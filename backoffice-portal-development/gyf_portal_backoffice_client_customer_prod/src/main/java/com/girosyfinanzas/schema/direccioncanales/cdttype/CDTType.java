
package com.girosyfinanzas.schema.direccioncanales.cdttype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.girosyfinanzas.schema.direccioncanales.producttype.ProductType;

/**
 * <p>
 * Java class for CDTType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CDTType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://girosyfinanzas.com/schema/DireccionCanales/ProductType/}ProductType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deadLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interetsPaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestCaused" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="efectiveRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptionState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptionTypeGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CDTType", propOrder = { "value", "dueDate", "deadLine", "interestValue", "interetsPaid",
		"interestCaused", "efectiveRate", "descriptionState", "numberProduct", "typeGroup", "descriptionTypeGroup" })
public class CDTType extends ProductType {

	protected String value;
	protected String dueDate;
	protected String deadLine;
	protected String interestValue;
	protected String interetsPaid;
	protected String interestCaused;
	protected String efectiveRate;
	protected String descriptionState;
	protected String numberProduct;
	protected String typeGroup;
	protected String descriptionTypeGroup;

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Gets the value of the dueDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDueDate() {
		return dueDate;
	}

	/**
	 * Sets the value of the dueDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDueDate(String value) {
		this.dueDate = value;
	}

	/**
	 * Gets the value of the deadLine property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeadLine() {
		return deadLine;
	}

	/**
	 * Sets the value of the deadLine property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDeadLine(String value) {
		this.deadLine = value;
	}

	/**
	 * Gets the value of the interestValue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInterestValue() {
		return interestValue;
	}

	/**
	 * Sets the value of the interestValue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInterestValue(String value) {
		this.interestValue = value;
	}

	/**
	 * Gets the value of the interetsPaid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInteretsPaid() {
		return interetsPaid;
	}

	/**
	 * Sets the value of the interetsPaid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInteretsPaid(String value) {
		this.interetsPaid = value;
	}

	/**
	 * Gets the value of the interestCaused property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInterestCaused() {
		return interestCaused;
	}

	/**
	 * Sets the value of the interestCaused property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInterestCaused(String value) {
		this.interestCaused = value;
	}

	/**
	 * Gets the value of the efectiveRate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEfectiveRate() {
		return efectiveRate;
	}

	/**
	 * Sets the value of the efectiveRate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEfectiveRate(String value) {
		this.efectiveRate = value;
	}

	/**
	 * Gets the value of the descriptionState property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescriptionState() {
		return descriptionState;
	}

	/**
	 * Sets the value of the descriptionState property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescriptionState(String value) {
		this.descriptionState = value;
	}

	/**
	 * Gets the value of the numberProduct property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNumberProduct() {
		return numberProduct;
	}

	/**
	 * Sets the value of the numberProduct property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNumberProduct(String value) {
		this.numberProduct = value;
	}

	/**
	 * Gets the value of the typeGroup property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTypeGroup() {
		return typeGroup;
	}

	/**
	 * Sets the value of the typeGroup property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTypeGroup(String value) {
		this.typeGroup = value;
	}

	/**
	 * Gets the value of the descriptionTypeGroup property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescriptionTypeGroup() {
		return descriptionTypeGroup;
	}

	/**
	 * Sets the value of the descriptionTypeGroup property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescriptionTypeGroup(String value) {
		this.descriptionTypeGroup = value;
	}

}
