
package com.backoffice.client.bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for BankAccountServiceRespType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="BankAccountServiceRespType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextResponse" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextResponseType/}ContextResponseType"/>
 *         &lt;element name="respCTC" type="{http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/}ServiceResponseType" minOccurs="0"/>
 *         &lt;element name="respSBI" type="{http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/}ServiceResponseType" minOccurs="0"/>
 *         &lt;element name="voucher" type="{http://girosyfinanzas.com/schema/DireccionCanales/VoucherBankAccountType/}VoucherBankAccountType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAccountServiceRespType", propOrder = { "contextResponse", "respCTC", "respSBI", "voucher" })
public class BankAccountServiceRespType {

	@XmlElement(required = true)
	protected ContextResponseType contextResponse;
	protected ServiceResponseType respCTC;
	protected ServiceResponseType respSBI;
	@XmlElement(required = true)
	protected VoucherBankAccountType voucher;

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
	 * Gets the value of the respCTC property.
	 * 
	 * @return possible object is {@link ServiceResponseType }
	 * 
	 */
	public ServiceResponseType getRespCTC() {
		return respCTC;
	}

	/**
	 * Sets the value of the respCTC property.
	 * 
	 * @param value
	 *            allowed object is {@link ServiceResponseType }
	 * 
	 */
	public void setRespCTC(ServiceResponseType value) {
		this.respCTC = value;
	}

	/**
	 * Gets the value of the respSBI property.
	 * 
	 * @return possible object is {@link ServiceResponseType }
	 * 
	 */
	public ServiceResponseType getRespSBI() {
		return respSBI;
	}

	/**
	 * Sets the value of the respSBI property.
	 * 
	 * @param value
	 *            allowed object is {@link ServiceResponseType }
	 * 
	 */
	public void setRespSBI(ServiceResponseType value) {
		this.respSBI = value;
	}

	/**
	 * Gets the value of the voucher property.
	 * 
	 * @return possible object is {@link VoucherBankAccountType }
	 * 
	 */
	public VoucherBankAccountType getVoucher() {
		return voucher;
	}

	/**
	 * Sets the value of the voucher property.
	 * 
	 * @param value
	 *            allowed object is {@link VoucherBankAccountType }
	 * 
	 */
	public void setVoucher(VoucherBankAccountType value) {
		this.voucher = value;
	}

}
