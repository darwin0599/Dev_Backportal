
package com.backoffice.client.validatecustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PaymentCashType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCashType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valTotalValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valNetValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valTaxPayment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detailPay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCashType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/PaymentCashType/", propOrder = {
		"code", "valTotalValue", "valNetValue", "valTaxPayment", "currencyCode", "detailPay" })
public class PaymentCashType {

	protected String code;
	@XmlElement(required = true)
	protected String valTotalValue;
	@XmlElement(required = true)
	protected String valNetValue;
	@XmlElement(required = true)
	protected String valTaxPayment;
	protected String currencyCode;
	protected String detailPay;

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
	 * Gets the value of the detailPay property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDetailPay() {
		return detailPay;
	}

	/**
	 * Sets the value of the detailPay property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDetailPay(String value) {
		this.detailPay = value;
	}

}
