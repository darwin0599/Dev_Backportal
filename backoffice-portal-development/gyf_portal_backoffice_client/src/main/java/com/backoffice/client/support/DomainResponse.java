
package com.backoffice.client.support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for domainResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="domainResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextResponse" type="{http://integration.services.support.gyf.com/}contextResponseType" minOccurs="0"/>
 *         &lt;element name="response" type="{http://integration.services.support.gyf.com/}supportServiceResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domainResponse", propOrder = { "contextResponse", "response" })
public class DomainResponse {

	protected ContextResponseType contextResponse;
	protected SupportServiceResponse response;

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
	 * Gets the value of the response property.
	 * 
	 * @return possible object is {@link SupportServiceResponse }
	 * 
	 */
	public SupportServiceResponse getResponse() {
		return response;
	}

	/**
	 * Sets the value of the response property.
	 * 
	 * @param value
	 *            allowed object is {@link SupportServiceResponse }
	 * 
	 */
	public void setResponse(SupportServiceResponse value) {
		this.response = value;
	}

}
