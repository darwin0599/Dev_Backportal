
package com.girosyfinanzas.schema.direccioncanales.insurance.insurancetype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for InsuranceType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="certificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuredIdentificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idInsured" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameInsured" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuranceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="premiumValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateSale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initialTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finalTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountInsured" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceType", propOrder = { "certificateNumber", "insuredIdentificationType", "idInsured",
		"nameInsured", "insuranceType", "premiumValue", "validity", "dateSale", "initialTerm", "finalTerm",
		"amountInsured", "contractNumber", "paymentMethod", "accountNumber" })
public class InsuranceType {

	protected String certificateNumber;
	protected String insuredIdentificationType;
	protected String idInsured;
	protected String nameInsured;
	protected String insuranceType;
	protected String premiumValue;
	protected String validity;
	protected String dateSale;
	protected String initialTerm;
	protected String finalTerm;
	protected String amountInsured;
	protected String contractNumber;
	protected String paymentMethod;
	protected String accountNumber;

	/**
	 * Gets the value of the certificateNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCertificateNumber() {
		return certificateNumber;
	}

	/**
	 * Sets the value of the certificateNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCertificateNumber(String value) {
		this.certificateNumber = value;
	}

	/**
	 * Gets the value of the insuredIdentificationType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInsuredIdentificationType() {
		return insuredIdentificationType;
	}

	/**
	 * Sets the value of the insuredIdentificationType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInsuredIdentificationType(String value) {
		this.insuredIdentificationType = value;
	}

	/**
	 * Gets the value of the idInsured property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdInsured() {
		return idInsured;
	}

	/**
	 * Sets the value of the idInsured property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdInsured(String value) {
		this.idInsured = value;
	}

	/**
	 * Gets the value of the nameInsured property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNameInsured() {
		return nameInsured;
	}

	/**
	 * Sets the value of the nameInsured property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNameInsured(String value) {
		this.nameInsured = value;
	}

	/**
	 * Gets the value of the insuranceType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInsuranceType() {
		return insuranceType;
	}

	/**
	 * Sets the value of the insuranceType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInsuranceType(String value) {
		this.insuranceType = value;
	}

	/**
	 * Gets the value of the premiumValue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPremiumValue() {
		return premiumValue;
	}

	/**
	 * Sets the value of the premiumValue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPremiumValue(String value) {
		this.premiumValue = value;
	}

	/**
	 * Gets the value of the validity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValidity() {
		return validity;
	}

	/**
	 * Sets the value of the validity property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValidity(String value) {
		this.validity = value;
	}

	/**
	 * Gets the value of the dateSale property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDateSale() {
		return dateSale;
	}

	/**
	 * Sets the value of the dateSale property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDateSale(String value) {
		this.dateSale = value;
	}

	/**
	 * Gets the value of the initialTerm property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInitialTerm() {
		return initialTerm;
	}

	/**
	 * Sets the value of the initialTerm property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInitialTerm(String value) {
		this.initialTerm = value;
	}

	/**
	 * Gets the value of the finalTerm property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFinalTerm() {
		return finalTerm;
	}

	/**
	 * Sets the value of the finalTerm property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFinalTerm(String value) {
		this.finalTerm = value;
	}

	/**
	 * Gets the value of the amountInsured property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAmountInsured() {
		return amountInsured;
	}

	/**
	 * Sets the value of the amountInsured property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAmountInsured(String value) {
		this.amountInsured = value;
	}

	/**
	 * Gets the value of the contractNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContractNumber() {
		return contractNumber;
	}

	/**
	 * Sets the value of the contractNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContractNumber(String value) {
		this.contractNumber = value;
	}

	/**
	 * Gets the value of the paymentMethod property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * Sets the value of the paymentMethod property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPaymentMethod(String value) {
		this.paymentMethod = value;
	}

	/**
	 * Gets the value of the accountNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Sets the value of the accountNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAccountNumber(String value) {
		this.accountNumber = value;
	}

}
