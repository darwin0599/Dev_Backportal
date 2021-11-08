package com.backoffice.model.interfaces;

import com.backoffice.model.to.BackOfficeAuditTO;

public interface BackOfficeAuditRemote 
{
	
	public void insertAuditBackOffice( BackOfficeAuditTO backOfficeAudit );
	
	public void updateAuditBackOfficeStatus(BackOfficeAuditTO backOfficeAudit);

}
