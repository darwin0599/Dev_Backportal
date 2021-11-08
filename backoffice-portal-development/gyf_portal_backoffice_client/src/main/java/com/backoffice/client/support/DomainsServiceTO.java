
package com.backoffice.client.support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for domainsServiceTO complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="domainsServiceTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="child" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domainsServiceTO", propOrder = { "child", "nameKey" })
public class DomainsServiceTO {

	protected String child;
	protected String nameKey;

	/**
	 * Gets the value of the child property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getChild() {
		return child;
	}

	/**
	 * Sets the value of the child property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setChild(String value) {
		this.child = value;
	}

	/**
	 * Gets the value of the nameKey property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNameKey() {
		return nameKey;
	}

	/**
	 * Sets the value of the nameKey property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNameKey(String value) {
		this.nameKey = value;
	}

}
