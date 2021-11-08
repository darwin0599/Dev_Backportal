
package com.backoffice.client.bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for InquiryBankAccountReqType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="InquiryBankAccountReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextTransaction" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextTransactionType/}ContextTransactionType"/>
 *         &lt;element name="agent" type="{http://girosyfinanzas.com/schema/DireccionCanales/AgentType/}AgentType" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://girosyfinanzas.com/schema/DireccionCanales/CustomerCommonType/}CustomerCommonType" minOccurs="0"/>
 *         &lt;element name="bankAccount" type="{http://girosyfinanzas.com/schema/DireccionCanales/BankAccountType/}BankAccountType" minOccurs="0"/>
 *         &lt;element name="inquiryType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InquiryBankAccountReqType", propOrder = { "contextTransaction", "agent", "owner", "bankAccount",
		"inquiryType" })
public class InquiryBankAccountReqType {

	@XmlElement(required = true)
	protected ContextTransactionType contextTransaction;
	protected AgentType agent;
	protected CustomerCommonType owner;
	protected BankAccountType bankAccount;
	@XmlElement(required = true)
	protected String inquiryType;

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
	 * Gets the value of the owner property.
	 * 
	 * @return possible object is {@link CustomerCommonType }
	 * 
	 */
	public CustomerCommonType getOwner() {
		return owner;
	}

	/**
	 * Sets the value of the owner property.
	 * 
	 * @param value
	 *            allowed object is {@link CustomerCommonType }
	 * 
	 */
	public void setOwner(CustomerCommonType value) {
		this.owner = value;
	}

	/**
	 * Gets the value of the bankAccount property.
	 * 
	 * @return possible object is {@link BankAccountType }
	 * 
	 */
	public BankAccountType getBankAccount() {
		return bankAccount;
	}

	/**
	 * Sets the value of the bankAccount property.
	 * 
	 * @param value
	 *            allowed object is {@link BankAccountType }
	 * 
	 */
	public void setBankAccount(BankAccountType value) {
		this.bankAccount = value;
	}

	/**
	 * Gets the value of the inquiryType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInquiryType() {
		return inquiryType;
	}

	/**
	 * Sets the value of the inquiryType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInquiryType(String value) {
		this.inquiryType = value;
	}

}
