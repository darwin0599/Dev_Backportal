package com.gyf.backoffice.delegate;

import java.util.Date;
import java.util.List;

import com.backoffice.model.interfaces.BackOfficeRemote;
import com.backoffice.model.to.CustomerBackOfficeRequestTO;
import com.backoffice.model.to.CustomerBackOfficeResponseTO;
import com.backoffice.model.to.ReportApprovalStateTO;
import com.gyf.backoffice.constants.KeyConstant;
import com.gyf.constants.ConstantesSeverity;
import com.gyf.exception.ApplicationException;
import com.gyf.exception.ControlApplicationException;
import com.gyf.exception.mngr.ExceptionManager;
import com.gyf.initialcontext.ServiceLocatorEjb3;

public class BackOfficeDelegate {

	public static final String CLASS_NAME = "com.gyf.backoffice.delegate.BackOfficeDelegate";
	
	private CustomerBackOfficeResponseTO emailAndMobile;
	private CustomerBackOfficeResponseTO registredAndCompliance;
	private CustomerBackOfficeResponseTO extraData;
	
	public synchronized CustomerBackOfficeResponseTO emailAndMobileInformation(CustomerBackOfficeRequestTO customerBackOfficeRequest ) 
			throws ControlApplicationException, ApplicationException, InterruptedException
	{
		final String METHOD_NAME = "emailAndMobileInformation(CustomerBackOfficeRequestTO customerBackOfficeRequest )";
		try {
			if(this.emailAndMobile == null) {
				BackOfficeRemote remote =  (BackOfficeRemote)ServiceLocatorEjb3.getInstance()
						.getContext(KeyConstant.SERVER, KeyConstant.HOST, false).lookup(KeyConstant.BACKOFFICE_REMOTE);
				this.emailAndMobile = remote.emailAndMobileInformation(customerBackOfficeRequest);
			}
		}catch (Exception e) {
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME,
					"Error en la consulta email y correo", ConstantesSeverity.FATAL);
		}		
		return this.emailAndMobile;
	}
	
	public synchronized CustomerBackOfficeResponseTO registredAndComplianceList(CustomerBackOfficeRequestTO customerBackOfficeRequest ) 
			throws ControlApplicationException, ApplicationException
	{
		final String METHOD_NAME = "registredAndComplianceList(CustomerBackOfficeRequestTO customerBackOfficeRequest )";
		try {
			if(this.registredAndCompliance == null) {
				BackOfficeRemote remote =  (BackOfficeRemote)ServiceLocatorEjb3.getInstance()
						.getContext(KeyConstant.SERVER, KeyConstant.HOST, false).lookup(KeyConstant.BACKOFFICE_REMOTE);
				this.registredAndCompliance = remote.registredAndComplianceList(customerBackOfficeRequest);
			}
		}catch (Exception e) {
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME,
					"Error en la consulta registrado y Sarlaft", ConstantesSeverity.FATAL);
		}
		return this.registredAndCompliance;
	}
	
	public synchronized CustomerBackOfficeResponseTO customerExtraData(CustomerBackOfficeRequestTO backOfficeRequestTO) 
			throws ApplicationException, ControlApplicationException
	{
		final String METHOD_NAME = "customerExtraData(CustomerBackOfficeRequestTO backOfficeRequestTO)";
		try {
			if(this.extraData == null) {
				BackOfficeRemote remote =  (BackOfficeRemote)ServiceLocatorEjb3.getInstance()
						.getContext(KeyConstant.SERVER, KeyConstant.HOST, false).lookup(KeyConstant.BACKOFFICE_REMOTE);
				this.extraData = remote.customerExtraData(backOfficeRequestTO);
			}
		}catch (Exception e) {
			e.printStackTrace();
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME,
					"Error en la consulta de datos extras", ConstantesSeverity.FATAL);
		}
		return this.extraData;
	}
	
	public CustomerBackOfficeResponseTO sendOTPDiffuserEmail(CustomerBackOfficeRequestTO backOfficeRequestTO) 
			throws ApplicationException, ControlApplicationException
	{
		final String METHOD_NAME = "sendOTPDiffuserEmail(CustomerBackOfficeRequestTO backOfficeRequestTO)";
		try {
			
				BackOfficeRemote remote =  (BackOfficeRemote)ServiceLocatorEjb3.getInstance()
						.getContext(KeyConstant.SERVER, KeyConstant.HOST, false).lookup(KeyConstant.BACKOFFICE_REMOTE);
				return remote.sendOTPDiffuserEmail(backOfficeRequestTO);		
		}catch (Exception e) {
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME,
					"Error enviando OTP via EMail", ConstantesSeverity.FATAL);
		}
		return null;
	}
	
	public CustomerBackOfficeResponseTO sendOTPDiffuserSMS(CustomerBackOfficeRequestTO backOfficeRequestTO) 
			throws ApplicationException, ControlApplicationException
	{		
		final String METHOD_NAME = "sendOTPDiffuserSMS(CustomerBackOfficeRequestTO backOfficeRequestTO)";
		try {
			
				BackOfficeRemote remote =  (BackOfficeRemote)ServiceLocatorEjb3.getInstance()
						.getContext(KeyConstant.SERVER, KeyConstant.HOST, false).lookup(KeyConstant.BACKOFFICE_REMOTE);
				return remote.sendOTPDiffuserSMS(backOfficeRequestTO);		
		}catch (Exception e) {
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME,
					"Error enviando OTP via SMS", ConstantesSeverity.FATAL);
		}
		return null;
	}
	
	public CustomerBackOfficeResponseTO updateAdminBlock( CustomerBackOfficeRequestTO backOfficeRequestTO ) 
			throws ApplicationException, ControlApplicationException
	{
		final String METHOD_NAME = "updateAdminBlock( CustomerBackOfficeRequestTO backOfficeRequestTO )";
		try {
			
				BackOfficeRemote remote =  (BackOfficeRemote)ServiceLocatorEjb3.getInstance()
						.getContext(KeyConstant.SERVER, KeyConstant.HOST, false).lookup(KeyConstant.BACKOFFICE_REMOTE);
				return remote.updateAdminBlock(backOfficeRequestTO);
		}catch (Exception e) {
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME,
					"Error desbloqueando Usuario", ConstantesSeverity.FATAL);
		}
		return null;
	}
	
	public CustomerBackOfficeResponseTO updateUnlockAdminBlock( CustomerBackOfficeRequestTO backOfficeRequestTO ) 
			throws ApplicationException, ControlApplicationException
	{
		final String METHOD_NAME = "updateUnlockAdminBlock( CustomerBackOfficeRequestTO backOfficeRequestTO )";
		try {
			
				BackOfficeRemote remote =  (BackOfficeRemote)ServiceLocatorEjb3.getInstance()
						.getContext(KeyConstant.SERVER, KeyConstant.HOST, false).lookup(KeyConstant.BACKOFFICE_REMOTE);
				return remote.updateUnlockAdminBlock(backOfficeRequestTO);	
		}catch (Exception e) {
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME,
					"Error bloqueando Usuario", ConstantesSeverity.FATAL);
		}
		return null;
	}
	
	public CustomerBackOfficeResponseTO getProductsByCustomer(CustomerBackOfficeRequestTO backOfficeRequestTO) 
			throws ApplicationException, ControlApplicationException
	{
		
		final String METHOD_NAME = "customerExtraData(CustomerBackOfficeRequestTO backOfficeRequestTO)";
		try 
		{
				BackOfficeRemote remote =  (BackOfficeRemote)ServiceLocatorEjb3.getInstance()
						.getContext(KeyConstant.SERVER, KeyConstant.HOST, false).lookup(KeyConstant.BACKOFFICE_REMOTE);
				return this.extraData = remote.getProductsByCustomer(backOfficeRequestTO);
		}catch (Exception e) 
		{
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME,
					"Error en la consulta de datos extras", ConstantesSeverity.FATAL);
		}
		
		return null;
	}
	
	public CustomerBackOfficeResponseTO inquiryBankAccount(CustomerBackOfficeRequestTO backOfficeRequestTO) 
			throws ApplicationException, ControlApplicationException
	{
		final String METHOD_NAME = "customerExtraData(CustomerBackOfficeRequestTO backOfficeRequestTO)";
		try 
		{
				BackOfficeRemote remote =  (BackOfficeRemote)ServiceLocatorEjb3.getInstance()
						.getContext(KeyConstant.SERVER, KeyConstant.HOST, false).lookup(KeyConstant.BACKOFFICE_REMOTE);
				return this.extraData = remote.inquiryBankAccount(backOfficeRequestTO);
		}catch (Exception e) 
		{
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME,
					"Error en la consulta de datos extras", ConstantesSeverity.FATAL);
		}
		
		return null;
	}
	
	public CustomerBackOfficeResponseTO inquiryPseInformation(CustomerBackOfficeRequestTO backOfficeRequestTO, Date fechaIni, Date fechaFin, String estado) 
			throws ApplicationException, ControlApplicationException
	{
		final String METHOD_NAME = "inquiryPseInformation(CustomerBackOfficeRequestTO backOfficeRequestTO, Date fechaIni, Date fechaFin, String estado)";
		try 
		{
				BackOfficeRemote remote =  (BackOfficeRemote)ServiceLocatorEjb3.getInstance()
						.getContext(KeyConstant.SERVER, KeyConstant.HOST, false).lookup(KeyConstant.BACKOFFICE_REMOTE);
				return this.extraData = remote.inquiryPseInformation(backOfficeRequestTO,fechaIni,fechaFin,estado);
		}catch (Exception e) 
		{
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME,
					"Error en la consulta de las transacciones PSE", ConstantesSeverity.FATAL);
		}
		
		return null;
	}
	
	public CustomerBackOfficeResponseTO deleteCustomer(CustomerBackOfficeRequestTO backOfficeRequestTO) 
			throws ApplicationException, ControlApplicationException
	{
		final String METHOD_NAME = "deleteCustomer(CustomerBackOfficeRequestTO backOfficeRequestTO)";
		try {
			
				BackOfficeRemote remote =  (BackOfficeRemote)ServiceLocatorEjb3.getInstance()
						.getContext(KeyConstant.SERVER, KeyConstant.HOST, false).lookup(KeyConstant.BACKOFFICE_REMOTE);
				return remote.deleteCustomer(backOfficeRequestTO);	
		}catch (Exception e) {
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME,
					"Error Eliminando Usuario", ConstantesSeverity.FATAL);
		}
		return null;
	}
	
	public CustomerBackOfficeResponseTO getCommonsServiceInfromation(CustomerBackOfficeRequestTO portalRequest) 
			throws ControlApplicationException, ApplicationException {
		final String METHOD_NAME = "getCommonsServiceInfromation(TransactionPortalRequestTO portalRequest)";
		try {
			BackOfficeRemote remote = (BackOfficeRemote)ServiceLocatorEjb3.getInstance()
					.getContext(KeyConstant.SERVER, KeyConstant.HOST, false).lookup(KeyConstant.BACKOFFICE_REMOTE);
			return remote.getCommonsServiceInfromation(portalRequest);
		}catch (Exception e) {
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME,
					"Error en la consulta para los commons", ConstantesSeverity.FATAL);
		}
		
		return null;
	}
	
	public List<ReportApprovalStateTO> getCreditCardReport(ReportApprovalStateTO filter) 
			throws ControlApplicationException, ApplicationException {
		final String METHOD_NAME = "getCreditCardReport(ReportApprovalStateTO filter)";
		try {
			BackOfficeRemote remote = (BackOfficeRemote)ServiceLocatorEjb3.getInstance()
					.getContext(KeyConstant.SERVER, KeyConstant.HOST, false).lookup(KeyConstant.BACKOFFICE_REMOTE);
			return remote.getCreditCardReport(filter);
		}catch (Exception e) {
			ExceptionManager.controlApplicationExceptionEjb3(e, CLASS_NAME, METHOD_NAME,
					"Error en la consulta del reporte de tarjeta de credito", ConstantesSeverity.FATAL);
		}
		
		return null;
	}
}
