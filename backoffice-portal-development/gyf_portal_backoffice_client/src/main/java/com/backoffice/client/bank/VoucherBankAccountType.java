
package com.backoffice.client.bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for VoucherBankAccountType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="VoucherBankAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sectionFive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sectionOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sectionThree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sectionFour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountList" type="{http://girosyfinanzas.com/schema/DireccionCanales/VoucherBankAccountType/}AccountListType" minOccurs="0"/>
 *         &lt;element name="customerIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerMiddleLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servicePointId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fingerPrint" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoucherBankAccountType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/VoucherBankAccountType/", propOrder = {
		"sectionFive", "sectionOne", "sectionThree", "sectionFour", "accountList", "customerIdType", "customerIdNumber",
		"customerFirstName", "customerMiddleName", "customerLastName", "customerMiddleLastName", "ipAddress",
		"servicePointId", "transactionNumber", "userId", "fingerPrint" })
public class VoucherBankAccountType {

	protected String sectionFive;
	protected String sectionOne;
	protected String sectionThree;
	protected String sectionFour;
	protected AccountListType accountList;
	protected String customerIdType;
	protected String customerIdNumber;
	protected String customerFirstName;
	protected String customerMiddleName;
	protected String customerLastName;
	protected String customerMiddleLastName;
	protected String ipAddress;
	protected String servicePointId;
	protected String transactionNumber;
	protected String userId;
	protected byte[] fingerPrint;

	/**
	 * Gets the value of the sectionFive property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSectionFive() {
		return sectionFive;
	}

	/**
	 * Sets the value of the sectionFive property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSectionFive(String value) {
		this.sectionFive = value;
	}

	/**
	 * Gets the value of the sectionOne property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSectionOne() {
		return sectionOne;
	}

	/**
	 * Sets the value of the sectionOne property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSectionOne(String value) {
		this.sectionOne = value;
	}

	/**
	 * Gets the value of the sectionThree property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSectionThree() {
		return sectionThree;
	}

	/**
	 * Sets the value of the sectionThree property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSectionThree(String value) {
		this.sectionThree = value;
	}

	/**
	 * Gets the value of the sectionFour property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSectionFour() {
		return sectionFour;
	}

	/**
	 * Sets the value of the sectionFour property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSectionFour(String value) {
		this.sectionFour = value;
	}

	/**
	 * Gets the value of the accountList property.
	 * 
	 * @return possible object is {@link AccountListType }
	 * 
	 */
	public AccountListType getAccountList() {
		return accountList;
	}

	/**
	 * Sets the value of the accountList property.
	 * 
	 * @param value
	 *            allowed object is {@link AccountListType }
	 * 
	 */
	public void setAccountList(AccountListType value) {
		this.accountList = value;
	}

	/**
	 * Gets the value of the customerIdType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustomerIdType() {
		return customerIdType;
	}

	/**
	 * Sets the value of the customerIdType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustomerIdType(String value) {
		this.customerIdType = value;
	}

	/**
	 * Gets the value of the customerIdNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustomerIdNumber() {
		return customerIdNumber;
	}

	/**
	 * Sets the value of the customerIdNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustomerIdNumber(String value) {
		this.customerIdNumber = value;
	}

	/**
	 * Gets the value of the customerFirstName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustomerFirstName() {
		return customerFirstName;
	}

	/**
	 * Sets the value of the customerFirstName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustomerFirstName(String value) {
		this.customerFirstName = value;
	}

	/**
	 * Gets the value of the customerMiddleName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustomerMiddleName() {
		return customerMiddleName;
	}

	/**
	 * Sets the value of the customerMiddleName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustomerMiddleName(String value) {
		this.customerMiddleName = value;
	}

	/**
	 * Gets the value of the customerLastName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustomerLastName() {
		return customerLastName;
	}

	/**
	 * Sets the value of the customerLastName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustomerLastName(String value) {
		this.customerLastName = value;
	}

	/**
	 * Gets the value of the customerMiddleLastName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustomerMiddleLastName() {
		return customerMiddleLastName;
	}

	/**
	 * Sets the value of the customerMiddleLastName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustomerMiddleLastName(String value) {
		this.customerMiddleLastName = value;
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
	 * Gets the value of the servicePointId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getServicePointId() {
		return servicePointId;
	}

	/**
	 * Sets the value of the servicePointId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setServicePointId(String value) {
		this.servicePointId = value;
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

	/**
	 * Gets the value of the userId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * Sets the value of the userId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserId(String value) {
		this.userId = value;
	}

	/**
	 * Gets the value of the fingerPrint property.
	 * 
	 * @return possible object is byte[]
	 */
	public byte[] getFingerPrint() {
		return fingerPrint;
	}

	/**
	 * Sets the value of the fingerPrint property.
	 * 
	 * @param value
	 *            allowed object is byte[]
	 */
	public void setFingerPrint(byte[] value) {
		this.fingerPrint = ((byte[]) value);
	}

}
