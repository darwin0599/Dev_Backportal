
package com.backoffice.client.bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for TranactionSIIFType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="TranactionSIIFType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueTransaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="networtCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newInversment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranactionSIIFType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/Accounts/TranactionSIIFType/", propOrder = {
		"number", "accountNumber", "valueTransaction", "nut", "transactionDate", "networtCode", "countryCode",
		"transactionCode", "transactionStatus", "newInversment", "agencyCode", "user" })
public class TranactionSIIFType {

	protected String number;
	protected String accountNumber;
	protected String valueTransaction;
	@XmlElement(name = "NUT")
	protected String nut;
	protected String transactionDate;
	protected String networtCode;
	protected String countryCode;
	protected String transactionCode;
	protected String transactionStatus;
	protected String newInversment;
	protected String agencyCode;
	protected String user;

	/**
	 * Gets the value of the number property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * Sets the value of the number property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNumber(String value) {
		this.number = value;
	}

	/**
	 * Gets the value of the accountNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Sets the value of the accountNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAccountNumber(String value) {
		this.accountNumber = value;
	}

	/**
	 * Gets the value of the valueTransaction property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValueTransaction() {
		return valueTransaction;
	}

	/**
	 * Sets the value of the valueTransaction property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValueTransaction(String value) {
		this.valueTransaction = value;
	}

	/**
	 * Gets the value of the nut property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNUT() {
		return nut;
	}

	/**
	 * Sets the value of the nut property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNUT(String value) {
		this.nut = value;
	}

	/**
	 * Gets the value of the transactionDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTransactionDate() {
		return transactionDate;
	}

	/**
	 * Sets the value of the transactionDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTransactionDate(String value) {
		this.transactionDate = value;
	}

	/**
	 * Gets the value of the networtCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNetwortCode() {
		return networtCode;
	}

	/**
	 * Sets the value of the networtCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNetwortCode(String value) {
		this.networtCode = value;
	}

	/**
	 * Gets the value of the countryCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * Sets the value of the countryCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	/**
	 * Gets the value of the transactionCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTransactionCode() {
		return transactionCode;
	}

	/**
	 * Sets the value of the transactionCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTransactionCode(String value) {
		this.transactionCode = value;
	}

	/**
	 * Gets the value of the transactionStatus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTransactionStatus() {
		return transactionStatus;
	}

	/**
	 * Sets the value of the transactionStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTransactionStatus(String value) {
		this.transactionStatus = value;
	}

	/**
	 * Gets the value of the newInversment property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNewInversment() {
		return newInversment;
	}

	/**
	 * Sets the value of the newInversment property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNewInversment(String value) {
		this.newInversment = value;
	}

	/**
	 * Gets the value of the agencyCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAgencyCode() {
		return agencyCode;
	}

	/**
	 * Sets the value of the agencyCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAgencyCode(String value) {
		this.agencyCode = value;
	}

	/**
	 * Gets the value of the user property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUser() {
		return user;
	}

	/**
	 * Sets the value of the user property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUser(String value) {
		this.user = value;
	}

}
