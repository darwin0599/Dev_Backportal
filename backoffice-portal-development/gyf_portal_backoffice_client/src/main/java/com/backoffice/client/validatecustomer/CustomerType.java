
package com.backoffice.client.validatecustomer;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for CustomerType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://girosyfinanzas.com/schema/DireccionCanales/PersonType/}PersonType">
 *       &lt;sequence>
 *         &lt;element name="codTypeCustomer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valOccupation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valOcupationLevel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valJob" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codEconomicActivity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valIncome" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valExpenses" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valOtherIncome" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valAssets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valPassive" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="codDestinationOfFundsEconomic" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="400"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valOtherIncomeDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="400"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valCompanyName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valCompanyAddress" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valCompanyPhone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valCompanyFax" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valCompanyCity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valComplianceComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valDesirePrivacyPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCountryOfIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idExpiryDate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="idIssueDate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valLocalDeliveryArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valSentBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valSharePersonalData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valSecondIDNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valLinkingDate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valLinkingAgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecLastUpdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecEnroll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enrold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="valPep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valCityWork" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flagReceiver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="foundsOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/CustomerType/", propOrder = {
		"codTypeCustomer", "valOccupation", "valOcupationLevel", "valJob", "codEconomicActivity", "valIncome",
		"valExpenses", "valOtherIncome", "valAssets", "valPassive", "codDestinationOfFundsEconomic",
		"valOtherIncomeDescription", "valCompanyName", "valCompanyAddress", "valCompanyPhone", "valCompanyFax",
		"valCompanyCity", "valComplianceComment", "valDesirePrivacyPolicy", "idCountryOfIssue", "idExpiryDate",
		"idIssueDate", "valLocalDeliveryArea", "valSentBy", "valSharePersonalData", "valSecondIDNo", "valLinkingDate",
		"valLinkingAgency", "fecLastUpdate", "fecEnroll", "enrold", "valPep", "valCityWork", "flagReceiver",
		"foundsOrigin" })
public class CustomerType extends PersonType {

	protected Integer codTypeCustomer;
	protected String valOccupation;
	protected String valOcupationLevel;
	protected String valJob;
	protected String codEconomicActivity;
	protected BigDecimal valIncome;
	protected BigDecimal valExpenses;
	protected BigDecimal valOtherIncome;
	protected BigDecimal valAssets;
	protected BigDecimal valPassive;
	protected String codDestinationOfFundsEconomic;
	protected String valOtherIncomeDescription;
	protected String valCompanyName;
	protected String valCompanyAddress;
	protected String valCompanyPhone;
	protected String valCompanyFax;
	protected String valCompanyCity;
	protected String valComplianceComment;
	protected String valDesirePrivacyPolicy;
	protected String idCountryOfIssue;
	protected String idExpiryDate;
	protected String idIssueDate;
	protected String valLocalDeliveryArea;
	protected String valSentBy;
	protected String valSharePersonalData;
	protected String valSecondIDNo;
	protected String valLinkingDate;
	protected String valLinkingAgency;
	protected String fecLastUpdate;
	protected String fecEnroll;
	protected Boolean enrold;
	protected String valPep;
	protected String valCityWork;
	protected String flagReceiver;
	protected String foundsOrigin;

	/**
	 * Gets the value of the codTypeCustomer property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getCodTypeCustomer() {
		return codTypeCustomer;
	}

	/**
	 * Sets the value of the codTypeCustomer property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setCodTypeCustomer(Integer value) {
		this.codTypeCustomer = value;
	}

	/**
	 * Gets the value of the valOccupation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValOccupation() {
		return valOccupation;
	}

	/**
	 * Sets the value of the valOccupation property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValOccupation(String value) {
		this.valOccupation = value;
	}

	/**
	 * Gets the value of the valOcupationLevel property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValOcupationLevel() {
		return valOcupationLevel;
	}

	/**
	 * Sets the value of the valOcupationLevel property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValOcupationLevel(String value) {
		this.valOcupationLevel = value;
	}

	/**
	 * Gets the value of the valJob property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValJob() {
		return valJob;
	}

	/**
	 * Sets the value of the valJob property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValJob(String value) {
		this.valJob = value;
	}

	/**
	 * Gets the value of the codEconomicActivity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodEconomicActivity() {
		return codEconomicActivity;
	}

	/**
	 * Sets the value of the codEconomicActivity property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodEconomicActivity(String value) {
		this.codEconomicActivity = value;
	}

	/**
	 * Gets the value of the valIncome property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getValIncome() {
		return valIncome;
	}

	/**
	 * Sets the value of the valIncome property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setValIncome(BigDecimal value) {
		this.valIncome = value;
	}

	/**
	 * Gets the value of the valExpenses property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getValExpenses() {
		return valExpenses;
	}

	/**
	 * Sets the value of the valExpenses property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setValExpenses(BigDecimal value) {
		this.valExpenses = value;
	}

	/**
	 * Gets the value of the valOtherIncome property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getValOtherIncome() {
		return valOtherIncome;
	}

	/**
	 * Sets the value of the valOtherIncome property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setValOtherIncome(BigDecimal value) {
		this.valOtherIncome = value;
	}

	/**
	 * Gets the value of the valAssets property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getValAssets() {
		return valAssets;
	}

	/**
	 * Sets the value of the valAssets property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setValAssets(BigDecimal value) {
		this.valAssets = value;
	}

	/**
	 * Gets the value of the valPassive property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getValPassive() {
		return valPassive;
	}

	/**
	 * Sets the value of the valPassive property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setValPassive(BigDecimal value) {
		this.valPassive = value;
	}

	/**
	 * Gets the value of the codDestinationOfFundsEconomic property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodDestinationOfFundsEconomic() {
		return codDestinationOfFundsEconomic;
	}

	/**
	 * Sets the value of the codDestinationOfFundsEconomic property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodDestinationOfFundsEconomic(String value) {
		this.codDestinationOfFundsEconomic = value;
	}

	/**
	 * Gets the value of the valOtherIncomeDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValOtherIncomeDescription() {
		return valOtherIncomeDescription;
	}

	/**
	 * Sets the value of the valOtherIncomeDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValOtherIncomeDescription(String value) {
		this.valOtherIncomeDescription = value;
	}

	/**
	 * Gets the value of the valCompanyName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValCompanyName() {
		return valCompanyName;
	}

	/**
	 * Sets the value of the valCompanyName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValCompanyName(String value) {
		this.valCompanyName = value;
	}

	/**
	 * Gets the value of the valCompanyAddress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValCompanyAddress() {
		return valCompanyAddress;
	}

	/**
	 * Sets the value of the valCompanyAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValCompanyAddress(String value) {
		this.valCompanyAddress = value;
	}

	/**
	 * Gets the value of the valCompanyPhone property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValCompanyPhone() {
		return valCompanyPhone;
	}

	/**
	 * Sets the value of the valCompanyPhone property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValCompanyPhone(String value) {
		this.valCompanyPhone = value;
	}

	/**
	 * Gets the value of the valCompanyFax property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValCompanyFax() {
		return valCompanyFax;
	}

	/**
	 * Sets the value of the valCompanyFax property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValCompanyFax(String value) {
		this.valCompanyFax = value;
	}

	/**
	 * Gets the value of the valCompanyCity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValCompanyCity() {
		return valCompanyCity;
	}

	/**
	 * Sets the value of the valCompanyCity property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValCompanyCity(String value) {
		this.valCompanyCity = value;
	}

	/**
	 * Gets the value of the valComplianceComment property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValComplianceComment() {
		return valComplianceComment;
	}

	/**
	 * Sets the value of the valComplianceComment property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValComplianceComment(String value) {
		this.valComplianceComment = value;
	}

	/**
	 * Gets the value of the valDesirePrivacyPolicy property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValDesirePrivacyPolicy() {
		return valDesirePrivacyPolicy;
	}

	/**
	 * Sets the value of the valDesirePrivacyPolicy property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValDesirePrivacyPolicy(String value) {
		this.valDesirePrivacyPolicy = value;
	}

	/**
	 * Gets the value of the idCountryOfIssue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdCountryOfIssue() {
		return idCountryOfIssue;
	}

	/**
	 * Sets the value of the idCountryOfIssue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdCountryOfIssue(String value) {
		this.idCountryOfIssue = value;
	}

	/**
	 * Gets the value of the idExpiryDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdExpiryDate() {
		return idExpiryDate;
	}

	/**
	 * Sets the value of the idExpiryDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdExpiryDate(String value) {
		this.idExpiryDate = value;
	}

	/**
	 * Gets the value of the idIssueDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdIssueDate() {
		return idIssueDate;
	}

	/**
	 * Sets the value of the idIssueDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdIssueDate(String value) {
		this.idIssueDate = value;
	}

	/**
	 * Gets the value of the valLocalDeliveryArea property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValLocalDeliveryArea() {
		return valLocalDeliveryArea;
	}

	/**
	 * Sets the value of the valLocalDeliveryArea property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValLocalDeliveryArea(String value) {
		this.valLocalDeliveryArea = value;
	}

	/**
	 * Gets the value of the valSentBy property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValSentBy() {
		return valSentBy;
	}

	/**
	 * Sets the value of the valSentBy property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValSentBy(String value) {
		this.valSentBy = value;
	}

	/**
	 * Gets the value of the valSharePersonalData property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValSharePersonalData() {
		return valSharePersonalData;
	}

	/**
	 * Sets the value of the valSharePersonalData property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValSharePersonalData(String value) {
		this.valSharePersonalData = value;
	}

	/**
	 * Gets the value of the valSecondIDNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValSecondIDNo() {
		return valSecondIDNo;
	}

	/**
	 * Sets the value of the valSecondIDNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValSecondIDNo(String value) {
		this.valSecondIDNo = value;
	}

	/**
	 * Gets the value of the valLinkingDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValLinkingDate() {
		return valLinkingDate;
	}

	/**
	 * Sets the value of the valLinkingDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValLinkingDate(String value) {
		this.valLinkingDate = value;
	}

	/**
	 * Gets the value of the valLinkingAgency property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValLinkingAgency() {
		return valLinkingAgency;
	}

	/**
	 * Sets the value of the valLinkingAgency property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValLinkingAgency(String value) {
		this.valLinkingAgency = value;
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
	 * Gets the value of the fecEnroll property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFecEnroll() {
		return fecEnroll;
	}

	/**
	 * Sets the value of the fecEnroll property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFecEnroll(String value) {
		this.fecEnroll = value;
	}

	/**
	 * Gets the value of the enrold property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isEnrold() {
		return enrold;
	}

	/**
	 * Sets the value of the enrold property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setEnrold(Boolean value) {
		this.enrold = value;
	}

	/**
	 * Gets the value of the valPep property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValPep() {
		return valPep;
	}

	/**
	 * Sets the value of the valPep property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValPep(String value) {
		this.valPep = value;
	}

	/**
	 * Gets the value of the valCityWork property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValCityWork() {
		return valCityWork;
	}

	/**
	 * Sets the value of the valCityWork property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValCityWork(String value) {
		this.valCityWork = value;
	}

	/**
	 * Gets the value of the flagReceiver property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFlagReceiver() {
		return flagReceiver;
	}

	/**
	 * Sets the value of the flagReceiver property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFlagReceiver(String value) {
		this.flagReceiver = value;
	}

	/**
	 * Gets the value of the foundsOrigin property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFoundsOrigin() {
		return foundsOrigin;
	}

	/**
	 * Sets the value of the foundsOrigin property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFoundsOrigin(String value) {
		this.foundsOrigin = value;
	}

}
