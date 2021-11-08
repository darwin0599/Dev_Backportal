
package com.backoffice.client.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for UpdateInfoClientsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateInfoClientsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="basicInformationPJ" type="{http://girosyfinanzas.com/schema/DireccionCanales/UpdateInfoClientType/}UpdateInfoClientType" minOccurs="0"/>
 *         &lt;element name="basicInformationPN" type="{http://girosyfinanzas.com/schema/DireccionCanales/UpdateInfoClientType/}UpdateInfoClientType" minOccurs="0"/>
 *         &lt;element name="economicInformationPN" type="{http://girosyfinanzas.com/schema/DireccionCanales/UpdateInfoClientType/}UpdateInfoClientType" minOccurs="0"/>
 *         &lt;element name="dataShareholdersPJ" type="{http://girosyfinanzas.com/schema/DireccionCanales/UpdateInfoClientType/}UpdateInfoClientType" minOccurs="0"/>
 *         &lt;element name="financialInformationPN" type="{http://girosyfinanzas.com/schema/DireccionCanales/UpdateInfoClientType/}UpdateInfoClientType" minOccurs="0"/>
 *         &lt;element name="infoCustomer" type="{http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomer/}InfoCustomerType" minOccurs="0"/>
 *         &lt;element name="legalRepresentativeDataPJ" type="{http://girosyfinanzas.com/schema/DireccionCanales/UpdateInfoClientType/}UpdateInfoClientType" minOccurs="0"/>
 *         &lt;element name="locationInformationPN" type="{http://girosyfinanzas.com/schema/DireccionCanales/UpdateInfoClientType/}UpdateInfoClientType" minOccurs="0"/>
 *         &lt;element name="representativeInformationPN" type="{http://girosyfinanzas.com/schema/DireccionCanales/UpdateInfoClientType/}UpdateInfoClientType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInfoClientsType", propOrder = { "basicInformationPJ", "basicInformationPN",
		"economicInformationPN", "dataShareholdersPJ", "financialInformationPN", "infoCustomer",
		"legalRepresentativeDataPJ", "locationInformationPN", "representativeInformationPN" })
public class UpdateInfoClientsType {

	protected UpdateInfoClientType basicInformationPJ;
	protected UpdateInfoClientType basicInformationPN;
	protected UpdateInfoClientType economicInformationPN;
	protected UpdateInfoClientType dataShareholdersPJ;
	protected UpdateInfoClientType financialInformationPN;
	protected InfoCustomerType infoCustomer;
	protected UpdateInfoClientType legalRepresentativeDataPJ;
	protected UpdateInfoClientType locationInformationPN;
	protected UpdateInfoClientType representativeInformationPN;

	/**
	 * Gets the value of the basicInformationPJ property.
	 * 
	 * @return possible object is {@link UpdateInfoClientType }
	 * 
	 */
	public UpdateInfoClientType getBasicInformationPJ() {
		return basicInformationPJ;
	}

	/**
	 * Sets the value of the basicInformationPJ property.
	 * 
	 * @param value
	 *            allowed object is {@link UpdateInfoClientType }
	 * 
	 */
	public void setBasicInformationPJ(UpdateInfoClientType value) {
		this.basicInformationPJ = value;
	}

	/**
	 * Gets the value of the basicInformationPN property.
	 * 
	 * @return possible object is {@link UpdateInfoClientType }
	 * 
	 */
	public UpdateInfoClientType getBasicInformationPN() {
		return basicInformationPN;
	}

	/**
	 * Sets the value of the basicInformationPN property.
	 * 
	 * @param value
	 *            allowed object is {@link UpdateInfoClientType }
	 * 
	 */
	public void setBasicInformationPN(UpdateInfoClientType value) {
		this.basicInformationPN = value;
	}

	/**
	 * Gets the value of the economicInformationPN property.
	 * 
	 * @return possible object is {@link UpdateInfoClientType }
	 * 
	 */
	public UpdateInfoClientType getEconomicInformationPN() {
		return economicInformationPN;
	}

	/**
	 * Sets the value of the economicInformationPN property.
	 * 
	 * @param value
	 *            allowed object is {@link UpdateInfoClientType }
	 * 
	 */
	public void setEconomicInformationPN(UpdateInfoClientType value) {
		this.economicInformationPN = value;
	}

	/**
	 * Gets the value of the dataShareholdersPJ property.
	 * 
	 * @return possible object is {@link UpdateInfoClientType }
	 * 
	 */
	public UpdateInfoClientType getDataShareholdersPJ() {
		return dataShareholdersPJ;
	}

	/**
	 * Sets the value of the dataShareholdersPJ property.
	 * 
	 * @param value
	 *            allowed object is {@link UpdateInfoClientType }
	 * 
	 */
	public void setDataShareholdersPJ(UpdateInfoClientType value) {
		this.dataShareholdersPJ = value;
	}

	/**
	 * Gets the value of the financialInformationPN property.
	 * 
	 * @return possible object is {@link UpdateInfoClientType }
	 * 
	 */
	public UpdateInfoClientType getFinancialInformationPN() {
		return financialInformationPN;
	}

	/**
	 * Sets the value of the financialInformationPN property.
	 * 
	 * @param value
	 *            allowed object is {@link UpdateInfoClientType }
	 * 
	 */
	public void setFinancialInformationPN(UpdateInfoClientType value) {
		this.financialInformationPN = value;
	}

	/**
	 * Gets the value of the infoCustomer property.
	 * 
	 * @return possible object is {@link InfoCustomerType }
	 * 
	 */
	public InfoCustomerType getInfoCustomer() {
		return infoCustomer;
	}

	/**
	 * Sets the value of the infoCustomer property.
	 * 
	 * @param value
	 *            allowed object is {@link InfoCustomerType }
	 * 
	 */
	public void setInfoCustomer(InfoCustomerType value) {
		this.infoCustomer = value;
	}

	/**
	 * Gets the value of the legalRepresentativeDataPJ property.
	 * 
	 * @return possible object is {@link UpdateInfoClientType }
	 * 
	 */
	public UpdateInfoClientType getLegalRepresentativeDataPJ() {
		return legalRepresentativeDataPJ;
	}

	/**
	 * Sets the value of the legalRepresentativeDataPJ property.
	 * 
	 * @param value
	 *            allowed object is {@link UpdateInfoClientType }
	 * 
	 */
	public void setLegalRepresentativeDataPJ(UpdateInfoClientType value) {
		this.legalRepresentativeDataPJ = value;
	}

	/**
	 * Gets the value of the locationInformationPN property.
	 * 
	 * @return possible object is {@link UpdateInfoClientType }
	 * 
	 */
	public UpdateInfoClientType getLocationInformationPN() {
		return locationInformationPN;
	}

	/**
	 * Sets the value of the locationInformationPN property.
	 * 
	 * @param value
	 *            allowed object is {@link UpdateInfoClientType }
	 * 
	 */
	public void setLocationInformationPN(UpdateInfoClientType value) {
		this.locationInformationPN = value;
	}

	/**
	 * Gets the value of the representativeInformationPN property.
	 * 
	 * @return possible object is {@link UpdateInfoClientType }
	 * 
	 */
	public UpdateInfoClientType getRepresentativeInformationPN() {
		return representativeInformationPN;
	}

	/**
	 * Sets the value of the representativeInformationPN property.
	 * 
	 * @param value
	 *            allowed object is {@link UpdateInfoClientType }
	 * 
	 */
	public void setRepresentativeInformationPN(UpdateInfoClientType value) {
		this.representativeInformationPN = value;
	}

}
