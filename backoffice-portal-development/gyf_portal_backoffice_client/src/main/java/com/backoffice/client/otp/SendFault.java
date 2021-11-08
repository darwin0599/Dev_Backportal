
package com.backoffice.client.otp;

import javax.xml.ws.WebFault;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebFault(name = "sendFault", targetNamespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntOTPDiffuser/")
public class SendFault extends Exception {

	/**
	 * Java type that goes as soapenv:Fault detail element.
	 * 
	 */
	private SendFaultType faultInfo;

	/**
	 * 
	 * @param faultInfo
	 * @param message
	 */
	public SendFault(String message, SendFaultType faultInfo) {
		super(message);
		this.faultInfo = faultInfo;
	}

	/**
	 * 
	 * @param faultInfo
	 * @param cause
	 * @param message
	 */
	public SendFault(String message, SendFaultType faultInfo, Throwable cause) {
		super(message, cause);
		this.faultInfo = faultInfo;
	}

	/**
	 * 
	 * @return returns fault bean: com.backoffice.client.otp.SendFaultType
	 */
	public SendFaultType getFaultInfo() {
		return faultInfo;
	}

}