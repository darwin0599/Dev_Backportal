package com.backoffice.bean;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import com.backoffice.manager.BackOfficeMngr;
import com.backoffice.model.interfaces.BackOfficeLocal;
import com.backoffice.model.interfaces.BackOfficeRemote;
import com.backoffice.model.to.CustomerBackOfficeRequestTO;
import com.backoffice.model.to.CustomerBackOfficeResponseTO;
import com.backoffice.model.to.ReportApprovalStateTO;
import com.gyf.conncetion.ConnectionBuilder;
import com.gyf.conncetion.ConnectionFactory;
import com.gyf.constants.DBConnectionTypeEnum;
import com.gyf.exception.ApplicationException;
import com.gyf.exception.ControlApplicationException;

@Stateless( name="BackOfficeBean" , mappedName="BackOfficeBean" )
@TransactionAttribute( TransactionAttributeType.SUPPORTS )
@TransactionManagement( TransactionManagementType.CONTAINER )
@Local({com.backoffice.model.interfaces.BackOfficeLocal.class})
@Remote({com.backoffice.model.interfaces.BackOfficeRemote.class})
public class BackOfficeBean implements BackOfficeRemote, BackOfficeLocal
{
	public CustomerBackOfficeResponseTO emailAndMobileInformation(CustomerBackOfficeRequestTO customerBackOfficeRequest ) throws ControlApplicationException, ApplicationException
	{
		BackOfficeMngr mngr = new BackOfficeMngr();
		return mngr.emailAndMobileInformation(customerBackOfficeRequest);
	}
	
	public CustomerBackOfficeResponseTO registredAndComplianceList(CustomerBackOfficeRequestTO customerBackOfficeRequest ) throws ControlApplicationException, ApplicationException
	{
		Connection connection = null;
		
		try 
		{
			connection = ConnectionFactory.getConnection(DBConnectionTypeEnum.ORACLE , "PORTAL_WEB_DS");
			BackOfficeMngr mngr = new BackOfficeMngr();
			return mngr.registredAndComplianceList(customerBackOfficeRequest, connection);
			
		} finally 
		{
			ConnectionBuilder.closeConnection(connection);
		}
	}
	
	public CustomerBackOfficeResponseTO customerExtraData(CustomerBackOfficeRequestTO backOfficeRequestTO) throws ApplicationException, ControlApplicationException
	{
		Connection connection = null;
		
		try 
		{
			connection = ConnectionFactory.getConnection(DBConnectionTypeEnum.ORACLE,"PORTAL_WEB_DS");
			BackOfficeMngr mngr = new BackOfficeMngr();
			return mngr.customerExtraData(backOfficeRequestTO, connection);
			
		} finally 
		{
			ConnectionBuilder.closeConnection(connection);
		}
	}
	
	
	public CustomerBackOfficeResponseTO sendOTPDiffuserEmail(CustomerBackOfficeRequestTO backOfficeRequestTO) throws ApplicationException, ControlApplicationException
	{
		BackOfficeMngr mngr = new BackOfficeMngr();
		return mngr.sendOTPDiffuserEmail(backOfficeRequestTO);
	}
	
	public CustomerBackOfficeResponseTO sendOTPDiffuserSMS(CustomerBackOfficeRequestTO backOfficeRequestTO) throws ApplicationException, ControlApplicationException
	{
		BackOfficeMngr mngr = new BackOfficeMngr();
		return mngr.sendOTPDiffuserSMS(backOfficeRequestTO);
	}
	
	
	public CustomerBackOfficeResponseTO updateAdminBlock( CustomerBackOfficeRequestTO backOfficeRequestTO )  throws ApplicationException, ControlApplicationException
	{
		Connection connection = null;
		
		try 
		{
			connection = ConnectionFactory.getConnection(DBConnectionTypeEnum.ORACLE,"PORTAL_WEB_DS");
			BackOfficeMngr mngr = new BackOfficeMngr();
			return mngr.updateCustomerStatus(backOfficeRequestTO, connection, "UNLOCK");
			
		} finally 
		{
			ConnectionBuilder.closeConnection(connection);
		}
		
	}
	
	
	public CustomerBackOfficeResponseTO updateUnlockAdminBlock( CustomerBackOfficeRequestTO backOfficeRequestTO )  throws ApplicationException, ControlApplicationException
	{
		Connection connection = null;
		
		try 
		{
			connection = ConnectionFactory.getConnection(DBConnectionTypeEnum.ORACLE,"PORTAL_WEB_DS");
			BackOfficeMngr mngr = new BackOfficeMngr();
			return mngr.updateCustomerStatus(backOfficeRequestTO, connection, "LOCK");
			
		} finally 
		{
			ConnectionBuilder.closeConnection(connection);
		}
		
	}
	
	
	public CustomerBackOfficeResponseTO getProductsByCustomer(CustomerBackOfficeRequestTO backOfficeRequestTO) throws ApplicationException, ControlApplicationException
	{
		BackOfficeMngr mngr = new BackOfficeMngr();
		return mngr.getProductsByCustomer(backOfficeRequestTO);
	}
	
	public CustomerBackOfficeResponseTO inquiryBankAccount(CustomerBackOfficeRequestTO backOfficeRequestTO) throws ApplicationException, ControlApplicationException
	{
		BackOfficeMngr mngr = new BackOfficeMngr();
		return mngr.inquiryBankAccount(backOfficeRequestTO);
	}
	
	public CustomerBackOfficeResponseTO inquiryPseInformation(CustomerBackOfficeRequestTO backOfficeRequestTO, Date fechaIni, Date fechaFin, String estado) throws ApplicationException, ControlApplicationException
	{
		Connection connection = null;
		
		try 
		{
			connection = ConnectionFactory.getConnection(DBConnectionTypeEnum.ORACLE,"PORTAL_WEB_DS");
			BackOfficeMngr mngr = new BackOfficeMngr();
			return mngr.inquiryPseInformation(backOfficeRequestTO, connection, fechaIni,fechaFin,estado);
			
		} finally 
		{
			ConnectionBuilder.closeConnection(connection);
		}
	}
	
	
	public CustomerBackOfficeResponseTO deleteCustomer(CustomerBackOfficeRequestTO backOfficeRequestTO) throws ApplicationException, ControlApplicationException
	{
		Connection connection = null;
		try 
		{
			connection = ConnectionFactory.getConnection(DBConnectionTypeEnum.ORACLE,"PORTAL_WEB_DS");
			BackOfficeMngr mngr = new BackOfficeMngr();
			return mngr.deleteCustomer(backOfficeRequestTO, connection);
			
		} finally 
		{
			ConnectionBuilder.closeConnection(connection);
		}	
	}
	
	public CustomerBackOfficeResponseTO getCommonsServiceInfromation(CustomerBackOfficeRequestTO portalRequest)throws ControlApplicationException, ApplicationException 
	{
		BackOfficeMngr mngr = new BackOfficeMngr();
		return mngr.getCommonsServiceInfromation(portalRequest);
	}

	@Override
	public List<ReportApprovalStateTO> getCreditCardReport(ReportApprovalStateTO filter)
			throws ApplicationException, ControlApplicationException {
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();
			BackOfficeMngr mngr = new BackOfficeMngr();
			return mngr.getCreditCardReport(filter, connection);
		}finally {
			ConnectionBuilder.closeConnection(connection);
		}
	}
	
}
