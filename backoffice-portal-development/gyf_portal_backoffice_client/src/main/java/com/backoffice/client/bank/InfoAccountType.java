
package com.backoffice.client.bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for InfoAccountType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="InfoAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankAccount" type="{http://girosyfinanzas.com/schema/DireccionCanales/BankAccountType/}BankAccountType"/>
 *         &lt;element name="lastMovementsList" type="{http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/}LastMovementsListType" minOccurs="0"/>
 *         &lt;element name="ownerList" type="{http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/}OwnerListType" minOccurs="0"/>
 *         &lt;element name="authorizedList" type="{http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/}AuthorizedListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoAccountType", propOrder = { "bankAccount", "lastMovementsList", "ownerList", "authorizedList" })
public class InfoAccountType {

	@XmlElement(required = true)
	protected BankAccountType bankAccount;
	protected LastMovementsListType lastMovementsList;
	protected OwnerListType ownerList;
	protected AuthorizedListType authorizedList;

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
	 * Gets the value of the lastMovementsList property.
	 * 
	 * @return possible object is {@link LastMovementsListType }
	 * 
	 */
	public LastMovementsListType getLastMovementsList() {
		return lastMovementsList;
	}

	/**
	 * Sets the value of the lastMovementsList property.
	 * 
	 * @param value
	 *            allowed object is {@link LastMovementsListType }
	 * 
	 */
	public void setLastMovementsList(LastMovementsListType value) {
		this.lastMovementsList = value;
	}

	/**
	 * Gets the value of the ownerList property.
	 * 
	 * @return possible object is {@link OwnerListType }
	 * 
	 */
	public OwnerListType getOwnerList() {
		return ownerList;
	}

	/**
	 * Sets the value of the ownerList property.
	 * 
	 * @param value
	 *            allowed object is {@link OwnerListType }
	 * 
	 */
	public void setOwnerList(OwnerListType value) {
		this.ownerList = value;
	}

	/**
	 * Gets the value of the authorizedList property.
	 * 
	 * @return possible object is {@link AuthorizedListType }
	 * 
	 */
	public AuthorizedListType getAuthorizedList() {
		return authorizedList;
	}

	/**
	 * Sets the value of the authorizedList property.
	 * 
	 * @param value
	 *            allowed object is {@link AuthorizedListType }
	 * 
	 */
	public void setAuthorizedList(AuthorizedListType value) {
		this.authorizedList = value;
	}

}
