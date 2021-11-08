
package com.backoffice.client.validatecustomer;

import javax.xml.ws.WebFault;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebFault(name = "validateAccumulatedFault", targetNamespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/")
public class ValidateAccumulatedFault extends Exception {

	/**
	 * Java type that goes as soapenv:Fault detail element.
	 * 
	 */
	private ValidateAccumulatedFaultType faultInfo;

	/**
	 * 
	 * @param faultInfo
	 * @param message
	 */
	public ValidateAccumulatedFault(String message, ValidateAccumulatedFaultType faultInfo) {
		super(message);
		this.faultInfo = faultInfo;
	}

	/**
	 * 
	 * @param faultInfo
	 * @param cause
	 * @param message
	 */
	public ValidateAccumulatedFault(String message, ValidateAccumulatedFaultType faultInfo, Throwable cause) {
		super(message, cause);
		this.faultInfo = faultInfo;
	}

	/**
	 * 
	 * @return returns fault bean:
	 *         com.backoffice.client.validatecustomer.ValidateAccumulatedFaultType
	 */
	public ValidateAccumulatedFaultType getFaultInfo() {
		return faultInfo;
	}

}
