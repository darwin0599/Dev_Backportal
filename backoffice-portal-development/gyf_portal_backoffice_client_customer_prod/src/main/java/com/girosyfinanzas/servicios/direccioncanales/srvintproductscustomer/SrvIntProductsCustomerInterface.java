
package com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer;

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
@WebService(name = "SrvIntProductsCustomerInterface", targetNamespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SrvIntProductsCustomerInterface {

	/**
	 * 
	 * @param productsReq
	 * @return returns
	 *         com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer.ProductsRespType
	 * @throws ProductsFault
	 */
	@WebMethod(operationName = "Products", action = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/Products")
	@WebResult(name = "productsResponse", targetNamespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/", partName = "productsResp")
	public ProductsRespType products(
			@WebParam(name = "productsRequest", targetNamespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/", partName = "productsReq") ProductsReqType productsReq)
			throws ProductsFault;

	/**
	 * 
	 * @param productMovementsReq
	 * @return returns
	 *         com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer.ProductMovementsRespType
	 * @throws ProductMovementsFault
	 */
	@WebMethod(operationName = "ProductMovements", action = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/ProductMovements")
	@WebResult(name = "productMovementsResponse", targetNamespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/", partName = "productMovementsResp")
	public ProductMovementsRespType productMovements(
			@WebParam(name = "productMovementsRequest", targetNamespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/", partName = "productMovementsReq") ProductMovementsReqType productMovementsReq)
			throws ProductMovementsFault;

}
