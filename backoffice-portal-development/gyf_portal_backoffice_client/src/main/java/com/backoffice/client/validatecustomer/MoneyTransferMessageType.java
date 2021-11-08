
package com.backoffice.client.validatecustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for MoneyTransferMessageType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="MoneyTransferMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseMessageCharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseMessageLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incrementalMessageCharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incrementalMessageLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyTransferMessageType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/MoneyTransferMessageType/", propOrder = {
		"baseMessageCharge", "baseMessageLimit", "incrementalMessageCharge", "incrementalMessageLimit" })
public class MoneyTransferMessageType {

	protected String baseMessageCharge;
	protected String baseMessageLimit;
	protected String incrementalMessageCharge;
	protected String incrementalMessageLimit;

	/**
	 * Gets the value of the baseMessageCharge property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBaseMessageCharge() {
		return baseMessageCharge;
	}

	/**
	 * Sets the value of the baseMessageCharge property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBaseMessageCharge(String value) {
		this.baseMessageCharge = value;
	}

	/**
	 * Gets the value of the baseMessageLimit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBaseMessageLimit() {
		return baseMessageLimit;
	}

	/**
	 * Sets the value of the baseMessageLimit property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBaseMessageLimit(String value) {
		this.baseMessageLimit = value;
	}

	/**
	 * Gets the value of the incrementalMessageCharge property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIncrementalMessageCharge() {
		return incrementalMessageCharge;
	}

	/**
	 * Sets the value of the incrementalMessageCharge property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIncrementalMessageCharge(String value) {
		this.incrementalMessageCharge = value;
	}

	/**
	 * Gets the value of the incrementalMessageLimit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIncrementalMessageLimit() {
		return incrementalMessageLimit;
	}

	/**
	 * Sets the value of the incrementalMessageLimit property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIncrementalMessageLimit(String value) {
		this.incrementalMessageLimit = value;
	}

}
