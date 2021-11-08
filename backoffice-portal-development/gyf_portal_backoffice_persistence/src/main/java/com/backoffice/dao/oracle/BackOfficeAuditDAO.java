package com.backoffice.dao.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import com.backoffice.dao.interfaces.IBackOfficeAuditDAO;
import com.backoffice.vo.BackOfficeAuditVO;
import com.gyf.conncetion.ConnectionBuilder;
import com.gyf.constants.ConstantesSeverity;
import com.gyf.exception.ApplicationException;
import com.gyf.exception.mngr.ExceptionManager;

public class BackOfficeAuditDAO implements IBackOfficeAuditDAO
{
	
	private static final String CLASS_NAME = "com.backoffice.dao.oracle.BackOfficeAuditDAO";
	
	
	private Connection connection;
	
	protected BackOfficeAuditDAO( Connection connection )
	{
		this.connection = connection;
	}

	@Override
	public void insertBackOfficeAudit(BackOfficeAuditVO backOfficeAuditVO) throws ApplicationException 
	{
		final String METHOD_NAME ="insertBackOfficeAudit";
		PreparedStatement ps = null;
		String query = "INSERT INTO BACK_OFFICE_AUDIT ( USER_NAME , SERVICE_POINT, ACTION, IDTYPE, ID, TRANSACTION_DATE, RESULT )"
				+ " VALUES (?,?,?,?,?,?,?)";
		
		try 
		{
			ps = this.connection.prepareStatement(query);
			ps.setString(1, backOfficeAuditVO.getUserName());
			ps.setString(2, backOfficeAuditVO.getServicePoint());
			ps.setString(3, backOfficeAuditVO.getAction());
			ps.setString(4, backOfficeAuditVO.getIdType());
			ps.setString(5, backOfficeAuditVO.getId());
			ps.setTimestamp(6,  new java.sql.Timestamp(backOfficeAuditVO.getTransactionDate().getTimeInMillis()));
			ps.setString(7, backOfficeAuditVO.getState());
			
			ps.executeUpdate();
			
			return;
			
		} catch (Exception e) 
		{
			ExceptionManager.controlApplicationException(e, CLASS_NAME, METHOD_NAME, "Error insertando en la tabla BACK_OFFICE_AUDIT", ConstantesSeverity.FATAL);
		}finally
		{
			ConnectionBuilder.closeResources(ps);
		}
		
		
	}

	@Override
	public int updateStatusBackOfficeAudit(BackOfficeAuditVO backOfficeAuditVO) throws ApplicationException 
	{
		final String METHOD_NAME ="updateStatusBackOfficeAudit()";
		PreparedStatement ps = null;
		String query = "UPDATE BACK_OFFICE_AUDIT SET RESULT = ? "
				+ "WHERE USER_NAME = ? AND SERVICE_POINT = ? AND  ACTION = ?  AND IDTYPE = ? AND ID = ? AND TRUNC(TRANSACTION_DATE) = TRUNC( ? )";
		
		try 
		{
			
			ps = this.connection.prepareStatement(query);
			ps.setString(1, backOfficeAuditVO.getState());
			ps.setString(2, backOfficeAuditVO.getUserName());
			ps.setString(3, backOfficeAuditVO.getServicePoint());
			ps.setString(4, backOfficeAuditVO.getAction());
			ps.setString(5, backOfficeAuditVO.getIdType());
			ps.setString(6, backOfficeAuditVO.getId());
			ps.setTimestamp(7, new java.sql.Timestamp( backOfficeAuditVO.getTransactionDate().getTimeInMillis() ));
			
			return ps.executeUpdate();
			
		} catch (Exception e) 
		{
			ExceptionManager.controlApplicationException(e, CLASS_NAME, METHOD_NAME, 
					"Error actualizando en la tabla BACK_OFFICE_AUDIT", ConstantesSeverity.FATAL);
		}finally
		{
			ConnectionBuilder.closeResources(ps);
		}
		
		return 0;
	}
	
}
