
package com.backoffice.client.validatecustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Tipo de cheche, dado por el tipo de cruce del mismo.
 * 
 * <p>
 * Java class for PaymentCheckType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCheckType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valTotalValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valNetValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valTaxPayment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valNumCheck" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codBank" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valNumAccountBank" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valTypeAccountBank" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valTypeCheck" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="beneficiary" type="{http://girosyfinanzas.com/schema/DireccionCanales/PersonType/}PersonType" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCheckType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/PaymentCheckType/", propOrder = {
		"code", "valTotalValue", "valNetValue", "valTaxPayment", "valNumCheck", "codBank", "valNumAccountBank",
		"valTypeAccountBank", "valTypeCheck", "beneficiary", "currencyCode" })
public class PaymentCheckType {

	protected String code;
	@XmlElement(required = true)
	protected String valTotalValue;
	@XmlElement(required = true)
	protected String valNetValue;
	@XmlElement(required = true)
	protected String valTaxPayment;
	@XmlElement(required = true)
	protected String valNumCheck;
	@XmlElement(required = true)
	protected String codBank;
	@XmlElement(required = true)
	protected String valNumAccountBank;
	@XmlElement(required = true)
	protected String valTypeAccountBank;
	@XmlElement(required = true)
	protected String valTypeCheck;
	protected PersonType beneficiary;
	protected String currencyCode;

	/**
	 * Gets the value of the code property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the value of the code property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCode(String value) {
		this.code = value;
	}

	/**
	 * Gets the value of the valTotalValue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValTotalValue() {
		return valTotalValue;
	}

	/**
	 * Sets the value of the valTotalValue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValTotalValue(String value) {
		this.valTotalValue = value;
	}

	/**
	 * Gets the value of the valNetValue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValNetValue() {
		return valNetValue;
	}

	/**
	 * Sets the value of the valNetValue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValNetValue(String value) {
		this.valNetValue = value;
	}

	/**
	 * Gets the value of the valTaxPayment property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValTaxPayment() {
		return valTaxPayment;
	}

	/**
	 * Sets the value of the valTaxPayment property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValTaxPayment(String value) {
		this.valTaxPayment = value;
	}

	/**
	 * Gets the value of the valNumCheck property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValNumCheck() {
		return valNumCheck;
	}

	/**
	 * Sets the value of the valNumCheck property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValNumCheck(String value) {
		this.valNumCheck = value;
	}

	/**
	 * Gets the value of the codBank property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodBank() {
		return codBank;
	}

	/**
	 * Sets the value of the codBank property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodBank(String value) {
		this.codBank = value;
	}

	/**
	 * Gets the value of the valNumAccountBank property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValNumAccountBank() {
		return valNumAccountBank;
	}

	/**
	 * Sets the value of the valNumAccountBank property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValNumAccountBank(String value) {
		this.valNumAccountBank = value;
	}

	/**
	 * Gets the value of the valTypeAccountBank property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValTypeAccountBank() {
		return valTypeAccountBank;
	}

	/**
	 * Sets the value of the valTypeAccountBank property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValTypeAccountBank(String value) {
		this.valTypeAccountBank = value;
	}

	/**
	 * Gets the value of the valTypeCheck property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValTypeCheck() {
		return valTypeCheck;
	}

	/**
	 * Sets the value of the valTypeCheck property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValTypeCheck(String value) {
		this.valTypeCheck = value;
	}

	/**
	 * Gets the value of the beneficiary property.
	 * 
	 * @return possible object is {@link PersonType }
	 * 
	 */
	public PersonType getBeneficiary() {
		return beneficiary;
	}

	/**
	 * Sets the value of the beneficiary property.
	 * 
	 * @param value
	 *            allowed object is {@link PersonType }
	 * 
	 */
	public void setBeneficiary(PersonType value) {
		this.beneficiary = value;
	}

	/**
	 * Gets the value of the currencyCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * Sets the value of the currencyCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCurrencyCode(String value) {
		this.currencyCode = value;
	}

}
