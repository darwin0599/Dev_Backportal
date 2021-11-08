
package com.backoffice.client.otp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ValidateFaultType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateFaultType">
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
@XmlType(name = "ValidateFaultType", propOrder = { "fault" })
public class ValidateFaultType {

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
