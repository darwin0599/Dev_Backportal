
package com.backoffice.client.validatecustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for MoneyTransferPromotionType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="MoneyTransferPromotionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aspplyDiscountForPromo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="couponPromotions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoSequenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotionError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="redemptionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="redemptionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderPromoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyTransferPromotionType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/MoneyTransferPromotionType.xsd/", propOrder = {
		"aspplyDiscountForPromo", "couponPromotions", "promoCodeDescription", "promoDiscountAmount", "promoMessage",
		"promoName", "promoSequenceNo", "promoText", "promotionDescription", "promotionError", "redemptionType",
		"redemptionValue", "senderPromoCode" })
public class MoneyTransferPromotionType {

	protected String aspplyDiscountForPromo;
	protected String couponPromotions;
	protected String promoCodeDescription;
	protected String promoDiscountAmount;
	protected String promoMessage;
	protected String promoName;
	protected String promoSequenceNo;
	protected String promoText;
	protected String promotionDescription;
	protected String promotionError;
	protected String redemptionType;
	protected String redemptionValue;
	protected String senderPromoCode;

	/**
	 * Gets the value of the aspplyDiscountForPromo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAspplyDiscountForPromo() {
		return aspplyDiscountForPromo;
	}

	/**
	 * Sets the value of the aspplyDiscountForPromo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAspplyDiscountForPromo(String value) {
		this.aspplyDiscountForPromo = value;
	}

	/**
	 * Gets the value of the couponPromotions property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCouponPromotions() {
		return couponPromotions;
	}

	/**
	 * Sets the value of the couponPromotions property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCouponPromotions(String value) {
		this.couponPromotions = value;
	}

	/**
	 * Gets the value of the promoCodeDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPromoCodeDescription() {
		return promoCodeDescription;
	}

	/**
	 * Sets the value of the promoCodeDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPromoCodeDescription(String value) {
		this.promoCodeDescription = value;
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

	/**
	 * Gets the value of the promoMessage property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPromoMessage() {
		return promoMessage;
	}

	/**
	 * Sets the value of the promoMessage property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPromoMessage(String value) {
		this.promoMessage = value;
	}

	/**
	 * Gets the value of the promoName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPromoName() {
		return promoName;
	}

	/**
	 * Sets the value of the promoName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPromoName(String value) {
		this.promoName = value;
	}

	/**
	 * Gets the value of the promoSequenceNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPromoSequenceNo() {
		return promoSequenceNo;
	}

	/**
	 * Sets the value of the promoSequenceNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPromoSequenceNo(String value) {
		this.promoSequenceNo = value;
	}

	/**
	 * Gets the value of the promoText property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPromoText() {
		return promoText;
	}

	/**
	 * Sets the value of the promoText property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPromoText(String value) {
		this.promoText = value;
	}

	/**
	 * Gets the value of the promotionDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPromotionDescription() {
		return promotionDescription;
	}

	/**
	 * Sets the value of the promotionDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPromotionDescription(String value) {
		this.promotionDescription = value;
	}

	/**
	 * Gets the value of the promotionError property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPromotionError() {
		return promotionError;
	}

	/**
	 * Sets the value of the promotionError property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPromotionError(String value) {
		this.promotionError = value;
	}

	/**
	 * Gets the value of the redemptionType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRedemptionType() {
		return redemptionType;
	}

	/**
	 * Sets the value of the redemptionType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRedemptionType(String value) {
		this.redemptionType = value;
	}

	/**
	 * Gets the value of the redemptionValue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRedemptionValue() {
		return redemptionValue;
	}

	/**
	 * Sets the value of the redemptionValue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRedemptionValue(String value) {
		this.redemptionValue = value;
	}

	/**
	 * Gets the value of the senderPromoCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSenderPromoCode() {
		return senderPromoCode;
	}

	/**
	 * Sets the value of the senderPromoCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSenderPromoCode(String value) {
		this.senderPromoCode = value;
	}

}
