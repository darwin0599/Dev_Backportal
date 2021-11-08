
package com.backoffice.client.validatecustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ValidateComplianceListRespType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateComplianceListRespType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextResponse" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextResponseType/}ContextResponseType"/>
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
@XmlType(name = "ValidateComplianceListRespType", propOrder = { "contextResponse", "notificationsList" })
public class ValidateComplianceListRespType {

	@XmlElement(required = true)
	protected ContextResponseType contextResponse;
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
