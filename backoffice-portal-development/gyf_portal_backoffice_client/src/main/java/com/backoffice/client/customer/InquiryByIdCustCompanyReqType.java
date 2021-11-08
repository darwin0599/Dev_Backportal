
package com.backoffice.client.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for InquiryByIdCustCompanyReqType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="InquiryByIdCustCompanyReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextTransaction" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextTransactionType/}ContextTransactionType"/>
 *         &lt;element name="codIdTypeCustCompany" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idCustomerCompany" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InquiryByIdCustCompanyReqType", propOrder = { "contextTransaction", "codIdTypeCustCompany",
		"idCustomerCompany" })
public class InquiryByIdCustCompanyReqType {

	@XmlElement(required = true)
	protected ContextTransactionType contextTransaction;
	@XmlElement(required = true)
	protected String codIdTypeCustCompany;
	@XmlElement(required = true)
	protected String idCustomerCompany;

	/**
	 * Gets the value of the contextTransaction property.
	 * 
	 * @return possible object is {@link ContextTransactionType }
	 * 
	 */
	public ContextTransactionType getContextTransaction() {
		return contextTransaction;
	}

	/**
	 * Sets the value of the contextTransaction property.
	 * 
	 * @param value
	 *            allowed object is {@link ContextTransactionType }
	 * 
	 */
	public void setContextTransaction(ContextTransactionType value) {
		this.contextTransaction = value;
	}

	/**
	 * Gets the value of the codIdTypeCustCompany property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodIdTypeCustCompany() {
		return codIdTypeCustCompany;
	}

	/**
	 * Sets the value of the codIdTypeCustCompany property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodIdTypeCustCompany(String value) {
		this.codIdTypeCustCompany = value;
	}

	/**
	 * Gets the value of the idCustomerCompany property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdCustomerCompany() {
		return idCustomerCompany;
	}

	/**
	 * Sets the value of the idCustomerCompany property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdCustomerCompany(String value) {
		this.idCustomerCompany = value;
	}

}
