
package com.backoffice.client.validatecustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for RepresentativeType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="RepresentativeType">
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
 *         &lt;element name="codTypeIdentification" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valFirstName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valMiddleName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valLastName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valMiddleLastName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valPhone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codCity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valAddress" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="imgPrint" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepresentativeType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/RepresentativeType/", propOrder = {
		"id", "codTypeIdentification", "valFirstName", "valMiddleName", "valLastName", "valMiddleLastName", "valPhone",
		"codCity", "valAddress", "imgPrint" })
public class RepresentativeType {

	protected String id;
	protected String codTypeIdentification;
	protected String valFirstName;
	protected String valMiddleName;
	protected String valLastName;
	protected String valMiddleLastName;
	protected String valPhone;
	protected String codCity;
	protected String valAddress;
	protected byte[] imgPrint;

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
	 * Gets the value of the codTypeIdentification property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodTypeIdentification() {
		return codTypeIdentification;
	}

	/**
	 * Sets the value of the codTypeIdentification property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodTypeIdentification(String value) {
		this.codTypeIdentification = value;
	}

	/**
	 * Gets the value of the valFirstName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValFirstName() {
		return valFirstName;
	}

	/**
	 * Sets the value of the valFirstName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValFirstName(String value) {
		this.valFirstName = value;
	}

	/**
	 * Gets the value of the valMiddleName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValMiddleName() {
		return valMiddleName;
	}

	/**
	 * Sets the value of the valMiddleName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValMiddleName(String value) {
		this.valMiddleName = value;
	}

	/**
	 * Gets the value of the valLastName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValLastName() {
		return valLastName;
	}

	/**
	 * Sets the value of the valLastName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValLastName(String value) {
		this.valLastName = value;
	}

	/**
	 * Gets the value of the valMiddleLastName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValMiddleLastName() {
		return valMiddleLastName;
	}

	/**
	 * Sets the value of the valMiddleLastName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValMiddleLastName(String value) {
		this.valMiddleLastName = value;
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
	 * Gets the value of the codCity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodCity() {
		return codCity;
	}

	/**
	 * Sets the value of the codCity property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodCity(String value) {
		this.codCity = value;
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
	 * Gets the value of the imgPrint property.
	 * 
	 * @return possible object is byte[]
	 */
	public byte[] getImgPrint() {
		return imgPrint;
	}

	/**
	 * Sets the value of the imgPrint property.
	 * 
	 * @param value
	 *            allowed object is byte[]
	 */
	public void setImgPrint(byte[] value) {
		this.imgPrint = ((byte[]) value);
	}

}
