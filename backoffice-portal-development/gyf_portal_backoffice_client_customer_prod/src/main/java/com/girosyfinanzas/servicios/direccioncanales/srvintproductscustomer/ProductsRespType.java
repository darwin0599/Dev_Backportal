
package com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.girosyfinanzas.schema.direccioncanales.contextresponsetype.ContextResponseType;

/**
 * <p>
 * Java class for ProductsRespType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ProductsRespType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextResponse" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextResponseType/}ContextResponseType"/>
 *         &lt;element name="savingAccounts" type="{http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/}SavingAccountsType" minOccurs="0"/>
 *         &lt;element name="creditAccounts" type="{http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/}CreditAccountsType" minOccurs="0"/>
 *         &lt;element name="cdts" type="{http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/}CdtsType" minOccurs="0"/>
 *         &lt;element name="insurances" type="{http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/}InsurancesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductsRespType", propOrder = { "contextResponse", "savingAccounts", "creditAccounts", "cdts",
		"insurances" })
public class ProductsRespType {

	@XmlElement(required = true)
	protected ContextResponseType contextResponse;
	protected SavingAccountsType savingAccounts;
	protected CreditAccountsType creditAccounts;
	protected CdtsType cdts;
	protected InsurancesType insurances;

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
	 * Gets the value of the savingAccounts property.
	 * 
	 * @return possible object is {@link SavingAccountsType }
	 * 
	 */
	public SavingAccountsType getSavingAccounts() {
		return savingAccounts;
	}

	/**
	 * Sets the value of the savingAccounts property.
	 * 
	 * @param value
	 *            allowed object is {@link SavingAccountsType }
	 * 
	 */
	public void setSavingAccounts(SavingAccountsType value) {
		this.savingAccounts = value;
	}

	/**
	 * Gets the value of the creditAccounts property.
	 * 
	 * @return possible object is {@link CreditAccountsType }
	 * 
	 */
	public CreditAccountsType getCreditAccounts() {
		return creditAccounts;
	}

	/**
	 * Sets the value of the creditAccounts property.
	 * 
	 * @param value
	 *            allowed object is {@link CreditAccountsType }
	 * 
	 */
	public void setCreditAccounts(CreditAccountsType value) {
		this.creditAccounts = value;
	}

	/**
	 * Gets the value of the cdts property.
	 * 
	 * @return possible object is {@link CdtsType }
	 * 
	 */
	public CdtsType getCdts() {
		return cdts;
	}

	/**
	 * Sets the value of the cdts property.
	 * 
	 * @param value
	 *            allowed object is {@link CdtsType }
	 * 
	 */
	public void setCdts(CdtsType value) {
		this.cdts = value;
	}

	/**
	 * Gets the value of the insurances property.
	 * 
	 * @return possible object is {@link InsurancesType }
	 * 
	 */
	public InsurancesType getInsurances() {
		return insurances;
	}

	/**
	 * Sets the value of the insurances property.
	 * 
	 * @param value
	 *            allowed object is {@link InsurancesType }
	 * 
	 */
	public void setInsurances(InsurancesType value) {
		this.insurances = value;
	}

}
