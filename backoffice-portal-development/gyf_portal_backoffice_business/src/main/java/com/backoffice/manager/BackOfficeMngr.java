package com.backoffice.manager;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.backoffice.client.bank.InquiryBankAccountRespType;
import com.backoffice.client.customer.InquiryByIdCustomerRespType;
import com.backoffice.client.otp.DeleteRespType;
import com.backoffice.client.otp.SendRespType;
import com.backoffice.client.otp.ValidateRespType;
import com.backoffice.client.support.DomainResponse;
import com.backoffice.client.validatecustomer.ValidateComplianceListRespType;
import com.backoffice.dao.DAOFactory;
import com.backoffice.dao.interfaces.IAdminBlockDAO;
import com.backoffice.dao.interfaces.ICustomerExtraDataDAO;
import com.backoffice.dao.interfaces.ICustomerRegistredDAO;
import com.backoffice.dao.interfaces.IDeleteCustomerDAO;
import com.backoffice.dao.interfaces.IPseDAO;
import com.backoffice.dao.interfaces.IReportApprovalStateDAO;
import com.backoffice.integration.BackOfficeDelegate;
import com.backoffice.integration.BackOfficeLDAPDelegate;
import com.backoffice.mapping.BackOfficeMapping;
import com.backoffice.model.to.CustomerBackOfficeRequestTO;
import com.backoffice.model.to.CustomerBackOfficeResponseTO;
import com.backoffice.model.to.ReportApprovalStateTO;
import com.backoffice.vo.AdminBlockVO;
import com.backoffice.vo.CustomerExtraDataVO;
import com.backoffice.vo.CustomerRegistredVO;
import com.backoffice.vo.DeleteCustomerVO;
import com.backoffice.vo.PseVO;
import com.backoffice.vo.ReportApprovalStateVO;
import com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer.ProductsRespType;
import com.gyf.constants.ConstantesSeverity;
import com.gyf.constants.ProcessStatus;
import com.gyf.exception.ApplicationException;
import com.gyf.exception.ControlApplicationException;
import com.gyf.exception.mngr.ExceptionManager;
import com.gyf.exception.model.ErrorModelControlException;

public class BackOfficeMngr {

	private final static String CLASS_NAME = "com.backoffice.manager.BackOfficeMngr";

	private BackOfficeDelegate delegate = null;
	private BackOfficeLDAPDelegate ldapDelegate = null;

	public BackOfficeMngr() {
		this.delegate = new BackOfficeDelegate();
		this.ldapDelegate = new BackOfficeLDAPDelegate();
	}

	public CustomerBackOfficeResponseTO emailAndMobileInformation(CustomerBackOfficeRequestTO customerBackOfficeRequest)
			throws ControlApplicationException, ApplicationException {
		final String METHOD_NAME = "emailAndMobileInformation";
		try {
			InquiryByIdCustomerRespType customerRespType = this.delegate
					.inquiryByIdCustomer(BackOfficeMapping.inquiryCustomerMapping(customerBackOfficeRequest));

			if (customerRespType == null || customerRespType.getCustomer() == null) {
				ErrorModelControlException errorModelControlExceptionList = new ErrorModelControlException();
				errorModelControlExceptionList.setErrorCode("CUNE001");
				errorModelControlExceptionList.setSeverity(ConstantesSeverity.ERROR);
				errorModelControlExceptionList.setErrorMessage("No se encontro cliente");
				throw new ControlApplicationException(
						new ErrorModelControlException[] { errorModelControlExceptionList });
			}

			return BackOfficeMapping.inquiryCustomerResponseMapping(customerRespType, customerBackOfficeRequest);

		} catch (Exception e) {
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME, "Consulta de cliente",
					ConstantesSeverity.FATAL);
		}

		return null;
	}

	public CustomerBackOfficeResponseTO registredAndComplianceList(
			CustomerBackOfficeRequestTO customerBackOfficeRequest, Connection connection)
			throws ControlApplicationException, ApplicationException {
		final String METHOD_NAME = "";
		ICustomerRegistredDAO dao = null;
		CustomerRegistredVO customerRegister = null;
		CustomerBackOfficeResponseTO customerBackOfficeResponse = null;
		try {
			customerBackOfficeResponse = new CustomerBackOfficeResponseTO();
			customerRegister = new CustomerRegistredVO(customerBackOfficeRequest.getId(),
					customerBackOfficeRequest.getIdType(),"");
			dao = DAOFactory.getDAOFactory(connection).getCustomerRegistredDAO();
			customerRegister = dao.validateCustomerRegisterSP(customerRegister);

			if (customerRegister.isRegister()) {
				customerBackOfficeResponse.setComplianceListFlag(Boolean.FALSE);
				customerBackOfficeResponse.setRegistredFlag(Boolean.TRUE);
				customerBackOfficeResponse.setRegistredInit(customerRegister.getRegisterDate());

			} else {
				customerBackOfficeResponse.setRegistredFlag(Boolean.FALSE);
				try {
					ValidateComplianceListRespType complianceListRespType = this.delegate.validateCompliancesList(
							BackOfficeMapping.validateComplianceListReqMapping(customerBackOfficeRequest));
					customerBackOfficeResponse.setComplianceListFlag(Boolean.FALSE);
				} catch (Exception e) {
					if (e instanceof ControlApplicationException) {
						customerBackOfficeResponse.setComplianceListFlag(Boolean.TRUE);

						ControlApplicationException controlApplicationException = (ControlApplicationException) e;
						for (ErrorModelControlException itemErrorModelControlException : controlApplicationException
								.getErrorModelControlExceptionList()) {
							customerBackOfficeResponse
									.setComplianceListCode(itemErrorModelControlException.getErrorCode());
							customerBackOfficeResponse
									.setComplianceListDescription(itemErrorModelControlException.getErrorMessage());
						}

					} else {
						throw e;
					}
				}
			}

			customerBackOfficeResponse.setId(customerBackOfficeRequest.getId());
			customerBackOfficeResponse.setIdType(customerBackOfficeRequest.getIdType());
			customerBackOfficeResponse.setServicePoint(customerBackOfficeRequest.getServicePoint());
			customerBackOfficeResponse.setUserId(customerBackOfficeRequest.getUserId());

			return customerBackOfficeResponse;
		} catch (Exception e) {
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME, "Lista de cumplimiento",
					ConstantesSeverity.FATAL);
		}
		return null;
	}

	public CustomerBackOfficeResponseTO customerExtraData(CustomerBackOfficeRequestTO backOfficeRequestTO,
			Connection connection) throws ApplicationException, ControlApplicationException {
		final String METHOD_NAME = "customerExtraData";
		CustomerExtraDataVO customerExtraData = null;
		ICustomerExtraDataDAO dao = null;
		CustomerBackOfficeResponseTO backOfficeResponse = null;
		try {

			customerExtraData = new CustomerExtraDataVO(backOfficeRequestTO.getId(), backOfficeRequestTO.getIdType());
			dao = DAOFactory.getDAOFactory(connection).getCustomerExtraDataDAO();
			customerExtraData = dao.customerExtraDataSP(customerExtraData);

			backOfficeResponse = new CustomerBackOfficeResponseTO();

			backOfficeResponse.setSessionInit(customerExtraData.getSessionInit());
			backOfficeResponse.setSessionInitFlag((customerExtraData.getSessionInit() != null
					&& customerExtraData.getSessionInit().trim().length() > 0));
			backOfficeResponse.setCurrentSession(customerExtraData.getCurrentSession());
			backOfficeResponse.setCurrentSessionFlag((customerExtraData.getCurrentSession() != null
					&& customerExtraData.getCurrentSession().trim().length() > 0));

			backOfficeResponse.setAdminBlockCode(customerExtraData.getAdminBlockCode());
			backOfficeResponse.setAdminBlockCodeFlag((customerExtraData.getAdminBlockCode() != null
					&& customerExtraData.getAdminBlockCode().trim().length() > 0));

			backOfficeResponse.setHabitsFlag(
					customerExtraData.getHabits() != null && customerExtraData.getHabits().equalsIgnoreCase("true"));

			backOfficeResponse.setSecurityQuestionsFlag((customerExtraData.getSecurityQuestions() != null
					&& customerExtraData.getSecurityQuestions().equals("true")));
			
			
			backOfficeResponse.setLockLoginFlag((customerExtraData.getLockLogin() != null
					&& customerExtraData.getLockLogin().equals("true")));

			backOfficeResponse.setId(backOfficeRequestTO.getId());
			backOfficeResponse.setIdType(backOfficeRequestTO.getIdType());
			backOfficeResponse.setServicePoint(backOfficeRequestTO.getServicePoint());
			backOfficeResponse.setUserId(backOfficeRequestTO.getUserId());

			return backOfficeResponse;
		} catch (Exception e) {
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME, "Informaci�n Adicional",
					ConstantesSeverity.FATAL);
		}
		return null;
	}

	public CustomerBackOfficeResponseTO sendOTPDiffuserEmail(CustomerBackOfficeRequestTO backOfficeRequestTO)
			throws ApplicationException, ControlApplicationException {
		final String METHOD_NAME = "sendOTPDiffuser";
		CustomerBackOfficeResponseTO customerBackOfficeResponse = null;
		try {
			SendRespType sendResp = this.delegate.send(BackOfficeMapping.sendMapping(backOfficeRequestTO));
			customerBackOfficeResponse = new CustomerBackOfficeResponseTO();
			if (sendResp != null && sendResp.getContextResponse() != null
					&& sendResp.getContextResponse().getCodStateTx().equals(ProcessStatus.SUCCESS)) {
				customerBackOfficeResponse.setOtpDiffuserSent(Boolean.TRUE);
			} else {
				customerBackOfficeResponse.setOtpDiffuserSent(Boolean.FALSE);
			}

			customerBackOfficeResponse.setId(backOfficeRequestTO.getId());
			customerBackOfficeResponse.setIdType(backOfficeRequestTO.getIdType());
			customerBackOfficeResponse.setServicePoint(backOfficeRequestTO.getServicePoint());
			customerBackOfficeResponse.setUserId(backOfficeRequestTO.getUserId());

			return customerBackOfficeResponse;
		} catch (Exception e) {
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME, "Error Sending OTP",
					ConstantesSeverity.FATAL);
		}

		return null;
	}

	public CustomerBackOfficeResponseTO sendOTPDiffuserSMS(CustomerBackOfficeRequestTO backOfficeRequestTO)
			throws ApplicationException, ControlApplicationException {
		final String METHOD_NAME = "sendOTPDiffuser";
		CustomerBackOfficeResponseTO customerBackOfficeResponse = null;
		try {
			SendRespType sendResp = this.delegate.send(BackOfficeMapping.sendMapping(backOfficeRequestTO));
			customerBackOfficeResponse = new CustomerBackOfficeResponseTO();
			if (sendResp != null && sendResp.getContextResponse() != null
					&& sendResp.getContextResponse().getCodStateTx().equals(ProcessStatus.SUCCESS)) {
				customerBackOfficeResponse.setOtpDiffuserSent(Boolean.TRUE);
			} else {
				customerBackOfficeResponse.setOtpDiffuserSent(Boolean.FALSE);
			}

			customerBackOfficeResponse.setId(backOfficeRequestTO.getId());
			customerBackOfficeResponse.setIdType(backOfficeRequestTO.getIdType());
			customerBackOfficeResponse.setServicePoint(backOfficeRequestTO.getServicePoint());
			customerBackOfficeResponse.setUserId(backOfficeRequestTO.getUserId());

			return customerBackOfficeResponse;
		} catch (Exception e) {
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME, "Error Sending OTP",
					ConstantesSeverity.FATAL);
		}

		return null;
	}

	public CustomerBackOfficeResponseTO updateCustomerStatus(CustomerBackOfficeRequestTO backOfficeRequestTO,
			Connection connection, String type) throws ApplicationException, ControlApplicationException {
		final String METHOD_NAME = "updateCustomerStatus";
		IAdminBlockDAO dao = null;
		AdminBlockVO adminBlock = null;
		CustomerBackOfficeResponseTO customerBackOfficeResponse = null;
		try {
			if (type.equalsIgnoreCase("UNLOCK")) {

				ValidateRespType validateResp = this.delegate
						.validate(BackOfficeMapping.validatedMapping(backOfficeRequestTO));

				if (validateResp != null && validateResp.getContextResponse() != null
						&& validateResp.getContextResponse().getCodStateTx() != null
						&& validateResp.getContextResponse().getCodStateTx().equals(ProcessStatus.SUCCESS)) {
					dao = DAOFactory.getDAOFactory(connection).getAdminBlockDAO();
					adminBlock = new AdminBlockVO(backOfficeRequestTO.getId(), backOfficeRequestTO.getIdType(),
							backOfficeRequestTO.getAdminBlockCode());
					int numberOfRowsAffected = dao.updateCustomerStatus(adminBlock);

					if (numberOfRowsAffected == 0) {
						ErrorModelControlException errorModelControlExceptionList = new ErrorModelControlException();
						errorModelControlExceptionList.setErrorCode("CUNE002");
						errorModelControlExceptionList.setSeverity(ConstantesSeverity.ERROR);
						errorModelControlExceptionList.setErrorMessage("No se encontro cliente para actualizar");
						throw new ControlApplicationException(
								new ErrorModelControlException[] { errorModelControlExceptionList });
					}
					customerBackOfficeResponse = new CustomerBackOfficeResponseTO();

					customerBackOfficeResponse.setId(backOfficeRequestTO.getId());
					customerBackOfficeResponse.setIdType(backOfficeRequestTO.getIdType());
					customerBackOfficeResponse.setServicePoint(backOfficeRequestTO.getServicePoint());
					customerBackOfficeResponse.setUserId(backOfficeRequestTO.getUserId());
				}

				return customerBackOfficeResponse;
			}else
			{
				dao = DAOFactory.getDAOFactory(connection).getAdminBlockDAO();
				adminBlock = new AdminBlockVO(backOfficeRequestTO.getId(), backOfficeRequestTO.getIdType(),
						backOfficeRequestTO.getAdminBlockCode());
				int numberOfRowsAffected = dao.updateCustomerStatus(adminBlock);

				if (numberOfRowsAffected == 0) {
					ErrorModelControlException errorModelControlExceptionList = new ErrorModelControlException();
					errorModelControlExceptionList.setErrorCode("CUNE002");
					errorModelControlExceptionList.setSeverity(ConstantesSeverity.ERROR);
					errorModelControlExceptionList.setErrorMessage("No se encontro cliente para actualizar");
					throw new ControlApplicationException(
							new ErrorModelControlException[] { errorModelControlExceptionList });
				}
				customerBackOfficeResponse = new CustomerBackOfficeResponseTO();

				customerBackOfficeResponse.setId(backOfficeRequestTO.getId());
				customerBackOfficeResponse.setIdType(backOfficeRequestTO.getIdType());
				customerBackOfficeResponse.setServicePoint(backOfficeRequestTO.getServicePoint());
				customerBackOfficeResponse.setUserId(backOfficeRequestTO.getUserId());
			}
			
		} catch (Exception e) {
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME,
					"Error Uptdating customer status", ConstantesSeverity.FATAL);
		}
		return null;
	}

	public CustomerBackOfficeResponseTO getProductsByCustomer(CustomerBackOfficeRequestTO backOfficeRequestTO)
			throws ApplicationException, ControlApplicationException {
		final String METHOD_NAME = "getProductsByCustomer";
		CustomerBackOfficeResponseTO customerBackOfficeResponse = null;
		try {

			ProductsRespType getProductsByCustomerResp = this.delegate
					.getProductsByCustomer(BackOfficeMapping.getProductsByCustomerMapping(backOfficeRequestTO));
			customerBackOfficeResponse = BackOfficeMapping
					.getProductsByCustomerResponseMapping(getProductsByCustomerResp, backOfficeRequestTO);
			return customerBackOfficeResponse;

		} catch (Exception e) {
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME,
					"Error retrieveing customers products", ConstantesSeverity.FATAL);
		}

		return null;
	}

	public CustomerBackOfficeResponseTO inquiryBankAccount(CustomerBackOfficeRequestTO backOfficeRequestTO)
			throws ApplicationException, ControlApplicationException {
		final String METHOD_NAME = "inquiryBankAccount";
		CustomerBackOfficeResponseTO customerBackOfficeResponse = null;

		try {
			InquiryBankAccountRespType inquiryBankAccountResp = this.delegate
					.inquiryBankAccount(BackOfficeMapping.inquiryBankAccountReqMapping(backOfficeRequestTO));
			customerBackOfficeResponse = BackOfficeMapping.inquiryBankAccountRespMapping(inquiryBankAccountResp,
					backOfficeRequestTO);
			return customerBackOfficeResponse;
		} catch (Exception e) {
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME,
					"Error retrieveing bank account products", ConstantesSeverity.FATAL);
		}

		return null;
	}

	public CustomerBackOfficeResponseTO inquiryPseInformation(CustomerBackOfficeRequestTO backOfficeRequestTO,
			Connection connection, Date fechaIni, Date fechaFin, String estado)
			throws ApplicationException, ControlApplicationException {
		final String METHOD_NAME = "inquiryPseInformation";
		CustomerBackOfficeResponseTO backOfficeResponseTO = null;
		IPseDAO dao = null;
		PseVO pse = null;
		try {
			dao = DAOFactory.getDAOFactory(connection).getPseDAO();

			String userId = backOfficeRequestTO.getIdType() + "" + backOfficeRequestTO.getId();
			pse = new PseVO(backOfficeRequestTO.getMethodOfPayment(), userId);
			List<PseVO> listPseVO = dao.selectPseByCustomer(pse, fechaIni, fechaFin, estado);
			backOfficeResponseTO = BackOfficeMapping.inquiryPseInformationResponse(listPseVO, backOfficeRequestTO);
			return backOfficeResponseTO;
		} catch (Exception e) {
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME,
					"Error retrieveing bank account products", ConstantesSeverity.FATAL);
		}

		return null;
	}

	public CustomerBackOfficeResponseTO deleteCustomer(CustomerBackOfficeRequestTO backOfficeRequestTO,
			Connection connection) throws ApplicationException, ControlApplicationException {
		final String METHOD_NAME = "deleteCustomer";
		CustomerBackOfficeResponseTO backOfficeResponseTO = null;
		IDeleteCustomerDAO dao = null;
		DeleteCustomerVO customer = null;
		try {
			ValidateRespType validateResp = this.delegate
					.validate(BackOfficeMapping.validatedMapping(backOfficeRequestTO));

			if (validateResp != null && validateResp.getContextResponse() != null
					&& validateResp.getContextResponse().getCodStateTx() != null
					&& validateResp.getContextResponse().getCodStateTx().equals(ProcessStatus.SUCCESS)) {
				String idCustomer = backOfficeRequestTO.getIdType() + "_" + backOfficeRequestTO.getId();
				this.ldapDelegate.deleteCustomerFromLdap(idCustomer);

				customer = new DeleteCustomerVO(backOfficeRequestTO.getId(), backOfficeRequestTO.getIdType(), backOfficeRequestTO.getUserId());
				dao = DAOFactory.getDAOFactory(connection).getDeleteCustomerDAO();
				dao.deleteCustomerSP(customer);

				DeleteRespType deleteResp = this.delegate.delete(BackOfficeMapping.deleteMapping(backOfficeRequestTO));

				backOfficeResponseTO = new CustomerBackOfficeResponseTO();

				backOfficeResponseTO.setId(backOfficeRequestTO.getId());
				backOfficeResponseTO.setIdType(backOfficeRequestTO.getIdType());
				backOfficeResponseTO.setServicePoint(backOfficeRequestTO.getServicePoint());
				backOfficeResponseTO.setUserId(backOfficeRequestTO.getUserId());
			}

			return backOfficeResponseTO;
		} catch (Exception e) {
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME, "Error deleting the customer",
					ConstantesSeverity.FATAL);
		}

		return null;
	}
	
	
	public CustomerBackOfficeResponseTO getCommonsServiceInfromation(CustomerBackOfficeRequestTO portalRequest)throws ControlApplicationException, ApplicationException 
	{
		final String METHOD_NAME = "getCommonsServiceInfromation";
		
		try 
		{
			DomainResponse domainResponse =	delegate.commonsServices(BackOfficeMapping.domainRequestMapping(portalRequest, "TiposDocumento"));
			return BackOfficeMapping.portalResponseMapping(domainResponse, portalRequest);
			
		} catch (Exception e) 
		{
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME,
					METHOD_NAME, e.getMessage(), ConstantesSeverity.FATAL);
		}
		
		return null;
	}
	
	public List<ReportApprovalStateTO> getCreditCardReport(ReportApprovalStateTO filter, Connection connection)
			throws ApplicationException, ControlApplicationException {
		
		final String METHOD_NAME = "getCreditCardReport()";
		List<ReportApprovalStateTO> records= null;
		
		try {
			
			IReportApprovalStateDAO dao = DAOFactory.getDAOFactory(connection).getReportApprovalStateDAO();
			
			ReportApprovalStateVO filterVO = new ReportApprovalStateVO();
			filterVO.setTipoDocumento(filter.getTipoDocumento());
			filterVO.setDocumento(filter.getDocumento());
			filterVO.setEstado(filter.getEstado());
			filterVO.setFiltroFechaInicio(filter.getFilterInitDate());
			filterVO.setFiltroFechaFin(filter.getEndFilterDate());
			
			
			List<ReportApprovalStateVO> result = dao.findBy(filterVO);
			if( result != null  && !result.isEmpty()) {
				records = new ArrayList<ReportApprovalStateTO>();
				for( ReportApprovalStateVO item : result ) {
					records.add(BackOfficeMapping.map(item));
				}
			}			
			
		}catch (Exception e) {
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME,
					METHOD_NAME, e.getMessage(), ConstantesSeverity.FATAL);
		}
		return records;
	}

}
