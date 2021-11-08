
package com.girosyfinanzas.schema.direccioncanales.errortype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ErrorType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codTypeSeverity">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="FATAL"/>
 *               &lt;enumeration value="ERROR"/>
 *               &lt;enumeration value="WARNING"/>
 *               &lt;enumeration value="INFO"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codTypeError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorType", propOrder = { "codError", "codTypeSeverity", "codTypeError", "descError", "notification" })
public class ErrorType {

	@XmlElement(required = true)
	protected String codError;
	@XmlElement(required = true)
	protected String codTypeSeverity;
	@XmlElement(required = true)
	protected String codTypeError;
	@XmlElement(required = true)
	protected String descError;
	protected Boolean notification;

	/**
	 * Gets the value of the codError property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodError() {
		return codError;
	}

	/**
	 * Sets the value of the codError property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodError(String value) {
		this.codError = value;
	}

	/**
	 * Gets the value of the codTypeSeverity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodTypeSeverity() {
		return codTypeSeverity;
	}

	/**
	 * Sets the value of the codTypeSeverity property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodTypeSeverity(String value) {
		this.codTypeSeverity = value;
	}

	/**
	 * Gets the value of the codTypeError property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodTypeError() {
		return codTypeError;
	}

	/**
	 * Sets the value of the codTypeError property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodTypeError(String value) {
		this.codTypeError = value;
	}

	/**
	 * Gets the value of the descError property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescError() {
		return descError;
	}

	/**
	 * Sets the value of the descError property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescError(String value) {
		this.descError = value;
	}

	/**
	 * Gets the value of the notification property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isNotification() {
		return notification;
	}

	/**
	 * Sets the value of the notification property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setNotification(Boolean value) {
		this.notification = value;
	}

}
