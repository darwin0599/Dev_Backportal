
package com.backoffice.client.validatecustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for CustomerCommonType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerCommonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeCustomer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="economicActivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="levelEconomicActivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientPEP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecLastUpdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastUpdatedData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerCommonType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/CustomerCommonType/", propOrder = {
		"typeCustomer", "id", "typeIdentification", "name1", "name2", "name3", "name4", "economicActivity",
		"levelEconomicActivity", "clientPEP", "fecLastUpdate", "lastUpdatedData", "nationality" })
public class CustomerCommonType {

	protected Integer typeCustomer;
	protected String id;
	protected String typeIdentification;
	protected String name1;
	protected String name2;
	protected String name3;
	protected String name4;
	protected String economicActivity;
	protected String levelEconomicActivity;
	protected String clientPEP;
	protected String fecLastUpdate;
	protected String lastUpdatedData;
	protected String nationality;

	/**
	 * Gets the value of the typeCustomer property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTypeCustomer() {
		return typeCustomer;
	}

	/**
	 * Sets the value of the typeCustomer property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTypeCustomer(Integer value) {
		this.typeCustomer = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Gets the value of the typeIdentification property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTypeIdentification() {
		return typeIdentification;
	}

	/**
	 * Sets the value of the typeIdentification property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTypeIdentification(String value) {
		this.typeIdentification = value;
	}

	/**
	 * Gets the value of the name1 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName1() {
		return name1;
	}

	/**
	 * Sets the value of the name1 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName1(String value) {
		this.name1 = value;
	}

	/**
	 * Gets the value of the name2 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName2() {
		return name2;
	}

	/**
	 * Sets the value of the name2 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName2(String value) {
		this.name2 = value;
	}

	/**
	 * Gets the value of the name3 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName3() {
		return name3;
	}

	/**
	 * Sets the value of the name3 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName3(String value) {
		this.name3 = value;
	}

	/**
	 * Gets the value of the name4 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName4() {
		return name4;
	}

	/**
	 * Sets the value of the name4 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName4(String value) {
		this.name4 = value;
	}

	/**
	 * Gets the value of the economicActivity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEconomicActivity() {
		return economicActivity;
	}

	/**
	 * Sets the value of the economicActivity property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEconomicActivity(String value) {
		this.economicActivity = value;
	}

	/**
	 * Gets the value of the levelEconomicActivity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLevelEconomicActivity() {
		return levelEconomicActivity;
	}

	/**
	 * Sets the value of the levelEconomicActivity property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLevelEconomicActivity(String value) {
		this.levelEconomicActivity = value;
	}

	/**
	 * Gets the value of the clientPEP property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClientPEP() {
		return clientPEP;
	}

	/**
	 * Sets the value of the clientPEP property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setClientPEP(String value) {
		this.clientPEP = value;
	}

	/**
	 * Gets the value of the fecLastUpdate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFecLastUpdate() {
		return fecLastUpdate;
	}

	/**
	 * Sets the value of the fecLastUpdate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFecLastUpdate(String value) {
		this.fecLastUpdate = value;
	}

	/**
	 * Gets the value of the lastUpdatedData property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLastUpdatedData() {
		return lastUpdatedData;
	}

	/**
	 * Sets the value of the lastUpdatedData property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLastUpdatedData(String value) {
		this.lastUpdatedData = value;
	}

	/**
	 * Gets the value of the nationality property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * Sets the value of the nationality property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNationality(String value) {
		this.nationality = value;
	}

}
