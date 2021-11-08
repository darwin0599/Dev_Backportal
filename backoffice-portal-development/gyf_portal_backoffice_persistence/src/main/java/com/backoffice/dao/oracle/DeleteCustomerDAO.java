package com.backoffice.dao.oracle;

import java.sql.CallableStatement;
import java.sql.Connection;

import com.backoffice.dao.interfaces.IDeleteCustomerDAO;
import com.backoffice.vo.DeleteCustomerVO;
import com.gyf.conncetion.ConnectionBuilder;
import com.gyf.constants.ConstantesSeverity;
import com.gyf.exception.ApplicationException;
import com.gyf.exception.mngr.ExceptionManager;

public class DeleteCustomerDAO implements IDeleteCustomerDAO
{
	
	private static final String CLASS_NAME = "com.backoffice.dao.oracle.DeleteCustomerDAO";
	
	private Connection connection;
	
	protected DeleteCustomerDAO(Connection connection)
	{
		this.connection = connection;
	}

	@Override
	public void deleteCustomerSP(DeleteCustomerVO deleteCustomerVO) throws ApplicationException 
	{
		final String METHOD_NAME = "deleteCustomerSP";
		String query = "{call PORTAL_TRANSACCIONAL_GYF.VALIDATE_CUSTOMER_PORTAL_PKG.DELETE_CUSTOMER_P(?,?,?)}";
		CallableStatement cs = null;
		
		try 
		{
			cs = this.connection.prepareCall(query);
			cs.setString(1, deleteCustomerVO.getId());
			cs.setString(2, deleteCustomerVO.getIdType());
			cs.setString(3, deleteCustomerVO.getUserId());
			
			cs.executeUpdate();
			
			return;
			
		} catch (Exception e) 
		{
			ExceptionManager.controlApplicationException(e, 
					CLASS_NAME, METHOD_NAME, e.getMessage(), ConstantesSeverity.FATAL);
		}finally
		{
			ConnectionBuilder.closeResources(cs);
		}
	}

}
