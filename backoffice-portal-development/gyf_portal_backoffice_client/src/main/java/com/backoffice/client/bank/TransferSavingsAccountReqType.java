
package com.backoffice.client.bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for TransferSavingsAccountReqType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="TransferSavingsAccountReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextTransaction" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextTransactionType/}ContextTransactionType"/>
 *         &lt;element name="paramsTransaction" type="{http://girosyfinanzas.com/schema/DireccionCanales/ParamsAgreementType/}ParamsAgreementType"/>
 *         &lt;element name="transactionSIIF" type="{http://girosyfinanzas.com/schema/DireccionCanales/Accounts/TranactionSIIFType/}TranactionSIIFType"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferSavingsAccountReqType", propOrder = { "contextTransaction", "paramsTransaction",
		"transactionSIIF", "page" })
public class TransferSavingsAccountReqType {

	@XmlElement(required = true)
	protected ContextTransactionType contextTransaction;
	@XmlElement(required = true)
	protected ParamsAgreementType paramsTransaction;
	@XmlElement(required = true)
	protected TranactionSIIFType transactionSIIF;
	protected String page;

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
	 * Gets the value of the paramsTransaction property.
	 * 
	 * @return possible object is {@link ParamsAgreementType }
	 * 
	 */
	public ParamsAgreementType getParamsTransaction() {
		return paramsTransaction;
	}

	/**
	 * Sets the value of the paramsTransaction property.
	 * 
	 * @param value
	 *            allowed object is {@link ParamsAgreementType }
	 * 
	 */
	public void setParamsTransaction(ParamsAgreementType value) {
		this.paramsTransaction = value;
	}

	/**
	 * Gets the value of the transactionSIIF property.
	 * 
	 * @return possible object is {@link TranactionSIIFType }
	 * 
	 */
	public TranactionSIIFType getTransactionSIIF() {
		return transactionSIIF;
	}

	/**
	 * Sets the value of the transactionSIIF property.
	 * 
	 * @param value
	 *            allowed object is {@link TranactionSIIFType }
	 * 
	 */
	public void setTransactionSIIF(TranactionSIIFType value) {
		this.transactionSIIF = value;
	}

	/**
	 * Gets the value of the page property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPage() {
		return page;
	}

	/**
	 * Sets the value of the page property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPage(String value) {
		this.page = value;
	}

}
