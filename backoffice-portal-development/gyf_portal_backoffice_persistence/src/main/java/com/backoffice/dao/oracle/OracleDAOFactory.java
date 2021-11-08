package com.backoffice.dao.oracle;

import java.sql.Connection;

import com.backoffice.dao.DAOFactory;
import com.backoffice.dao.interfaces.IAdminBlockDAO;
import com.backoffice.dao.interfaces.IBackOfficeAuditDAO;
import com.backoffice.dao.interfaces.ICustomerExtraDataDAO;
import com.backoffice.dao.interfaces.ICustomerRegistredDAO;
import com.backoffice.dao.interfaces.IDeleteCustomerDAO;
import com.backoffice.dao.interfaces.IPseDAO;
import com.backoffice.dao.interfaces.IReportApprovalStateDAO;

public class OracleDAOFactory extends DAOFactory {
	
	
	private Connection connection;
	
	public OracleDAOFactory( Connection connection )
	{
		this.connection = connection;
	}
	
	
	public ICustomerRegistredDAO getCustomerRegistredDAO()
	{
		return new CustomerRegistredDAO(this.connection);
	}
	
	
	public ICustomerExtraDataDAO getCustomerExtraDataDAO()
	{
		return new CustomerExtraDataDAO(this.connection);
	}
	
	public IAdminBlockDAO getAdminBlockDAO()
	{
		return new AdminBlockDAO(this.connection);
	}
	
	public IBackOfficeAuditDAO getBackOfficeAuditDAO()
	{
		return new BackOfficeAuditDAO(this.connection);
	}
	
	public IPseDAO getPseDAO()
	{
		return new PseDAO(this.connection);
	}
	
	public IDeleteCustomerDAO getDeleteCustomerDAO()
	{
		return new DeleteCustomerDAO(this.connection);
	}


	@Override
	public IReportApprovalStateDAO getReportApprovalStateDAO() {
		return new ReportApprovalStateDAO(this.connection);
	}
	
}
