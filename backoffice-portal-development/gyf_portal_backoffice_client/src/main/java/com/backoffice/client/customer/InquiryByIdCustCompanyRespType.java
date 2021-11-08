
package com.backoffice.client.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for InquiryByIdCustCompanyRespType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="InquiryByIdCustCompanyRespType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextResponse" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextResponseType/}ContextResponseType"/>
 *         &lt;element name="customerCompany" type="{http://girosyfinanzas.com/schema/DireccionCanales/CustomerCompanyType/}CustomerCompanyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InquiryByIdCustCompanyRespType", propOrder = { "contextResponse", "customerCompany" })
public class InquiryByIdCustCompanyRespType {

	@XmlElement(required = true)
	protected ContextResponseType contextResponse;
	@XmlElement(required = true)
	protected CustomerCompanyType customerCompany;

	/**
	 * Gets the value of the contextResponse property.
	 * 
	 * @return possible object is {@link ContextResponseType }
	 * 
	 */
	public ContextResponseType getContextResponse() {
		return contextResponse;
	}

	/**
	 * Sets the value of the contextResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link ContextResponseType }
	 * 
	 */
	public void setContextResponse(ContextResponseType value) {
		this.contextResponse = value;
	}

	/**
	 * Gets the value of the customerCompany property.
	 * 
	 * @return possible object is {@link CustomerCompanyType }
	 * 
	 */
	public CustomerCompanyType getCustomerCompany() {
		return customerCompany;
	}

	/**
	 * Sets the value of the customerCompany property.
	 * 
	 * @param value
	 *            allowed object is {@link CustomerCompanyType }
	 * 
	 */
	public void setCustomerCompany(CustomerCompanyType value) {
		this.customerCompany = value;
	}

}
