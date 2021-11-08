
package com.backoffice.client.otp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ValidateReqType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextTransaction" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextTransactionType/}ContextTransactionType"/>
 *         &lt;element name="agent" type="{http://girosyfinanzas.com/schema/DireccionCanales/AgentType/}AgentType" minOccurs="0"/>
 *         &lt;element name="person" type="{http://girosyfinanzas.com/schema/DireccionCanales/PersonType/}PersonType" minOccurs="0"/>
 *         &lt;element name="verificateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateReqType", propOrder = { "contextTransaction", "agent", "person", "verificateCode" })
public class ValidateReqType {

	@XmlElement(required = true)
	protected ContextTransactionType contextTransaction;
	protected AgentType agent;
	protected PersonType person;
	protected String verificateCode;

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
	 * Gets the value of the person property.
	 * 
	 * @return possible object is {@link PersonType }
	 * 
	 */
	public PersonType getPerson() {
		return person;
	}

	/**
	 * Sets the value of the person property.
	 * 
	 * @param value
	 *            allowed object is {@link PersonType }
	 * 
	 */
	public void setPerson(PersonType value) {
		this.person = value;
	}

	/**
	 * Gets the value of the verificateCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVerificateCode() {
		return verificateCode;
	}

	/**
	 * Sets the value of the verificateCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVerificateCode(String value) {
		this.verificateCode = value;
	}

}
