package com.backoffice.dao.interfaces;

import java.util.Date;
import java.util.List;

import com.backoffice.vo.PseVO;
import com.gyf.exception.ApplicationException;

public interface IPseDAO 
{
	
	public List<PseVO> selectPseByCustomer( PseVO pse , Date fechaIni, Date fechaFin, String estado )throws ApplicationException;

}
