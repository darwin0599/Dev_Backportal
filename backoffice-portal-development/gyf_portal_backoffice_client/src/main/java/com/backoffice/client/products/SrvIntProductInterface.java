
package com.backoffice.client.products;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "SrvIntProductInterface", targetNamespace = "http://www.girosyfinanzas/servicios/DireccionCanales/SrvIntProduct/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SrvIntProductInterface {

	/**
	 * 
	 * @param getProductsByCustomerReq
	 * @return returns
	 *         com.backoffice.client.products.GetProductsByCustomerRespType
	 * @throws GetProductsByCustomerFault
	 */
	@WebMethod(operationName = "GetProductsByCustomer", action = "http://www.girosyfinanzas/servicios/DireccionCanales/SrvIntProduct/GetProductsByCustomer")
	@WebResult(name = "getProductsByCustomerResponse", targetNamespace = "http://www.girosyfinanzas/servicios/DireccionCanales/SrvIntProduct/", partName = "getProductsByCustomerResp")
	public GetProductsByCustomerRespType getProductsByCustomer(
			@WebParam(name = "getProductsByCustomerRequest", targetNamespace = "http://www.girosyfinanzas/servicios/DireccionCanales/SrvIntProduct/", partName = "getProductsByCustomerReq") GetProductsByCustomerReqType getProductsByCustomerReq)
			throws GetProductsByCustomerFault;

}