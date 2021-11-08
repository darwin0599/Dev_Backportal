
package com.backoffice.client.validatecustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ValidateCustomerFaultType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateCustomerFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fault" type="{http://girosyfinanzas.com/schema/DireccionCanales/FaultType/}FaultType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateCustomerFaultType", propOrder = { "fault" })
public class ValidateCustomerFaultType {

	@XmlElement(required = true)
	protected FaultType fault;

	/**
	 * Gets the value of the fault property.
	 * 
	 * @return possible object is {@link FaultType }
	 * 
	 */
	public FaultType getFault() {
		return fault;
	}

	/**
	 * Sets the value of the fault property.
	 * 
	 * @param value
	 *            allowed object is {@link FaultType }
	 * 
	 */
	public void setFault(FaultType value) {
		this.fault = value;
	}

}
