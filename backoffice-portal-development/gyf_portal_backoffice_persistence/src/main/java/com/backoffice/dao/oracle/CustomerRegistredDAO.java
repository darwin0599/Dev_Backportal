package com.backoffice.dao.oracle;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Types;

import com.backoffice.dao.interfaces.ICustomerRegistredDAO;
import com.backoffice.vo.CustomerRegistredVO;
import com.gyf.conncetion.ConnectionBuilder;
import com.gyf.constants.ConstantesSeverity;
import com.gyf.exception.ApplicationException;
import com.gyf.exception.mngr.ExceptionManager;

public class CustomerRegistredDAO implements ICustomerRegistredDAO {
	
	private static final String CLASS_NAME = "com.backoffice.dao.oracle.CustomerRegisterDAO";
	
	
	private Connection connection;
	
	protected CustomerRegistredDAO( Connection connection )
	{
		this.connection = connection;
	}
	
	/**
	 * Metodo encargado de validar si el cliente existe en la base de datos de el portal mediante el llamado al SP de oracle VALIDATE_CUSTOMER_PORTAL.VALIDATE_CUSTOMER_REGISTRED
	 * 	@param 
	 * 		customerRegister
	 * 	@return
	 * 		customerRegister
	 *	@throws 
	 *		ApplicationException
	 */
	public CustomerRegistredVO validateCustomerRegisterSP( CustomerRegistredVO customerRegister ) throws ApplicationException
	{
		final String METHOD_NAME = "validateCustomerRegisterSP";
		String query = "{call PORTAL_TRANSACCIONAL_GYF.VALIDATE_CUSTOMER_PORTAL_PKG.VALIDATE_CUSTOMER_REGISTRED_P(?,?,?,?)}";
		CallableStatement cs = null;
		ResultSet rs = null;
		try 
		{
			cs = this.connection.prepareCall(query);
			cs.setString(1, customerRegister.getId());
			cs.setString(2, customerRegister.getIdType());
			cs.registerOutParameter(3, Types.VARCHAR);
			cs.registerOutParameter(4, Types.VARCHAR);

			cs.executeUpdate();
			
			customerRegister.setRegister(cs.getString(3).equals("true"));
			customerRegister.setRegisterDate(cs.getString(4));
			
			return customerRegister;
			
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
