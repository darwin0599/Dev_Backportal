
package com.backoffice.client.bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ParamsAgreementType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ParamsAgreementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityAcquirer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="controlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servicePointAcquirer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamsAgreementType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/ParamsAgreementType/", propOrder = {
		"login", "password", "entityAcquirer", "controlNumber", "transactionDate", "ipAddress",
		"servicePointAcquirer" })
public class ParamsAgreementType {

	protected String login;
	protected String password;
	protected String entityAcquirer;
	protected String controlNumber;
	protected String transactionDate;
	protected String ipAddress;
	protected String servicePointAcquirer;

	/**
	 * Gets the value of the login property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * Sets the value of the login property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLogin(String value) {
		this.login = value;
	}

	/**
	 * Gets the value of the password property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the value of the password property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPassword(String value) {
		this.password = value;
	}

	/**
	 * Gets the value of the entityAcquirer property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEntityAcquirer() {
		return entityAcquirer;
	}

	/**
	 * Sets the value of the entityAcquirer property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEntityAcquirer(String value) {
		this.entityAcquirer = value;
	}

	/**
	 * Gets the value of the controlNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getControlNumber() {
		return controlNumber;
	}

	/**
	 * Sets the value of the controlNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setControlNumber(String value) {
		this.controlNumber = value;
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
	 * Gets the value of the ipAddress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * Sets the value of the ipAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIpAddress(String value) {
		this.ipAddress = value;
	}

	/**
	 * Gets the value of the servicePointAcquirer property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getServicePointAcquirer() {
		return servicePointAcquirer;
	}

	/**
	 * Sets the value of the servicePointAcquirer property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setServicePointAcquirer(String value) {
		this.servicePointAcquirer = value;
	}

}
