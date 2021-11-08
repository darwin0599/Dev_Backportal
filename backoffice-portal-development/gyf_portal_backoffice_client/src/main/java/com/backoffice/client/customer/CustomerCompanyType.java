
package com.backoffice.client.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for CustomerCompanyType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerCompanyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constitutionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CIIUCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cellular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enterpriseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legalRepresentatives" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="legalRepresentative" type="{http://girosyfinanzas.com/schema/DireccionCanales/CustomerType/}CustomerType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="shareholders" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="shareholder" type="{http://girosyfinanzas.com/schema/DireccionCanales/CustomerType/}CustomerType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerCompanyType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/CustomerCompanyType/", propOrder = {
		"city", "companyAddress", "companyName", "country", "id", "identificationType", "phoneNumber", "state",
		"constitutionDate", "ciiuCode", "email", "cellular", "enterpriseType", "legalRepresentatives", "shareholders" })
public class CustomerCompanyType {

	protected String city;
	protected String companyAddress;
	protected String companyName;
	protected String country;
	@XmlElement(required = true)
	protected String id;
	@XmlElement(required = true)
	protected String identificationType;
	protected String phoneNumber;
	protected String state;
	protected String constitutionDate;
	@XmlElement(name = "CIIUCode")
	protected String ciiuCode;
	protected String email;
	protected String cellular;
	protected String enterpriseType;
	protected CustomerCompanyType.LegalRepresentatives legalRepresentatives;
	protected CustomerCompanyType.Shareholders shareholders;

	/**
	 * Gets the value of the city property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the value of the city property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCity(String value) {
		this.city = value;
	}

	/**
	 * Gets the value of the companyAddress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCompanyAddress() {
		return companyAddress;
	}

	/**
	 * Sets the value of the companyAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCompanyAddress(String value) {
		this.companyAddress = value;
	}

	/**
	 * Gets the value of the companyName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * Sets the value of the companyName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCompanyName(String value) {
		this.companyName = value;
	}

	/**
	 * Gets the value of the country property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the value of the country property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCountry(String value) {
		this.country = value;
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
	 * Gets the value of the identificationType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdentificationType() {
		return identificationType;
	}

	/**
	 * Sets the value of the identificationType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdentificationType(String value) {
		this.identificationType = value;
	}

	/**
	 * Gets the value of the phoneNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the value of the phoneNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPhoneNumber(String value) {
		this.phoneNumber = value;
	}

	/**
	 * Gets the value of the state property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the value of the state property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setState(String value) {
		this.state = value;
	}

	/**
	 * Gets the value of the constitutionDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConstitutionDate() {
		return constitutionDate;
	}

	/**
	 * Sets the value of the constitutionDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConstitutionDate(String value) {
		this.constitutionDate = value;
	}

	/**
	 * Gets the value of the ciiuCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCIIUCode() {
		return ciiuCode;
	}

	/**
	 * Sets the value of the ciiuCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCIIUCode(String value) {
		this.ciiuCode = value;
	}

	/**
	 * Gets the value of the email property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the value of the email property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEmail(String value) {
		this.email = value;
	}

	/**
	 * Gets the value of the cellular property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCellular() {
		return cellular;
	}

	/**
	 * Sets the value of the cellular property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCellular(String value) {
		this.cellular = value;
	}

	/**
	 * Gets the value of the enterpriseType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEnterpriseType() {
		return enterpriseType;
	}

	/**
	 * Sets the value of the enterpriseType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEnterpriseType(String value) {
		this.enterpriseType = value;
	}

	/**
	 * Gets the value of the legalRepresentatives property.
	 * 
	 * @return possible object is
	 *         {@link CustomerCompanyType.LegalRepresentatives }
	 * 
	 */
	public CustomerCompanyType.LegalRepresentatives getLegalRepresentatives() {
		return legalRepresentatives;
	}

	/**
	 * Sets the value of the legalRepresentatives property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link CustomerCompanyType.LegalRepresentatives }
	 * 
	 */
	public void setLegalRepresentatives(CustomerCompanyType.LegalRepresentatives value) {
		this.legalRepresentatives = value;
	}

	/**
	 * Gets the value of the shareholders property.
	 * 
	 * @return possible object is {@link CustomerCompanyType.Shareholders }
	 * 
	 */
	public CustomerCompanyType.Shareholders getShareholders() {
		return shareholders;
	}

	/**
	 * Sets the value of the shareholders property.
	 * 
	 * @param value
	 *            allowed object is {@link CustomerCompanyType.Shareholders }
	 * 
	 */
	public void setShareholders(CustomerCompanyType.Shareholders value) {
		this.shareholders = value;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="legalRepresentative" type="{http://girosyfinanzas.com/schema/DireccionCanales/CustomerType/}CustomerType" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "legalRepresentative" })
	public static class LegalRepresentatives {

		protected List<CustomerType> legalRepresentative;

		/**
		 * Gets the value of the legalRepresentative property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the legalRepresentative property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getLegalRepresentative().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link CustomerType }
		 * 
		 * 
		 */
		public List<CustomerType> getLegalRepresentative() {
			if (legalRepresentative == null) {
				legalRepresentative = new ArrayList<CustomerType>();
			}
			return this.legalRepresentative;
		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="shareholder" type="{http://girosyfinanzas.com/schema/DireccionCanales/CustomerType/}CustomerType" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "shareholder" })
	public static class Shareholders {

		protected List<CustomerType> shareholder;

		/**
		 * Gets the value of the shareholder property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the shareholder property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getShareholder().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link CustomerType }
		 * 
		 * 
		 */
		public List<CustomerType> getShareholder() {
			if (shareholder == null) {
				shareholder = new ArrayList<CustomerType>();
			}
			return this.shareholder;
		}

	}

}
