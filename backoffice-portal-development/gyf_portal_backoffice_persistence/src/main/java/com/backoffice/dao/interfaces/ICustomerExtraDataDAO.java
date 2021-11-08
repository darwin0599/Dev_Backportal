package com.backoffice.dao.interfaces;

import com.backoffice.vo.CustomerExtraDataVO;
import com.gyf.exception.ApplicationException;

public interface ICustomerExtraDataDAO 
{
	public CustomerExtraDataVO customerExtraDataSP(CustomerExtraDataVO customerExtraData) throws ApplicationException;

}
