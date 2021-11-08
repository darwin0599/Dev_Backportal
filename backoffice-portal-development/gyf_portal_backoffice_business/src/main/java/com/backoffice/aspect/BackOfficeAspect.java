package com.backoffice.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import com.backoffice.integration.BackOfficeDelegate;
import com.backoffice.model.to.BackOfficeAuditTO;
import com.backoffice.model.to.CustomerBackOfficeRequestTO;
import com.backoffice.model.to.CustomerBackOfficeResponseTO;

@Aspect
public class BackOfficeAspect 
{
	private BackOfficeDelegate delegate = null;
	
	public BackOfficeAspect()
	{
		delegate = new BackOfficeDelegate();
	}
	
	@Pointcut( "execution(* com.backoffice.bean.*.*(..))" )
	public void auditBackOffice( )
	{}
	
	@Before("auditBackOffice()")
	public void beforeExcecuteMethod(JoinPoint joinPoint )
	{
		BackOfficeAuditTO auditTO = null;
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		String mehodName = methodSignature.getName();
		for(Object itemObjetc : joinPoint.getArgs()){
			if(itemObjetc instanceof CustomerBackOfficeRequestTO)
			{
				CustomerBackOfficeRequestTO backOfficeResponse = (CustomerBackOfficeRequestTO)itemObjetc;
				auditTO = new BackOfficeAuditTO();
				auditTO.setId(backOfficeResponse.getId());
				auditTO.setIdType(backOfficeResponse.getIdType());
				auditTO.setState("ERROR");
				auditTO.setServicePoint(backOfficeResponse.getServicePoint());
				auditTO.setUserName(backOfficeResponse.getUserId());
				auditTO.setAction(mehodName);
				this.delegate.insertAuditBackOffice(auditTO);
			}
		}
	}
	
	
	@AfterReturning(pointcut="auditBackOffice()" , returning="result" )
	public void afterExcecuteMethod(JoinPoint joinPoint, Object result  )
	{
		BackOfficeAuditTO auditTO = null;
		CustomerBackOfficeResponseTO backOfficeResp = (CustomerBackOfficeResponseTO)result;
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		String mehodName = methodSignature.getName();
		for(Object itemObjetc : joinPoint.getArgs()){
			if(itemObjetc instanceof CustomerBackOfficeRequestTO)
			{
				CustomerBackOfficeRequestTO backOfficeResponse = (CustomerBackOfficeRequestTO)itemObjetc;
				auditTO = new BackOfficeAuditTO();
				auditTO.setId(backOfficeResponse.getId());
				auditTO.setIdType(backOfficeResponse.getIdType());
				auditTO.setState("EXITO");
				auditTO.setServicePoint(backOfficeResponse.getServicePoint());
				auditTO.setUserName(backOfficeResponse.getUserId());
				auditTO.setAction(mehodName);
				this.delegate.updateAuditBackOfficeStatus(auditTO);
			}
		}
	}
	
	
}
