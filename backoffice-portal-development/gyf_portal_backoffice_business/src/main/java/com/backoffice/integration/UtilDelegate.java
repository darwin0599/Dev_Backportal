package com.backoffice.integration;

import java.text.SimpleDateFormat;

import com.backoffice.client.bank.InquiryBankAccountFault;
import com.backoffice.client.customer.ErrorType;
import com.backoffice.client.customer.InquiryByIdCustomerFault;
import com.backoffice.client.otp.DeleteFault;
import com.backoffice.client.otp.SendFault;
import com.backoffice.client.otp.ValidateFault;
import com.backoffice.client.products.GetProductsByCustomerFault;
import com.backoffice.client.validatecustomer.ValidateCompliancesListFault;
import com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer.ProductsFault;
import com.gyf.constants.ConstantesSeverity;
import com.gyf.constants.MessageApplicationEnum;
import com.gyf.error.util.ErrorUtil;
import com.gyf.exception.ApplicationException;
import com.gyf.exception.ControlApplicationException;
import com.gyf.exception.mngr.ExceptionManager;
import com.gyf.exception.model.ErrorModelControlException;
import com.gyf.exception.model.ErrorModelException;
import com.gyf.message.mngr.MessagesApplicationLoader;
import com.gyf.message.mngr.MessagesApplicationsVO;

import properties.ParametersLoader;

public class UtilDelegate {
	
	public static final String CLASS_NAME = "com.backoffice.integration.BackOfficeDelegate";
	
	protected static SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss:SS");
	
	protected static String CUSTOMER_SERVICE_URL = "";
	
	protected static String VALIDATE_CUSTOMER_URL = ""; 
	
	protected static String OTP_DIFFUSER_URL = "";
	
	protected static String CUSTOMER_PRODUCTS_URL = "";
	
	protected static String CUSTOMER_BANK_ACCOUNT_URL ="";
	
	protected static String EJB_AUDIT = "";
	
	protected static String LDAP_URL = "";
	
	protected static String LDAP_USERNAME ="";
	
	protected static String LDAP_PASSWORD = "";
	
	protected static String LDAP_UID = "";
	
	protected static String URL_COMMONS = "";
	
	public static String CNB_360 = "";
	public static String OFFICE_360 = "";
	
	
	protected final static String CONNECTION_TYPE = "simple" ;
	
	protected final static String SEARCH_FILTER = "(cn={0})";
	
	static
	{
		try {
			CUSTOMER_SERVICE_URL = ParametersLoader.getInstance().getParameterTO("SRVINTCUSTOMER-SERVICIOS");
			VALIDATE_CUSTOMER_URL = ParametersLoader.getInstance().getParameterTO("SRVINTVLIDATECUSTOMER-SERVICIOS");
			OTP_DIFFUSER_URL  = ParametersLoader.getInstance().getParameterTO("SRVINTOTPDIFFUSER-SERVICIOS");
			CUSTOMER_PRODUCTS_URL = ParametersLoader.getInstance().getParameterTO("SRVINTCUSTOMERPRODUCTS-SERVICIOS");
			CUSTOMER_BANK_ACCOUNT_URL = ParametersLoader.getInstance().getParameterTO("SRVINTCUSTOMERBANKACCOUNT-SERVICIOS");
			EJB_AUDIT = ParametersLoader.getInstance().getParameterTO("EJBAUDIT-SERVICIOS");
			LDAP_URL =  ParametersLoader.getInstance().getParameterTO("LDAP-URL");
			LDAP_USERNAME =  ParametersLoader.getInstance().getParameterTO("LDAP-USERNAME-URL");
			LDAP_PASSWORD = ParametersLoader.getInstance().getParameterTO("LDAP-PASSWORD-URL");
			LDAP_UID = ParametersLoader.getInstance().getParameterTO("LDAP-UID-URL");
			URL_COMMONS = ParametersLoader.getInstance().getParameterTO("RPRINT-URL-WEBSERVICE-DATA-RPRINT");
			CNB_360 = ParametersLoader.getInstance().getParameterTO("STANDARDCNB-BOPORTAL");
			OFFICE_360 = ParametersLoader.getInstance().getParameterTO("STANDARDOFFICE-BOPORTAL");
		} catch (Exception e) 
		{
			CUSTOMER_SERVICE_URL = "http://172.16.16.53:7802/servicios/DireccionCanales/SrvIntCustomer?wsdl";
			VALIDATE_CUSTOMER_URL = "http://172.16.16.53:7804/servicios/DireccionCanales/SrvIntCustomerOrq?wsdl";
			OTP_DIFFUSER_URL = "http://172.16.16.53:7860/servicios/DireccionCanales/SrvIntOTPDiffuser/?wsdl";
			CUSTOMER_PRODUCTS_URL = "http://172.16.16.53:7802/servicios/DireccionCanales/SrvIntProduct/?wsdl";
			CUSTOMER_BANK_ACCOUNT_URL = "http://172.16.16.53:7805/servicios/DireccionCanales/SrvIntBankAccount/?wsdl";
			LDAP_URL = "ldap://172.16.16.231:389";
		}
	}
	
	
	protected void ExceptionManagerLocal( Exception ex ) throws ApplicationException, ControlApplicationException
	{
		final String METHOD_NAME = "ExceptionManagerLocal()";
		ControlApplicationException controlApplicationException = null;
		ApplicationException applicationException = null;
		ErrorModelControlException [] errorModelControlExceptionList = null;
		
		try {
			if( ex instanceof  InquiryByIdCustomerFault)
			{
				InquiryByIdCustomerFault fault = (InquiryByIdCustomerFault)ex;
				int contador = 0;
				errorModelControlExceptionList = new ErrorModelControlException [fault.getFaultInfo().getFault().getErrors().getError().size()];
				for ( ErrorType itemErrorType : fault.getFaultInfo().getFault().getErrors().getError() )
				{
					errorModelControlExceptionList[contador] = new ErrorModelControlException();
					errorModelControlExceptionList[contador].setErrorCode(itemErrorType.getCodError());
					errorModelControlExceptionList[contador].setErrorMessage(itemErrorType.getDescError());
					errorModelControlExceptionList[contador].setSeverity(itemErrorType.getCodTypeSeverity());
					contador++;
				}
				controlApplicationException = new ControlApplicationException(errorModelControlExceptionList);
				throw controlApplicationException;
			}else if(ex instanceof ValidateCompliancesListFault)
			{
				
				ValidateCompliancesListFault fault = (ValidateCompliancesListFault)ex;
				int contador = 0;
				errorModelControlExceptionList = new ErrorModelControlException [fault.getFaultInfo().getFault().getErrors().getError().size()];
				for ( com.backoffice.client.validatecustomer.ErrorType itemErrorType : fault.getFaultInfo().getFault().getErrors().getError() )
				{
					errorModelControlExceptionList[contador] = new ErrorModelControlException();
					errorModelControlExceptionList[contador].setErrorCode(itemErrorType.getCodError());
					errorModelControlExceptionList[contador].setErrorMessage(itemErrorType.getDescError());
					errorModelControlExceptionList[contador].setSeverity(itemErrorType.getCodTypeSeverity());
					contador++;
				}
				controlApplicationException = new ControlApplicationException(errorModelControlExceptionList);
				throw controlApplicationException;
			}else if(ex instanceof SendFault)
			{
				SendFault fault = (SendFault)ex;
				int contador = 0;
				errorModelControlExceptionList = new ErrorModelControlException [fault.getFaultInfo().getFault().getErrors().getError().size()];
				for ( com.backoffice.client.otp.ErrorType itemErrorType : fault.getFaultInfo().getFault().getErrors().getError() )
				{
					errorModelControlExceptionList[contador] = new ErrorModelControlException();
					errorModelControlExceptionList[contador].setErrorCode(itemErrorType.getCodError());
					errorModelControlExceptionList[contador].setErrorMessage(itemErrorType.getDescError());
					errorModelControlExceptionList[contador].setSeverity(itemErrorType.getCodTypeSeverity());
					contador++;
				}
				controlApplicationException = new ControlApplicationException(errorModelControlExceptionList);
				throw controlApplicationException;
			}else if( ex instanceof ProductsFault )
			{
				ProductsFault fault = (ProductsFault)ex;
				int contador = 0;
				errorModelControlExceptionList = new ErrorModelControlException [fault.getFaultInfo().getFault().getErrors().getError().size()];
				for ( com.girosyfinanzas.schema.direccioncanales.errortype.ErrorType itemErrorType : fault.getFaultInfo().getFault().getErrors().getError() )
				{
					errorModelControlExceptionList[contador] = new ErrorModelControlException();
					errorModelControlExceptionList[contador].setErrorCode(itemErrorType.getCodError());
					errorModelControlExceptionList[contador].setErrorMessage(itemErrorType.getDescError());
					errorModelControlExceptionList[contador].setSeverity(itemErrorType.getCodTypeSeverity());
					contador++;
				}
				controlApplicationException = new ControlApplicationException(errorModelControlExceptionList);
				throw controlApplicationException;
			}else if(ex instanceof InquiryBankAccountFault )
			{
				InquiryBankAccountFault fault = (InquiryBankAccountFault)ex;
				int contador = 0;
				errorModelControlExceptionList = new ErrorModelControlException [fault.getFaultInfo().getFault().getErrors().getError().size()];
				for ( com.backoffice.client.bank.ErrorType itemErrorType : fault.getFaultInfo().getFault().getErrors().getError() )
				{
					errorModelControlExceptionList[contador] = new ErrorModelControlException();
					errorModelControlExceptionList[contador].setErrorCode(itemErrorType.getCodError());
					errorModelControlExceptionList[contador].setErrorMessage(itemErrorType.getDescError());
					errorModelControlExceptionList[contador].setSeverity(itemErrorType.getCodTypeSeverity());
					contador++;
				}
				controlApplicationException = new ControlApplicationException(errorModelControlExceptionList);
				throw controlApplicationException;
			}else if(ex instanceof DeleteFault)
			{
				DeleteFault fault = (DeleteFault)ex;
				int contador = 0;
				errorModelControlExceptionList = new ErrorModelControlException [fault.getFaultInfo().getFault().getErrors().getError().size()];
				for ( com.backoffice.client.otp.ErrorType itemErrorType : fault.getFaultInfo().getFault().getErrors().getError() )
				{
					errorModelControlExceptionList[contador] = new ErrorModelControlException();
					errorModelControlExceptionList[contador].setErrorCode(itemErrorType.getCodError());
					errorModelControlExceptionList[contador].setErrorMessage(itemErrorType.getDescError());
					errorModelControlExceptionList[contador].setSeverity(itemErrorType.getCodTypeSeverity());
					contador++;
				}
				controlApplicationException = new ControlApplicationException(errorModelControlExceptionList);
				throw controlApplicationException;
			}else if(ex instanceof ValidateFault)
			{
				ValidateFault fault = (ValidateFault)ex;
				int contador = 0;
				errorModelControlExceptionList = new ErrorModelControlException [fault.getFaultInfo().getFault().getErrors().getError().size()];
				for ( com.backoffice.client.otp.ErrorType itemErrorType : fault.getFaultInfo().getFault().getErrors().getError() )
				{
					errorModelControlExceptionList[contador] = new ErrorModelControlException();
					errorModelControlExceptionList[contador].setErrorCode(itemErrorType.getCodError());
					errorModelControlExceptionList[contador].setErrorMessage(itemErrorType.getDescError());
					errorModelControlExceptionList[contador].setSeverity(itemErrorType.getCodTypeSeverity());
					contador++;
				}
				controlApplicationException = new ControlApplicationException(errorModelControlExceptionList);
				throw controlApplicationException;
			}else
			{
				ErrorModelException errorModelException = new ErrorModelException();
				errorModelException.setClassName(CLASS_NAME);
				errorModelException.setProcess("Ocurrio un error no controlado [" + ex.getMessage() + "]");
				errorModelException.setMessage("Ocurrio un error no controlado [" + ex.getMessage() + "]");
				errorModelException.setMethodName(METHOD_NAME);
				errorModelException.setSeverity(ConstantesSeverity.FATAL);
				errorModelException.setTrace(ErrorUtil.getExceptionStackTraceString(ex));
				applicationException = new ApplicationException(errorModelException);
				throw applicationException;
			}
		} catch (Exception e) {
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME, "Generando errores de manera controlada",
					ConstantesSeverity.FATAL);
		}
	}
	
	
	protected void handleTimeOutException(MessageApplicationEnum applicationEnum) throws ControlApplicationException
	{
		ErrorModelControlException [] errorModelControlExceptionList = new ErrorModelControlException [1];
		errorModelControlExceptionList[0] = new ErrorModelControlException();
		errorModelControlExceptionList[0].setErrorCode(applicationEnum.getMessageCode());
		MessagesApplicationsVO mensaje = MessagesApplicationLoader.getInstance().getItemMessage(applicationEnum.getMessageCode());
		if ( mensaje != null )
		{
			errorModelControlExceptionList[0].setErrorMessage(mensaje.getBusinessDescription());
			errorModelControlExceptionList[0].setSeverity(mensaje.getSeverity());
		}
		throw new ControlApplicationException(errorModelControlExceptionList);
	}
	
}
