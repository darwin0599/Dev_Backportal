
package com.girosyfinanzas.schema.direccioncanales.creditaccounttype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.girosyfinanzas.schema.direccioncanales.producttype.ProductType;

/**
 * <p>
 * Java class for CreditAccountType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CreditAccountType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://girosyfinanzas.com/schema/DireccionCanales/ProductType/}ProductType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestOnArreals" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minimumPay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalPay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debitDebtAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approvedCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="availableCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allowCollect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movementsList" type="{http://girosyfinanzas.com/schema/DireccionCanales/CreditAccountType/}MovementsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditAccountType", propOrder = { "code", "businessType", "line", "lineDescription",
		"interestOnArreals", "payDate", "minimumPay", "totalPay", "debitDebtAmount", "approvedCredit",
		"availableCredit", "allowCollect", "codeSummary", "movementsList" })
public class CreditAccountType extends ProductType {

	protected String code;
	protected String businessType;
	protected String line;
	protected String lineDescription;
	protected String interestOnArreals;
	protected String payDate;
	protected String minimumPay;
	protected String totalPay;
	protected String debitDebtAmount;
	protected String approvedCredit;
	protected String availableCredit;
	protected String allowCollect;
	protected String codeSummary;
	protected MovementsListType movementsList;

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
	 * Gets the value of the businessType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBusinessType() {
		return businessType;
	}

	/**
	 * Sets the value of the businessType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBusinessType(String value) {
		this.businessType = value;
	}

	/**
	 * Gets the value of the line property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLine() {
		return line;
	}

	/**
	 * Sets the value of the line property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLine(String value) {
		this.line = value;
	}

	/**
	 * Gets the value of the lineDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLineDescription() {
		return lineDescription;
	}

	/**
	 * Sets the value of the lineDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLineDescription(String value) {
		this.lineDescription = value;
	}

	/**
	 * Gets the value of the interestOnArreals property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInterestOnArreals() {
		return interestOnArreals;
	}

	/**
	 * Sets the value of the interestOnArreals property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInterestOnArreals(String value) {
		this.interestOnArreals = value;
	}

	/**
	 * Gets the value of the payDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPayDate() {
		return payDate;
	}

	/**
	 * Sets the value of the payDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPayDate(String value) {
		this.payDate = value;
	}

	/**
	 * Gets the value of the minimumPay property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMinimumPay() {
		return minimumPay;
	}

	/**
	 * Sets the value of the minimumPay property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMinimumPay(String value) {
		this.minimumPay = value;
	}

	/**
	 * Gets the value of the totalPay property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTotalPay() {
		return totalPay;
	}

	/**
	 * Sets the value of the totalPay property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTotalPay(String value) {
		this.totalPay = value;
	}

	/**
	 * Gets the value of the debitDebtAmount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDebitDebtAmount() {
		return debitDebtAmount;
	}

	/**
	 * Sets the value of the debitDebtAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDebitDebtAmount(String value) {
		this.debitDebtAmount = value;
	}

	/**
	 * Gets the value of the approvedCredit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getApprovedCredit() {
		return approvedCredit;
	}

	/**
	 * Sets the value of the approvedCredit property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setApprovedCredit(String value) {
		this.approvedCredit = value;
	}

	/**
	 * Gets the value of the availableCredit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAvailableCredit() {
		return availableCredit;
	}

	/**
	 * Sets the value of the availableCredit property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAvailableCredit(String value) {
		this.availableCredit = value;
	}

	/**
	 * Gets the value of the allowCollect property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAllowCollect() {
		return allowCollect;
	}

	/**
	 * Sets the value of the allowCollect property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAllowCollect(String value) {
		this.allowCollect = value;
	}

	/**
	 * Gets the value of the codeSummary property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodeSummary() {
		return codeSummary;
	}

	/**
	 * Sets the value of the codeSummary property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodeSummary(String value) {
		this.codeSummary = value;
	}

	/**
	 * Gets the value of the movementsList property.
	 * 
	 * @return possible object is {@link MovementsListType }
	 * 
	 */
	public MovementsListType getMovementsList() {
		return movementsList;
	}

	/**
	 * Sets the value of the movementsList property.
	 * 
	 * @param value
	 *            allowed object is {@link MovementsListType }
	 * 
	 */
	public void setMovementsList(MovementsListType value) {
		this.movementsList = value;
	}

}
