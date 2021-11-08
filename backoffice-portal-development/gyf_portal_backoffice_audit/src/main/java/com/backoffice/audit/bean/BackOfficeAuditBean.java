package com.backoffice.audit.bean;

import java.sql.Connection;

import javax.ejb.Asynchronous;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import com.backoffice.audit.manager.BackOfficeAuditMngr;
import com.backoffice.model.interfaces.BackOfficeAuditLocal;
import com.backoffice.model.interfaces.BackOfficeAuditRemote;
import com.backoffice.model.to.BackOfficeAuditTO;
import com.gyf.conncetion.ConnectionBuilder;
import com.gyf.conncetion.ConnectionFactory;
import com.gyf.constants.DBConnectionTypeEnum;

@Stateless( name="BackOfficeAuditBean" , mappedName="BackOfficeAuditBean" )
@TransactionAttribute( TransactionAttributeType.SUPPORTS )
@TransactionManagement( TransactionManagementType.CONTAINER )
@Local({com.backoffice.model.interfaces.BackOfficeAuditLocal.class})
@Remote({ com.backoffice.model.interfaces.BackOfficeAuditRemote.class })
public class BackOfficeAuditBean implements BackOfficeAuditLocal, BackOfficeAuditRemote
{
	
	@Asynchronous
	public void insertAuditBackOffice(BackOfficeAuditTO backOfficeAudit) 
	{
		Connection connection = null;
		try 
		{
			connection = ConnectionFactory.getConnection(DBConnectionTypeEnum.ORACLE,"PORTAL_WEB_DS");
			BackOfficeAuditMngr mngr = new BackOfficeAuditMngr();
			mngr.insertAuditBackOffice(backOfficeAudit, connection);
		} finally
		{
			ConnectionBuilder.closeConnection(connection);
		}
	}
	
	@Asynchronous
	public void updateAuditBackOfficeStatus(BackOfficeAuditTO backOfficeAudit) 
	{
		Connection connection = null;
		try 
		{
			connection = ConnectionFactory.getConnection(DBConnectionTypeEnum.ORACLE,"PORTAL_WEB_DS");
			BackOfficeAuditMngr mngr = new BackOfficeAuditMngr();
			mngr.updateAuditBackOfficeStatus(backOfficeAudit, connection);
		} finally
		{
			ConnectionBuilder.closeConnection(connection);
		}
	}

}
