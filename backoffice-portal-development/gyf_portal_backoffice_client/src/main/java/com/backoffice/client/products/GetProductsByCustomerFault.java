
package com.backoffice.client.products;

import javax.xml.ws.WebFault;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebFault(name = "getProductsByCustomerFault", targetNamespace = "http://www.girosyfinanzas/servicios/DireccionCanales/SrvIntProduct/")
public class GetProductsByCustomerFault extends Exception {

	/**
	 * Java type that goes as soapenv:Fault detail element.
	 * 
	 */
	private GetProductsByCustomerFaultType faultInfo;

	/**
	 * 
	 * @param faultInfo
	 * @param message
	 */
	public GetProductsByCustomerFault(String message, GetProductsByCustomerFaultType faultInfo) {
		super(message);
		this.faultInfo = faultInfo;
	}

	/**
	 * 
	 * @param faultInfo
	 * @param cause
	 * @param message
	 */
	public GetProductsByCustomerFault(String message, GetProductsByCustomerFaultType faultInfo, Throwable cause) {
		super(message, cause);
		this.faultInfo = faultInfo;
	}

	/**
	 * 
	 * @return returns fault bean:
	 *         com.backoffice.client.products.GetProductsByCustomerFaultType
	 */
	public GetProductsByCustomerFaultType getFaultInfo() {
		return faultInfo;
	}

}
