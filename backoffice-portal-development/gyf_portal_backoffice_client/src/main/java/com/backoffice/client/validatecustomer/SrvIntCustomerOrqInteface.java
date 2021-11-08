
package com.backoffice.client.validatecustomer;

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
@WebService(name = "SrvIntCustomerOrqInteface", targetNamespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SrvIntCustomerOrqInteface {

	/**
	 * 
	 * @param validateComplianceListReq
	 * @return returns
	 *         com.backoffice.client.validatecustomer.ValidateComplianceListRespType
	 * @throws ValidateCompliancesListFault
	 */
	@WebMethod(operationName = "ValidateCompliancesList", action = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/ValidateCompliancesList")
	@WebResult(name = "validateComplianceListResponse", targetNamespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/", partName = "validateComplianceListResp")
	public ValidateComplianceListRespType validateCompliancesList(
			@WebParam(name = "validateComplianceListRequest", targetNamespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/", partName = "validateComplianceListReq") ValidateComplianceListReqType validateComplianceListReq)
			throws ValidateCompliancesListFault;

	/**
	 * 
	 * @param validateAccumulatedReq
	 * @return returns
	 *         com.backoffice.client.validatecustomer.ValidateAccumulatedRespType
	 * @throws ValidateAccumulatedFault
	 */
	@WebMethod(operationName = "ValidateAccumulated", action = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/ValidateAccumulated")
	@WebResult(name = "validateAccumulatedResponse", targetNamespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/", partName = "validateAccumulatedResp")
	public ValidateAccumulatedRespType validateAccumulated(
			@WebParam(name = "validateAccumulatedRequest", targetNamespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/", partName = "validateAccumulatedReq") ValidateAccumulatedReqType validateAccumulatedReq)
			throws ValidateAccumulatedFault;

	/**
	 * 
	 * @param validateCustomerReq
	 * @return returns
	 *         com.backoffice.client.validatecustomer.ValidateCustomerRespType
	 * @throws ValidateCustomerFault
	 */
	@WebMethod(operationName = "ValidateCustomer", action = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/ValidateCustomer")
	@WebResult(name = "validateCustomerResponse", targetNamespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/", partName = "validateCustomerResp")
	public ValidateCustomerRespType validateCustomer(
			@WebParam(name = "validateCustomerRequest", targetNamespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/", partName = "validateCustomerReq") ValidateCustomerReqType validateCustomerReq)
			throws ValidateCustomerFault;

}