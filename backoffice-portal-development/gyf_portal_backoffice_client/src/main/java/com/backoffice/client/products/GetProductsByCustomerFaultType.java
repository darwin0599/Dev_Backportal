
package com.backoffice.client.products;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for GetProductsByCustomerFaultType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="GetProductsByCustomerFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fault" type="{http://girosyfinanzas.com/schema/DireccionCanales/FaultType_v2/}FaultType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProductsByCustomerFaultType", propOrder = { "fault" })
public class GetProductsByCustomerFaultType {

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
