
package com.backoffice.client.bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ManageAccountsReqType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ManageAccountsReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextTransaction" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextTransactionType/}ContextTransactionType"/>
 *         &lt;element name="agent" type="{http://girosyfinanzas.com/schema/DireccionCanales/AgentType/}AgentType"/>
 *         &lt;element name="customer" type="{http://girosyfinanzas.com/schema/DireccionCanales/PersonType/}PersonType"/>
 *         &lt;element name="bankAccountList" type="{http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/}BankAccountListType" minOccurs="0"/>
 *         &lt;element name="system" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageAccountsReqType", propOrder = { "contextTransaction", "agent", "customer", "bankAccountList",
		"system" })
public class ManageAccountsReqType {

	@XmlElement(required = true)
	protected ContextTransactionType contextTransaction;
	@XmlElement(required = true)
	protected AgentType agent;
	@XmlElement(required = true)
	protected PersonType customer;
	protected BankAccountListType bankAccountList;
	@XmlElement(required = true)
	protected String system;

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
	 * Gets the value of the customer property.
	 * 
	 * @return possible object is {@link PersonType }
	 * 
	 */
	public PersonType getCustomer() {
		return customer;
	}

	/**
	 * Sets the value of the customer property.
	 * 
	 * @param value
	 *            allowed object is {@link PersonType }
	 * 
	 */
	public void setCustomer(PersonType value) {
		this.customer = value;
	}

	/**
	 * Gets the value of the bankAccountList property.
	 * 
	 * @return possible object is {@link BankAccountListType }
	 * 
	 */
	public BankAccountListType getBankAccountList() {
		return bankAccountList;
	}

	/**
	 * Sets the value of the bankAccountList property.
	 * 
	 * @param value
	 *            allowed object is {@link BankAccountListType }
	 * 
	 */
	public void setBankAccountList(BankAccountListType value) {
		this.bankAccountList = value;
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

}
