
package com.backoffice.client.validatecustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ValidateCustomerRespType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateCustomerRespType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextResponse" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextResponseType/}ContextResponseType"/>
 *         &lt;element name="customerCompany" type="{http://girosyfinanzas.com/schema/DireccionCanales/CustomerCompanyType/}CustomerCompanyType" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://girosyfinanzas.com/schema/DireccionCanales/CustomerType/}CustomerType" minOccurs="0"/>
 *         &lt;element name="requiredInformationClients" type="{http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/}RequiredInformationClientsType" minOccurs="0"/>
 *         &lt;element name="updateInfoClients" type="{http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/}UpdateInfoClientsType" minOccurs="0"/>
 *         &lt;element name="notificationsList" type="{http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntCustomerOrq/}NotificationsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateCustomerRespType", propOrder = { "contextResponse", "customerCompany", "customer",
		"requiredInformationClients", "updateInfoClients", "notificationsList" })
public class ValidateCustomerRespType {

	@XmlElement(required = true)
	protected ContextResponseType contextResponse;
	protected CustomerCompanyType customerCompany;
	protected CustomerType customer;
	protected RequiredInformationClientsType requiredInformationClients;
	protected UpdateInfoClientsType updateInfoClients;
	protected NotificationsListType notificationsList;

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
	 * Gets the value of the customerCompany property.
	 * 
	 * @return possible object is {@link CustomerCompanyType }
	 * 
	 */
	public CustomerCompanyType getCustomerCompany() {
		return customerCompany;
	}

	/**
	 * Sets the value of the customerCompany property.
	 * 
	 * @param value
	 *            allowed object is {@link CustomerCompanyType }
	 * 
	 */
	public void setCustomerCompany(CustomerCompanyType value) {
		this.customerCompany = value;
	}

	/**
	 * Gets the value of the customer property.
	 * 
	 * @return possible object is {@link CustomerType }
	 * 
	 */
	public CustomerType getCustomer() {
		return customer;
	}

	/**
	 * Sets the value of the customer property.
	 * 
	 * @param value
	 *            allowed object is {@link CustomerType }
	 * 
	 */
	public void setCustomer(CustomerType value) {
		this.customer = value;
	}

	/**
	 * Gets the value of the requiredInformationClients property.
	 * 
	 * @return possible object is {@link RequiredInformationClientsType }
	 * 
	 */
	public RequiredInformationClientsType getRequiredInformationClients() {
		return requiredInformationClients;
	}

	/**
	 * Sets the value of the requiredInformationClients property.
	 * 
	 * @param value
	 *            allowed object is {@link RequiredInformationClientsType }
	 * 
	 */
	public void setRequiredInformationClients(RequiredInformationClientsType value) {
		this.requiredInformationClients = value;
	}

	/**
	 * Gets the value of the updateInfoClients property.
	 * 
	 * @return possible object is {@link UpdateInfoClientsType }
	 * 
	 */
	public UpdateInfoClientsType getUpdateInfoClients() {
		return updateInfoClients;
	}

	/**
	 * Sets the value of the updateInfoClients property.
	 * 
	 * @param value
	 *            allowed object is {@link UpdateInfoClientsType }
	 * 
	 */
	public void setUpdateInfoClients(UpdateInfoClientsType value) {
		this.updateInfoClients = value;
	}

	/**
	 * Gets the value of the notificationsList property.
	 * 
	 * @return possible object is {@link NotificationsListType }
	 * 
	 */
	public NotificationsListType getNotificationsList() {
		return notificationsList;
	}

	/**
	 * Sets the value of the notificationsList property.
	 * 
	 * @param value
	 *            allowed object is {@link NotificationsListType }
	 * 
	 */
	public void setNotificationsList(NotificationsListType value) {
		this.notificationsList = value;
	}

}
