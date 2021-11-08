
package com.backoffice.client.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for UpdateInfoClientType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateInfoClientType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createCustomerPN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="createCustomerPJ" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "UpdateInfoClientType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/UpdateInfoClientType/", propOrder = {
		"actions", "createCustomerPN", "createCustomerPJ", "requiresUpdatingData" })
public class UpdateInfoClientType {

	protected String actions;
	protected Boolean createCustomerPN;
	protected Boolean createCustomerPJ;
	protected Boolean requiresUpdatingData;

	/**
	 * Gets the value of the actions property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getActions() {
		return actions;
	}

	/**
	 * Sets the value of the actions property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setActions(String value) {
		this.actions = value;
	}

	/**
	 * Gets the value of the createCustomerPN property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isCreateCustomerPN() {
		return createCustomerPN;
	}

	/**
	 * Sets the value of the createCustomerPN property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setCreateCustomerPN(Boolean value) {
		this.createCustomerPN = value;
	}

	/**
	 * Gets the value of the createCustomerPJ property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isCreateCustomerPJ() {
		return createCustomerPJ;
	}

	/**
	 * Sets the value of the createCustomerPJ property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setCreateCustomerPJ(Boolean value) {
		this.createCustomerPJ = value;
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
