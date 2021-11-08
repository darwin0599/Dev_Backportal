
package com.backoffice.client.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for InquiryByIdCustomerRespType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="InquiryByIdCustomerRespType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextResponse" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextResponseType/}ContextResponseType"/>
 *         &lt;element name="customer" type="{http://girosyfinanzas.com/schema/DireccionCanales/CustomerType/}CustomerType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InquiryByIdCustomerRespType", propOrder = { "contextResponse", "customer" })
public class InquiryByIdCustomerRespType {

	@XmlElement(required = true)
	protected ContextResponseType contextResponse;
	@XmlElement(required = true)
	protected CustomerType customer;

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
	 * Gets the value of the customer property.
	 * 
	 * @return possible object is {@link CustomerType }
	 * 
	 */
	public CustomerType getCustomer() {
		return customer;
	}

	/**
	 * Sets the value of the customer property.
	 * 
	 * @param value
	 *            allowed object is {@link CustomerType }
	 * 
	 */
	public void setCustomer(CustomerType value) {
		this.customer = value;
	}

}
