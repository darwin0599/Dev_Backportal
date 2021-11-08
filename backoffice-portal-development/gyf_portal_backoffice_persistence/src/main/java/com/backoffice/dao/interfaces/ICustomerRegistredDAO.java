package com.backoffice.dao.interfaces;

import com.backoffice.vo.CustomerRegistredVO;
import com.gyf.exception.ApplicationException;

public interface ICustomerRegistredDAO 
{
	public CustomerRegistredVO validateCustomerRegisterSP( CustomerRegistredVO customerRegister ) throws ApplicationException;
}
