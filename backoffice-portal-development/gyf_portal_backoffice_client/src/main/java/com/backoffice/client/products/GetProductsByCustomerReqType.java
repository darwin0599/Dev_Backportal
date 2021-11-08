
package com.backoffice.client.products;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for GetProductsByCustomerReqType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="GetProductsByCustomerReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextTransaction" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextTransactionType/}ContextTransactionType"/>
 *         &lt;element name="customer" type="{http://girosyfinanzas.com/schema/DireccionCanales/CustomerCommonType/}CustomerCommonType" minOccurs="0"/>
 *         &lt;element name="inquiryType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProductsByCustomerReqType", propOrder = { "contextTransaction", "customer", "inquiryType" })
public class GetProductsByCustomerReqType {

	@XmlElement(required = true)
	protected ContextTransactionType contextTransaction;
	protected CustomerCommonType customer;
	@XmlElement(required = true)
	protected String inquiryType;

	/**
	 * Gets the value of the contextTransaction property.
	 * 
	 * @return possible object is {@link ContextTransactionType }
	 * 
	 */
	public ContextTransactionType getContextTransaction() {
		return contextTransaction;
	}

	/**
	 * Sets the value of the contextTransaction property.
	 * 
	 * @param value
	 *            allowed object is {@link ContextTransactionType }
	 * 
	 */
	public void setContextTransaction(ContextTransactionType value) {
		this.contextTransaction = value;
	}

	/**
	 * Gets the value of the customer property.
	 * 
	 * @return possible object is {@link CustomerCommonType }
	 * 
	 */
	public CustomerCommonType getCustomer() {
		return customer;
	}

	/**
	 * Sets the value of the customer property.
	 * 
	 * @param value
	 *            allowed object is {@link CustomerCommonType }
	 * 
	 */
	public void setCustomer(CustomerCommonType value) {
		this.customer = value;
	}

	/**
	 * Gets the value of the inquiryType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInquiryType() {
		return inquiryType;
	}

	/**
	 * Sets the value of the inquiryType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInquiryType(String value) {
		this.inquiryType = value;
	}

}
