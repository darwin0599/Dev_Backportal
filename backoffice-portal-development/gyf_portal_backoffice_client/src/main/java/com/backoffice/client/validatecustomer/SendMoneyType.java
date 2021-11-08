
package com.backoffice.client.validatecustomer;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for SendMoneyType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SendMoneyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valueAdditionalServicesCOP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="transactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="baseCurrencyIVA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="commissionIVA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="currencyIVA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="differenceRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="otherServicesIVA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="otherServicesIVAGYF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="additionalRate1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="additionalRate2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalValueBeforeTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalValueTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valueServicesMailNotificationGYF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valueServicesSMSNotificationGYF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="agencyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cashierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cashValueUSD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cashValueCOP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valGMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TCRMRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="commerceRepresentativeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="averageBuyRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="salesRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="sendDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="broker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundsTarget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kinshipBeneficiary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detailActivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonShipping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeralExchange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testQuestionSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="methodOfPayment" type="{http://girosyfinanzas.com/schema/DireccionCanales/MethodOfPaymentType/}MethodOfPaymentType" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://girosyfinanzas.com/schema/DireccionCanales/CustomerType/}CustomerType" minOccurs="0"/>
 *         &lt;element name="customerCompany" type="{http://girosyfinanzas.com/schema/DireccionCanales/CustomerCompanyType/}CustomerCompanyType" minOccurs="0"/>
 *         &lt;element name="moneyTransfer" type="{http://girosyfinanzas.com/schema/DireccionCanales/MoneyTransferType/}MoneyTransferType" minOccurs="0"/>
 *         &lt;element name="representative" type="{http://girosyfinanzas.com/schema/DireccionCanales/RepresentativeType/}RepresentativeType" minOccurs="0"/>
 *         &lt;element name="valueAdditionalServicesCOPGYF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotionsGYF" type="{http://girosyfinanzas.com/schema/DireccionCanales/MoneyTransferPromotionType.xsd/}MoneyTransferPromotionType" minOccurs="0"/>
 *         &lt;element name="promoDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendMoneyType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/SendMoneyType/", propOrder = {
		"valueAdditionalServicesCOP", "transactionDate", "baseCurrencyIVA", "commissionIVA", "currencyIVA",
		"differenceRate", "otherServicesIVA", "otherServicesIVAGYF", "additionalRate1", "additionalRate2", "totalValue",
		"totalValueBeforeTax", "totalValueTax", "valueServicesMailNotificationGYF", "valueServicesSMSNotificationGYF",
		"agencyId", "cashierCode", "cashValueUSD", "cashValueCOP", "valGMF", "tcrmRate", "commerceRepresentativeRate",
		"averageBuyRate", "salesRate", "sendDate", "broker", "fundsTarget", "kinshipBeneficiary", "detailActivity",
		"reasonShipping", "numeralExchange", "commission", "testQuestionSet", "methodOfPayment", "customer",
		"customerCompany", "moneyTransfer", "representative", "valueAdditionalServicesCOPGYF", "promotionsGYF",
		"promoDiscountAmount" })
public class SendMoneyType {

	protected BigDecimal valueAdditionalServicesCOP;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar transactionDate;
	protected BigDecimal baseCurrencyIVA;
	protected BigDecimal commissionIVA;
	protected BigDecimal currencyIVA;
	protected BigDecimal differenceRate;
	protected BigDecimal otherServicesIVA;
	protected BigDecimal otherServicesIVAGYF;
	protected BigDecimal additionalRate1;
	protected BigDecimal additionalRate2;
	protected BigDecimal totalValue;
	protected BigDecimal totalValueBeforeTax;
	protected BigDecimal totalValueTax;
	protected BigDecimal valueServicesMailNotificationGYF;
	protected BigDecimal valueServicesSMSNotificationGYF;
	protected String agencyId;
	protected String cashierCode;
	protected String cashValueUSD;
	protected String cashValueCOP;
	protected String valGMF;
	@XmlElement(name = "TCRMRate")
	protected BigDecimal tcrmRate;
	protected BigDecimal commerceRepresentativeRate;
	protected BigDecimal averageBuyRate;
	protected BigDecimal salesRate;
	protected String sendDate;
	protected String broker;
	protected String fundsTarget;
	protected String kinshipBeneficiary;
	protected String detailActivity;
	protected String reasonShipping;
	protected String numeralExchange;
	protected String commission;
	protected String testQuestionSet;
	protected MethodOfPaymentType methodOfPayment;
	protected CustomerType customer;
	protected CustomerCompanyType customerCompany;
	protected MoneyTransferType moneyTransfer;
	protected RepresentativeType representative;
	protected String valueAdditionalServicesCOPGYF;
	protected MoneyTransferPromotionType promotionsGYF;
	protected String promoDiscountAmount;

	/**
	 * Gets the value of the valueAdditionalServicesCOP property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getValueAdditionalServicesCOP() {
		return valueAdditionalServicesCOP;
	}

	/**
	 * Sets the value of the valueAdditionalServicesCOP property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setValueAdditionalServicesCOP(BigDecimal value) {
		this.valueAdditionalServicesCOP = value;
	}

	/**
	 * Gets the value of the transactionDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getTransactionDate() {
		return transactionDate;
	}

	/**
	 * Sets the value of the transactionDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setTransactionDate(XMLGregorianCalendar value) {
		this.transactionDate = value;
	}

	/**
	 * Gets the value of the baseCurrencyIVA property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getBaseCurrencyIVA() {
		return baseCurrencyIVA;
	}

	/**
	 * Sets the value of the baseCurrencyIVA property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setBaseCurrencyIVA(BigDecimal value) {
		this.baseCurrencyIVA = value;
	}

	/**
	 * Gets the value of the commissionIVA property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getCommissionIVA() {
		return commissionIVA;
	}

	/**
	 * Sets the value of the commissionIVA property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setCommissionIVA(BigDecimal value) {
		this.commissionIVA = value;
	}

	/**
	 * Gets the value of the currencyIVA property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getCurrencyIVA() {
		return currencyIVA;
	}

	/**
	 * Sets the value of the currencyIVA property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setCurrencyIVA(BigDecimal value) {
		this.currencyIVA = value;
	}

	/**
	 * Gets the value of the differenceRate property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getDifferenceRate() {
		return differenceRate;
	}

	/**
	 * Sets the value of the differenceRate property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setDifferenceRate(BigDecimal value) {
		this.differenceRate = value;
	}

	/**
	 * Gets the value of the otherServicesIVA property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getOtherServicesIVA() {
		return otherServicesIVA;
	}

	/**
	 * Sets the value of the otherServicesIVA property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setOtherServicesIVA(BigDecimal value) {
		this.otherServicesIVA = value;
	}

	/**
	 * Gets the value of the otherServicesIVAGYF property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getOtherServicesIVAGYF() {
		return otherServicesIVAGYF;
	}

	/**
	 * Sets the value of the otherServicesIVAGYF property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setOtherServicesIVAGYF(BigDecimal value) {
		this.otherServicesIVAGYF = value;
	}

	/**
	 * Gets the value of the additionalRate1 property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getAdditionalRate1() {
		return additionalRate1;
	}

	/**
	 * Sets the value of the additionalRate1 property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setAdditionalRate1(BigDecimal value) {
		this.additionalRate1 = value;
	}

	/**
	 * Gets the value of the additionalRate2 property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getAdditionalRate2() {
		return additionalRate2;
	}

	/**
	 * Sets the value of the additionalRate2 property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setAdditionalRate2(BigDecimal value) {
		this.additionalRate2 = value;
	}

	/**
	 * Gets the value of the totalValue property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getTotalValue() {
		return totalValue;
	}

	/**
	 * Sets the value of the totalValue property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setTotalValue(BigDecimal value) {
		this.totalValue = value;
	}

	/**
	 * Gets the value of the totalValueBeforeTax property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getTotalValueBeforeTax() {
		return totalValueBeforeTax;
	}

	/**
	 * Sets the value of the totalValueBeforeTax property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setTotalValueBeforeTax(BigDecimal value) {
		this.totalValueBeforeTax = value;
	}

	/**
	 * Gets the value of the totalValueTax property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getTotalValueTax() {
		return totalValueTax;
	}

	/**
	 * Sets the value of the totalValueTax property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setTotalValueTax(BigDecimal value) {
		this.totalValueTax = value;
	}

	/**
	 * Gets the value of the valueServicesMailNotificationGYF property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getValueServicesMailNotificationGYF() {
		return valueServicesMailNotificationGYF;
	}

	/**
	 * Sets the value of the valueServicesMailNotificationGYF property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setValueServicesMailNotificationGYF(BigDecimal value) {
		this.valueServicesMailNotificationGYF = value;
	}

	/**
	 * Gets the value of the valueServicesSMSNotificationGYF property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getValueServicesSMSNotificationGYF() {
		return valueServicesSMSNotificationGYF;
	}

	/**
	 * Sets the value of the valueServicesSMSNotificationGYF property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setValueServicesSMSNotificationGYF(BigDecimal value) {
		this.valueServicesSMSNotificationGYF = value;
	}

	/**
	 * Gets the value of the agencyId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAgencyId() {
		return agencyId;
	}

	/**
	 * Sets the value of the agencyId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAgencyId(String value) {
		this.agencyId = value;
	}

	/**
	 * Gets the value of the cashierCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCashierCode() {
		return cashierCode;
	}

	/**
	 * Sets the value of the cashierCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCashierCode(String value) {
		this.cashierCode = value;
	}

	/**
	 * Gets the value of the cashValueUSD property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCashValueUSD() {
		return cashValueUSD;
	}

	/**
	 * Sets the value of the cashValueUSD property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCashValueUSD(String value) {
		this.cashValueUSD = value;
	}

	/**
	 * Gets the value of the cashValueCOP property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCashValueCOP() {
		return cashValueCOP;
	}

	/**
	 * Sets the value of the cashValueCOP property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCashValueCOP(String value) {
		this.cashValueCOP = value;
	}

	/**
	 * Gets the value of the valGMF property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValGMF() {
		return valGMF;
	}

	/**
	 * Sets the value of the valGMF property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValGMF(String value) {
		this.valGMF = value;
	}

	/**
	 * Gets the value of the tcrmRate property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getTCRMRate() {
		return tcrmRate;
	}

	/**
	 * Sets the value of the tcrmRate property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setTCRMRate(BigDecimal value) {
		this.tcrmRate = value;
	}

	/**
	 * Gets the value of the commerceRepresentativeRate property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getCommerceRepresentativeRate() {
		return commerceRepresentativeRate;
	}

	/**
	 * Sets the value of the commerceRepresentativeRate property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setCommerceRepresentativeRate(BigDecimal value) {
		this.commerceRepresentativeRate = value;
	}

	/**
	 * Gets the value of the averageBuyRate property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getAverageBuyRate() {
		return averageBuyRate;
	}

	/**
	 * Sets the value of the averageBuyRate property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setAverageBuyRate(BigDecimal value) {
		this.averageBuyRate = value;
	}

	/**
	 * Gets the value of the salesRate property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getSalesRate() {
		return salesRate;
	}

	/**
	 * Sets the value of the salesRate property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setSalesRate(BigDecimal value) {
		this.salesRate = value;
	}

	/**
	 * Gets the value of the sendDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSendDate() {
		return sendDate;
	}

	/**
	 * Sets the value of the sendDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSendDate(String value) {
		this.sendDate = value;
	}

	/**
	 * Gets the value of the broker property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBroker() {
		return broker;
	}

	/**
	 * Sets the value of the broker property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBroker(String value) {
		this.broker = value;
	}

	/**
	 * Gets the value of the fundsTarget property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFundsTarget() {
		return fundsTarget;
	}

	/**
	 * Sets the value of the fundsTarget property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFundsTarget(String value) {
		this.fundsTarget = value;
	}

	/**
	 * Gets the value of the kinshipBeneficiary property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getKinshipBeneficiary() {
		return kinshipBeneficiary;
	}

	/**
	 * Sets the value of the kinshipBeneficiary property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setKinshipBeneficiary(String value) {
		this.kinshipBeneficiary = value;
	}

	/**
	 * Gets the value of the detailActivity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDetailActivity() {
		return detailActivity;
	}

	/**
	 * Sets the value of the detailActivity property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDetailActivity(String value) {
		this.detailActivity = value;
	}

	/**
	 * Gets the value of the reasonShipping property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReasonShipping() {
		return reasonShipping;
	}

	/**
	 * Sets the value of the reasonShipping property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReasonShipping(String value) {
		this.reasonShipping = value;
	}

	/**
	 * Gets the value of the numeralExchange property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNumeralExchange() {
		return numeralExchange;
	}

	/**
	 * Sets the value of the numeralExchange property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNumeralExchange(String value) {
		this.numeralExchange = value;
	}

	/**
	 * Gets the value of the commission property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCommission() {
		return commission;
	}

	/**
	 * Sets the value of the commission property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCommission(String value) {
		this.commission = value;
	}

	/**
	 * Gets the value of the testQuestionSet property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTestQuestionSet() {
		return testQuestionSet;
	}

	/**
	 * Sets the value of the testQuestionSet property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTestQuestionSet(String value) {
		this.testQuestionSet = value;
	}

	/**
	 * Gets the value of the methodOfPayment property.
	 * 
	 * @return possible object is {@link MethodOfPaymentType }
	 * 
	 */
	public MethodOfPaymentType getMethodOfPayment() {
		return methodOfPayment;
	}

	/**
	 * Sets the value of the methodOfPayment property.
	 * 
	 * @param value
	 *            allowed object is {@link MethodOfPaymentType }
	 * 
	 */
	public void setMethodOfPayment(MethodOfPaymentType value) {
		this.methodOfPayment = value;
	}

	/**
	 * Gets the value of the customer property.
	 * 
	 * @return possible object is {@link CustomerType }
	 * 
	 */
	public CustomerType getCustomer() {
		return customer;
	}

	/**
	 * Sets the value of the customer property.
	 * 
	 * @param value
	 *            allowed object is {@link CustomerType }
	 * 
	 */
	public void setCustomer(CustomerType value) {
		this.customer = value;
	}

	/**
	 * Gets the value of the customerCompany property.
	 * 
	 * @return possible object is {@link CustomerCompanyType }
	 * 
	 */
	public CustomerCompanyType getCustomerCompany() {
		return customerCompany;
	}

	/**
	 * Sets the value of the customerCompany property.
	 * 
	 * @param value
	 *            allowed object is {@link CustomerCompanyType }
	 * 
	 */
	public void setCustomerCompany(CustomerCompanyType value) {
		this.customerCompany = value;
	}

	/**
	 * Gets the value of the moneyTransfer property.
	 * 
	 * @return possible object is {@link MoneyTransferType }
	 * 
	 */
	public MoneyTransferType getMoneyTransfer() {
		return moneyTransfer;
	}

	/**
	 * Sets the value of the moneyTransfer property.
	 * 
	 * @param value
	 *            allowed object is {@link MoneyTransferType }
	 * 
	 */
	public void setMoneyTransfer(MoneyTransferType value) {
		this.moneyTransfer = value;
	}

	/**
	 * Gets the value of the representative property.
	 * 
	 * @return possible object is {@link RepresentativeType }
	 * 
	 */
	public RepresentativeType getRepresentative() {
		return representative;
	}

	/**
	 * Sets the value of the representative property.
	 * 
	 * @param value
	 *            allowed object is {@link RepresentativeType }
	 * 
	 */
	public void setRepresentative(RepresentativeType value) {
		this.representative = value;
	}

	/**
	 * Gets the value of the valueAdditionalServicesCOPGYF property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValueAdditionalServicesCOPGYF() {
		return valueAdditionalServicesCOPGYF;
	}

	/**
	 * Sets the value of the valueAdditionalServicesCOPGYF property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValueAdditionalServicesCOPGYF(String value) {
		this.valueAdditionalServicesCOPGYF = value;
	}

	/**
	 * Gets the value of the promotionsGYF property.
	 * 
	 * @return possible object is {@link MoneyTransferPromotionType }
	 * 
	 */
	public MoneyTransferPromotionType getPromotionsGYF() {
		return promotionsGYF;
	}

	/**
	 * Sets the value of the promotionsGYF property.
	 * 
	 * @param value
	 *            allowed object is {@link MoneyTransferPromotionType }
	 * 
	 */
	public void setPromotionsGYF(MoneyTransferPromotionType value) {
		this.promotionsGYF = value;
	}

	/**
	 * Gets the value of the promoDiscountAmount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPromoDiscountAmount() {
		return promoDiscountAmount;
	}

	/**
	 * Sets the value of the promoDiscountAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPromoDiscountAmount(String value) {
		this.promoDiscountAmount = value;
	}

}
