package com.backoffice.audit.manager;

import java.sql.Connection;
import java.util.GregorianCalendar;

import com.backoffice.audit.constant.BackOfficeAuditEnum;
import com.backoffice.dao.DAOFactory;
import com.backoffice.dao.interfaces.IBackOfficeAuditDAO;
import com.backoffice.model.to.BackOfficeAuditTO;
import com.backoffice.vo.BackOfficeAuditVO;
import com.gyf.log.LogWriter;

public class BackOfficeAuditMngr 
{
	
	public void insertAuditBackOffice(BackOfficeAuditTO backOfficeAudit, Connection connection) 
	{
		final String METHOD_NAME = "insertAuditBackOffice";
		IBackOfficeAuditDAO dao = null;
		BackOfficeAuditVO backOfficeAuditVO = null ;
		try 
		{
			
			BackOfficeAuditEnum backOfficeAuditEnum = BackOfficeAuditEnum.fromValue(backOfficeAudit.getAction());
			
			if( backOfficeAuditEnum != null  )
			{
				backOfficeAuditVO = new BackOfficeAuditVO();
				backOfficeAuditVO.setAction(backOfficeAuditEnum.getTableCode());
				backOfficeAuditVO.setId(backOfficeAudit.getId());
				backOfficeAuditVO.setIdType(backOfficeAudit.getIdType());
				backOfficeAuditVO.setServicePoint(backOfficeAudit.getServicePoint());
				backOfficeAuditVO.setUserName(backOfficeAudit.getUserName());
				backOfficeAuditVO.setTransactionDate(GregorianCalendar.getInstance());
				backOfficeAuditVO.setState(backOfficeAudit.getState());
				
				dao = DAOFactory.getDAOFactory(connection).getBackOfficeAuditDAO();
				dao.insertBackOfficeAudit(backOfficeAuditVO);
			}else
			{
				return;
			}
			
		} catch (Exception e) 
		{
			LogWriter.writeErrorLog(e, e.getMessage(), METHOD_NAME);
		}
	}
	
	
	public void updateAuditBackOfficeStatus(BackOfficeAuditTO backOfficeAudit, Connection connection) 
	{
		final String METHOD_NAME = "updateAuditBackOfficeStatus";
		IBackOfficeAuditDAO dao = null;
		BackOfficeAuditVO backOfficeAuditVO = null ;
		try 
		{
			
			BackOfficeAuditEnum backOfficeAuditEnum = BackOfficeAuditEnum.fromValue(backOfficeAudit.getAction());
			
			if( backOfficeAuditEnum != null  )
			{
				backOfficeAuditVO = new BackOfficeAuditVO();
				backOfficeAuditVO.setAction(backOfficeAuditEnum.getTableCode());
				backOfficeAuditVO.setId(backOfficeAudit.getId());
				backOfficeAuditVO.setIdType(backOfficeAudit.getIdType());
				backOfficeAuditVO.setServicePoint(backOfficeAudit.getServicePoint());
				backOfficeAuditVO.setUserName(backOfficeAudit.getUserName());
				backOfficeAuditVO.setTransactionDate(GregorianCalendar.getInstance());
				backOfficeAuditVO.setState(backOfficeAudit.getState());
				
				dao = DAOFactory.getDAOFactory(connection).getBackOfficeAuditDAO();
				dao.updateStatusBackOfficeAudit(backOfficeAuditVO);
			}else
			{
				return;
			}
			
		} catch (Exception e) 
		{
			LogWriter.writeErrorLog(e, e.getMessage(), METHOD_NAME);
		}
	}

}
