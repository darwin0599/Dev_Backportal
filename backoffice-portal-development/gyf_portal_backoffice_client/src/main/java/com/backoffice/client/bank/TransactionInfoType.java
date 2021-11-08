
package com.backoffice.client.bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for TransactionInfoType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valPledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionInfoType", propOrder = { "description", "value", "pig", "valPledge", "transactionNumber" })
public class TransactionInfoType {

	@XmlElement(required = true)
	protected String description;
	@XmlElement(required = true)
	protected String value;
	@XmlElement(name = "PIG")
	protected String pig;
	protected String valPledge;
	protected String transactionNumber;

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
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Gets the value of the pig property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPIG() {
		return pig;
	}

	/**
	 * Sets the value of the pig property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPIG(String value) {
		this.pig = value;
	}

	/**
	 * Gets the value of the valPledge property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValPledge() {
		return valPledge;
	}

	/**
	 * Sets the value of the valPledge property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValPledge(String value) {
		this.valPledge = value;
	}

	/**
	 * Gets the value of the transactionNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTransactionNumber() {
		return transactionNumber;
	}

	/**
	 * Sets the value of the transactionNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTransactionNumber(String value) {
		this.transactionNumber = value;
	}

}
