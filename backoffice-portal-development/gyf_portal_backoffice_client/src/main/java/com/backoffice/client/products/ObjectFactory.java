
package com.backoffice.client.products;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.backoffice.client.products package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _GetProductsByCustomerResponse_QNAME = new QName(
			"http://www.girosyfinanzas/servicios/DireccionCanales/SrvIntProduct/", "getProductsByCustomerResponse");
	private final static QName _GetProductsByCustomerFault_QNAME = new QName(
			"http://www.girosyfinanzas/servicios/DireccionCanales/SrvIntProduct/", "getProductsByCustomerFault");
	private final static QName _GetProductsByCustomerRequest_QNAME = new QName(
			"http://www.girosyfinanzas/servicios/DireccionCanales/SrvIntProduct/", "getProductsByCustomerRequest");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.backoffice.client.products
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link ProductType }
	 * 
	 */
	public ProductType createProductType() {
		return new ProductType();
	}

	/**
	 * Create an instance of {@link ErrorType }
	 * 
	 */
	public ErrorType createErrorType() {
		return new ErrorType();
	}

	/**
	 * Create an instance of {@link ErrorsList }
	 * 
	 */
	public ErrorsList createErrorsList() {
		return new ErrorsList();
	}

	/**
	 * Create an instance of {@link CustomerCommonType }
	 * 
	 */
	public CustomerCommonType createCustomerCommonType() {
		return new CustomerCommonType();
	}

	/**
	 * Create an instance of {@link GetProductsByCustomerFaultType }
	 * 
	 */
	public GetProductsByCustomerFaultType createGetProductsByCustomerFaultType() {
		return new GetProductsByCustomerFaultType();
	}

	/**
	 * Create an instance of {@link FaultType }
	 * 
	 */
	public FaultType createFaultType() {
		return new FaultType();
	}

	/**
	 * Create an instance of {@link GetProductsByCustomerRespType }
	 * 
	 */
	public GetProductsByCustomerRespType createGetProductsByCustomerRespType() {
		return new GetProductsByCustomerRespType();
	}

	/**
	 * Create an instance of {@link ContextResponseType }
	 * 
	 */
	public ContextResponseType createContextResponseType() {
		return new ContextResponseType();
	}

	/**
	 * Create an instance of {@link GetProductsByCustomerReqType }
	 * 
	 */
	public GetProductsByCustomerReqType createGetProductsByCustomerReqType() {
		return new GetProductsByCustomerReqType();
	}

	/**
	 * Create an instance of {@link ProductsListType }
	 * 
	 */
	public ProductsListType createProductsListType() {
		return new ProductsListType();
	}

	/**
	 * Create an instance of {@link ContextTransactionType }
	 * 
	 */
	public ContextTransactionType createContextTransactionType() {
		return new ContextTransactionType();
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link GetProductsByCustomerRespType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas/servicios/DireccionCanales/SrvIntProduct/", name = "getProductsByCustomerResponse")
	public JAXBElement<GetProductsByCustomerRespType> createGetProductsByCustomerResponse(
			GetProductsByCustomerRespType value) {
		return new JAXBElement<GetProductsByCustomerRespType>(_GetProductsByCustomerResponse_QNAME,
				GetProductsByCustomerRespType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link GetProductsByCustomerFaultType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas/servicios/DireccionCanales/SrvIntProduct/", name = "getProductsByCustomerFault")
	public JAXBElement<GetProductsByCustomerFaultType> createGetProductsByCustomerFault(
			GetProductsByCustomerFaultType value) {
		return new JAXBElement<GetProductsByCustomerFaultType>(_GetProductsByCustomerFault_QNAME,
				GetProductsByCustomerFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link GetProductsByCustomerReqType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas/servicios/DireccionCanales/SrvIntProduct/", name = "getProductsByCustomerRequest")
	public JAXBElement<GetProductsByCustomerReqType> createGetProductsByCustomerRequest(
			GetProductsByCustomerReqType value) {
		return new JAXBElement<GetProductsByCustomerReqType>(_GetProductsByCustomerRequest_QNAME,
				GetProductsByCustomerReqType.class, null, value);
	}

}
