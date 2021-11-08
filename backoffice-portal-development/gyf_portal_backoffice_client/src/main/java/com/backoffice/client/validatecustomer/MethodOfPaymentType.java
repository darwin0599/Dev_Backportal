
package com.backoffice.client.validatecustomer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for MethodOfPaymentType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="MethodOfPaymentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cash" type="{http://girosyfinanzas.com/schema/DireccionCanales/PaymentCashType/}PaymentCashType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lstChecks" type="{http://girosyfinanzas.com/schema/DireccionCanales/PaymentCheckType/}PaymentCheckType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lstACHAccounts" type="{http://girosyfinanzas.com/schema/DireccionCanales/PaymentACHType/}PaymentACHType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lstGYFAccounts" type="{http://girosyfinanzas.com/schema/DireccionCanales/PaymentGYFAccountType/}PaymentGYFAccounType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodOfPaymentType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/MethodOfPaymentType/", propOrder = {
		"cash", "lstChecks", "lstACHAccounts", "lstGYFAccounts" })
public class MethodOfPaymentType {

	protected List<PaymentCashType> cash;
	protected List<PaymentCheckType> lstChecks;
	protected List<PaymentACHType> lstACHAccounts;
	protected List<PaymentGYFAccounType> lstGYFAccounts;

	/**
	 * Gets the value of the cash property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the cash property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getCash().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link PaymentCashType }
	 * 
	 * 
	 */
	public List<PaymentCashType> getCash() {
		if (cash == null) {
			cash = new ArrayList<PaymentCashType>();
		}
		return this.cash;
	}

	/**
	 * Gets the value of the lstChecks property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the lstChecks property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getLstChecks().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link PaymentCheckType }
	 * 
	 * 
	 */
	public List<PaymentCheckType> getLstChecks() {
		if (lstChecks == null) {
			lstChecks = new ArrayList<PaymentCheckType>();
		}
		return this.lstChecks;
	}

	/**
	 * Gets the value of the lstACHAccounts property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the lstACHAccounts property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getLstACHAccounts().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link PaymentACHType }
	 * 
	 * 
	 */
	public List<PaymentACHType> getLstACHAccounts() {
		if (lstACHAccounts == null) {
			lstACHAccounts = new ArrayList<PaymentACHType>();
		}
		return this.lstACHAccounts;
	}

	/**
	 * Gets the value of the lstGYFAccounts property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the lstGYFAccounts property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getLstGYFAccounts().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link PaymentGYFAccounType }
	 * 
	 * 
	 */
	public List<PaymentGYFAccounType> getLstGYFAccounts() {
		if (lstGYFAccounts == null) {
			lstGYFAccounts = new ArrayList<PaymentGYFAccounType>();
		}
		return this.lstGYFAccounts;
	}

}
