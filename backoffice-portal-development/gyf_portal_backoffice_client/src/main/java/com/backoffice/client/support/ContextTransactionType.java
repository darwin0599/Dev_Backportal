
package com.backoffice.client.support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for contextTransactionType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="contextTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codTypeTx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idConsumer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idTx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contextTransactionType", propOrder = { "codTypeTx", "idConsumer", "idService", "idTx", "idUser" })
public class ContextTransactionType {

	protected String codTypeTx;
	protected String idConsumer;
	protected String idService;
	protected String idTx;
	protected String idUser;

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

}
