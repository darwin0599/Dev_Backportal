
package com.backoffice.client.validatecustomer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for MoneyTransferType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="MoneyTransferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="expectedPayoutLocationStateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tolls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fixOnSend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageCharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originatorsPrincipalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneDeliveryAvailable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="testQuestionAvailable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeDeliveryService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationPrincipalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expectedPayoutLocationCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="canadianDollarExchangeFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valAcknowledgeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valAddAgentDefinedData" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="valAddCheckAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valAddCheckCashedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valAddCheckNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valAddComplianceDataBuffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valAddComplianceFlagBuffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valAddMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valAddressvalIdatedByAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valAddressVerificationDocumentIssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valAdntlPayeeInfoBuff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valArizonaOperatorFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valArizonaOperatorLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valArizonaOperatorMaternalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valArizonaOperatorPaternalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valComplianceDataBuffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valComplianceFlagBuffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valCountryOfResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valCountyTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valCurrentFX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCustomerTypeAlpha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCustomerTypeNumeric" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valDestinationCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valDestinationState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valDestinationCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codDestinationCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valComplianceComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valDestinationCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valNumeralExchange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valPaidDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valPayAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valRateExchange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valTaxWorksheet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valExpectedActualPayout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valFathersName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateFiling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeFiling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codFiscal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valFormSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valHasId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valHasPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valIdPlaceOfIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valLoyaltyCardUpdateIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idMTCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valMemberOrAssociateToGovernment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valMoneyTransferCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idMoneyTransferKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valMunicipalTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valNewMTCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valNorwegian" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valNumberMatches" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valNumberMessageLines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valOperatorComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valOriginalDestinationCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valOriginalDestinationCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valOriginatingCityLocale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valOriginatingCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valOriginatingState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOriginatingCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valPayIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descPayStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valPayWithoutIDIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valPayoutCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valPayoutCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valPlaceOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valPlusCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valPreferredCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valPrincipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valPromoMessageSet1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valPromotionDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valPromotionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valPromotionSequenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valProofOfEUCitizenship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valReasonForAlternativeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valReceiverSMSFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valRemittanceTradeRelated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valReprintFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valResidentOfOriginCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valSearchParametersBuffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valSecondIDCountryOfIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valSecondIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valSenderSMSFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valSourceIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valSourceIPPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valSourceOfFunds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valStateTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valTemplateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valTestQuestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valTestQuestionResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valThirdIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valThirdPartyAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valThirdPartyCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valThirdPartyCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valThirdPartyCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valThirdPartyFX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valThirdPartyFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valThirdPartyFlagPay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valThirdPartyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valThirdPartyIDCountryOfIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valThirdPartyIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valTransactionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valValutaAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codValuta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valWasResidentPermitProvided" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valGross" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valChargesBuffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valMISCBuffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valForeignExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valForeignSystemReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdPartySender" type="{http://girosyfinanzas.com/schema/DireccionCanales/CustomerType/}CustomerType" minOccurs="0"/>
 *         &lt;element name="sender" type="{http://girosyfinanzas.com/schema/DireccionCanales/CustomerType/}CustomerType" minOccurs="0"/>
 *         &lt;element name="senderCompany" type="{http://girosyfinanzas.com/schema/DireccionCanales/CustomerCompanyType/}CustomerCompanyType" minOccurs="0"/>
 *         &lt;element name="receiver" type="{http://girosyfinanzas.com/schema/DireccionCanales/CustomerType/}CustomerType" minOccurs="0"/>
 *         &lt;element name="receiverCompany" type="{http://girosyfinanzas.com/schema/DireccionCanales/CustomerCompanyType/}CustomerCompanyType" minOccurs="0"/>
 *         &lt;element name="moneyTransferMessage" type="{http://girosyfinanzas.com/schema/DireccionCanales/MoneyTransferMessageType/}MoneyTransferMessageType" minOccurs="0"/>
 *         &lt;element name="promotions" type="{http://girosyfinanzas.com/schema/DireccionCanales/MoneyTransferPromotionType.xsd/}MoneyTransferPromotionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyTransferType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/MoneyTransferType/", propOrder = {
		"expectedPayoutLocationStateCode", "tolls", "fixOnSend", "messageCharge", "originatorsPrincipalAmount",
		"paymentType", "phoneDeliveryAvailable", "testQuestionAvailable", "transactionType", "codeDeliveryService",
		"destinationPrincipalAmount", "expectedPayoutLocationCity", "canadianDollarExchangeFee", "valAcknowledgeFlag",
		"valAddAgentDefinedData", "valAddCheckAmount", "valAddCheckCashedFlag", "valAddCheckNo",
		"valAddComplianceDataBuffer", "valAddComplianceFlagBuffer", "valAddMessage", "valAddressvalIdatedByAgent",
		"valAddressVerificationDocumentIssueDate", "valAdntlPayeeInfoBuff", "valAnswer", "valArizonaOperatorFirstName",
		"valArizonaOperatorLastName", "valArizonaOperatorMaternalName", "valArizonaOperatorPaternalName",
		"valComplianceDataBuffer", "valComplianceFlagBuffer", "valCountryOfResidence", "valCountyTax", "valCurrentFX",
		"codCustomerTypeAlpha", "codCustomerTypeNumeric", "valDestinationCountry", "valDestinationState",
		"valDestinationCity", "codDestinationCurrency", "valComplianceComment", "valDestinationCurrency",
		"valNumeralExchange", "valPaidDateTime", "valPayAmount", "valRateExchange", "valTaxWorksheet",
		"valExpectedActualPayout", "valFathersName", "dateFiling", "timeFiling", "codFiscal", "valFormSerialNumber",
		"valHasId", "valHasPhoneNumber", "descId", "descIdType", "valIdPlaceOfIssue", "valLocation",
		"valLoyaltyCardUpdateIndicator", "idMTCN", "valMemberOrAssociateToGovernment", "valMessage",
		"valMoneyTransferCategory", "idMoneyTransferKey", "valMunicipalTax", "valNewMTCN", "valNorwegian",
		"valNumberMatches", "valNumberMessageLines", "valOperatorComment", "valOriginalDestinationCountry",
		"valOriginalDestinationCurrency", "valOriginatingCityLocale", "valOriginatingCountry", "valOriginatingState",
		"codOriginatingCurrency", "valPayIndicator", "descPayStatus", "valPayWithoutIDIndicator", "valPayoutCountry",
		"valPayoutCurrency", "valPlaceOfBirth", "valPlusCharges", "valPreferredCustomerNo", "valPrincipal",
		"valPromoMessageSet1", "valPromotionDiscountAmount", "valPromotionName", "valPromotionSequenceNo",
		"valProofOfEUCitizenship", "valReasonForAlternativeID", "valReceiverSMSFlag", "valRemittanceTradeRelated",
		"valReprintFlag", "valResidentOfOriginCountry", "valSearchParametersBuffer", "valSecondIDCountryOfIssue",
		"valSecondIDType", "valSenderSMSFlag", "valSourceIPAddress", "valSourceIPPort", "valSourceOfFunds",
		"valStateTax", "valTemplateID", "valTestQuestion", "valTestQuestionResponse", "valThirdIdNumber",
		"valThirdPartyAmount", "valThirdPartyCity", "valThirdPartyCompanyName", "valThirdPartyCountry",
		"valThirdPartyFX", "valThirdPartyFirstName", "valThirdPartyFlagPay", "valThirdPartyID",
		"valThirdPartyIDCountryOfIssue", "valThirdPartyIDType", "valTransactionReason", "valValutaAmount", "codValuta",
		"valWasResidentPermitProvided", "valGross", "valCharges", "valChargesBuffer", "valMISCBuffer",
		"valForeignExchangeRate", "valForeignSystemReferenceNo", "thirdPartySender", "sender", "senderCompany",
		"receiver", "receiverCompany", "moneyTransferMessage", "promotions" })
public class MoneyTransferType {

	protected String expectedPayoutLocationStateCode;
	protected String tolls;
	protected String fixOnSend;
	protected String messageCharge;
	protected String originatorsPrincipalAmount;
	protected String paymentType;
	protected String phoneDeliveryAvailable;
	protected String testQuestionAvailable;
	protected String transactionType;
	protected String codeDeliveryService;
	protected String destinationPrincipalAmount;
	protected String expectedPayoutLocationCity;
	protected String canadianDollarExchangeFee;
	protected String valAcknowledgeFlag;
	protected List<String> valAddAgentDefinedData;
	protected String valAddCheckAmount;
	protected String valAddCheckCashedFlag;
	protected String valAddCheckNo;
	protected String valAddComplianceDataBuffer;
	protected String valAddComplianceFlagBuffer;
	protected String valAddMessage;
	protected String valAddressvalIdatedByAgent;
	protected String valAddressVerificationDocumentIssueDate;
	protected String valAdntlPayeeInfoBuff;
	protected String valAnswer;
	protected String valArizonaOperatorFirstName;
	protected String valArizonaOperatorLastName;
	protected String valArizonaOperatorMaternalName;
	protected String valArizonaOperatorPaternalName;
	protected String valComplianceDataBuffer;
	protected String valComplianceFlagBuffer;
	protected String valCountryOfResidence;
	protected String valCountyTax;
	protected String valCurrentFX;
	protected String codCustomerTypeAlpha;
	protected String codCustomerTypeNumeric;
	protected String valDestinationCountry;
	protected String valDestinationState;
	protected String valDestinationCity;
	protected String codDestinationCurrency;
	protected String valComplianceComment;
	protected String valDestinationCurrency;
	protected String valNumeralExchange;
	protected String valPaidDateTime;
	protected String valPayAmount;
	protected String valRateExchange;
	protected String valTaxWorksheet;
	protected String valExpectedActualPayout;
	protected String valFathersName;
	protected String dateFiling;
	protected String timeFiling;
	protected String codFiscal;
	protected String valFormSerialNumber;
	protected String valHasId;
	protected String valHasPhoneNumber;
	protected String descId;
	protected String descIdType;
	protected String valIdPlaceOfIssue;
	protected String valLocation;
	protected String valLoyaltyCardUpdateIndicator;
	protected String idMTCN;
	protected String valMemberOrAssociateToGovernment;
	protected String valMessage;
	protected String valMoneyTransferCategory;
	protected String idMoneyTransferKey;
	protected String valMunicipalTax;
	protected String valNewMTCN;
	protected String valNorwegian;
	protected String valNumberMatches;
	protected String valNumberMessageLines;
	protected String valOperatorComment;
	protected String valOriginalDestinationCountry;
	protected String valOriginalDestinationCurrency;
	protected String valOriginatingCityLocale;
	protected String valOriginatingCountry;
	protected String valOriginatingState;
	protected String codOriginatingCurrency;
	protected String valPayIndicator;
	protected String descPayStatus;
	protected String valPayWithoutIDIndicator;
	protected String valPayoutCountry;
	protected String valPayoutCurrency;
	protected String valPlaceOfBirth;
	protected String valPlusCharges;
	protected String valPreferredCustomerNo;
	protected String valPrincipal;
	protected String valPromoMessageSet1;
	protected String valPromotionDiscountAmount;
	protected String valPromotionName;
	protected String valPromotionSequenceNo;
	protected String valProofOfEUCitizenship;
	protected String valReasonForAlternativeID;
	protected String valReceiverSMSFlag;
	protected String valRemittanceTradeRelated;
	protected String valReprintFlag;
	protected String valResidentOfOriginCountry;
	protected String valSearchParametersBuffer;
	protected String valSecondIDCountryOfIssue;
	protected String valSecondIDType;
	protected String valSenderSMSFlag;
	protected String valSourceIPAddress;
	protected String valSourceIPPort;
	protected String valSourceOfFunds;
	protected String valStateTax;
	protected String valTemplateID;
	protected String valTestQuestion;
	protected String valTestQuestionResponse;
	protected String valThirdIdNumber;
	protected String valThirdPartyAmount;
	protected String valThirdPartyCity;
	protected String valThirdPartyCompanyName;
	protected String valThirdPartyCountry;
	protected String valThirdPartyFX;
	protected String valThirdPartyFirstName;
	protected String valThirdPartyFlagPay;
	protected String valThirdPartyID;
	protected String valThirdPartyIDCountryOfIssue;
	protected String valThirdPartyIDType;
	protected String valTransactionReason;
	protected String valValutaAmount;
	protected String codValuta;
	protected String valWasResidentPermitProvided;
	protected String valGross;
	protected String valCharges;
	protected String valChargesBuffer;
	protected String valMISCBuffer;
	protected BigDecimal valForeignExchangeRate;
	protected String valForeignSystemReferenceNo;
	protected CustomerType thirdPartySender;
	protected CustomerType sender;
	protected CustomerCompanyType senderCompany;
	protected CustomerType receiver;
	protected CustomerCompanyType receiverCompany;
	protected MoneyTransferMessageType moneyTransferMessage;
	protected MoneyTransferPromotionType promotions;

	/**
	 * Gets the value of the expectedPayoutLocationStateCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExpectedPayoutLocationStateCode() {
		return expectedPayoutLocationStateCode;
	}

	/**
	 * Sets the value of the expectedPayoutLocationStateCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExpectedPayoutLocationStateCode(String value) {
		this.expectedPayoutLocationStateCode = value;
	}

	/**
	 * Gets the value of the tolls property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTolls() {
		return tolls;
	}

	/**
	 * Sets the value of the tolls property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTolls(String value) {
		this.tolls = value;
	}

	/**
	 * Gets the value of the fixOnSend property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFixOnSend() {
		return fixOnSend;
	}

	/**
	 * Sets the value of the fixOnSend property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFixOnSend(String value) {
		this.fixOnSend = value;
	}

	/**
	 * Gets the value of the messageCharge property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMessageCharge() {
		return messageCharge;
	}

	/**
	 * Sets the value of the messageCharge property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMessageCharge(String value) {
		this.messageCharge = value;
	}

	/**
	 * Gets the value of the originatorsPrincipalAmount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOriginatorsPrincipalAmount() {
		return originatorsPrincipalAmount;
	}

	/**
	 * Sets the value of the originatorsPrincipalAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOriginatorsPrincipalAmount(String value) {
		this.originatorsPrincipalAmount = value;
	}

	/**
	 * Gets the value of the paymentType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPaymentType() {
		return paymentType;
	}

	/**
	 * Sets the value of the paymentType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPaymentType(String value) {
		this.paymentType = value;
	}

	/**
	 * Gets the value of the phoneDeliveryAvailable property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPhoneDeliveryAvailable() {
		return phoneDeliveryAvailable;
	}

	/**
	 * Sets the value of the phoneDeliveryAvailable property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPhoneDeliveryAvailable(String value) {
		this.phoneDeliveryAvailable = value;
	}

	/**
	 * Gets the value of the testQuestionAvailable property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTestQuestionAvailable() {
		return testQuestionAvailable;
	}

	/**
	 * Sets the value of the testQuestionAvailable property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTestQuestionAvailable(String value) {
		this.testQuestionAvailable = value;
	}

	/**
	 * Gets the value of the transactionType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTransactionType() {
		return transactionType;
	}

	/**
	 * Sets the value of the transactionType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTransactionType(String value) {
		this.transactionType = value;
	}

	/**
	 * Gets the value of the codeDeliveryService property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodeDeliveryService() {
		return codeDeliveryService;
	}

	/**
	 * Sets the value of the codeDeliveryService property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodeDeliveryService(String value) {
		this.codeDeliveryService = value;
	}

	/**
	 * Gets the value of the destinationPrincipalAmount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDestinationPrincipalAmount() {
		return destinationPrincipalAmount;
	}

	/**
	 * Sets the value of the destinationPrincipalAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDestinationPrincipalAmount(String value) {
		this.destinationPrincipalAmount = value;
	}

	/**
	 * Gets the value of the expectedPayoutLocationCity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExpectedPayoutLocationCity() {
		return expectedPayoutLocationCity;
	}

	/**
	 * Sets the value of the expectedPayoutLocationCity property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExpectedPayoutLocationCity(String value) {
		this.expectedPayoutLocationCity = value;
	}

	/**
	 * Gets the value of the canadianDollarExchangeFee property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCanadianDollarExchangeFee() {
		return canadianDollarExchangeFee;
	}

	/**
	 * Sets the value of the canadianDollarExchangeFee property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCanadianDollarExchangeFee(String value) {
		this.canadianDollarExchangeFee = value;
	}

	/**
	 * Gets the value of the valAcknowledgeFlag property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValAcknowledgeFlag() {
		return valAcknowledgeFlag;
	}

	/**
	 * Sets the value of the valAcknowledgeFlag property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValAcknowledgeFlag(String value) {
		this.valAcknowledgeFlag = value;
	}

	/**
	 * Gets the value of the valAddAgentDefinedData property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the valAddAgentDefinedData property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getValAddAgentDefinedData().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getValAddAgentDefinedData() {
		if (valAddAgentDefinedData == null) {
			valAddAgentDefinedData = new ArrayList<String>();
		}
		return this.valAddAgentDefinedData;
	}

	/**
	 * Gets the value of the valAddCheckAmount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValAddCheckAmount() {
		return valAddCheckAmount;
	}

	/**
	 * Sets the value of the valAddCheckAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValAddCheckAmount(String value) {
		this.valAddCheckAmount = value;
	}

	/**
	 * Gets the value of the valAddCheckCashedFlag property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValAddCheckCashedFlag() {
		return valAddCheckCashedFlag;
	}

	/**
	 * Sets the value of the valAddCheckCashedFlag property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValAddCheckCashedFlag(String value) {
		this.valAddCheckCashedFlag = value;
	}

	/**
	 * Gets the value of the valAddCheckNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValAddCheckNo() {
		return valAddCheckNo;
	}

	/**
	 * Sets the value of the valAddCheckNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValAddCheckNo(String value) {
		this.valAddCheckNo = value;
	}

	/**
	 * Gets the value of the valAddComplianceDataBuffer property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValAddComplianceDataBuffer() {
		return valAddComplianceDataBuffer;
	}

	/**
	 * Sets the value of the valAddComplianceDataBuffer property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValAddComplianceDataBuffer(String value) {
		this.valAddComplianceDataBuffer = value;
	}

	/**
	 * Gets the value of the valAddComplianceFlagBuffer property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValAddComplianceFlagBuffer() {
		return valAddComplianceFlagBuffer;
	}

	/**
	 * Sets the value of the valAddComplianceFlagBuffer property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValAddComplianceFlagBuffer(String value) {
		this.valAddComplianceFlagBuffer = value;
	}

	/**
	 * Gets the value of the valAddMessage property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValAddMessage() {
		return valAddMessage;
	}

	/**
	 * Sets the value of the valAddMessage property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValAddMessage(String value) {
		this.valAddMessage = value;
	}

	/**
	 * Gets the value of the valAddressvalIdatedByAgent property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValAddressvalIdatedByAgent() {
		return valAddressvalIdatedByAgent;
	}

	/**
	 * Sets the value of the valAddressvalIdatedByAgent property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValAddressvalIdatedByAgent(String value) {
		this.valAddressvalIdatedByAgent = value;
	}

	/**
	 * Gets the value of the valAddressVerificationDocumentIssueDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValAddressVerificationDocumentIssueDate() {
		return valAddressVerificationDocumentIssueDate;
	}

	/**
	 * Sets the value of the valAddressVerificationDocumentIssueDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValAddressVerificationDocumentIssueDate(String value) {
		this.valAddressVerificationDocumentIssueDate = value;
	}

	/**
	 * Gets the value of the valAdntlPayeeInfoBuff property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValAdntlPayeeInfoBuff() {
		return valAdntlPayeeInfoBuff;
	}

	/**
	 * Sets the value of the valAdntlPayeeInfoBuff property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValAdntlPayeeInfoBuff(String value) {
		this.valAdntlPayeeInfoBuff = value;
	}

	/**
	 * Gets the value of the valAnswer property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValAnswer() {
		return valAnswer;
	}

	/**
	 * Sets the value of the valAnswer property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValAnswer(String value) {
		this.valAnswer = value;
	}

	/**
	 * Gets the value of the valArizonaOperatorFirstName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValArizonaOperatorFirstName() {
		return valArizonaOperatorFirstName;
	}

	/**
	 * Sets the value of the valArizonaOperatorFirstName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValArizonaOperatorFirstName(String value) {
		this.valArizonaOperatorFirstName = value;
	}

	/**
	 * Gets the value of the valArizonaOperatorLastName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValArizonaOperatorLastName() {
		return valArizonaOperatorLastName;
	}

	/**
	 * Sets the value of the valArizonaOperatorLastName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValArizonaOperatorLastName(String value) {
		this.valArizonaOperatorLastName = value;
	}

	/**
	 * Gets the value of the valArizonaOperatorMaternalName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValArizonaOperatorMaternalName() {
		return valArizonaOperatorMaternalName;
	}

	/**
	 * Sets the value of the valArizonaOperatorMaternalName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValArizonaOperatorMaternalName(String value) {
		this.valArizonaOperatorMaternalName = value;
	}

	/**
	 * Gets the value of the valArizonaOperatorPaternalName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValArizonaOperatorPaternalName() {
		return valArizonaOperatorPaternalName;
	}

	/**
	 * Sets the value of the valArizonaOperatorPaternalName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValArizonaOperatorPaternalName(String value) {
		this.valArizonaOperatorPaternalName = value;
	}

	/**
	 * Gets the value of the valComplianceDataBuffer property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValComplianceDataBuffer() {
		return valComplianceDataBuffer;
	}

	/**
	 * Sets the value of the valComplianceDataBuffer property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValComplianceDataBuffer(String value) {
		this.valComplianceDataBuffer = value;
	}

	/**
	 * Gets the value of the valComplianceFlagBuffer property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValComplianceFlagBuffer() {
		return valComplianceFlagBuffer;
	}

	/**
	 * Sets the value of the valComplianceFlagBuffer property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValComplianceFlagBuffer(String value) {
		this.valComplianceFlagBuffer = value;
	}

	/**
	 * Gets the value of the valCountryOfResidence property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValCountryOfResidence() {
		return valCountryOfResidence;
	}

	/**
	 * Sets the value of the valCountryOfResidence property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValCountryOfResidence(String value) {
		this.valCountryOfResidence = value;
	}

	/**
	 * Gets the value of the valCountyTax property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValCountyTax() {
		return valCountyTax;
	}

	/**
	 * Sets the value of the valCountyTax property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValCountyTax(String value) {
		this.valCountyTax = value;
	}

	/**
	 * Gets the value of the valCurrentFX property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValCurrentFX() {
		return valCurrentFX;
	}

	/**
	 * Sets the value of the valCurrentFX property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValCurrentFX(String value) {
		this.valCurrentFX = value;
	}

	/**
	 * Gets the value of the codCustomerTypeAlpha property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodCustomerTypeAlpha() {
		return codCustomerTypeAlpha;
	}

	/**
	 * Sets the value of the codCustomerTypeAlpha property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodCustomerTypeAlpha(String value) {
		this.codCustomerTypeAlpha = value;
	}

	/**
	 * Gets the value of the codCustomerTypeNumeric property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodCustomerTypeNumeric() {
		return codCustomerTypeNumeric;
	}

	/**
	 * Sets the value of the codCustomerTypeNumeric property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodCustomerTypeNumeric(String value) {
		this.codCustomerTypeNumeric = value;
	}

	/**
	 * Gets the value of the valDestinationCountry property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValDestinationCountry() {
		return valDestinationCountry;
	}

	/**
	 * Sets the value of the valDestinationCountry property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValDestinationCountry(String value) {
		this.valDestinationCountry = value;
	}

	/**
	 * Gets the value of the valDestinationState property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValDestinationState() {
		return valDestinationState;
	}

	/**
	 * Sets the value of the valDestinationState property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValDestinationState(String value) {
		this.valDestinationState = value;
	}

	/**
	 * Gets the value of the valDestinationCity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValDestinationCity() {
		return valDestinationCity;
	}

	/**
	 * Sets the value of the valDestinationCity property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValDestinationCity(String value) {
		this.valDestinationCity = value;
	}

	/**
	 * Gets the value of the codDestinationCurrency property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodDestinationCurrency() {
		return codDestinationCurrency;
	}

	/**
	 * Sets the value of the codDestinationCurrency property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodDestinationCurrency(String value) {
		this.codDestinationCurrency = value;
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
	 * Gets the value of the valDestinationCurrency property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValDestinationCurrency() {
		return valDestinationCurrency;
	}

	/**
	 * Sets the value of the valDestinationCurrency property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValDestinationCurrency(String value) {
		this.valDestinationCurrency = value;
	}

	/**
	 * Gets the value of the valNumeralExchange property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValNumeralExchange() {
		return valNumeralExchange;
	}

	/**
	 * Sets the value of the valNumeralExchange property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValNumeralExchange(String value) {
		this.valNumeralExchange = value;
	}

	/**
	 * Gets the value of the valPaidDateTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValPaidDateTime() {
		return valPaidDateTime;
	}

	/**
	 * Sets the value of the valPaidDateTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValPaidDateTime(String value) {
		this.valPaidDateTime = value;
	}

	/**
	 * Gets the value of the valPayAmount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValPayAmount() {
		return valPayAmount;
	}

	/**
	 * Sets the value of the valPayAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValPayAmount(String value) {
		this.valPayAmount = value;
	}

	/**
	 * Gets the value of the valRateExchange property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValRateExchange() {
		return valRateExchange;
	}

	/**
	 * Sets the value of the valRateExchange property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValRateExchange(String value) {
		this.valRateExchange = value;
	}

	/**
	 * Gets the value of the valTaxWorksheet property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValTaxWorksheet() {
		return valTaxWorksheet;
	}

	/**
	 * Sets the value of the valTaxWorksheet property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValTaxWorksheet(String value) {
		this.valTaxWorksheet = value;
	}

	/**
	 * Gets the value of the valExpectedActualPayout property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValExpectedActualPayout() {
		return valExpectedActualPayout;
	}

	/**
	 * Sets the value of the valExpectedActualPayout property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValExpectedActualPayout(String value) {
		this.valExpectedActualPayout = value;
	}

	/**
	 * Gets the value of the valFathersName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValFathersName() {
		return valFathersName;
	}

	/**
	 * Sets the value of the valFathersName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValFathersName(String value) {
		this.valFathersName = value;
	}

	/**
	 * Gets the value of the dateFiling property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDateFiling() {
		return dateFiling;
	}

	/**
	 * Sets the value of the dateFiling property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDateFiling(String value) {
		this.dateFiling = value;
	}

	/**
	 * Gets the value of the timeFiling property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTimeFiling() {
		return timeFiling;
	}

	/**
	 * Sets the value of the timeFiling property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTimeFiling(String value) {
		this.timeFiling = value;
	}

	/**
	 * Gets the value of the codFiscal property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodFiscal() {
		return codFiscal;
	}

	/**
	 * Sets the value of the codFiscal property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodFiscal(String value) {
		this.codFiscal = value;
	}

	/**
	 * Gets the value of the valFormSerialNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValFormSerialNumber() {
		return valFormSerialNumber;
	}

	/**
	 * Sets the value of the valFormSerialNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValFormSerialNumber(String value) {
		this.valFormSerialNumber = value;
	}

	/**
	 * Gets the value of the valHasId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValHasId() {
		return valHasId;
	}

	/**
	 * Sets the value of the valHasId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValHasId(String value) {
		this.valHasId = value;
	}

	/**
	 * Gets the value of the valHasPhoneNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValHasPhoneNumber() {
		return valHasPhoneNumber;
	}

	/**
	 * Sets the value of the valHasPhoneNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValHasPhoneNumber(String value) {
		this.valHasPhoneNumber = value;
	}

	/**
	 * Gets the value of the descId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescId() {
		return descId;
	}

	/**
	 * Sets the value of the descId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescId(String value) {
		this.descId = value;
	}

	/**
	 * Gets the value of the descIdType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescIdType() {
		return descIdType;
	}

	/**
	 * Sets the value of the descIdType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescIdType(String value) {
		this.descIdType = value;
	}

	/**
	 * Gets the value of the valIdPlaceOfIssue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValIdPlaceOfIssue() {
		return valIdPlaceOfIssue;
	}

	/**
	 * Sets the value of the valIdPlaceOfIssue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValIdPlaceOfIssue(String value) {
		this.valIdPlaceOfIssue = value;
	}

	/**
	 * Gets the value of the valLocation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValLocation() {
		return valLocation;
	}

	/**
	 * Sets the value of the valLocation property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValLocation(String value) {
		this.valLocation = value;
	}

	/**
	 * Gets the value of the valLoyaltyCardUpdateIndicator property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValLoyaltyCardUpdateIndicator() {
		return valLoyaltyCardUpdateIndicator;
	}

	/**
	 * Sets the value of the valLoyaltyCardUpdateIndicator property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValLoyaltyCardUpdateIndicator(String value) {
		this.valLoyaltyCardUpdateIndicator = value;
	}

	/**
	 * Gets the value of the idMTCN property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdMTCN() {
		return idMTCN;
	}

	/**
	 * Sets the value of the idMTCN property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdMTCN(String value) {
		this.idMTCN = value;
	}

	/**
	 * Gets the value of the valMemberOrAssociateToGovernment property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValMemberOrAssociateToGovernment() {
		return valMemberOrAssociateToGovernment;
	}

	/**
	 * Sets the value of the valMemberOrAssociateToGovernment property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValMemberOrAssociateToGovernment(String value) {
		this.valMemberOrAssociateToGovernment = value;
	}

	/**
	 * Gets the value of the valMessage property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValMessage() {
		return valMessage;
	}

	/**
	 * Sets the value of the valMessage property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValMessage(String value) {
		this.valMessage = value;
	}

	/**
	 * Gets the value of the valMoneyTransferCategory property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValMoneyTransferCategory() {
		return valMoneyTransferCategory;
	}

	/**
	 * Sets the value of the valMoneyTransferCategory property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValMoneyTransferCategory(String value) {
		this.valMoneyTransferCategory = value;
	}

	/**
	 * Gets the value of the idMoneyTransferKey property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdMoneyTransferKey() {
		return idMoneyTransferKey;
	}

	/**
	 * Sets the value of the idMoneyTransferKey property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdMoneyTransferKey(String value) {
		this.idMoneyTransferKey = value;
	}

	/**
	 * Gets the value of the valMunicipalTax property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValMunicipalTax() {
		return valMunicipalTax;
	}

	/**
	 * Sets the value of the valMunicipalTax property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValMunicipalTax(String value) {
		this.valMunicipalTax = value;
	}

	/**
	 * Gets the value of the valNewMTCN property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValNewMTCN() {
		return valNewMTCN;
	}

	/**
	 * Sets the value of the valNewMTCN property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValNewMTCN(String value) {
		this.valNewMTCN = value;
	}

	/**
	 * Gets the value of the valNorwegian property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValNorwegian() {
		return valNorwegian;
	}

	/**
	 * Sets the value of the valNorwegian property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValNorwegian(String value) {
		this.valNorwegian = value;
	}

	/**
	 * Gets the value of the valNumberMatches property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValNumberMatches() {
		return valNumberMatches;
	}

	/**
	 * Sets the value of the valNumberMatches property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValNumberMatches(String value) {
		this.valNumberMatches = value;
	}

	/**
	 * Gets the value of the valNumberMessageLines property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValNumberMessageLines() {
		return valNumberMessageLines;
	}

	/**
	 * Sets the value of the valNumberMessageLines property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValNumberMessageLines(String value) {
		this.valNumberMessageLines = value;
	}

	/**
	 * Gets the value of the valOperatorComment property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValOperatorComment() {
		return valOperatorComment;
	}

	/**
	 * Sets the value of the valOperatorComment property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValOperatorComment(String value) {
		this.valOperatorComment = value;
	}

	/**
	 * Gets the value of the valOriginalDestinationCountry property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValOriginalDestinationCountry() {
		return valOriginalDestinationCountry;
	}

	/**
	 * Sets the value of the valOriginalDestinationCountry property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValOriginalDestinationCountry(String value) {
		this.valOriginalDestinationCountry = value;
	}

	/**
	 * Gets the value of the valOriginalDestinationCurrency property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValOriginalDestinationCurrency() {
		return valOriginalDestinationCurrency;
	}

	/**
	 * Sets the value of the valOriginalDestinationCurrency property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValOriginalDestinationCurrency(String value) {
		this.valOriginalDestinationCurrency = value;
	}

	/**
	 * Gets the value of the valOriginatingCityLocale property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValOriginatingCityLocale() {
		return valOriginatingCityLocale;
	}

	/**
	 * Sets the value of the valOriginatingCityLocale property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValOriginatingCityLocale(String value) {
		this.valOriginatingCityLocale = value;
	}

	/**
	 * Gets the value of the valOriginatingCountry property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValOriginatingCountry() {
		return valOriginatingCountry;
	}

	/**
	 * Sets the value of the valOriginatingCountry property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValOriginatingCountry(String value) {
		this.valOriginatingCountry = value;
	}

	/**
	 * Gets the value of the valOriginatingState property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValOriginatingState() {
		return valOriginatingState;
	}

	/**
	 * Sets the value of the valOriginatingState property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValOriginatingState(String value) {
		this.valOriginatingState = value;
	}

	/**
	 * Gets the value of the codOriginatingCurrency property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodOriginatingCurrency() {
		return codOriginatingCurrency;
	}

	/**
	 * Sets the value of the codOriginatingCurrency property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodOriginatingCurrency(String value) {
		this.codOriginatingCurrency = value;
	}

	/**
	 * Gets the value of the valPayIndicator property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValPayIndicator() {
		return valPayIndicator;
	}

	/**
	 * Sets the value of the valPayIndicator property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValPayIndicator(String value) {
		this.valPayIndicator = value;
	}

	/**
	 * Gets the value of the descPayStatus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescPayStatus() {
		return descPayStatus;
	}

	/**
	 * Sets the value of the descPayStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescPayStatus(String value) {
		this.descPayStatus = value;
	}

	/**
	 * Gets the value of the valPayWithoutIDIndicator property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValPayWithoutIDIndicator() {
		return valPayWithoutIDIndicator;
	}

	/**
	 * Sets the value of the valPayWithoutIDIndicator property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValPayWithoutIDIndicator(String value) {
		this.valPayWithoutIDIndicator = value;
	}

	/**
	 * Gets the value of the valPayoutCountry property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValPayoutCountry() {
		return valPayoutCountry;
	}

	/**
	 * Sets the value of the valPayoutCountry property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValPayoutCountry(String value) {
		this.valPayoutCountry = value;
	}

	/**
	 * Gets the value of the valPayoutCurrency property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValPayoutCurrency() {
		return valPayoutCurrency;
	}

	/**
	 * Sets the value of the valPayoutCurrency property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValPayoutCurrency(String value) {
		this.valPayoutCurrency = value;
	}

	/**
	 * Gets the value of the valPlaceOfBirth property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValPlaceOfBirth() {
		return valPlaceOfBirth;
	}

	/**
	 * Sets the value of the valPlaceOfBirth property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValPlaceOfBirth(String value) {
		this.valPlaceOfBirth = value;
	}

	/**
	 * Gets the value of the valPlusCharges property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValPlusCharges() {
		return valPlusCharges;
	}

	/**
	 * Sets the value of the valPlusCharges property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValPlusCharges(String value) {
		this.valPlusCharges = value;
	}

	/**
	 * Gets the value of the valPreferredCustomerNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValPreferredCustomerNo() {
		return valPreferredCustomerNo;
	}

	/**
	 * Sets the value of the valPreferredCustomerNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValPreferredCustomerNo(String value) {
		this.valPreferredCustomerNo = value;
	}

	/**
	 * Gets the value of the valPrincipal property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValPrincipal() {
		return valPrincipal;
	}

	/**
	 * Sets the value of the valPrincipal property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValPrincipal(String value) {
		this.valPrincipal = value;
	}

	/**
	 * Gets the value of the valPromoMessageSet1 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValPromoMessageSet1() {
		return valPromoMessageSet1;
	}

	/**
	 * Sets the value of the valPromoMessageSet1 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValPromoMessageSet1(String value) {
		this.valPromoMessageSet1 = value;
	}

	/**
	 * Gets the value of the valPromotionDiscountAmount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValPromotionDiscountAmount() {
		return valPromotionDiscountAmount;
	}

	/**
	 * Sets the value of the valPromotionDiscountAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValPromotionDiscountAmount(String value) {
		this.valPromotionDiscountAmount = value;
	}

	/**
	 * Gets the value of the valPromotionName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValPromotionName() {
		return valPromotionName;
	}

	/**
	 * Sets the value of the valPromotionName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValPromotionName(String value) {
		this.valPromotionName = value;
	}

	/**
	 * Gets the value of the valPromotionSequenceNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValPromotionSequenceNo() {
		return valPromotionSequenceNo;
	}

	/**
	 * Sets the value of the valPromotionSequenceNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValPromotionSequenceNo(String value) {
		this.valPromotionSequenceNo = value;
	}

	/**
	 * Gets the value of the valProofOfEUCitizenship property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValProofOfEUCitizenship() {
		return valProofOfEUCitizenship;
	}

	/**
	 * Sets the value of the valProofOfEUCitizenship property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValProofOfEUCitizenship(String value) {
		this.valProofOfEUCitizenship = value;
	}

	/**
	 * Gets the value of the valReasonForAlternativeID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValReasonForAlternativeID() {
		return valReasonForAlternativeID;
	}

	/**
	 * Sets the value of the valReasonForAlternativeID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValReasonForAlternativeID(String value) {
		this.valReasonForAlternativeID = value;
	}

	/**
	 * Gets the value of the valReceiverSMSFlag property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValReceiverSMSFlag() {
		return valReceiverSMSFlag;
	}

	/**
	 * Sets the value of the valReceiverSMSFlag property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValReceiverSMSFlag(String value) {
		this.valReceiverSMSFlag = value;
	}

	/**
	 * Gets the value of the valRemittanceTradeRelated property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValRemittanceTradeRelated() {
		return valRemittanceTradeRelated;
	}

	/**
	 * Sets the value of the valRemittanceTradeRelated property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValRemittanceTradeRelated(String value) {
		this.valRemittanceTradeRelated = value;
	}

	/**
	 * Gets the value of the valReprintFlag property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValReprintFlag() {
		return valReprintFlag;
	}

	/**
	 * Sets the value of the valReprintFlag property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValReprintFlag(String value) {
		this.valReprintFlag = value;
	}

	/**
	 * Gets the value of the valResidentOfOriginCountry property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValResidentOfOriginCountry() {
		return valResidentOfOriginCountry;
	}

	/**
	 * Sets the value of the valResidentOfOriginCountry property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValResidentOfOriginCountry(String value) {
		this.valResidentOfOriginCountry = value;
	}

	/**
	 * Gets the value of the valSearchParametersBuffer property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValSearchParametersBuffer() {
		return valSearchParametersBuffer;
	}

	/**
	 * Sets the value of the valSearchParametersBuffer property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValSearchParametersBuffer(String value) {
		this.valSearchParametersBuffer = value;
	}

	/**
	 * Gets the value of the valSecondIDCountryOfIssue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValSecondIDCountryOfIssue() {
		return valSecondIDCountryOfIssue;
	}

	/**
	 * Sets the value of the valSecondIDCountryOfIssue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValSecondIDCountryOfIssue(String value) {
		this.valSecondIDCountryOfIssue = value;
	}

	/**
	 * Gets the value of the valSecondIDType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValSecondIDType() {
		return valSecondIDType;
	}

	/**
	 * Sets the value of the valSecondIDType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValSecondIDType(String value) {
		this.valSecondIDType = value;
	}

	/**
	 * Gets the value of the valSenderSMSFlag property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValSenderSMSFlag() {
		return valSenderSMSFlag;
	}

	/**
	 * Sets the value of the valSenderSMSFlag property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValSenderSMSFlag(String value) {
		this.valSenderSMSFlag = value;
	}

	/**
	 * Gets the value of the valSourceIPAddress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValSourceIPAddress() {
		return valSourceIPAddress;
	}

	/**
	 * Sets the value of the valSourceIPAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValSourceIPAddress(String value) {
		this.valSourceIPAddress = value;
	}

	/**
	 * Gets the value of the valSourceIPPort property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValSourceIPPort() {
		return valSourceIPPort;
	}

	/**
	 * Sets the value of the valSourceIPPort property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValSourceIPPort(String value) {
		this.valSourceIPPort = value;
	}

	/**
	 * Gets the value of the valSourceOfFunds property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValSourceOfFunds() {
		return valSourceOfFunds;
	}

	/**
	 * Sets the value of the valSourceOfFunds property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValSourceOfFunds(String value) {
		this.valSourceOfFunds = value;
	}

	/**
	 * Gets the value of the valStateTax property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValStateTax() {
		return valStateTax;
	}

	/**
	 * Sets the value of the valStateTax property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValStateTax(String value) {
		this.valStateTax = value;
	}

	/**
	 * Gets the value of the valTemplateID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValTemplateID() {
		return valTemplateID;
	}

	/**
	 * Sets the value of the valTemplateID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValTemplateID(String value) {
		this.valTemplateID = value;
	}

	/**
	 * Gets the value of the valTestQuestion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValTestQuestion() {
		return valTestQuestion;
	}

	/**
	 * Sets the value of the valTestQuestion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValTestQuestion(String value) {
		this.valTestQuestion = value;
	}

	/**
	 * Gets the value of the valTestQuestionResponse property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValTestQuestionResponse() {
		return valTestQuestionResponse;
	}

	/**
	 * Sets the value of the valTestQuestionResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValTestQuestionResponse(String value) {
		this.valTestQuestionResponse = value;
	}

	/**
	 * Gets the value of the valThirdIdNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValThirdIdNumber() {
		return valThirdIdNumber;
	}

	/**
	 * Sets the value of the valThirdIdNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValThirdIdNumber(String value) {
		this.valThirdIdNumber = value;
	}

	/**
	 * Gets the value of the valThirdPartyAmount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValThirdPartyAmount() {
		return valThirdPartyAmount;
	}

	/**
	 * Sets the value of the valThirdPartyAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValThirdPartyAmount(String value) {
		this.valThirdPartyAmount = value;
	}

	/**
	 * Gets the value of the valThirdPartyCity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValThirdPartyCity() {
		return valThirdPartyCity;
	}

	/**
	 * Sets the value of the valThirdPartyCity property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValThirdPartyCity(String value) {
		this.valThirdPartyCity = value;
	}

	/**
	 * Gets the value of the valThirdPartyCompanyName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValThirdPartyCompanyName() {
		return valThirdPartyCompanyName;
	}

	/**
	 * Sets the value of the valThirdPartyCompanyName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValThirdPartyCompanyName(String value) {
		this.valThirdPartyCompanyName = value;
	}

	/**
	 * Gets the value of the valThirdPartyCountry property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValThirdPartyCountry() {
		return valThirdPartyCountry;
	}

	/**
	 * Sets the value of the valThirdPartyCountry property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValThirdPartyCountry(String value) {
		this.valThirdPartyCountry = value;
	}

	/**
	 * Gets the value of the valThirdPartyFX property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValThirdPartyFX() {
		return valThirdPartyFX;
	}

	/**
	 * Sets the value of the valThirdPartyFX property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValThirdPartyFX(String value) {
		this.valThirdPartyFX = value;
	}

	/**
	 * Gets the value of the valThirdPartyFirstName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValThirdPartyFirstName() {
		return valThirdPartyFirstName;
	}

	/**
	 * Sets the value of the valThirdPartyFirstName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValThirdPartyFirstName(String value) {
		this.valThirdPartyFirstName = value;
	}

	/**
	 * Gets the value of the valThirdPartyFlagPay property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValThirdPartyFlagPay() {
		return valThirdPartyFlagPay;
	}

	/**
	 * Sets the value of the valThirdPartyFlagPay property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValThirdPartyFlagPay(String value) {
		this.valThirdPartyFlagPay = value;
	}

	/**
	 * Gets the value of the valThirdPartyID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValThirdPartyID() {
		return valThirdPartyID;
	}

	/**
	 * Sets the value of the valThirdPartyID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValThirdPartyID(String value) {
		this.valThirdPartyID = value;
	}

	/**
	 * Gets the value of the valThirdPartyIDCountryOfIssue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValThirdPartyIDCountryOfIssue() {
		return valThirdPartyIDCountryOfIssue;
	}

	/**
	 * Sets the value of the valThirdPartyIDCountryOfIssue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValThirdPartyIDCountryOfIssue(String value) {
		this.valThirdPartyIDCountryOfIssue = value;
	}

	/**
	 * Gets the value of the valThirdPartyIDType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValThirdPartyIDType() {
		return valThirdPartyIDType;
	}

	/**
	 * Sets the value of the valThirdPartyIDType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValThirdPartyIDType(String value) {
		this.valThirdPartyIDType = value;
	}

	/**
	 * Gets the value of the valTransactionReason property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValTransactionReason() {
		return valTransactionReason;
	}

	/**
	 * Sets the value of the valTransactionReason property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValTransactionReason(String value) {
		this.valTransactionReason = value;
	}

	/**
	 * Gets the value of the valValutaAmount property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValValutaAmount() {
		return valValutaAmount;
	}

	/**
	 * Sets the value of the valValutaAmount property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValValutaAmount(String value) {
		this.valValutaAmount = value;
	}

	/**
	 * Gets the value of the codValuta property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodValuta() {
		return codValuta;
	}

	/**
	 * Sets the value of the codValuta property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodValuta(String value) {
		this.codValuta = value;
	}

	/**
	 * Gets the value of the valWasResidentPermitProvided property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValWasResidentPermitProvided() {
		return valWasResidentPermitProvided;
	}

	/**
	 * Sets the value of the valWasResidentPermitProvided property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValWasResidentPermitProvided(String value) {
		this.valWasResidentPermitProvided = value;
	}

	/**
	 * Gets the value of the valGross property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValGross() {
		return valGross;
	}

	/**
	 * Sets the value of the valGross property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValGross(String value) {
		this.valGross = value;
	}

	/**
	 * Gets the value of the valCharges property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValCharges() {
		return valCharges;
	}

	/**
	 * Sets the value of the valCharges property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValCharges(String value) {
		this.valCharges = value;
	}

	/**
	 * Gets the value of the valChargesBuffer property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValChargesBuffer() {
		return valChargesBuffer;
	}

	/**
	 * Sets the value of the valChargesBuffer property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValChargesBuffer(String value) {
		this.valChargesBuffer = value;
	}

	/**
	 * Gets the value of the valMISCBuffer property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValMISCBuffer() {
		return valMISCBuffer;
	}

	/**
	 * Sets the value of the valMISCBuffer property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValMISCBuffer(String value) {
		this.valMISCBuffer = value;
	}

	/**
	 * Gets the value of the valForeignExchangeRate property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getValForeignExchangeRate() {
		return valForeignExchangeRate;
	}

	/**
	 * Sets the value of the valForeignExchangeRate property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setValForeignExchangeRate(BigDecimal value) {
		this.valForeignExchangeRate = value;
	}

	/**
	 * Gets the value of the valForeignSystemReferenceNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValForeignSystemReferenceNo() {
		return valForeignSystemReferenceNo;
	}

	/**
	 * Sets the value of the valForeignSystemReferenceNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValForeignSystemReferenceNo(String value) {
		this.valForeignSystemReferenceNo = value;
	}

	/**
	 * Gets the value of the thirdPartySender property.
	 * 
	 * @return possible object is {@link CustomerType }
	 * 
	 */
	public CustomerType getThirdPartySender() {
		return thirdPartySender;
	}

	/**
	 * Sets the value of the thirdPartySender property.
	 * 
	 * @param value
	 *            allowed object is {@link CustomerType }
	 * 
	 */
	public void setThirdPartySender(CustomerType value) {
		this.thirdPartySender = value;
	}

	/**
	 * Gets the value of the sender property.
	 * 
	 * @return possible object is {@link CustomerType }
	 * 
	 */
	public CustomerType getSender() {
		return sender;
	}

	/**
	 * Sets the value of the sender property.
	 * 
	 * @param value
	 *            allowed object is {@link CustomerType }
	 * 
	 */
	public void setSender(CustomerType value) {
		this.sender = value;
	}

	/**
	 * Gets the value of the senderCompany property.
	 * 
	 * @return possible object is {@link CustomerCompanyType }
	 * 
	 */
	public CustomerCompanyType getSenderCompany() {
		return senderCompany;
	}

	/**
	 * Sets the value of the senderCompany property.
	 * 
	 * @param value
	 *            allowed object is {@link CustomerCompanyType }
	 * 
	 */
	public void setSenderCompany(CustomerCompanyType value) {
		this.senderCompany = value;
	}

	/**
	 * Gets the value of the receiver property.
	 * 
	 * @return possible object is {@link CustomerType }
	 * 
	 */
	public CustomerType getReceiver() {
		return receiver;
	}

	/**
	 * Sets the value of the receiver property.
	 * 
	 * @param value
	 *            allowed object is {@link CustomerType }
	 * 
	 */
	public void setReceiver(CustomerType value) {
		this.receiver = value;
	}

	/**
	 * Gets the value of the receiverCompany property.
	 * 
	 * @return possible object is {@link CustomerCompanyType }
	 * 
	 */
	public CustomerCompanyType getReceiverCompany() {
		return receiverCompany;
	}

	/**
	 * Sets the value of the receiverCompany property.
	 * 
	 * @param value
	 *            allowed object is {@link CustomerCompanyType }
	 * 
	 */
	public void setReceiverCompany(CustomerCompanyType value) {
		this.receiverCompany = value;
	}

	/**
	 * Gets the value of the moneyTransferMessage property.
	 * 
	 * @return possible object is {@link MoneyTransferMessageType }
	 * 
	 */
	public MoneyTransferMessageType getMoneyTransferMessage() {
		return moneyTransferMessage;
	}

	/**
	 * Sets the value of the moneyTransferMessage property.
	 * 
	 * @param value
	 *            allowed object is {@link MoneyTransferMessageType }
	 * 
	 */
	public void setMoneyTransferMessage(MoneyTransferMessageType value) {
		this.moneyTransferMessage = value;
	}

	/**
	 * Gets the value of the promotions property.
	 * 
	 * @return possible object is {@link MoneyTransferPromotionType }
	 * 
	 */
	public MoneyTransferPromotionType getPromotions() {
		return promotions;
	}

	/**
	 * Sets the value of the promotions property.
	 * 
	 * @param value
	 *            allowed object is {@link MoneyTransferPromotionType }
	 * 
	 */
	public void setPromotions(MoneyTransferPromotionType value) {
		this.promotions = value;
	}

}
