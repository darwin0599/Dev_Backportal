
package com.backoffice.client.bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PersonType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codTypeIdentification" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valNameType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valFirstName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valMiddleName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valLastName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valMiddleLastName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valGender" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dateOfBirth" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valBirthPlace" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valPhone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valMobile" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valEmail" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valNationality" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valCountry" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valState" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valCity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valCurrentLocationZIP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valResidencePlace" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valAddress" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codMobileCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valSMSFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valEstratum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valMaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CIIU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/PersonType/", propOrder = {
		"id", "codTypeIdentification", "valNameType", "valFirstName", "valMiddleName", "valLastName",
		"valMiddleLastName", "valGender", "dateOfBirth", "age", "valBirthPlace", "valPhone", "valMobile", "valEmail",
		"valNationality", "valCountry", "valState", "valCity", "valCurrentLocationZIP", "valResidencePlace",
		"valAddress", "codState", "codMobileCountry", "valSMSFlag", "valEstratum", "countryName", "desCity",
		"phoneCityCode", "phoneCountryCode", "valMaritalStatus", "occupation", "ciiu" })
public class PersonType {

	protected String id;
	protected String codTypeIdentification;
	protected String valNameType;
	protected String valFirstName;
	protected String valMiddleName;
	protected String valLastName;
	protected String valMiddleLastName;
	protected String valGender;
	protected String dateOfBirth;
	protected Integer age;
	protected String valBirthPlace;
	protected String valPhone;
	protected String valMobile;
	protected String valEmail;
	protected String valNationality;
	protected String valCountry;
	protected String valState;
	protected String valCity;
	protected String valCurrentLocationZIP;
	protected String valResidencePlace;
	protected String valAddress;
	protected String codState;
	protected String codMobileCountry;
	protected String valSMSFlag;
	protected String valEstratum;
	protected String countryName;
	protected String desCity;
	protected String phoneCityCode;
	protected String phoneCountryCode;
	protected String valMaritalStatus;
	protected String occupation;
	@XmlElement(name = "CIIU")
	protected String ciiu;

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
	 * Gets the value of the codTypeIdentification property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodTypeIdentification() {
		return codTypeIdentification;
	}

	/**
	 * Sets the value of the codTypeIdentification property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodTypeIdentification(String value) {
		this.codTypeIdentification = value;
	}

	/**
	 * Gets the value of the valNameType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValNameType() {
		return valNameType;
	}

	/**
	 * Sets the value of the valNameType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValNameType(String value) {
		this.valNameType = value;
	}

	/**
	 * Gets the value of the valFirstName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValFirstName() {
		return valFirstName;
	}

	/**
	 * Sets the value of the valFirstName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValFirstName(String value) {
		this.valFirstName = value;
	}

	/**
	 * Gets the value of the valMiddleName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValMiddleName() {
		return valMiddleName;
	}

	/**
	 * Sets the value of the valMiddleName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValMiddleName(String value) {
		this.valMiddleName = value;
	}

	/**
	 * Gets the value of the valLastName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValLastName() {
		return valLastName;
	}

	/**
	 * Sets the value of the valLastName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValLastName(String value) {
		this.valLastName = value;
	}

	/**
	 * Gets the value of the valMiddleLastName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValMiddleLastName() {
		return valMiddleLastName;
	}

	/**
	 * Sets the value of the valMiddleLastName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValMiddleLastName(String value) {
		this.valMiddleLastName = value;
	}

	/**
	 * Gets the value of the valGender property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValGender() {
		return valGender;
	}

	/**
	 * Sets the value of the valGender property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValGender(String value) {
		this.valGender = value;
	}

	/**
	 * Gets the value of the dateOfBirth property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * Sets the value of the dateOfBirth property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDateOfBirth(String value) {
		this.dateOfBirth = value;
	}

	/**
	 * Gets the value of the age property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * Sets the value of the age property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setAge(Integer value) {
		this.age = value;
	}

	/**
	 * Gets the value of the valBirthPlace property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValBirthPlace() {
		return valBirthPlace;
	}

	/**
	 * Sets the value of the valBirthPlace property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValBirthPlace(String value) {
		this.valBirthPlace = value;
	}

	/**
	 * Gets the value of the valPhone property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValPhone() {
		return valPhone;
	}

	/**
	 * Sets the value of the valPhone property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValPhone(String value) {
		this.valPhone = value;
	}

	/**
	 * Gets the value of the valMobile property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValMobile() {
		return valMobile;
	}

	/**
	 * Sets the value of the valMobile property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValMobile(String value) {
		this.valMobile = value;
	}

	/**
	 * Gets the value of the valEmail property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValEmail() {
		return valEmail;
	}

	/**
	 * Sets the value of the valEmail property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValEmail(String value) {
		this.valEmail = value;
	}

	/**
	 * Gets the value of the valNationality property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValNationality() {
		return valNationality;
	}

	/**
	 * Sets the value of the valNationality property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValNationality(String value) {
		this.valNationality = value;
	}

	/**
	 * Gets the value of the valCountry property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValCountry() {
		return valCountry;
	}

	/**
	 * Sets the value of the valCountry property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValCountry(String value) {
		this.valCountry = value;
	}

	/**
	 * Gets the value of the valState property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValState() {
		return valState;
	}

	/**
	 * Sets the value of the valState property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValState(String value) {
		this.valState = value;
	}

	/**
	 * Gets the value of the valCity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValCity() {
		return valCity;
	}

	/**
	 * Sets the value of the valCity property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValCity(String value) {
		this.valCity = value;
	}

	/**
	 * Gets the value of the valCurrentLocationZIP property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValCurrentLocationZIP() {
		return valCurrentLocationZIP;
	}

	/**
	 * Sets the value of the valCurrentLocationZIP property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValCurrentLocationZIP(String value) {
		this.valCurrentLocationZIP = value;
	}

	/**
	 * Gets the value of the valResidencePlace property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValResidencePlace() {
		return valResidencePlace;
	}

	/**
	 * Sets the value of the valResidencePlace property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValResidencePlace(String value) {
		this.valResidencePlace = value;
	}

	/**
	 * Gets the value of the valAddress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValAddress() {
		return valAddress;
	}

	/**
	 * Sets the value of the valAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValAddress(String value) {
		this.valAddress = value;
	}

	/**
	 * Gets the value of the codState property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodState() {
		return codState;
	}

	/**
	 * Sets the value of the codState property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodState(String value) {
		this.codState = value;
	}

	/**
	 * Gets the value of the codMobileCountry property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodMobileCountry() {
		return codMobileCountry;
	}

	/**
	 * Sets the value of the codMobileCountry property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodMobileCountry(String value) {
		this.codMobileCountry = value;
	}

	/**
	 * Gets the value of the valSMSFlag property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValSMSFlag() {
		return valSMSFlag;
	}

	/**
	 * Sets the value of the valSMSFlag property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValSMSFlag(String value) {
		this.valSMSFlag = value;
	}

	/**
	 * Gets the value of the valEstratum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValEstratum() {
		return valEstratum;
	}

	/**
	 * Sets the value of the valEstratum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValEstratum(String value) {
		this.valEstratum = value;
	}

	/**
	 * Gets the value of the countryName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * Sets the value of the countryName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCountryName(String value) {
		this.countryName = value;
	}

	/**
	 * Gets the value of the desCity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDesCity() {
		return desCity;
	}

	/**
	 * Sets the value of the desCity property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDesCity(String value) {
		this.desCity = value;
	}

	/**
	 * Gets the value of the phoneCityCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPhoneCityCode() {
		return phoneCityCode;
	}

	/**
	 * Sets the value of the phoneCityCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPhoneCityCode(String value) {
		this.phoneCityCode = value;
	}

	/**
	 * Gets the value of the phoneCountryCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPhoneCountryCode() {
		return phoneCountryCode;
	}

	/**
	 * Sets the value of the phoneCountryCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPhoneCountryCode(String value) {
		this.phoneCountryCode = value;
	}

	/**
	 * Gets the value of the valMaritalStatus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValMaritalStatus() {
		return valMaritalStatus;
	}

	/**
	 * Sets the value of the valMaritalStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValMaritalStatus(String value) {
		this.valMaritalStatus = value;
	}

	/**
	 * Gets the value of the occupation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOccupation() {
		return occupation;
	}

	/**
	 * Sets the value of the occupation property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOccupation(String value) {
		this.occupation = value;
	}

	/**
	 * Gets the value of the ciiu property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCIIU() {
		return ciiu;
	}

	/**
	 * Sets the value of the ciiu property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCIIU(String value) {
		this.ciiu = value;
	}

}
