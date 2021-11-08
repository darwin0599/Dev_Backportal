
package com.girosyfinanzas.schema.direccioncanales.savingaccounttype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.girosyfinanzas.schema.direccioncanales.producttype.ProductType;

/**
 * <p>
 * Java class for SavingAccountType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SavingAccountType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://girosyfinanzas.com/schema/DireccionCanales/ProductType/}ProductType">
 *       &lt;sequence>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balanceExchange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptionState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movementsList" type="{http://girosyfinanzas.com/schema/DireccionCanales/SavingAccountType/}MovementsListType" minOccurs="0"/>
 *         &lt;element name="codeSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SavingAccountType", propOrder = { "balance", "balanceExchange", "available", "descriptionState",
		"movementsList", "codeSummary" })
public class SavingAccountType extends ProductType {

	protected String balance;
	protected String balanceExchange;
	protected String available;
	protected String descriptionState;
	protected MovementsListType movementsList;
	protected String codeSummary;

	/**
	 * Gets the value of the balance property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBalance() {
		return balance;
	}

	/**
	 * Sets the value of the balance property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBalance(String value) {
		this.balance = value;
	}

	/**
	 * Gets the value of the balanceExchange property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBalanceExchange() {
		return balanceExchange;
	}

	/**
	 * Sets the value of the balanceExchange property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBalanceExchange(String value) {
		this.balanceExchange = value;
	}

	/**
	 * Gets the value of the available property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAvailable() {
		return available;
	}

	/**
	 * Sets the value of the available property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAvailable(String value) {
		this.available = value;
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
	 * Gets the value of the movementsList property.
	 * 
	 * @return possible object is {@link MovementsListType }
	 * 
	 */
	public MovementsListType getMovementsList() {
		return movementsList;
	}

	/**
	 * Sets the value of the movementsList property.
	 * 
	 * @param value
	 *            allowed object is {@link MovementsListType }
	 * 
	 */
	public void setMovementsList(MovementsListType value) {
		this.movementsList = value;
	}

	/**
	 * Gets the value of the codeSummary property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodeSummary() {
		return codeSummary;
	}

	/**
	 * Sets the value of the codeSummary property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodeSummary(String value) {
		this.codeSummary = value;
	}

}
