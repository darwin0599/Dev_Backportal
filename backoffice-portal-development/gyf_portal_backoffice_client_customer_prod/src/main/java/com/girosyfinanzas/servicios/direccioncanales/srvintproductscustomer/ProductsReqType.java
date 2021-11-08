
package com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.girosyfinanzas.schema.direccioncanales.agenttype.AgentType;
import com.girosyfinanzas.schema.direccioncanales.contexttransactiontype.ContextTransactionType;
import com.girosyfinanzas.schema.direccioncanales.customercommontype.CustomerCommonType;

/**
 * <p>
 * Java class for ProductsReqType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ProductsReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextTransaction" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextTransactionType/}ContextTransactionType"/>
 *         &lt;element name="agent" type="{http://girosyfinanzas.com/schema/DireccionCanales/AgentType/}AgentType" minOccurs="0"/>
 *         &lt;element name="consumerVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerCommon" type="{http://girosyfinanzas.com/schema/DireccionCanales/CustomerCommonType/}CustomerCommonType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductsReqType", propOrder = { "contextTransaction", "agent", "consumerVersion", "customerCommon" })
public class ProductsReqType {

	@XmlElement(required = true)
	protected ContextTransactionType contextTransaction;
	protected AgentType agent;
	protected String consumerVersion;
	protected CustomerCommonType customerCommon;

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
	 * Gets the value of the consumerVersion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConsumerVersion() {
		return consumerVersion;
	}

	/**
	 * Sets the value of the consumerVersion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConsumerVersion(String value) {
		this.consumerVersion = value;
	}

	/**
	 * Gets the value of the customerCommon property.
	 * 
	 * @return possible object is {@link CustomerCommonType }
	 * 
	 */
	public CustomerCommonType getCustomerCommon() {
		return customerCommon;
	}

	/**
	 * Sets the value of the customerCommon property.
	 * 
	 * @param value
	 *            allowed object is {@link CustomerCommonType }
	 * 
	 */
	public void setCustomerCommon(CustomerCommonType value) {
		this.customerCommon = value;
	}

}
