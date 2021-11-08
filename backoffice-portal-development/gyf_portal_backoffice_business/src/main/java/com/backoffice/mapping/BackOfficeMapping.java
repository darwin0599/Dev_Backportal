package com.backoffice.mapping;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.backoffice.client.bank.InfoAccountType;
import com.backoffice.client.bank.InquiryBankAccountReqType;
import com.backoffice.client.bank.InquiryBankAccountRespType;
import com.backoffice.client.customer.ContextTransactionType;
import com.backoffice.client.customer.CustomerType;
import com.backoffice.client.customer.InquiryByIdCustomerReqType;
import com.backoffice.client.customer.InquiryByIdCustomerRespType;
import com.backoffice.client.otp.DeleteReqType;
import com.backoffice.client.otp.PersonType;
import com.backoffice.client.otp.SendReqType;
import com.backoffice.client.otp.ValidateReqType;
import com.backoffice.client.support.DomainRequest;
import com.backoffice.client.support.DomainResponse;
import com.backoffice.client.support.SupportServicesTO;
import com.backoffice.client.support.ValueDomainTO;
import com.backoffice.client.validatecustomer.AgentType;
import com.backoffice.client.validatecustomer.CustomerCommonType;
import com.backoffice.client.validatecustomer.DeviceType;
import com.backoffice.client.validatecustomer.OfficeType;
import com.backoffice.client.validatecustomer.ServicePointType;
import com.backoffice.client.validatecustomer.ValidateComplianceListReqType;
import com.backoffice.integration.UtilDelegate;
import com.backoffice.model.to.BankAccountTO;
import com.backoffice.model.to.CustomerBackOfficeRequestTO;
import com.backoffice.model.to.CustomerBackOfficeResponseTO;
import com.backoffice.model.to.ProductTO;
import com.backoffice.model.to.PseTO;
import com.backoffice.model.to.ReportApprovalStateTO;
import com.backoffice.model.to.ValueDomainElementTO;
import com.backoffice.vo.PseVO;
import com.backoffice.vo.ReportApprovalStateVO;
import com.girosyfinanzas.schema.direccioncanales.cdttype.CDTType;
import com.girosyfinanzas.schema.direccioncanales.creditaccounttype.CreditAccountType;
import com.girosyfinanzas.schema.direccioncanales.savingaccounttype.SavingAccountType;
import com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer.InsuranceCompoundType;
import com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer.ProductsReqType;
import com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer.ProductsRespType;
import com.gyf.log.LogWriter;

public class BackOfficeMapping {
	private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss:SS");

	public static InquiryByIdCustomerReqType inquiryCustomerMapping(
			CustomerBackOfficeRequestTO customerBackOfficeRequest) {
		final String METHOD_NAME = "inquiryCustomer";
		InquiryByIdCustomerReqType inquiryByIdCustomerReq = null;
		ContextTransactionType contextTransaction = null;
		try {
			inquiryByIdCustomerReq = new InquiryByIdCustomerReqType();
			contextTransaction = new ContextTransactionType();

			contextTransaction.setIdUser(customerBackOfficeRequest.getUserId());
			contextTransaction.setIdTx(UUID.randomUUID().toString());
			contextTransaction.setCodTypeTx("BackOfficePortal");
			contextTransaction.setCreationMsgDate(formatter.format(new Date()));
			inquiryByIdCustomerReq.setContextTransaction(contextTransaction);
			inquiryByIdCustomerReq.setCodTypeIdentificationCustomer(customerBackOfficeRequest.getIdType());
			inquiryByIdCustomerReq.setIdCustomer(customerBackOfficeRequest.getId());

			return inquiryByIdCustomerReq;

		} catch (Exception e) {
			LogWriter.writeErrorLog(e, e.getMessage(), METHOD_NAME);
		}
		return null;
	}

	public static CustomerBackOfficeResponseTO inquiryCustomerResponseMapping(
			InquiryByIdCustomerRespType inquiryByIdCustomerResp,
			CustomerBackOfficeRequestTO customerBackOfficeRequest) {
		final String METHOD_NAME = "inquiryCustomerResponseMapping";
		CustomerBackOfficeResponseTO backOfficeResponseTO = null;
		try {
			backOfficeResponseTO = new CustomerBackOfficeResponseTO();

			if (inquiryByIdCustomerResp != null && inquiryByIdCustomerResp.getCustomer() != null) {
				CustomerType customer = inquiryByIdCustomerResp.getCustomer();
				backOfficeResponseTO.setEmail(customer.getValEmail());
				backOfficeResponseTO
						.setEmailFlag((customer.getValEmail() != null && customer.getValEmail().trim().length() > 0));

				backOfficeResponseTO.setMobile(customer.getValMobile());
				backOfficeResponseTO.setMobileFlag(
						(customer.getValMobile() != null && customer.getValMobile().trim().length() > 0));
				backOfficeResponseTO.setAvailable(
						customer.getAvailableCustomer() != null && customer.getAvailableCustomer().equals("true"));

				backOfficeResponseTO.setFirstName(customer.getValFirstName());
				backOfficeResponseTO.setMiddleName(customer.getValMiddleName());
				backOfficeResponseTO.setLastName(customer.getValLastName());
				backOfficeResponseTO.setMiddleLastName(customer.getValMiddleLastName());

			}

			backOfficeResponseTO.setId(customerBackOfficeRequest.getId());
			backOfficeResponseTO.setIdType(customerBackOfficeRequest.getIdType());
			backOfficeResponseTO.setServicePoint(customerBackOfficeRequest.getServicePoint());
			backOfficeResponseTO.setUserId(customerBackOfficeRequest.getUserId());

			return backOfficeResponseTO;
		} catch (Exception e) {
			LogWriter.writeErrorLog(e, e.getMessage(), METHOD_NAME);
		}

		return null;
	}

	public static ValidateComplianceListReqType validateComplianceListReqMapping(
			CustomerBackOfficeRequestTO customerBackOfficeRequest) {
		final String METHOD_NAME = "validateComplianceListReqMapping";
		ValidateComplianceListReqType validateComplianceListReq = null;
		com.backoffice.client.validatecustomer.ContextTransactionType contextTransaction = null;
		AgentType agent = null;
		OfficeType office = null;
		ServicePointType servicePoint = null;
		DeviceType device = null;
		CustomerCommonType customerCommonType = null;
		try {
			validateComplianceListReq = new ValidateComplianceListReqType();
			contextTransaction = new com.backoffice.client.validatecustomer.ContextTransactionType();
			contextTransaction.setIdUser(customerBackOfficeRequest.getUserId());
			contextTransaction.setIdTx(UUID.randomUUID().toString());
			contextTransaction.setCodTypeTx("BackOfficePortal");
			contextTransaction.setCreationMsgDate(formatter.format(new Date()));
			validateComplianceListReq.setContextTransaction(contextTransaction);
			agent = new AgentType();
			agent.setId("GYF001");
			office = new OfficeType();
			servicePoint = new ServicePointType();
			servicePoint.setId(customerBackOfficeRequest.getServicePoint());
			device = new DeviceType();
			device.setId("1");
			servicePoint.setDevice(device);
			office.setServicePoint(servicePoint);
			agent.setOffice(office);
			validateComplianceListReq.setAgent(agent);

			customerCommonType = new CustomerCommonType();

			customerCommonType.setId(customerBackOfficeRequest.getId());
			customerCommonType.setTypeIdentification(customerBackOfficeRequest.getIdType());
			customerCommonType.setName1(customerBackOfficeRequest.getFirstName());
			customerCommonType.setName2(customerBackOfficeRequest.getMiddleName());
			customerCommonType.setName3(customerBackOfficeRequest.getLastName());
			customerCommonType.setName4(customerBackOfficeRequest.getMiddleLastName());
			validateComplianceListReq.setCustomer(customerCommonType);

			return validateComplianceListReq;
		} catch (Exception e) {
			LogWriter.writeErrorLog(e, e.getMessage(), METHOD_NAME);
		}

		return null;
	}

	public static SendReqType sendMapping(CustomerBackOfficeRequestTO customerBackOfficeRequest) {
		final String METHOD_NAME = "";
		SendReqType sendReq = null;
		com.backoffice.client.otp.ContextTransactionType contextTransaction = null;
		com.backoffice.client.otp.AgentType agent = null;
		com.backoffice.client.otp.OfficeType office = null;
		com.backoffice.client.otp.ServicePointType servicePoint = null;
		com.backoffice.client.otp.DeviceType device = null;

		PersonType person = null;

		try {
			sendReq = new SendReqType();

			contextTransaction = new com.backoffice.client.otp.ContextTransactionType();
			contextTransaction.setIdUser(customerBackOfficeRequest.getUserId());
			contextTransaction.setIdTx(UUID.randomUUID().toString());
			contextTransaction.setCodTypeTx("BackOfficePortal");
			contextTransaction.setCreationMsgDate(formatter.format(new Date()));
			sendReq.setContextTransaction(contextTransaction);
			agent = new com.backoffice.client.otp.AgentType();
			agent.setId("GYF001");
			office = new com.backoffice.client.otp.OfficeType();
			servicePoint = new com.backoffice.client.otp.ServicePointType();
			servicePoint.setId(customerBackOfficeRequest.getServicePoint());
			device = new com.backoffice.client.otp.DeviceType();
			device.setId("1");
			servicePoint.setDevice(device);
			office.setServicePoint(servicePoint);
			agent.setOffice(office);
			sendReq.setAgent(agent);

			person = new PersonType();
			person.setId(customerBackOfficeRequest.getId());
			person.setCodTypeIdentification(customerBackOfficeRequest.getIdType());
			person.setValEmail(customerBackOfficeRequest.getEmail());
			person.setValMobile(customerBackOfficeRequest.getMobile());

			sendReq.setPerson(person);
			return sendReq;
		} catch (Exception e) {
			LogWriter.writeErrorLog(e, e.getMessage(), METHOD_NAME);
		}

		return null;
	}

	public static ValidateReqType validatedMapping(CustomerBackOfficeRequestTO customerBackOfficeRequest) {
		final String METHOD_NAME = "";
		ValidateReqType sendReq = null;
		com.backoffice.client.otp.ContextTransactionType contextTransaction = null;
		com.backoffice.client.otp.AgentType agent = null;
		com.backoffice.client.otp.OfficeType office = null;
		com.backoffice.client.otp.ServicePointType servicePoint = null;
		com.backoffice.client.otp.DeviceType device = null;

		PersonType person = null;

		try {
			sendReq = new ValidateReqType();

			contextTransaction = new com.backoffice.client.otp.ContextTransactionType();
			contextTransaction.setIdUser(customerBackOfficeRequest.getUserId());
			contextTransaction.setIdTx(UUID.randomUUID().toString());
			contextTransaction.setCodTypeTx("BackOfficePortal");
			contextTransaction.setCreationMsgDate(formatter.format(new Date()));
			sendReq.setContextTransaction(contextTransaction);
			agent = new com.backoffice.client.otp.AgentType();
			agent.setId("GYF001");
			office = new com.backoffice.client.otp.OfficeType();
			servicePoint = new com.backoffice.client.otp.ServicePointType();
			servicePoint.setId(customerBackOfficeRequest.getServicePoint());
			device = new com.backoffice.client.otp.DeviceType();
			device.setId("1");
			servicePoint.setDevice(device);
			office.setServicePoint(servicePoint);
			agent.setOffice(office);
			sendReq.setAgent(agent);

			person = new PersonType();
			person.setId(customerBackOfficeRequest.getId());
			person.setCodTypeIdentification(customerBackOfficeRequest.getIdType());
			person.setValEmail(customerBackOfficeRequest.getEmail());
			person.setValMobile(customerBackOfficeRequest.getMobile());

			sendReq.setVerificateCode(customerBackOfficeRequest.getCustomerOTP());
			sendReq.setPerson(person);
			return sendReq;
		} catch (Exception e) {
			LogWriter.writeErrorLog(e, e.getMessage(), METHOD_NAME);
		}

		return null;
	}

	public static DeleteReqType deleteMapping(CustomerBackOfficeRequestTO customerBackOfficeRequest) {
		final String METHOD_NAME = "";
		DeleteReqType sendReq = null;
		com.backoffice.client.otp.ContextTransactionType contextTransaction = null;
		com.backoffice.client.otp.AgentType agent = null;
		com.backoffice.client.otp.OfficeType office = null;
		com.backoffice.client.otp.ServicePointType servicePoint = null;
		com.backoffice.client.otp.DeviceType device = null;

		PersonType person = null;

		try {
			sendReq = new DeleteReqType();

			contextTransaction = new com.backoffice.client.otp.ContextTransactionType();
			contextTransaction.setIdUser(customerBackOfficeRequest.getUserId());
			contextTransaction.setIdTx(UUID.randomUUID().toString());
			contextTransaction.setCodTypeTx("BackOfficePortal");
			contextTransaction.setCreationMsgDate(formatter.format(new Date()));
			sendReq.setContextTransaction(contextTransaction);
			agent = new com.backoffice.client.otp.AgentType();
			agent.setId("GYF001");
			office = new com.backoffice.client.otp.OfficeType();
			servicePoint = new com.backoffice.client.otp.ServicePointType();
			servicePoint.setId(customerBackOfficeRequest.getServicePoint());
			device = new com.backoffice.client.otp.DeviceType();
			device.setId("1");
			servicePoint.setDevice(device);
			office.setServicePoint(servicePoint);
			agent.setOffice(office);
			sendReq.setAgent(agent);

			person = new PersonType();
			person.setId(customerBackOfficeRequest.getId());
			person.setCodTypeIdentification(customerBackOfficeRequest.getIdType());
			person.setValEmail(customerBackOfficeRequest.getEmail());
			person.setValMobile(customerBackOfficeRequest.getMobile());

			sendReq.setPerson(person);
			return sendReq;
		} catch (Exception e) {
			LogWriter.writeErrorLog(e, e.getMessage(), METHOD_NAME);
		}

		return null;
	}

	public static ProductsReqType getProductsByCustomerMapping(CustomerBackOfficeRequestTO customerBackOfficeRequest) {
		final String METHOD_NAME = "getProductsByCustomerMapping";
		ProductsReqType getProductsByCustomerReq = null;
		com.girosyfinanzas.schema.direccioncanales.contexttransactiontype.ContextTransactionType contextTransaction = null;
		com.girosyfinanzas.schema.direccioncanales.customercommontype.CustomerCommonType customerCommonType = null;
		try {
			getProductsByCustomerReq = new ProductsReqType();
			contextTransaction = new com.girosyfinanzas.schema.direccioncanales.contexttransactiontype.ContextTransactionType();
			contextTransaction.setIdUser(customerBackOfficeRequest.getUserId());
			contextTransaction.setIdTx(UUID.randomUUID().toString());
			contextTransaction.setCodTypeTx("PGI");
			contextTransaction.setCreationMsgDate(formatter.format(new Date()));
			getProductsByCustomerReq.setContextTransaction(contextTransaction);

			com.girosyfinanzas.schema.direccioncanales.agenttype.AgentType agent = new com.girosyfinanzas.schema.direccioncanales.agenttype.AgentType();
			// agent.setId("GYF002");
			agent.setId(UtilDelegate.CNB_360);

			com.girosyfinanzas.schema.direccioncanales.officetype.OfficeType office = new com.girosyfinanzas.schema.direccioncanales.officetype.OfficeType();
			com.girosyfinanzas.schema.direccioncanales.servicepointtype.ServicePointType sPoint = new com.girosyfinanzas.schema.direccioncanales.servicepointtype.ServicePointType();
			sPoint.setId(UtilDelegate.OFFICE_360);
			//sPoint.setId(customerBackOfficeRequest.getServicePoint());
			//sPoint.setId("700");
//			sPoint.setId("601");
			com.girosyfinanzas.schema.direccioncanales.devicetype.DeviceType device = new com.girosyfinanzas.schema.direccioncanales.devicetype.DeviceType();
			device.setId("1");
			sPoint.setDevice(device);
			office.setServicePoint(sPoint);
			agent.setOffice(office);
			getProductsByCustomerReq.setAgent(agent);

			customerCommonType = new com.girosyfinanzas.schema.direccioncanales.customercommontype.CustomerCommonType();

			customerCommonType.setId(customerBackOfficeRequest.getId());
			customerCommonType.setTypeIdentification(customerBackOfficeRequest.getIdType());
			customerCommonType.setName1(customerBackOfficeRequest.getFirstName());
			customerCommonType.setName2(customerBackOfficeRequest.getMiddleName());
			customerCommonType.setName3(customerBackOfficeRequest.getLastName());
			customerCommonType.setName4(customerBackOfficeRequest.getMiddleLastName());
			getProductsByCustomerReq.setCustomerCommon(customerCommonType);

			return getProductsByCustomerReq;
		} catch (Exception e) {
			LogWriter.writeErrorLog(e, e.getMessage(), METHOD_NAME);
		}
		return null;
	}

	public static CustomerBackOfficeResponseTO getProductsByCustomerResponseMapping(
			ProductsRespType getProductsByCustomerResp, CustomerBackOfficeRequestTO backOfficeRequestTO) {
		final String METHOD_NAME = "getProductsByCustomerResponseMapping";
		CustomerBackOfficeResponseTO customerBackOfficeResponse = null;
		List<ProductTO> productList = new ArrayList<ProductTO>(0);
		try {
			customerBackOfficeResponse = new CustomerBackOfficeResponseTO();

			// AHORROS
			if (getProductsByCustomerResp != null && getProductsByCustomerResp.getSavingAccounts() != null
					&& getProductsByCustomerResp.getSavingAccounts().getSavingAccount() != null
					&& getProductsByCustomerResp.getSavingAccounts().getSavingAccount().size() > 0) {
				ProductTO temp = new ProductTO();
				temp.setName("Ahorros");
				BigDecimal value = new BigDecimal("0.0");
				for (SavingAccountType itemProduct : getProductsByCustomerResp.getSavingAccounts().getSavingAccount()) {
					value = value.add(new BigDecimal(itemProduct.getBalance()));
				}
				temp.setValue(value.toPlainString());
				temp.setType("Saldo Total");
				productList.add(temp);
			}

			// creditos
			if (getProductsByCustomerResp != null && getProductsByCustomerResp.getCreditAccounts() != null
					&& getProductsByCustomerResp.getCreditAccounts().getCreditAccount() != null
					&& getProductsByCustomerResp.getCreditAccounts().getCreditAccount().size() > 0) {
				ProductTO temp = new ProductTO();
				temp.setName("Cr�ditos");
				BigDecimal value = new BigDecimal(0);
				for (CreditAccountType itemProduct : getProductsByCustomerResp.getCreditAccounts().getCreditAccount()) {
					if (!itemProduct.getLine().equalsIgnoreCase("TDCRBM")) {
						value = value.add(new BigDecimal(itemProduct.getTotalPay()));
					}

				}
				if (value.compareTo(BigDecimal.ZERO) > 0) {
					temp.setValue(value.toPlainString());
					temp.setType("Pago Total");
					productList.add(temp);
				}
			}

			// TC
			if (getProductsByCustomerResp != null && getProductsByCustomerResp.getCreditAccounts() != null
					&& getProductsByCustomerResp.getCreditAccounts().getCreditAccount() != null
					&& getProductsByCustomerResp.getCreditAccounts().getCreditAccount().size() > 0) {
				ProductTO temp = new ProductTO();
				temp.setName("Tarjeta de Cr�dito LA 14");
				BigDecimal value = new BigDecimal(0);
				for (CreditAccountType itemProduct : getProductsByCustomerResp.getCreditAccounts().getCreditAccount()) {
					if (itemProduct.getLine().equalsIgnoreCase("TDCRBM")) {
						value = value.add(new BigDecimal(itemProduct.getTotalPay()));
					}
				}
				if (value.compareTo(BigDecimal.ZERO) > 0) {
					temp.setValue(value.toPlainString());
					temp.setType("Pago Total");
					productList.add(temp);
				}
			}

			// CDTS
			if (getProductsByCustomerResp != null && getProductsByCustomerResp.getCdts() != null
					&& getProductsByCustomerResp.getCdts().getCdt() != null
					&& getProductsByCustomerResp.getCdts().getCdt().size() > 0) {
				ProductTO temp = new ProductTO();
				temp.setName("CDT");
				BigDecimal value = new BigDecimal(0);
				for (CDTType itemProduct : getProductsByCustomerResp.getCdts().getCdt()) {
					value = value.add(new BigDecimal(itemProduct.getValue()));
				}
				temp.setValue(value.toPlainString());
				temp.setType("Monto Total");
				productList.add(temp);

			}

			// seguros
			if (getProductsByCustomerResp != null && getProductsByCustomerResp.getInsurances() != null
					&& getProductsByCustomerResp.getInsurances().getInsuranceCompound() != null
					&& getProductsByCustomerResp.getInsurances().getInsuranceCompound().size() > 0) {
				ProductTO temp = new ProductTO();
				temp.setName("Seguros");
				BigDecimal value = new BigDecimal(0);
				for (InsuranceCompoundType itemProduct : getProductsByCustomerResp.getInsurances()
						.getInsuranceCompound()) {
					value = value.add(new BigDecimal(itemProduct.getInsurance().getAmountInsured()));
				}
				temp.setValue(value.toPlainString());
				temp.setType("Monto Total");
				productList.add(temp);
			}

			customerBackOfficeResponse.setProductList(productList);
			customerBackOfficeResponse.setId(backOfficeRequestTO.getId());
			customerBackOfficeResponse.setIdType(backOfficeRequestTO.getIdType());
			customerBackOfficeResponse.setServicePoint(backOfficeRequestTO.getServicePoint());
			customerBackOfficeResponse.setUserId(backOfficeRequestTO.getUserId());

			return customerBackOfficeResponse;
		} catch (Exception e) {
			LogWriter.writeErrorLog(e, e.getMessage(), METHOD_NAME);
		}

		return null;
	}

	public static InquiryBankAccountReqType inquiryBankAccountReqMapping(
			CustomerBackOfficeRequestTO customerBackOfficeRequest) {
		final String METHOD_NAME = "inquiryBankAccount()";
		InquiryBankAccountReqType inquiryBankAccount = null;
		com.backoffice.client.bank.ContextTransactionType contextTransaction = null;

		com.backoffice.client.bank.AgentType agent = null;
		com.backoffice.client.bank.OfficeType office = null;
		com.backoffice.client.bank.ServicePointType servicePoint = null;
		com.backoffice.client.bank.DeviceType device = null;

		com.backoffice.client.bank.CustomerCommonType customerCommonType = null;

		try {
			inquiryBankAccount = new InquiryBankAccountReqType();

			contextTransaction = new com.backoffice.client.bank.ContextTransactionType();
			contextTransaction.setIdUser(customerBackOfficeRequest.getUserId());
			contextTransaction.setIdTx(UUID.randomUUID().toString());
			contextTransaction.setCodTypeTx("PGI");
			contextTransaction.setCreationMsgDate(formatter.format(new Date()));
			inquiryBankAccount.setContextTransaction(contextTransaction);

			agent = new com.backoffice.client.bank.AgentType();
			agent.setId("GYF001");
			office = new com.backoffice.client.bank.OfficeType();
			servicePoint = new com.backoffice.client.bank.ServicePointType();
			servicePoint.setId(customerBackOfficeRequest.getServicePoint());
			device = new com.backoffice.client.bank.DeviceType();
			device.setId("1");
			servicePoint.setDevice(device);
			office.setServicePoint(servicePoint);
			agent.setOffice(office);
			inquiryBankAccount.setAgent(agent);

			customerCommonType = new com.backoffice.client.bank.CustomerCommonType();

			customerCommonType.setId(customerBackOfficeRequest.getId());
			customerCommonType.setTypeIdentification(customerBackOfficeRequest.getIdType());
			customerCommonType.setName1(customerBackOfficeRequest.getFirstName());
			customerCommonType.setName2(customerBackOfficeRequest.getMiddleName());
			customerCommonType.setName3(customerBackOfficeRequest.getLastName());
			customerCommonType.setName4(customerBackOfficeRequest.getMiddleLastName());
			inquiryBankAccount.setOwner(customerCommonType);
			inquiryBankAccount.setInquiryType("INFO_ACCOUNTS_EXTERNAL");

			return inquiryBankAccount;

		} catch (Exception e) {
			LogWriter.writeErrorLog(e, e.getMessage(), METHOD_NAME);
		}
		return null;
	}

	public static CustomerBackOfficeResponseTO inquiryBankAccountRespMapping(
			InquiryBankAccountRespType inquiryBankAccountResp, CustomerBackOfficeRequestTO backOfficeRequestTO) {
		final String METHOD_NAME = "inquiryBankAccountRespMapping";
		CustomerBackOfficeResponseTO customerBackOfficeResponse = null;
		BankAccountTO[] bankAccountList = null;
		try {
			customerBackOfficeResponse = new CustomerBackOfficeResponseTO();

			if (inquiryBankAccountResp != null && inquiryBankAccountResp.getInfoAccountsList() != null
					&& inquiryBankAccountResp.getInfoAccountsList().getInfoAccount() != null
					&& inquiryBankAccountResp.getInfoAccountsList().getInfoAccount().size() > 0) {
				bankAccountList = new BankAccountTO[inquiryBankAccountResp.getInfoAccountsList().getInfoAccount()
						.size()];
				int contador = 0;
				for (InfoAccountType itemInfoAccount : inquiryBankAccountResp.getInfoAccountsList().getInfoAccount()) {
					if (itemInfoAccount.getBankAccount() != null) {
						bankAccountList[contador] = new BankAccountTO();
						bankAccountList[contador].setState(itemInfoAccount.getBankAccount().getState());
						bankAccountList[contador].setCurrency(itemInfoAccount.getBankAccount().getCurrency());
						bankAccountList[contador].setAccountNumber(itemInfoAccount.getBankAccount().getAccountNumber());
						bankAccountList[contador].setAccountType(itemInfoAccount.getBankAccount().getAccountType());
						bankAccountList[contador].setAccountClass(itemInfoAccount.getBankAccount().getAccountClass());
						bankAccountList[contador].setSystem(itemInfoAccount.getBankAccount().getSystem());
						bankAccountList[contador].setProduct(itemInfoAccount.getBankAccount().getProduct());
						bankAccountList[contador].setAgency(itemInfoAccount.getBankAccount().getAgency());
						bankAccountList[contador].setOverDraft(itemInfoAccount.getBankAccount().getOverDraft());
						bankAccountList[contador]
								.setAvailableBalanace(itemInfoAccount.getBankAccount().getAvailableBalanace());
						bankAccountList[contador].setTradeBalance(itemInfoAccount.getBankAccount().getTradeBalance());
						bankAccountList[contador].setBankCode(itemInfoAccount.getBankAccount().getBankCode());
						bankAccountList[contador].setOperation(itemInfoAccount.getBankAccount().getOperation());
						bankAccountList[contador].setBankName(itemInfoAccount.getBankAccount().getBankName());
						bankAccountList[contador].setAlias(itemInfoAccount.getBankAccount().getAlias());
						contador++;
					}
				}
				customerBackOfficeResponse.setBankAccountList(bankAccountList);
			}

			customerBackOfficeResponse.setId(backOfficeRequestTO.getId());
			customerBackOfficeResponse.setIdType(backOfficeRequestTO.getIdType());
			customerBackOfficeResponse.setServicePoint(backOfficeRequestTO.getServicePoint());
			customerBackOfficeResponse.setUserId(backOfficeRequestTO.getUserId());

			return customerBackOfficeResponse;
		} catch (Exception e) {
			LogWriter.writeErrorLog(e, e.getMessage(), METHOD_NAME);
		}
		return null;
	}

	public static CustomerBackOfficeResponseTO inquiryPseInformationResponse(List<PseVO> pseList,
			CustomerBackOfficeRequestTO customerBackOfficeRequest) {
		final String METHOD_NAME = "inquiryPseInformationResponse";
		CustomerBackOfficeResponseTO backOfficeResponse = null;
		PseTO[] pse = null;
		try {
			backOfficeResponse = new CustomerBackOfficeResponseTO();
			if (pseList != null && pseList.size() > 0) {
				pse = new PseTO[pseList.size()];
				int contador = 0;
				for (PseVO itemPse : pseList) {
					pse[contador] = new PseTO();

					pse[contador].setType(itemPse.getType());
					pse[contador].setOperationDae(itemPse.getOperationDae());
					pse[contador].setMethodOfPayment(itemPse.getMethodOfPayment());
					pse[contador].setStatus(itemPse.getStatus());
					pse[contador].setNotificationStatus(itemPse.getNotificationStatus());
					pse[contador].setNotificationAttempts(itemPse.getNotificationAttempts());
					pse[contador].setUserId(itemPse.getUserId());

					contador++;
				}
			}

			backOfficeResponse.setId(customerBackOfficeRequest.getId());
			backOfficeResponse.setIdType(customerBackOfficeRequest.getIdType());
			backOfficeResponse.setServicePoint(customerBackOfficeRequest.getServicePoint());
			backOfficeResponse.setUserId(customerBackOfficeRequest.getUserId());
			backOfficeResponse.setPseList(pse);

			return backOfficeResponse;
		} catch (Exception e) {
			LogWriter.writeErrorLog(e, e.getMessage(), METHOD_NAME);
		}

		return null;
	}
	
	
	public static DomainRequest domainRequestMapping(CustomerBackOfficeRequestTO portalRequestTO, String element)
	{
		final String METHOD_NAME = "domainRequestMapping";
		DomainRequest domainRequest = null;
		com.backoffice.client.support.ContextTransactionType contextTransaction = null;
		try 
		{
			domainRequest = new DomainRequest();
			
			
			contextTransaction = new com.backoffice.client.support.ContextTransactionType();

			contextTransaction.setIdUser(portalRequestTO.getUserId());
			contextTransaction.setIdTx(UUID.randomUUID().toString());
			contextTransaction.setCodTypeTx("BackOfficePortal");
			domainRequest.setContextTransaction(contextTransaction);
			
			domainRequest.setCadenaElementos(element);
			
			return domainRequest;
		} catch (Exception e) 
		{
			LogWriter.writeErrorLog(e, e.getMessage(), METHOD_NAME);
		}
		
		return null;
	}
	
	
	
	public static CustomerBackOfficeResponseTO  portalResponseMapping(DomainResponse domainResponse,CustomerBackOfficeRequestTO portalRequestTO)
	{
		final String METHOD_NAME = "portalResponseMapping";
		CustomerBackOfficeResponseTO portalResponseTO = null;
		List<ValueDomainElementTO> valueDomainElements = null;
		ValueDomainElementTO itemValueDomainElement = null;
		try 
		{
			portalResponseTO = new CustomerBackOfficeResponseTO();
			
			portalResponseTO.setUserId(portalRequestTO.getUserId());
			portalResponseTO.setServicePoint(portalRequestTO.getServicePoint());
			
			if(domainResponse != null && domainResponse.getResponse() != null 
					&& domainResponse.getResponse().getRespoServicesTO() != null
					&& domainResponse.getResponse().getRespoServicesTO().size() > 0)
			{
				valueDomainElements = new ArrayList<ValueDomainElementTO>();
				for(SupportServicesTO itemSupportServices : domainResponse.getResponse().getRespoServicesTO())
				{
					
					for(ValueDomainTO itemValueDomainTO :  itemSupportServices.getValueDomain() )
					{
						itemValueDomainElement = new ValueDomainElementTO();
						itemValueDomainElement.setName(itemValueDomainTO.getName());
						itemValueDomainElement.setDescription(itemValueDomainTO.getDescription());
						itemValueDomainElement.setCode(itemValueDomainTO.getCode());
						valueDomainElements.add(itemValueDomainElement);
					}
					
				}
				portalResponseTO.setValueDomainElement(valueDomainElements);
			}
			
			
			return portalResponseTO;
		} catch (Exception e) 
		{
			LogWriter.writeErrorLog(e, e.getMessage(), METHOD_NAME);
		}
		
		return null;
	}
	
	public static ReportApprovalStateTO map(ReportApprovalStateVO in) {
		ReportApprovalStateTO out = null;
		if( in != null ) {
			out = new ReportApprovalStateTO();
			out.setFechaCreacion(in.getFechaCreacion());
			out.setTipoDocumento(in.getTipoDocumento());
			out.setDocumento(in.getDocumento());
			out.setNumeroTarjeta(in.getNumeroTarjeta());
			out.setEstado(in.getEstado());
			out.setValorCupoAprobado(in.getValorCupoAprobado());
			out.setValorCupoAvances(in.getValorCupoAvances());
			out.setNombreCajero(in.getNombreCajero());
			out.setRegional(in.getRegional());
			out.setAgencia(in.getAgencia());
			out.setPuntoServicio(in.getPuntoServicio());
			out.setCiudadOficina(in.getCiudadOficina());
			out.setNombreOficina(in.getNombreOficina());
			out.setDireccionEntrega(in.getDireccionEntrega());
		}
		return out;
	}
	
	
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.backoffice.model.to.PseTO");
		for (Method itemMethod : clazz.getMethods()) {
			if (itemMethod.getName().startsWith("set")) {
				String name = "get" + itemMethod.getName().substring(3);
				System.out.println("pse[contador]." + itemMethod.getName() + "(itemPse." + name + "());");

			}
		}
	}

}