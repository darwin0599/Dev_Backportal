package com.backoffice.dao.interfaces;

import com.backoffice.vo.BackOfficeAuditVO;
import com.gyf.exception.ApplicationException;

public interface IBackOfficeAuditDAO 
{
	
	public void insertBackOfficeAudit(BackOfficeAuditVO backOfficeAuditVO) throws ApplicationException;
	
	
	public int updateStatusBackOfficeAudit(BackOfficeAuditVO backOfficeAuditVO) throws ApplicationException;

}
