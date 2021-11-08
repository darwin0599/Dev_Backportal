package com.gyf.backoffice.action;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.gyf.constants.ConstantesSeverity;
import com.gyf.error.util.ErrorUtil;
import com.gyf.exception.ApplicationException;
import com.gyf.exception.ControlApplicationException;
import com.gyf.exception.model.ErrorModelControlException;
import com.gyf.exception.model.ErrorModelException;
import com.gyf.log.LogWriter;
import com.gyf.tools.presentacion.backing.ActionUtil;

@ManagedBean( name="errorBean" )
@SessionScoped
public class ErrorBean extends ActionUtil
{

	private String errorCode;
	
	private String errorMessage;
	
	private String severity;
	
	
	public ErrorBean() 
	{
		Exception e = (Exception)this.obtenerDeSesion("ERROR_OBJECT");
		
		if( e instanceof ControlApplicationException )
		{
			ControlApplicationException controlApplicationException = (ControlApplicationException) e;
			ErrorModelControlException[] controlExceptions = controlApplicationException.getErrorModelControlExceptionList();
			
			for( ErrorModelControlException itemControlExceptions : controlExceptions )
			{
				this.errorCode    = itemControlExceptions.getErrorCode();
				this.errorMessage = itemControlExceptions.getErrorMessage();
				this.severity     = itemControlExceptions.getSeverity();
			}
			
		}else if( e instanceof ApplicationException )
		{
			ApplicationException applicationException = (ApplicationException)e;
			ErrorModelException errorModelException = applicationException.getErrorModelException();
			
			this.errorCode    = errorModelException.getCodeError();
			this.errorMessage = errorModelException.getTrace();
			this.severity = errorModelException.getSeverity();
			
		}else
		{
			this.errorCode    = "-1";
			this.errorMessage = ErrorUtil.getExceptionStackTraceString(e);
			this.severity	  = ConstantesSeverity.FATAL;		
		}
		LogWriter.writeErrorLog(e, e.getMessage(), "ErrorBean()");		
		this.quitarDeSesion("ERROR_OBJECT");
	}


	/**
	 * @return the errorCode
	 */
	public String getErrorCode()
	{
		return errorCode;
	}


	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode)
	{
		this.errorCode = errorCode;
	}


	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage()
	{
		return errorMessage;
	}


	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}


	/**
	 * @return the severity
	 */
	public String getSeverity()
	{
		return severity;
	}


	/**
	 * @param severity the severity to set
	 */
	public void setSeverity(String severity)
	{
		this.severity = severity;
	}
	
	
	
}
