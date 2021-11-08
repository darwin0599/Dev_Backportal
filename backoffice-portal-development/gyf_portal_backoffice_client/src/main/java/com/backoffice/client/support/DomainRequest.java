
package com.backoffice.client.support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for domainRequest complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="domainRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cadenaElementos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contextTransaction" type="{http://integration.services.support.gyf.com/}contextTransactionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domainRequest", propOrder = { "cadenaElementos", "contextTransaction" })
public class DomainRequest {

	protected String cadenaElementos;
	protected ContextTransactionType contextTransaction;

	/**
	 * Gets the value of the cadenaElementos property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCadenaElementos() {
		return cadenaElementos;
	}

	/**
	 * Sets the value of the cadenaElementos property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCadenaElementos(String value) {
		this.cadenaElementos = value;
	}

	/**
	 * Gets the value of the contextTransaction property.
	 * 
	 * @return possible object is {@link ContextTransactionType }
	 * 
	 */
	public ContextTransactionType getContextTransaction() {
		return contextTransaction;
	}

	/**
	 * Sets the value of the contextTransaction property.
	 * 
	 * @param value
	 *            allowed object is {@link ContextTransactionType }
	 * 
	 */
	public void setContextTransaction(ContextTransactionType value) {
		this.contextTransaction = value;
	}

}
