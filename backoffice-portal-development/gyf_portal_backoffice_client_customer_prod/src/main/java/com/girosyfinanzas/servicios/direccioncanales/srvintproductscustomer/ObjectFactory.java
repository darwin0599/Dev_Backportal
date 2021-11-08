
package com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer package.
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

	private final static QName _ProductsFault_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/", "productsFault");
	private final static QName _ProductsResponse_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/", "productsResponse");
	private final static QName _ProductMovementsRequest_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/",
			"productMovementsRequest");
	private final static QName _ProductMovementsResponse_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/",
			"productMovementsResponse");
	private final static QName _ProductMovementsFault_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/",
			"productMovementsFault");
	private final static QName _ProductsRequest_QNAME = new QName(
			"http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/", "productsRequest");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package:
	 * com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link ProductsReqType }
	 * 
	 */
	public ProductsReqType createProductsReqType() {
		return new ProductsReqType();
	}

	/**
	 * Create an instance of {@link ProductsRespType }
	 * 
	 */
	public ProductsRespType createProductsRespType() {
		return new ProductsRespType();
	}

	/**
	 * Create an instance of {@link InsurancesType }
	 * 
	 */
	public InsurancesType createInsurancesType() {
		return new InsurancesType();
	}

	/**
	 * Create an instance of {@link CdtsType }
	 * 
	 */
	public CdtsType createCdtsType() {
		return new CdtsType();
	}

	/**
	 * Create an instance of {@link InsuranceCompoundType }
	 * 
	 */
	public InsuranceCompoundType createInsuranceCompoundType() {
		return new InsuranceCompoundType();
	}

	/**
	 * Create an instance of {@link ProductsFaultType }
	 * 
	 */
	public ProductsFaultType createProductsFaultType() {
		return new ProductsFaultType();
	}

	/**
	 * Create an instance of {@link ProductMovementsRespType }
	 * 
	 */
	public ProductMovementsRespType createProductMovementsRespType() {
		return new ProductMovementsRespType();
	}

	/**
	 * Create an instance of {@link ProductMovementsReqType }
	 * 
	 */
	public ProductMovementsReqType createProductMovementsReqType() {
		return new ProductMovementsReqType();
	}

	/**
	 * Create an instance of {@link CreditAccountsType }
	 * 
	 */
	public CreditAccountsType createCreditAccountsType() {
		return new CreditAccountsType();
	}

	/**
	 * Create an instance of {@link SavingAccountsType }
	 * 
	 */
	public SavingAccountsType createSavingAccountsType() {
		return new SavingAccountsType();
	}

	/**
	 * Create an instance of {@link MovementListType }
	 * 
	 */
	public MovementListType createMovementListType() {
		return new MovementListType();
	}

	/**
	 * Create an instance of {@link ProductMovementsFaultType }
	 * 
	 */
	public ProductMovementsFaultType createProductMovementsFaultType() {
		return new ProductMovementsFaultType();
	}

	/**
	 * Create an instance of {@link BeneficiaryListType }
	 * 
	 */
	public BeneficiaryListType createBeneficiaryListType() {
		return new BeneficiaryListType();
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ProductsFaultType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/", name = "productsFault")
	public JAXBElement<ProductsFaultType> createProductsFault(ProductsFaultType value) {
		return new JAXBElement<ProductsFaultType>(_ProductsFault_QNAME, ProductsFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ProductsRespType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/", name = "productsResponse")
	public JAXBElement<ProductsRespType> createProductsResponse(ProductsRespType value) {
		return new JAXBElement<ProductsRespType>(_ProductsResponse_QNAME, ProductsRespType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ProductMovementsReqType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/", name = "productMovementsRequest")
	public JAXBElement<ProductMovementsReqType> createProductMovementsRequest(ProductMovementsReqType value) {
		return new JAXBElement<ProductMovementsReqType>(_ProductMovementsRequest_QNAME, ProductMovementsReqType.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ProductMovementsRespType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/", name = "productMovementsResponse")
	public JAXBElement<ProductMovementsRespType> createProductMovementsResponse(ProductMovementsRespType value) {
		return new JAXBElement<ProductMovementsRespType>(_ProductMovementsResponse_QNAME,
				ProductMovementsRespType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ProductMovementsFaultType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/", name = "productMovementsFault")
	public JAXBElement<ProductMovementsFaultType> createProductMovementsFault(ProductMovementsFaultType value) {
		return new JAXBElement<ProductMovementsFaultType>(_ProductMovementsFault_QNAME, ProductMovementsFaultType.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ProductsReqType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/", name = "productsRequest")
	public JAXBElement<ProductsReqType> createProductsRequest(ProductsReqType value) {
		return new JAXBElement<ProductsReqType>(_ProductsRequest_QNAME, ProductsReqType.class, null, value);
	}

}
