
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
 * Java class for ProductMovementsReqType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ProductMovementsReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextTransaction" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextTransactionType/}ContextTransactionType"/>
 *         &lt;element name="agent" type="{http://girosyfinanzas.com/schema/DireccionCanales/AgentType/}AgentType" minOccurs="0"/>
 *         &lt;element name="consumerVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerCommon" type="{http://girosyfinanzas.com/schema/DireccionCanales/CustomerCommonType/}CustomerCommonType" minOccurs="0"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductMovementsReqType", propOrder = { "contextTransaction", "agent", "consumerVersion",
		"customerCommon", "productId", "productTypeCode", "startDate", "endDate" })
public class ProductMovementsReqType {

	@XmlElement(required = true)
	protected ContextTransactionType contextTransaction;
	protected AgentType agent;
	protected String consumerVersion;
	protected CustomerCommonType customerCommon;
	protected String productId;
	protected String productTypeCode;
	protected String startDate;
	protected String endDate;

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

	/**
	 * Gets the value of the productId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * Sets the value of the productId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProductId(String value) {
		this.productId = value;
	}

	/**
	 * Gets the value of the productTypeCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductTypeCode() {
		return productTypeCode;
	}

	/**
	 * Sets the value of the productTypeCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProductTypeCode(String value) {
		this.productTypeCode = value;
	}

	/**
	 * Gets the value of the startDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * Sets the value of the startDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStartDate(String value) {
		this.startDate = value;
	}

	/**
	 * Gets the value of the endDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * Sets the value of the endDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEndDate(String value) {
		this.endDate = value;
	}

}
