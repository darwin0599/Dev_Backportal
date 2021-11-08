
package com.backoffice.client.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for InfoCustomerType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="InfoCustomerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="requiresUpdatingData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoCustomerType", propOrder = { "createCustomer", "requiresUpdatingData" })
public class InfoCustomerType {

	protected Boolean createCustomer;
	protected Boolean requiresUpdatingData;

	/**
	 * Gets the value of the createCustomer property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isCreateCustomer() {
		return createCustomer;
	}

	/**
	 * Sets the value of the createCustomer property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setCreateCustomer(Boolean value) {
		this.createCustomer = value;
	}

	/**
	 * Gets the value of the requiresUpdatingData property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isRequiresUpdatingData() {
		return requiresUpdatingData;
	}

	/**
	 * Sets the value of the requiresUpdatingData property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setRequiresUpdatingData(Boolean value) {
		this.requiresUpdatingData = value;
	}

}
