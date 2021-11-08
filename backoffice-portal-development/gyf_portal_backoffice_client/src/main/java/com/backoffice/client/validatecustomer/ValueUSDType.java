
package com.backoffice.client.validatecustomer;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ValueUSDType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ValueUSDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="expectedActualPayout" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="rateExchange" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="rateExchangeAgent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="rateExchangeUSD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalTransaction" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="USD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueUSDType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/ValueUSDType/", propOrder = {
		"expectedActualPayout", "rateExchange", "rateExchangeAgent", "rateExchangeUSD", "totalTransaction", "usd" })
public class ValueUSDType {

	protected BigDecimal expectedActualPayout;
	protected BigDecimal rateExchange;
	protected BigDecimal rateExchangeAgent;
	protected BigDecimal rateExchangeUSD;
	protected BigDecimal totalTransaction;
	@XmlElement(name = "USD")
	protected BigDecimal usd;

	/**
	 * Gets the value of the expectedActualPayout property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getExpectedActualPayout() {
		return expectedActualPayout;
	}

	/**
	 * Sets the value of the expectedActualPayout property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setExpectedActualPayout(BigDecimal value) {
		this.expectedActualPayout = value;
	}

	/**
	 * Gets the value of the rateExchange property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getRateExchange() {
		return rateExchange;
	}

	/**
	 * Sets the value of the rateExchange property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setRateExchange(BigDecimal value) {
		this.rateExchange = value;
	}

	/**
	 * Gets the value of the rateExchangeAgent property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getRateExchangeAgent() {
		return rateExchangeAgent;
	}

	/**
	 * Sets the value of the rateExchangeAgent property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setRateExchangeAgent(BigDecimal value) {
		this.rateExchangeAgent = value;
	}

	/**
	 * Gets the value of the rateExchangeUSD property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getRateExchangeUSD() {
		return rateExchangeUSD;
	}

	/**
	 * Sets the value of the rateExchangeUSD property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setRateExchangeUSD(BigDecimal value) {
		this.rateExchangeUSD = value;
	}

	/**
	 * Gets the value of the totalTransaction property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getTotalTransaction() {
		return totalTransaction;
	}

	/**
	 * Sets the value of the totalTransaction property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setTotalTransaction(BigDecimal value) {
		this.totalTransaction = value;
	}

	/**
	 * Gets the value of the usd property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getUSD() {
		return usd;
	}

	/**
	 * Sets the value of the usd property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setUSD(BigDecimal value) {
		this.usd = value;
	}

}
