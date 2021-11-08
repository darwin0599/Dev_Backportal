package com.backoffice.dao.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.backoffice.dao.interfaces.IAdminBlockDAO;
import com.backoffice.vo.AdminBlockVO;
import com.gyf.conncetion.ConnectionBuilder;
import com.gyf.constants.ConstantesSeverity;
import com.gyf.exception.ApplicationException;
import com.gyf.exception.mngr.ExceptionManager;

public class AdminBlockDAO implements IAdminBlockDAO
{
	private static final String CLASS_NAME = "com.backoffice.dao.oracle.AdminBlockDAO";
	
	private Connection connection;
	
	protected AdminBlockDAO( Connection connection )
	{
		this.connection = connection;
	}
	
	public int updateCustomerStatus( AdminBlockVO adminBlock ) throws ApplicationException
	{
		final String METHOD_NAME = "updateCustomerStatus";
		String query = "UPDATE USUARIO SET ESTADO = ? WHERE NUMERO_DOCUMENTO = ? AND TIPO_DOCUMENTO = ?";
		PreparedStatement pst = null;
		int numberOfRowsAffected = 0;
		try 
		{
			pst = this.connection.prepareStatement(query);
			pst.setString(1, adminBlock.getBlockCode());
			pst.setString(2, adminBlock.getId());
			pst.setString(3, adminBlock.getIdType());
			
			numberOfRowsAffected = pst.executeUpdate();
			
			return numberOfRowsAffected;
			
		} catch (Exception e) 
		{
			ExceptionManager.controlApplicationException(e, CLASS_NAME, METHOD_NAME, e.getMessage(), ConstantesSeverity.FATAL);
		}finally 
		{
			ConnectionBuilder.closeResources(pst);
		}
		
		return  0;
	}
}
