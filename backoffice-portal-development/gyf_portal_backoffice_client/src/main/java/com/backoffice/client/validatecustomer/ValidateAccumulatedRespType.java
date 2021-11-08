
package com.backoffice.client.validatecustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ValidateAccumulatedRespType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateAccumulatedRespType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextResponse" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextResponseType/}ContextResponseType" minOccurs="0"/>
 *         &lt;element name="flagReceiver" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "ValidateAccumulatedRespType", propOrder = { "contextResponse", "flagReceiver",
		"requiredInformationClients", "updateInfoClients", "notificationsList" })
public class ValidateAccumulatedRespType {

	protected ContextResponseType contextResponse;
	protected Boolean flagReceiver;
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
	 * Gets the value of the flagReceiver property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isFlagReceiver() {
		return flagReceiver;
	}

	/**
	 * Sets the value of the flagReceiver property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setFlagReceiver(Boolean value) {
		this.flagReceiver = value;
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
