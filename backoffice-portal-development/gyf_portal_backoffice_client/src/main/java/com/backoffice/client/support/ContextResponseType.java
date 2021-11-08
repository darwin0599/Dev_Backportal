
package com.backoffice.client.support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for contextResponseType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="contextResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codStateTx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateTx" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="idTx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contextResponseType", propOrder = { "codStateTx", "dateTx", "idTx" })
public class ContextResponseType {

	protected String codStateTx;
	@XmlSchemaType(name = "anySimpleType")
	protected Object dateTx;
	protected String idTx;

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
	 * @return possible object is {@link Object }
	 * 
	 */
	public Object getDateTx() {
		return dateTx;
	}

	/**
	 * Sets the value of the dateTx property.
	 * 
	 * @param value
	 *            allowed object is {@link Object }
	 * 
	 */
	public void setDateTx(Object value) {
		this.dateTx = value;
	}

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

}
