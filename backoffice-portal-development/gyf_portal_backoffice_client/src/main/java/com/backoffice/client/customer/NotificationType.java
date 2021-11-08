
package com.backoffice.client.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * quien emite el mensaje
 * 
 * <p>
 * Java class for NotificationType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="severity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="FATAL"/>
 *               &lt;enumeration value="ERROR"/>
 *               &lt;enumeration value="WARNING"/>
 *               &lt;enumeration value="INFO"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notify" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/NotificationType/", propOrder = {
		"emisor", "decline", "code", "severity", "type", "description", "visibility", "receptor", "notify" })
public class NotificationType {

	protected String emisor;
	protected Boolean decline;
	protected String code;
	protected String severity;
	protected String type;
	protected String description;
	protected String visibility;
	protected String receptor;
	protected String notify;

	/**
	 * Gets the value of the emisor property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEmisor() {
		return emisor;
	}

	/**
	 * Sets the value of the emisor property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEmisor(String value) {
		this.emisor = value;
	}

	/**
	 * Gets the value of the decline property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isDecline() {
		return decline;
	}

	/**
	 * Sets the value of the decline property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setDecline(Boolean value) {
		this.decline = value;
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
	 * Gets the value of the severity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSeverity() {
		return severity;
	}

	/**
	 * Sets the value of the severity property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSeverity(String value) {
		this.severity = value;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setType(String value) {
		this.type = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Gets the value of the visibility property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVisibility() {
		return visibility;
	}

	/**
	 * Sets the value of the visibility property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVisibility(String value) {
		this.visibility = value;
	}

	/**
	 * Gets the value of the receptor property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReceptor() {
		return receptor;
	}

	/**
	 * Sets the value of the receptor property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReceptor(String value) {
		this.receptor = value;
	}

	/**
	 * Gets the value of the notify property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNotify() {
		return notify;
	}

	/**
	 * Sets the value of the notify property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNotify(String value) {
		this.notify = value;
	}

}
