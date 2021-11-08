
package com.backoffice.client.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for RegisterReqType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextTransaction" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextTransactionType/}ContextTransactionType"/>
 *         &lt;element name="customer" type="{http://girosyfinanzas.com/schema/DireccionCanales/CustomerType/}CustomerType"/>
 *         &lt;element name="representative" type="{http://girosyfinanzas.com/schema/DireccionCanales/RepresentativeType/}RepresentativeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterReqType", propOrder = { "contextTransaction", "customer", "representative" })
public class RegisterReqType {

	@XmlElement(required = true)
	protected ContextTransactionType contextTransaction;
	@XmlElement(required = true)
	protected CustomerType customer;
	@XmlElement(required = true)
	protected RepresentativeType representative;

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

	/**
	 * Gets the value of the representative property.
	 * 
	 * @return possible object is {@link RepresentativeType }
	 * 
	 */
	public RepresentativeType getRepresentative() {
		return representative;
	}

	/**
	 * Sets the value of the representative property.
	 * 
	 * @param value
	 *            allowed object is {@link RepresentativeType }
	 * 
	 */
	public void setRepresentative(RepresentativeType value) {
		this.representative = value;
	}

}
