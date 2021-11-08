package com.backoffice.dao;

import java.sql.Connection;

import com.backoffice.dao.interfaces.IAdminBlockDAO;
import com.backoffice.dao.interfaces.IBackOfficeAuditDAO;
import com.backoffice.dao.interfaces.ICustomerExtraDataDAO;
import com.backoffice.dao.interfaces.ICustomerRegistredDAO;
import com.backoffice.dao.interfaces.IDeleteCustomerDAO;
import com.backoffice.dao.interfaces.IPseDAO;
import com.backoffice.dao.interfaces.IReportApprovalStateDAO;
import com.backoffice.dao.oracle.OracleDAOFactory;

public abstract class DAOFactory {

	public final static DAOFactory getDAOFactory(Connection connection)
	{
		return new OracleDAOFactory(connection);
	}
	
	public abstract ICustomerRegistredDAO getCustomerRegistredDAO();
	
	public abstract ICustomerExtraDataDAO getCustomerExtraDataDAO();
	
	public abstract IAdminBlockDAO getAdminBlockDAO();
	
	public abstract IBackOfficeAuditDAO getBackOfficeAuditDAO();
	
	public abstract IPseDAO  getPseDAO(  );
	
	public abstract IDeleteCustomerDAO getDeleteCustomerDAO();
	
	public abstract IReportApprovalStateDAO getReportApprovalStateDAO();
	
}
