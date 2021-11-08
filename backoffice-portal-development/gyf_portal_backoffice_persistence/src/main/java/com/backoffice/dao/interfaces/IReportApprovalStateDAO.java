package com.backoffice.dao.interfaces;

import java.util.List;

import com.backoffice.vo.ReportApprovalStateVO;
import com.gyf.exception.ApplicationException;

public interface IReportApprovalStateDAO {

	public List<ReportApprovalStateVO> findBy(ReportApprovalStateVO filter) throws ApplicationException;
	
}
