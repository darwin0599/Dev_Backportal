
package com.backoffice.client.bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ManageAccountsRespType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ManageAccountsRespType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextResponse" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextResponseType/}ContextResponseType"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageAccountsRespType", propOrder = { "contextResponse", "code", "message" })
public class ManageAccountsRespType {

	@XmlElement(required = true)
	protected ContextResponseType contextResponse;
	@XmlElement(required = true)
	protected String code;
	@XmlElement(required = true)
	protected String message;

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
	 * Gets the value of the code property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the value of the code property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCode(String value) {
		this.code = value;
	}

	/**
	 * Gets the value of the message property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the value of the message property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMessage(String value) {
		this.message = value;
	}

}
