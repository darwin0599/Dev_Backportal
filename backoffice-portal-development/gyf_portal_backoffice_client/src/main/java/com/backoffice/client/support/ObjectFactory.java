
package com.backoffice.client.support;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.backoffice.client.support package.
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

	private final static QName _CommonsServicesResponse_QNAME = new QName(
			"http://integration.services.support.gyf.com/", "commonsServicesResponse");
	private final static QName _CommonsServices_QNAME = new QName("http://integration.services.support.gyf.com/",
			"commonsServices");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.backoffice.client.support
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link DomainsServiceTO }
	 * 
	 */
	public DomainsServiceTO createDomainsServiceTO() {
		return new DomainsServiceTO();
	}

	/**
	 * Create an instance of {@link ContextResponseType }
	 * 
	 */
	public ContextResponseType createContextResponseType() {
		return new ContextResponseType();
	}

	/**
	 * Create an instance of {@link CommonsServicesResponse }
	 * 
	 */
	public CommonsServicesResponse createCommonsServicesResponse() {
		return new CommonsServicesResponse();
	}

	/**
	 * Create an instance of {@link ContextTransactionType }
	 * 
	 */
	public ContextTransactionType createContextTransactionType() {
		return new ContextTransactionType();
	}

	/**
	 * Create an instance of {@link CommonsServices }
	 * 
	 */
	public CommonsServices createCommonsServices() {
		return new CommonsServices();
	}

	/**
	 * Create an instance of {@link SupportServicesTO }
	 * 
	 */
	public SupportServicesTO createSupportServicesTO() {
		return new SupportServicesTO();
	}

	/**
	 * Create an instance of {@link DomainRequest }
	 * 
	 */
	public DomainRequest createDomainRequest() {
		return new DomainRequest();
	}

	/**
	 * Create an instance of {@link SupportServiceResponse }
	 * 
	 */
	public SupportServiceResponse createSupportServiceResponse() {
		return new SupportServiceResponse();
	}

	/**
	 * Create an instance of {@link DomainResponse }
	 * 
	 */
	public DomainResponse createDomainResponse() {
		return new DomainResponse();
	}

	/**
	 * Create an instance of {@link ValueDomainTO }
	 * 
	 */
	public ValueDomainTO createValueDomainTO() {
		return new ValueDomainTO();
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link CommonsServicesResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://integration.services.support.gyf.com/", name = "commonsServicesResponse")
	public JAXBElement<CommonsServicesResponse> createCommonsServicesResponse(CommonsServicesResponse value) {
		return new JAXBElement<CommonsServicesResponse>(_CommonsServicesResponse_QNAME, CommonsServicesResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CommonsServices
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://integration.services.support.gyf.com/", name = "commonsServices")
	public JAXBElement<CommonsServices> createCommonsServices(CommonsServices value) {
		return new JAXBElement<CommonsServices>(_CommonsServices_QNAME, CommonsServices.class, null, value);
	}

}
