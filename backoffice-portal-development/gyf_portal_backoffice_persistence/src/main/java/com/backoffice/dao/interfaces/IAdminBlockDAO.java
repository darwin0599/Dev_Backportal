package com.backoffice.dao.interfaces;

import com.backoffice.vo.AdminBlockVO;
import com.gyf.exception.ApplicationException;

public interface IAdminBlockDAO 
{
	
	public int updateCustomerStatus( AdminBlockVO adminBlock ) throws ApplicationException;

}
