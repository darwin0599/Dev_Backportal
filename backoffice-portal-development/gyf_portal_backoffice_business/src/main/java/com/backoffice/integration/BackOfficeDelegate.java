package com.backoffice.integration;

import static com.backoffice.integration.UtilDelegate.URL_COMMONS;

import java.net.URL;
import java.util.Date;

import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceException;

import com.backoffice.client.bank.InquiryBankAccountReqType;
import com.backoffice.client.bank.InquiryBankAccountRespType;
import com.backoffice.client.bank.SrvIntBankAccount;
import com.backoffice.client.bank.SrvIntBankAccountInterface;
import com.backoffice.client.customer.InquiryByIdCustomerReqType;
import com.backoffice.client.customer.InquiryByIdCustomerRespType;
import com.backoffice.client.customer.SrvIntCustomer;
import com.backoffice.client.customer.SrvIntCustomerInteface;
import com.backoffice.client.otp.DeleteReqType;
import com.backoffice.client.otp.DeleteRespType;
import com.backoffice.client.otp.SendReqType;
import com.backoffice.client.otp.SendRespType;
import com.backoffice.client.otp.SrvIntOTPDiffuser;
import com.backoffice.client.otp.SrvIntOTPDiffuser_Service;
import com.backoffice.client.otp.ValidateReqType;
import com.backoffice.client.otp.ValidateRespType;
import com.backoffice.client.support.DomainRequest;
import com.backoffice.client.support.DomainResponse;
import com.backoffice.client.support.SrvIntSupportServices;
import com.backoffice.client.support.SupportServicesDelegate;
import com.backoffice.client.validatecustomer.SrvIntCustomerOrq;
import com.backoffice.client.validatecustomer.SrvIntCustomerOrqInteface;
import com.backoffice.client.validatecustomer.ValidateComplianceListReqType;
import com.backoffice.client.validatecustomer.ValidateComplianceListRespType;
import com.backoffice.model.interfaces.BackOfficeAuditRemote;
import com.backoffice.model.to.BackOfficeAuditTO;
import com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer.ProductsReqType;
import com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer.ProductsRespType;
import com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer.SrvIntProductsCustomer;
import com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer.SrvIntProductsCustomerInterface;
import com.gyf.constants.ConstantesSeverity;
import com.gyf.constants.MessageApplicationEnum;
import com.gyf.exception.ApplicationException;
import com.gyf.exception.ControlApplicationException;
import com.gyf.exception.mngr.ExceptionManager;
import com.gyf.initialcontext.ServiceLocatorEjb3;
import com.gyf.log.LogWriter;
import com.gyf.timeout.mngr.ConnectionTimeOutMngr;

public class BackOfficeDelegate extends UtilDelegate {

	public InquiryByIdCustomerRespType inquiryByIdCustomer(InquiryByIdCustomerReqType inquiryByIdCustomerReq)
			throws ApplicationException, ControlApplicationException {
		final long INIT_TIME = System.currentTimeMillis();
		final String METHOD_NAME = "inquiryByIdCustomer()";
		Boolean isError = false;
		MessageApplicationEnum applicationEnum = MessageApplicationEnum.SRVINTCUSTOMER;
		SrvIntCustomer service = null;
		URL url = null;
		InquiryByIdCustomerRespType inquiryByIdCustomerRespType = null;
		ConnectionTimeOutMngr<SrvIntCustomerInteface> connectionTimeOutMngr = null;
		try {
			url = new URL(CUSTOMER_SERVICE_URL);
			QName qname = new QName("http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/",
					"SrvIntCustomer");

			service = new SrvIntCustomer(url, qname);
			connectionTimeOutMngr = new ConnectionTimeOutMngr<SrvIntCustomerInteface>();
			SrvIntCustomerInteface srvIntCustomerInteface = connectionTimeOutMngr
					.assignTimeout(service.getSrvIntCustomerPort(), applicationEnum.getTimeOut());
			inquiryByIdCustomerRespType = srvIntCustomerInteface.inquiryByIdCustomer(inquiryByIdCustomerReq);

			return inquiryByIdCustomerRespType;

		} catch (Exception e) {

			if (!(e instanceof WebServiceException)) {
				ExceptionManagerLocal(e);
			} else {
				isError = true;
				handleTimeOutException(applicationEnum);
			}

		} finally {
			LogWriter.writeWebServiceLog(formatter.format(new Date(INIT_TIME)),
					formatter.format(new Date(System.currentTimeMillis())), "SrvIntCustomer", METHOD_NAME,
					inquiryByIdCustomerReq.getContextTransaction() != null
							? inquiryByIdCustomerReq.getContextTransaction().getIdTx() : "",
					String.valueOf((System.currentTimeMillis() - INIT_TIME)), isError);
		}

		return null;
	}

	public ValidateComplianceListRespType validateCompliancesList(
			ValidateComplianceListReqType validateComplianceListReq)
			throws ApplicationException, ControlApplicationException {

		final long INIT_TIME = System.currentTimeMillis();
		final String METHOD_NAME = "validateCompliancesList()";
		Boolean isError = false;
		MessageApplicationEnum applicationEnum = MessageApplicationEnum.SRVINTCUSTOMER;
		SrvIntCustomerOrq service = null;
		URL url = null;
		ValidateComplianceListRespType inquiryByIdCustomerRespType = null;
		ConnectionTimeOutMngr<SrvIntCustomerOrqInteface> connectionTimeOutMngr = null;

		try {

			url = new URL(VALIDATE_CUSTOMER_URL);
			QName qname = new QName("http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/",
					"SrvIntCustomerOrq");
			service = new SrvIntCustomerOrq(url, qname);
			connectionTimeOutMngr = new ConnectionTimeOutMngr<SrvIntCustomerOrqInteface>();
			SrvIntCustomerOrqInteface customerOrqInteface = connectionTimeOutMngr
					.assignTimeout(service.getSrvIntCustomerOrqPort(), applicationEnum.getTimeOut());
			inquiryByIdCustomerRespType = customerOrqInteface.validateCompliancesList(validateComplianceListReq);

			return inquiryByIdCustomerRespType;
		} catch (Exception e) {
			if (!(e instanceof WebServiceException)) {
				ExceptionManagerLocal(e);
			} else {
				isError = true;
				handleTimeOutException(applicationEnum);
			}

		} finally {
			LogWriter.writeWebServiceLog(formatter.format(new Date(INIT_TIME)),
					formatter.format(new Date(System.currentTimeMillis())), "SrvIntCustomerOrq", METHOD_NAME,
					validateComplianceListReq.getContextTransaction() != null
							? validateComplianceListReq.getContextTransaction().getIdTx() : "",
					String.valueOf((System.currentTimeMillis() - INIT_TIME)), isError);
		}

		return null;
	}

	/**
	 * Metodo encargado de hacer la invocaci�n al Servicio de OTP Diffuser
	 * 
	 * @param SendReqType
	 * @return SendRespType
	 * @throws ApplicationException
	 * @throws ControlApplicationException
	 */
	public SendRespType send(SendReqType sendReq) throws ApplicationException, ControlApplicationException {
		final String METHOD_NAME = "send";
		final long INIT_TIME = System.currentTimeMillis();
		Boolean isError = false;
		MessageApplicationEnum applicationEnum = MessageApplicationEnum.SRVINTCUSTOMER;
		SrvIntOTPDiffuser_Service service = null;
		URL url = null;
		SendRespType sendResp = null;
		ConnectionTimeOutMngr<SrvIntOTPDiffuser> connectionTimeOutMngr = null;
		try {
			url = new URL(OTP_DIFFUSER_URL);
			QName qname = new QName("http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntOTPDiffuser/",
					"SrvIntOTPDiffuser");
			service = new SrvIntOTPDiffuser_Service(url, qname);
			connectionTimeOutMngr = new ConnectionTimeOutMngr<SrvIntOTPDiffuser>();
			SrvIntOTPDiffuser intOTPDiffuser = connectionTimeOutMngr.assignTimeout(service.getSrvIntOTPDiffuserSOAP(),
					applicationEnum.getTimeOut());
			sendResp = intOTPDiffuser.send(sendReq);
			return sendResp;
		} catch (Exception e) {
			if (!(e instanceof WebServiceException)) {
				ExceptionManagerLocal(e);
			} else {
				isError = true;
				handleTimeOutException(applicationEnum);
			}

		} finally {
			LogWriter.writeWebServiceLog(formatter.format(new Date(INIT_TIME)),
					formatter.format(new Date(System.currentTimeMillis())), "SrvIntSend", METHOD_NAME,
					sendReq.getContextTransaction() != null ? sendReq.getContextTransaction().getIdTx() : "",
					String.valueOf((System.currentTimeMillis() - INIT_TIME)), isError);
		}

		return null;
	}

	/**
	 * Metodo encargado de hacer la invocaci�n al Servicio de OTP Diffuser
	 * 
	 * @param SendReqType
	 * @return SendRespType
	 * @throws ApplicationException
	 * @throws ControlApplicationException
	 */
	public ValidateRespType validate(ValidateReqType sendReq) throws ApplicationException, ControlApplicationException {
		final String METHOD_NAME = "send";
		final long INIT_TIME = System.currentTimeMillis();
		Boolean isError = false;
		MessageApplicationEnum applicationEnum = MessageApplicationEnum.SRVINTCUSTOMER;
		SrvIntOTPDiffuser_Service service = null;
		URL url = null;
		ValidateRespType sendResp = null;
		ConnectionTimeOutMngr<SrvIntOTPDiffuser> connectionTimeOutMngr = null;
		try {
			url = new URL(OTP_DIFFUSER_URL);
			QName qname = new QName("http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntOTPDiffuser/",
					"SrvIntOTPDiffuser");
			service = new SrvIntOTPDiffuser_Service(url, qname);
			connectionTimeOutMngr = new ConnectionTimeOutMngr<SrvIntOTPDiffuser>();
			SrvIntOTPDiffuser intOTPDiffuser = connectionTimeOutMngr.assignTimeout(service.getSrvIntOTPDiffuserSOAP(),
					applicationEnum.getTimeOut());
			sendResp = intOTPDiffuser.validate(sendReq);
			return sendResp;
		} catch (Exception e) {
			if (!(e instanceof WebServiceException)) {
				ExceptionManagerLocal(e);
			} else {
				isError = true;
				handleTimeOutException(applicationEnum);
			}

		} finally {
			LogWriter.writeWebServiceLog(formatter.format(new Date(INIT_TIME)),
					formatter.format(new Date(System.currentTimeMillis())), "SrvIntSend", METHOD_NAME,
					sendReq.getContextTransaction() != null ? sendReq.getContextTransaction().getIdTx() : "",
					String.valueOf((System.currentTimeMillis() - INIT_TIME)), isError);
		}

		return null;
	}

	public ProductsRespType getProductsByCustomer(ProductsReqType productsReq)
			throws ApplicationException, ControlApplicationException {
		final String METHOD_NAME = "getProductsByCustomer()";
		final long INIT_TIME = System.currentTimeMillis();
		Boolean isError = false;
		MessageApplicationEnum applicationEnum = MessageApplicationEnum.SRVINTCUSTOMER;
		ProductsRespType getProductsByCustomerResp = null;
		SrvIntProductsCustomer product = null;
		ConnectionTimeOutMngr<SrvIntProductsCustomerInterface> connectionTimeOut = null;
		URL url = null;
		try {
			url = new URL(CUSTOMER_PRODUCTS_URL);
			product = new SrvIntProductsCustomer(url,
					new QName("http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/",
							"SrvIntProductsCustomer"));
			connectionTimeOut = new ConnectionTimeOutMngr<SrvIntProductsCustomerInterface>();
			SrvIntProductsCustomerInterface productInterface = connectionTimeOut
					.assignTimeout(product.getSrvIntProductsCustomerSOAP(), applicationEnum.getTimeOut());
			getProductsByCustomerResp = productInterface.products(productsReq);
			return getProductsByCustomerResp;
		} catch (Exception e) {
			if (!(e instanceof WebServiceException)) {
				ExceptionManagerLocal(e);
			} else {
				isError = true;
				handleTimeOutException(applicationEnum);
			}
		} finally {
			LogWriter.writeWebServiceLog(formatter.format(new Date(INIT_TIME)),
					formatter.format(new Date(System.currentTimeMillis())), "SrvIntProducts", METHOD_NAME,
					productsReq.getContextTransaction() != null ? productsReq.getContextTransaction().getIdTx() : "",
					String.valueOf((System.currentTimeMillis() - INIT_TIME)), isError);
		}

		return null;
	}

	public InquiryBankAccountRespType inquiryBankAccount(InquiryBankAccountReqType inquiryBankAccountReq)
			throws ApplicationException, ControlApplicationException {
		final String METHOD_NAME = "inquiryBankAccount()";
		final long INIT_TIME = System.currentTimeMillis();
		Boolean isError = false;
		MessageApplicationEnum applicationEnum = MessageApplicationEnum.SRVINTCUSTOMER;
		SrvIntBankAccount bankAccount = null;
		URL url = null;
		ConnectionTimeOutMngr<SrvIntBankAccountInterface> connectionTimeOutMngr = null;
		InquiryBankAccountRespType bankAccountResp = null;
		try {
			url = new URL(CUSTOMER_BANK_ACCOUNT_URL);
			bankAccount = new SrvIntBankAccount(url,
					new QName("http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/",
							"SrvIntBankAccount"));
			connectionTimeOutMngr = new ConnectionTimeOutMngr<SrvIntBankAccountInterface>();
			SrvIntBankAccountInterface srvIntBankAccountInterface = connectionTimeOutMngr
					.assignTimeout(bankAccount.getSrvIntBankAccountPort(), applicationEnum.getTimeOut());
			bankAccountResp = srvIntBankAccountInterface.inquiryBankAccount(inquiryBankAccountReq);

			return bankAccountResp;
		} catch (Exception e) {
			if (!(e instanceof WebServiceException)) {
				ExceptionManagerLocal(e);
			} else {
				isError = true;
				handleTimeOutException(applicationEnum);
			}
		} finally {
			LogWriter.writeWebServiceLog(formatter.format(new Date(INIT_TIME)),
					formatter.format(new Date(System.currentTimeMillis())), "SrvIntBankAccount", METHOD_NAME,
					inquiryBankAccountReq.getContextTransaction() != null
							? inquiryBankAccountReq.getContextTransaction().getIdTx() : "",
					String.valueOf((System.currentTimeMillis() - INIT_TIME)), isError);
		}

		return null;
	}

	public DeleteRespType delete(DeleteReqType deleteReq) throws ApplicationException, ControlApplicationException {
		final String METHOD_NAME = "delete";
		final long INIT_TIME = System.currentTimeMillis();
		Boolean isError = false;
		MessageApplicationEnum applicationEnum = MessageApplicationEnum.SRVINTCUSTOMER;
		SrvIntOTPDiffuser_Service service = null;
		URL url = null;
		DeleteRespType deleteResp = null;
		ConnectionTimeOutMngr<SrvIntOTPDiffuser> connectionTimeOutMngr = null;
		try {
			url = new URL(OTP_DIFFUSER_URL);
			QName qname = new QName("http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntOTPDiffuser/",
					"SrvIntOTPDiffuser");
			service = new SrvIntOTPDiffuser_Service(url, qname);
			connectionTimeOutMngr = new ConnectionTimeOutMngr<SrvIntOTPDiffuser>();
			SrvIntOTPDiffuser intOTPDiffuser = connectionTimeOutMngr.assignTimeout(service.getSrvIntOTPDiffuserSOAP(),
					applicationEnum.getTimeOut());
			deleteResp = intOTPDiffuser.delete(deleteReq);
			return deleteResp;
		} catch (Exception e) {
			if (!(e instanceof WebServiceException)) {
				ExceptionManagerLocal(e);
			} else {
				isError = true;
				handleTimeOutException(applicationEnum);
			}

		} finally {
			LogWriter.writeWebServiceLog(formatter.format(new Date(INIT_TIME)),
					formatter.format(new Date(System.currentTimeMillis())), "SrvIntSend", METHOD_NAME,
					deleteReq.getContextTransaction() != null ? deleteReq.getContextTransaction().getIdTx() : "",
					String.valueOf((System.currentTimeMillis() - INIT_TIME)), isError);
		}
		return null;
	}

	public void insertAuditBackOffice(BackOfficeAuditTO backOfficeAudit) {
		final String METHOD_NAME = "insertAuditBackOffice";
		try {
			BackOfficeAuditRemote facade = (BackOfficeAuditRemote) ServiceLocatorEjb3.getInstance()
					.getContext(null, null, true).lookup(EJB_AUDIT);

			facade.insertAuditBackOffice(backOfficeAudit);
		} catch (Exception e) {
			LogWriter.writeErrorLog(e, e.getMessage(), METHOD_NAME);
		}
	}

	public void updateAuditBackOfficeStatus(BackOfficeAuditTO backOfficeAudit) {
		final String METHOD_NAME = "updateAuditBackOfficeStatus";
		try {
			BackOfficeAuditRemote facade = (BackOfficeAuditRemote) ServiceLocatorEjb3.getInstance()
					.getContext(null, null, true).lookup(EJB_AUDIT);

			facade.updateAuditBackOfficeStatus(backOfficeAudit);
		} catch (Exception e) {
			LogWriter.writeErrorLog(e, e.getMessage(), METHOD_NAME);
		}
	}
	
	
	public DomainResponse commonsServices(DomainRequest arg0) throws ApplicationException, ControlApplicationException
	{
		final long INIT_TIME = System.currentTimeMillis();
		final String METHOD_NAME = "commonsServices()";
		Boolean isError = false;
		MessageApplicationEnum applicationEnum = MessageApplicationEnum.SRVINTCUSTOMER;
		SrvIntSupportServices service = null;
		URL url = null;
		DomainResponse domainResponse = null;
		ConnectionTimeOutMngr<SupportServicesDelegate> connectionTimeOutMngr = null;
		
		try 
		{
			url = new URL(URL_COMMONS);
			QName qname = new QName("http://integration.services.support.gyf.com/", "SrvIntSupportServices");
			
			service = new SrvIntSupportServices(url, qname);
			connectionTimeOutMngr = new ConnectionTimeOutMngr<SupportServicesDelegate>();
			SupportServicesDelegate srvIntCustomerInteface = connectionTimeOutMngr
					.assignTimeout(service.getPortSrvIntSupportServices(), applicationEnum.getTimeOut());
			domainResponse = srvIntCustomerInteface.commonsServices(arg0);
			
			return domainResponse;
			
		} catch (Exception e) 
		{
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, 
					METHOD_NAME, e.getMessage()	, ConstantesSeverity.FATAL);
		}finally {
			LogWriter.writeWebServiceLog(formatter.format(new Date(INIT_TIME)),
					formatter.format(new Date(System.currentTimeMillis())), "SrvIntSend", METHOD_NAME,
					arg0.getContextTransaction() != null ? arg0.getContextTransaction().getIdTx() : "",
					String.valueOf((System.currentTimeMillis() - INIT_TIME)), isError);
		}
		
		return null;
	}
	
}
