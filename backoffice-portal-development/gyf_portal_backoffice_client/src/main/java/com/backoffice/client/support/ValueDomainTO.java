
package com.backoffice.client.support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for valueDomainTO complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="valueDomainTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="child" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domainsServiceTO" type="{http://integration.services.support.gyf.com/}domainsServiceTO" minOccurs="0"/>
 *         &lt;element name="father" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherValueDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idValueDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueDomainTO", propOrder = { "child", "code", "description", "domainsServiceTO", "father",
		"fatherValueDomain", "idDomain", "idValueDomain", "name" })
public class ValueDomainTO {

	protected String child;
	protected String code;
	protected String description;
	protected DomainsServiceTO domainsServiceTO;
	protected String father;
	protected String fatherValueDomain;
	protected String idDomain;
	protected String idValueDomain;
	protected String name;

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
	 * Gets the value of the code property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the value of the code property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCode(String value) {
		this.code = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Gets the value of the domainsServiceTO property.
	 * 
	 * @return possible object is {@link DomainsServiceTO }
	 * 
	 */
	public DomainsServiceTO getDomainsServiceTO() {
		return domainsServiceTO;
	}

	/**
	 * Sets the value of the domainsServiceTO property.
	 * 
	 * @param value
	 *            allowed object is {@link DomainsServiceTO }
	 * 
	 */
	public void setDomainsServiceTO(DomainsServiceTO value) {
		this.domainsServiceTO = value;
	}

	/**
	 * Gets the value of the father property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFather() {
		return father;
	}

	/**
	 * Sets the value of the father property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFather(String value) {
		this.father = value;
	}

	/**
	 * Gets the value of the fatherValueDomain property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFatherValueDomain() {
		return fatherValueDomain;
	}

	/**
	 * Sets the value of the fatherValueDomain property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFatherValueDomain(String value) {
		this.fatherValueDomain = value;
	}

	/**
	 * Gets the value of the idDomain property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdDomain() {
		return idDomain;
	}

	/**
	 * Sets the value of the idDomain property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdDomain(String value) {
		this.idDomain = value;
	}

	/**
	 * Gets the value of the idValueDomain property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdValueDomain() {
		return idValueDomain;
	}

	/**
	 * Sets the value of the idValueDomain property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdValueDomain(String value) {
		this.idValueDomain = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

}
