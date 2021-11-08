
package com.girosyfinanzas.schema.direccioncanales.faulttype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.girosyfinanzas.schema.direccioncanales.contextresponsetype.ContextResponseType;

/**
 * <p>
 * Java class for FaultType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="FaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextResponse" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextResponseType/}ContextResponseType"/>
 *         &lt;element name="errors" type="{http://girosyfinanzas.com/schema/DireccionCanales/FaultType/}ErrorsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultType", propOrder = { "contextResponse", "errors" })
public class FaultType {

	@XmlElement(required = true)
	protected ContextResponseType contextResponse;
	protected ErrorsType errors;

	/**
	 * Gets the value of the contextResponse property.
	 * 
	 * @return possible object is {@link ContextResponseType }
	 * 
	 */
	public ContextResponseType getContextResponse() {
		return contextResponse;
	}

	/**
	 * Sets the value of the contextResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link ContextResponseType }
	 * 
	 */
	public void setContextResponse(ContextResponseType value) {
		this.contextResponse = value;
	}

	/**
	 * Gets the value of the errors property.
	 * 
	 * @return possible object is {@link ErrorsType }
	 * 
	 */
	public ErrorsType getErrors() {
		return errors;
	}

	/**
	 * Sets the value of the errors property.
	 * 
	 * @param value
	 *            allowed object is {@link ErrorsType }
	 * 
	 */
	public void setErrors(ErrorsType value) {
		this.errors = value;
	}

}
