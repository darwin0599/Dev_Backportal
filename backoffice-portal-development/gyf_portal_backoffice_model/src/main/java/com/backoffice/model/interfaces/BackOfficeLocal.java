package com.backoffice.model.interfaces;

import java.util.Date;
import java.util.List;

import com.backoffice.model.to.CustomerBackOfficeRequestTO;
import com.backoffice.model.to.CustomerBackOfficeResponseTO;
import com.backoffice.model.to.ReportApprovalStateTO;
import com.gyf.exception.ApplicationException;
import com.gyf.exception.ControlApplicationException;

public interface BackOfficeLocal {

	public CustomerBackOfficeResponseTO emailAndMobileInformation(CustomerBackOfficeRequestTO customerBackOfficeRequest ) throws ControlApplicationException, ApplicationException;
	
	public CustomerBackOfficeResponseTO registredAndComplianceList(CustomerBackOfficeRequestTO customerBackOfficeRequest ) throws ControlApplicationException, ApplicationException;

	public CustomerBackOfficeResponseTO customerExtraData(CustomerBackOfficeRequestTO backOfficeRequestTO) throws ApplicationException, ControlApplicationException;
	
	public CustomerBackOfficeResponseTO sendOTPDiffuserSMS(CustomerBackOfficeRequestTO backOfficeRequestTO) throws ApplicationException, ControlApplicationException;
	
	public CustomerBackOfficeResponseTO sendOTPDiffuserEmail(CustomerBackOfficeRequestTO backOfficeRequestTO) throws ApplicationException, ControlApplicationException;
	
	public CustomerBackOfficeResponseTO updateUnlockAdminBlock( CustomerBackOfficeRequestTO backOfficeRequestTO )  throws ApplicationException, ControlApplicationException;
	
	public CustomerBackOfficeResponseTO updateAdminBlock( CustomerBackOfficeRequestTO backOfficeRequestTO )  throws ApplicationException, ControlApplicationException;
	
	public CustomerBackOfficeResponseTO getProductsByCustomer(CustomerBackOfficeRequestTO backOfficeRequestTO) throws ApplicationException, ControlApplicationException;
	
	public CustomerBackOfficeResponseTO inquiryBankAccount(CustomerBackOfficeRequestTO backOfficeRequestTO) throws ApplicationException, ControlApplicationException;
	
	public CustomerBackOfficeResponseTO inquiryPseInformation(CustomerBackOfficeRequestTO backOfficeRequestTO, Date fechaIni, Date fechaFin, String estado) throws ApplicationException, ControlApplicationException;
	
	public CustomerBackOfficeResponseTO deleteCustomer(CustomerBackOfficeRequestTO backOfficeRequestTO) throws ApplicationException, ControlApplicationException;

	public CustomerBackOfficeResponseTO getCommonsServiceInfromation(CustomerBackOfficeRequestTO portalRequest)throws ControlApplicationException, ApplicationException;
	
	public List<ReportApprovalStateTO> getCreditCardReport(ReportApprovalStateTO filter) throws ApplicationException, ControlApplicationException;
	
}
