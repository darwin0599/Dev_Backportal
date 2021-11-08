
package com.backoffice.client.validatecustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PaymentGYFAccounType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentGYFAccounType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valTotalValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valNetValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valTaxPayment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valProduct" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valAgency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valNumAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valPledge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descPayment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noteValueDebitCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentGYFAccounType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/PaymentGYFAccountType/", propOrder = {
		"code", "valTotalValue", "valNetValue", "valTaxPayment", "codSystem", "valProduct", "valAgency",
		"valNumAccount", "valPledge", "descPayment", "currencyCode", "noteValueDebitCredit", "transactionCode", "pig" })
public class PaymentGYFAccounType {

	protected String code;
	@XmlElement(required = true)
	protected String valTotalValue;
	@XmlElement(required = true)
	protected String valNetValue;
	@XmlElement(required = true)
	protected String valTaxPayment;
	@XmlElement(required = true)
	protected String codSystem;
	@XmlElement(required = true)
	protected String valProduct;
	@XmlElement(required = true)
	protected String valAgency;
	@XmlElement(required = true)
	protected String valNumAccount;
	@XmlElement(required = true)
	protected String valPledge;
	@XmlElement(required = true)
	protected String descPayment;
	protected String currencyCode;
	protected String noteValueDebitCredit;
	protected String transactionCode;
	@XmlElement(name = "PIG")
	protected String pig;

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
	 * Gets the value of the codSystem property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodSystem() {
		return codSystem;
	}

	/**
	 * Sets the value of the codSystem property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodSystem(String value) {
		this.codSystem = value;
	}

	/**
	 * Gets the value of the valProduct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValProduct() {
		return valProduct;
	}

	/**
	 * Sets the value of the valProduct property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValProduct(String value) {
		this.valProduct = value;
	}

	/**
	 * Gets the value of the valAgency property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValAgency() {
		return valAgency;
	}

	/**
	 * Sets the value of the valAgency property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValAgency(String value) {
		this.valAgency = value;
	}

	/**
	 * Gets the value of the valNumAccount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValNumAccount() {
		return valNumAccount;
	}

	/**
	 * Sets the value of the valNumAccount property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValNumAccount(String value) {
		this.valNumAccount = value;
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
	 * Gets the value of the descPayment property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescPayment() {
		return descPayment;
	}

	/**
	 * Sets the value of the descPayment property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescPayment(String value) {
		this.descPayment = value;
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

	/**
	 * Gets the value of the noteValueDebitCredit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNoteValueDebitCredit() {
		return noteValueDebitCredit;
	}

	/**
	 * Sets the value of the noteValueDebitCredit property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNoteValueDebitCredit(String value) {
		this.noteValueDebitCredit = value;
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

}
