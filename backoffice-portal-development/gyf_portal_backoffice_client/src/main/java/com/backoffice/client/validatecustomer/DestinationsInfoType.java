
package com.backoffice.client.validatecustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for DestinationsInfoType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DestinationsInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originatingInfo" type="{http://girosyfinanzas.com/schema/DireccionCanales/DestinationsInfoType/}InfoSourceTransactionType" minOccurs="0"/>
 *         &lt;element name="destinationInfo" type="{http://girosyfinanzas.com/schema/DireccionCanales/DestinationsInfoType/}InfoSourceTransactionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinationsInfoType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/DestinationsInfoType/", propOrder = {
		"originatingInfo", "destinationInfo" })
public class DestinationsInfoType {

	protected InfoSourceTransactionType originatingInfo;
	protected InfoSourceTransactionType destinationInfo;

	/**
	 * Gets the value of the originatingInfo property.
	 * 
	 * @return possible object is {@link InfoSourceTransactionType }
	 * 
	 */
	public InfoSourceTransactionType getOriginatingInfo() {
		return originatingInfo;
	}

	/**
	 * Sets the value of the originatingInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link InfoSourceTransactionType }
	 * 
	 */
	public void setOriginatingInfo(InfoSourceTransactionType value) {
		this.originatingInfo = value;
	}

	/**
	 * Gets the value of the destinationInfo property.
	 * 
	 * @return possible object is {@link InfoSourceTransactionType }
	 * 
	 */
	public InfoSourceTransactionType getDestinationInfo() {
		return destinationInfo;
	}

	/**
	 * Sets the value of the destinationInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link InfoSourceTransactionType }
	 * 
	 */
	public void setDestinationInfo(InfoSourceTransactionType value) {
		this.destinationInfo = value;
	}

}
