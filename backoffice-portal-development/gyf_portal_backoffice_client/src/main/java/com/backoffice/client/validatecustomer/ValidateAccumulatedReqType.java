
package com.backoffice.client.validatecustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ValidateAccumulatedReqType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateAccumulatedReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextTransaction" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextTransactionType/}ContextTransactionType"/>
 *         &lt;element name="transactionValueCOP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionValueUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationsInfo" type="{http://girosyfinanzas.com/schema/DireccionCanales/DestinationsInfoType/}DestinationsInfoType" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://girosyfinanzas.com/schema/DireccionCanales/CustomerCommonType/}CustomerCommonType" minOccurs="0"/>
 *         &lt;element name="agent" type="{http://girosyfinanzas.com/schema/DireccionCanales/AgentType/}AgentType" minOccurs="0"/>
 *         &lt;element name="usd" type="{http://girosyfinanzas.com/schema/DireccionCanales/ValueUSDType/}ValueUSDType" minOccurs="0"/>
 *         &lt;element name="methodOfPayment" type="{http://girosyfinanzas.com/schema/DireccionCanales/MethodOfPaymentType/}MethodOfPaymentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateAccumulatedReqType", propOrder = { "contextTransaction", "transactionValueCOP",
		"transactionValueUSD", "destinationsInfo", "customer", "agent", "usd", "methodOfPayment" })
public class ValidateAccumulatedReqType {

	@XmlElement(required = true)
	protected ContextTransactionType contextTransaction;
	protected String transactionValueCOP;
	protected String transactionValueUSD;
	protected DestinationsInfoType destinationsInfo;
	protected CustomerCommonType customer;
	protected AgentType agent;
	protected ValueUSDType usd;
	protected MethodOfPaymentType methodOfPayment;

	/**
	 * Gets the value of the contextTransaction property.
	 * 
	 * @return possible object is {@link ContextTransactionType }
	 * 
	 */
	public ContextTransactionType getContextTransaction() {
		return contextTransaction;
	}

	/**
	 * Sets the value of the contextTransaction property.
	 * 
	 * @param value
	 *            allowed object is {@link ContextTransactionType }
	 * 
	 */
	public void setContextTransaction(ContextTransactionType value) {
		this.contextTransaction = value;
	}

	/**
	 * Gets the value of the transactionValueCOP property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTransactionValueCOP() {
		return transactionValueCOP;
	}

	/**
	 * Sets the value of the transactionValueCOP property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTransactionValueCOP(String value) {
		this.transactionValueCOP = value;
	}

	/**
	 * Gets the value of the transactionValueUSD property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTransactionValueUSD() {
		return transactionValueUSD;
	}

	/**
	 * Sets the value of the transactionValueUSD property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTransactionValueUSD(String value) {
		this.transactionValueUSD = value;
	}

	/**
	 * Gets the value of the destinationsInfo property.
	 * 
	 * @return possible object is {@link DestinationsInfoType }
	 * 
	 */
	public DestinationsInfoType getDestinationsInfo() {
		return destinationsInfo;
	}

	/**
	 * Sets the value of the destinationsInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link DestinationsInfoType }
	 * 
	 */
	public void setDestinationsInfo(DestinationsInfoType value) {
		this.destinationsInfo = value;
	}

	/**
	 * Gets the value of the customer property.
	 * 
	 * @return possible object is {@link CustomerCommonType }
	 * 
	 */
	public CustomerCommonType getCustomer() {
		return customer;
	}

	/**
	 * Sets the value of the customer property.
	 * 
	 * @param value
	 *            allowed object is {@link CustomerCommonType }
	 * 
	 */
	public void setCustomer(CustomerCommonType value) {
		this.customer = value;
	}

	/**
	 * Gets the value of the agent property.
	 * 
	 * @return possible object is {@link AgentType }
	 * 
	 */
	public AgentType getAgent() {
		return agent;
	}

	/**
	 * Sets the value of the agent property.
	 * 
	 * @param value
	 *            allowed object is {@link AgentType }
	 * 
	 */
	public void setAgent(AgentType value) {
		this.agent = value;
	}

	/**
	 * Gets the value of the usd property.
	 * 
	 * @return possible object is {@link ValueUSDType }
	 * 
	 */
	public ValueUSDType getUsd() {
		return usd;
	}

	/**
	 * Sets the value of the usd property.
	 * 
	 * @param value
	 *            allowed object is {@link ValueUSDType }
	 * 
	 */
	public void setUsd(ValueUSDType value) {
		this.usd = value;
	}

	/**
	 * Gets the value of the methodOfPayment property.
	 * 
	 * @return possible object is {@link MethodOfPaymentType }
	 * 
	 */
	public MethodOfPaymentType getMethodOfPayment() {
		return methodOfPayment;
	}

	/**
	 * Sets the value of the methodOfPayment property.
	 * 
	 * @param value
	 *            allowed object is {@link MethodOfPaymentType }
	 * 
	 */
	public void setMethodOfPayment(MethodOfPaymentType value) {
		this.methodOfPayment = value;
	}

}
