
package com.backoffice.client.bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for BankAccountType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="BankAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overDraft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="availableBalanace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tradeBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="office" type="{http://girosyfinanzas.com/schema/DireccionCanales/OfficeType/}OfficeType" minOccurs="0"/>
 *         &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAccountType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/BankAccountType/", propOrder = {
		"accountNumber", "accountType", "accountClass", "system", "product", "currency", "agency", "overDraft",
		"availableBalanace", "tradeBalance", "office", "bankCode", "state", "operation", "bankName", "alias" })
public class BankAccountType {

	protected String accountNumber;
	protected String accountType;
	protected String accountClass;
	protected String system;
	protected String product;
	protected String currency;
	protected String agency;
	protected String overDraft;
	protected String availableBalanace;
	protected String tradeBalance;
	protected OfficeType office;
	protected String bankCode;
	protected String state;
	protected String operation;
	protected String bankName;
	protected String alias;

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
	 * Gets the value of the accountClass property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAccountClass() {
		return accountClass;
	}

	/**
	 * Sets the value of the accountClass property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAccountClass(String value) {
		this.accountClass = value;
	}

	/**
	 * Gets the value of the system property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSystem() {
		return system;
	}

	/**
	 * Sets the value of the system property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSystem(String value) {
		this.system = value;
	}

	/**
	 * Gets the value of the product property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProduct() {
		return product;
	}

	/**
	 * Sets the value of the product property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProduct(String value) {
		this.product = value;
	}

	/**
	 * Gets the value of the currency property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * Sets the value of the currency property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCurrency(String value) {
		this.currency = value;
	}

	/**
	 * Gets the value of the agency property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAgency() {
		return agency;
	}

	/**
	 * Sets the value of the agency property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAgency(String value) {
		this.agency = value;
	}

	/**
	 * Gets the value of the overDraft property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOverDraft() {
		return overDraft;
	}

	/**
	 * Sets the value of the overDraft property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOverDraft(String value) {
		this.overDraft = value;
	}

	/**
	 * Gets the value of the availableBalanace property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAvailableBalanace() {
		return availableBalanace;
	}

	/**
	 * Sets the value of the availableBalanace property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAvailableBalanace(String value) {
		this.availableBalanace = value;
	}

	/**
	 * Gets the value of the tradeBalance property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTradeBalance() {
		return tradeBalance;
	}

	/**
	 * Sets the value of the tradeBalance property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTradeBalance(String value) {
		this.tradeBalance = value;
	}

	/**
	 * Gets the value of the office property.
	 * 
	 * @return possible object is {@link OfficeType }
	 * 
	 */
	public OfficeType getOffice() {
		return office;
	}

	/**
	 * Sets the value of the office property.
	 * 
	 * @param value
	 *            allowed object is {@link OfficeType }
	 * 
	 */
	public void setOffice(OfficeType value) {
		this.office = value;
	}

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
	 * Gets the value of the state property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the value of the state property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setState(String value) {
		this.state = value;
	}

	/**
	 * Gets the value of the operation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * Sets the value of the operation property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOperation(String value) {
		this.operation = value;
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
	 * Gets the value of the alias property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * Sets the value of the alias property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAlias(String value) {
		this.alias = value;
	}

}
