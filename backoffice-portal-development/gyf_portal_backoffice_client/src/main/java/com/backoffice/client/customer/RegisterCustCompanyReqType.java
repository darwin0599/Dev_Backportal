
package com.backoffice.client.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for RegisterCustCompanyReqType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterCustCompanyReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextTransaction" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextTransactionType/}ContextTransactionType"/>
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
@XmlType(name = "RegisterCustCompanyReqType", propOrder = { "contextTransaction", "customerCompany" })
public class RegisterCustCompanyReqType {

	@XmlElement(required = true)
	protected ContextTransactionType contextTransaction;
	@XmlElement(required = true)
	protected CustomerCompanyType customerCompany;

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
