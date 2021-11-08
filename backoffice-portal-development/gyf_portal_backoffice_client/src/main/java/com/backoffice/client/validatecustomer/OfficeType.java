
package com.backoffice.client.validatecustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for OfficeType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="OfficeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valAddress" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valPhone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valCity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="idRegional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servicePoint" type="{http://girosyfinanzas.com/schema/DireccionCanales/ServicePointType/}ServicePointType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfficeType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/OfficeType/", propOrder = {
		"id", "valName", "valAddress", "valPhone", "valCity", "idRegional", "servicePoint" })
public class OfficeType {

	protected String id;
	protected String valName;
	protected String valAddress;
	protected String valPhone;
	protected String valCity;
	protected String idRegional;
	protected ServicePointType servicePoint;

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Gets the value of the valName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValName() {
		return valName;
	}

	/**
	 * Sets the value of the valName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValName(String value) {
		this.valName = value;
	}

	/**
	 * Gets the value of the valAddress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValAddress() {
		return valAddress;
	}

	/**
	 * Sets the value of the valAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValAddress(String value) {
		this.valAddress = value;
	}

	/**
	 * Gets the value of the valPhone property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValPhone() {
		return valPhone;
	}

	/**
	 * Sets the value of the valPhone property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValPhone(String value) {
		this.valPhone = value;
	}

	/**
	 * Gets the value of the valCity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValCity() {
		return valCity;
	}

	/**
	 * Sets the value of the valCity property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValCity(String value) {
		this.valCity = value;
	}

	/**
	 * Gets the value of the idRegional property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdRegional() {
		return idRegional;
	}

	/**
	 * Sets the value of the idRegional property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdRegional(String value) {
		this.idRegional = value;
	}

	/**
	 * Gets the value of the servicePoint property.
	 * 
	 * @return possible object is {@link ServicePointType }
	 * 
	 */
	public ServicePointType getServicePoint() {
		return servicePoint;
	}

	/**
	 * Sets the value of the servicePoint property.
	 * 
	 * @param value
	 *            allowed object is {@link ServicePointType }
	 * 
	 */
	public void setServicePoint(ServicePointType value) {
		this.servicePoint = value;
	}

}
