
package com.girosyfinanzas.schema.direccioncanales.contexttransactiontype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ContextTransactionType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ContextTransactionType">
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
 *         &lt;element name="idUser" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="idConsumer" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="idService" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codTypeTx" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="creationMsgDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextTransactionType", propOrder = { "idTx", "idUser", "idConsumer", "idService", "codTypeTx",
		"creationMsgDate" })
public class ContextTransactionType {

	@XmlElement(required = true)
	protected String idTx;
	protected String idUser;
	protected String idConsumer;
	protected String idService;
	protected String codTypeTx;
	protected String creationMsgDate;

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
	 * Gets the value of the idUser property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdUser() {
		return idUser;
	}

	/**
	 * Sets the value of the idUser property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdUser(String value) {
		this.idUser = value;
	}

	/**
	 * Gets the value of the idConsumer property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdConsumer() {
		return idConsumer;
	}

	/**
	 * Sets the value of the idConsumer property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdConsumer(String value) {
		this.idConsumer = value;
	}

	/**
	 * Gets the value of the idService property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdService() {
		return idService;
	}

	/**
	 * Sets the value of the idService property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdService(String value) {
		this.idService = value;
	}

	/**
	 * Gets the value of the codTypeTx property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodTypeTx() {
		return codTypeTx;
	}

	/**
	 * Sets the value of the codTypeTx property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodTypeTx(String value) {
		this.codTypeTx = value;
	}

	/**
	 * Gets the value of the creationMsgDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreationMsgDate() {
		return creationMsgDate;
	}

	/**
	 * Sets the value of the creationMsgDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreationMsgDate(String value) {
		this.creationMsgDate = value;
	}

}
