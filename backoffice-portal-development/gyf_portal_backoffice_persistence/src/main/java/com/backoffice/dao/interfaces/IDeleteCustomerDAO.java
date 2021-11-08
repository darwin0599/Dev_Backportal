package com.backoffice.dao.interfaces;

import com.backoffice.vo.DeleteCustomerVO;
import com.gyf.exception.ApplicationException;

public interface IDeleteCustomerDAO 
{
	public void deleteCustomerSP(DeleteCustomerVO deleteCustomerVO) throws ApplicationException;
}
