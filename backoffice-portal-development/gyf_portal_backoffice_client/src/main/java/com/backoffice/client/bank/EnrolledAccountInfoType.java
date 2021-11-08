
package com.backoffice.client.bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for EnrolledAccountInfoType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="EnrolledAccountInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnrolledAccountInfoType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/VoucherBankAccountType/", propOrder = {
		"bankCode", "bankName", "accountType", "accountNumber" })
public class EnrolledAccountInfoType {

	@XmlElement(required = true)
	protected String bankCode;
	@XmlElement(required = true)
	protected String bankName;
	@XmlElement(required = true)
	protected String accountType;
	@XmlElement(required = true)
	protected String accountNumber;

	/**
	 * Gets the value of the bankCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBankCode() {
		return bankCode;
	}

	/**
	 * Sets the value of the bankCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBankCode(String value) {
		this.bankCode = value;
	}

	/**
	 * Gets the value of the bankName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * Sets the value of the bankName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBankName(String value) {
		this.bankName = value;
	}

	/**
	 * Gets the value of the accountType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * Sets the value of the accountType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAccountType(String value) {
		this.accountType = value;
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

}
