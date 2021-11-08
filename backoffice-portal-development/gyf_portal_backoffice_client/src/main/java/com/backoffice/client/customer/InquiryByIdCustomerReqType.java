
package com.backoffice.client.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for InquiryByIdCustomerReqType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="InquiryByIdCustomerReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextTransaction" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextTransactionType/}ContextTransactionType"/>
 *         &lt;element name="codTypeIdentificationCustomer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idCustomer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InquiryByIdCustomerReqType", propOrder = { "contextTransaction", "codTypeIdentificationCustomer",
		"idCustomer" })
public class InquiryByIdCustomerReqType {

	@XmlElement(required = true)
	protected ContextTransactionType contextTransaction;
	@XmlElement(required = true)
	protected String codTypeIdentificationCustomer;
	@XmlElement(required = true)
	protected String idCustomer;

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
	 * Gets the value of the codTypeIdentificationCustomer property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodTypeIdentificationCustomer() {
		return codTypeIdentificationCustomer;
	}

	/**
	 * Sets the value of the codTypeIdentificationCustomer property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodTypeIdentificationCustomer(String value) {
		this.codTypeIdentificationCustomer = value;
	}

	/**
	 * Gets the value of the idCustomer property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdCustomer() {
		return idCustomer;
	}

	/**
	 * Sets the value of the idCustomer property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdCustomer(String value) {
		this.idCustomer = value;
	}

}
