
package com.backoffice.client.support;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "SupportServicesDelegate", targetNamespace = "http://integration.services.support.gyf.com/")
public interface SupportServicesDelegate {

	/**
	 * 
	 * @param arg0
	 * @return returns com.backoffice.client.support.DomainResponse
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "commonsServices", targetNamespace = "http://integration.services.support.gyf.com/", className = "com.backoffice.client.support.CommonsServices")
	@ResponseWrapper(localName = "commonsServicesResponse", targetNamespace = "http://integration.services.support.gyf.com/", className = "com.backoffice.client.support.CommonsServicesResponse")
	public DomainResponse commonsServices(@WebParam(name = "arg0", targetNamespace = "") DomainRequest arg0);

}