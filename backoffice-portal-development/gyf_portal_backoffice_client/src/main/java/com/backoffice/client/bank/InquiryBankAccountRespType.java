
package com.backoffice.client.bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for InquiryBankAccountRespType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="InquiryBankAccountRespType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextResponse" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextResponseType/}ContextResponseType"/>
 *         &lt;element name="infoAccountsList" type="{http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/}InfoAccountsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InquiryBankAccountRespType", propOrder = { "contextResponse", "infoAccountsList" })
public class InquiryBankAccountRespType {

	@XmlElement(required = true)
	protected ContextResponseType contextResponse;
	protected InfoAccountsListType infoAccountsList;

	/**
	 * Gets the value of the contextResponse property.
	 * 
	 * @return possible object is {@link ContextResponseType }
	 * 
	 */
	public ContextResponseType getContextResponse() {
		return contextResponse;
	}

	/**
	 * Sets the value of the contextResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link ContextResponseType }
	 * 
	 */
	public void setContextResponse(ContextResponseType value) {
		this.contextResponse = value;
	}

	/**
	 * Gets the value of the infoAccountsList property.
	 * 
	 * @return possible object is {@link InfoAccountsListType }
	 * 
	 */
	public InfoAccountsListType getInfoAccountsList() {
		return infoAccountsList;
	}

	/**
	 * Sets the value of the infoAccountsList property.
	 * 
	 * @param value
	 *            allowed object is {@link InfoAccountsListType }
	 * 
	 */
	public void setInfoAccountsList(InfoAccountsListType value) {
		this.infoAccountsList = value;
	}

}
