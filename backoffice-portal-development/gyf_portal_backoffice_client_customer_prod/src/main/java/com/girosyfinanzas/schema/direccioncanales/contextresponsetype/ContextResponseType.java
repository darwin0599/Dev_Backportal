
package com.girosyfinanzas.schema.direccioncanales.contextresponsetype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ContextResponseType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ContextResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTx">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codStateTx">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dateTx">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextResponseType", propOrder = { "idTx", "codStateTx", "dateTx" })
public class ContextResponseType {

	@XmlElement(required = true)
	protected String idTx;
	@XmlElement(required = true)
	protected String codStateTx;
	@XmlElement(required = true)
	protected String dateTx;

	/**
	 * Gets the value of the idTx property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdTx() {
		return idTx;
	}

	/**
	 * Sets the value of the idTx property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdTx(String value) {
		this.idTx = value;
	}

	/**
	 * Gets the value of the codStateTx property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodStateTx() {
		return codStateTx;
	}

	/**
	 * Sets the value of the codStateTx property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodStateTx(String value) {
		this.codStateTx = value;
	}

	/**
	 * Gets the value of the dateTx property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDateTx() {
		return dateTx;
	}

	/**
	 * Sets the value of the dateTx property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDateTx(String value) {
		this.dateTx = value;
	}

}
