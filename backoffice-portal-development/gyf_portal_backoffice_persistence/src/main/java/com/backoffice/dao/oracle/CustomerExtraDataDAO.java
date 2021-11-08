package com.backoffice.dao.oracle;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Types;

import com.backoffice.dao.interfaces.ICustomerExtraDataDAO;
import com.backoffice.vo.CustomerExtraDataVO;
import com.gyf.conncetion.ConnectionBuilder;
import com.gyf.constants.ConstantesSeverity;
import com.gyf.exception.ApplicationException;
import com.gyf.exception.mngr.ExceptionManager;

public class CustomerExtraDataDAO implements ICustomerExtraDataDAO 
{

	private static final String CLASS_NAME = "com.backoffice.dao.oracle.CustomerExtraDataDAO";
	
	
	private Connection connection;
	
	protected CustomerExtraDataDAO( Connection connection )
	{
		this.connection = connection;
	}
	
	
	public CustomerExtraDataVO customerExtraDataSP(CustomerExtraDataVO customerExtraData) throws ApplicationException
	{
		final String METHOD_NAME = "customerExtraDataSP";
		CallableStatement cs = null;
		ResultSet rs = null;
		String query = "{call PORTAL_TRANSACCIONAL_GYF.VALIDATE_CUSTOMER_PORTAL_PKG.VALIDATE_CUSTOMER_EXTRA_DATA_P(?,?,?,?,?,?,?,?)}";
		
		try
		{
			cs = this.connection.prepareCall(query);
			cs.setString(1,customerExtraData.getId());
			cs.setString(2,customerExtraData.getIdType());
			
			cs.registerOutParameter(3, Types.VARCHAR);
			cs.registerOutParameter(4, Types.VARCHAR);
			cs.registerOutParameter(5, Types.VARCHAR);
			cs.registerOutParameter(6, Types.VARCHAR);
			cs.registerOutParameter(7, Types.VARCHAR);
			cs.registerOutParameter(8, Types.VARCHAR);
			
			cs.executeUpdate();
			
			customerExtraData.setSessionInit(cs.getString(3));
			customerExtraData.setCurrentSession(cs.getString(4));
			customerExtraData.setAdminBlockCode(cs.getString(5));
			customerExtraData.setSecurityQuestions(cs.getString(6));
			customerExtraData.setHabits(cs.getString(7));
			customerExtraData.setLockLogin(cs.getString(8));
			return customerExtraData;
			
		} catch (Exception e) 
		{
			ExceptionManager.controlApplicationException(e, CLASS_NAME, METHOD_NAME, e.getMessage(), ConstantesSeverity.FATAL);
		}finally
		{
			ConnectionBuilder.closeResources(cs, rs);
		}
		
		return null;
	}
	
}
