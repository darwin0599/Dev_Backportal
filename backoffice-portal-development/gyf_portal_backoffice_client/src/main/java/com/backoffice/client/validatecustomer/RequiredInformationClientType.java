
package com.backoffice.client.validatecustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for RequiredInformationClientType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="RequiredInformationClientType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informationalText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requieresReceiverDocuments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="requiresSIO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="requieresSenderDocuments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cashOpetarionForm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="codeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="questionsAnswersForm" type="{http://girosyfinanzas.com/schema/DireccionCanales/RequiredInformationClientType/}QuestionsAnswersFormType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredInformationClientType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/RequiredInformationClientType/", propOrder = {
		"informationalText", "requieresReceiverDocuments", "requiresSIO", "requieresSenderDocuments",
		"cashOpetarionForm", "codeText", "questionsAnswersForm" })
public class RequiredInformationClientType {

	protected String informationalText;
	protected Boolean requieresReceiverDocuments;
	protected Boolean requiresSIO;
	protected Boolean requieresSenderDocuments;
	protected Boolean cashOpetarionForm;
	protected String codeText;
	protected QuestionsAnswersFormType questionsAnswersForm;

	/**
	 * Gets the value of the informationalText property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInformationalText() {
		return informationalText;
	}

	/**
	 * Sets the value of the informationalText property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInformationalText(String value) {
		this.informationalText = value;
	}

	/**
	 * Gets the value of the requieresReceiverDocuments property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isRequieresReceiverDocuments() {
		return requieresReceiverDocuments;
	}

	/**
	 * Sets the value of the requieresReceiverDocuments property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setRequieresReceiverDocuments(Boolean value) {
		this.requieresReceiverDocuments = value;
	}

	/**
	 * Gets the value of the requiresSIO property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isRequiresSIO() {
		return requiresSIO;
	}

	/**
	 * Sets the value of the requiresSIO property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setRequiresSIO(Boolean value) {
		this.requiresSIO = value;
	}

	/**
	 * Gets the value of the requieresSenderDocuments property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isRequieresSenderDocuments() {
		return requieresSenderDocuments;
	}

	/**
	 * Sets the value of the requieresSenderDocuments property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setRequieresSenderDocuments(Boolean value) {
		this.requieresSenderDocuments = value;
	}

	/**
	 * Gets the value of the cashOpetarionForm property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isCashOpetarionForm() {
		return cashOpetarionForm;
	}

	/**
	 * Sets the value of the cashOpetarionForm property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setCashOpetarionForm(Boolean value) {
		this.cashOpetarionForm = value;
	}

	/**
	 * Gets the value of the codeText property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodeText() {
		return codeText;
	}

	/**
	 * Sets the value of the codeText property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodeText(String value) {
		this.codeText = value;
	}

	/**
	 * Gets the value of the questionsAnswersForm property.
	 * 
	 * @return possible object is {@link QuestionsAnswersFormType }
	 * 
	 */
	public QuestionsAnswersFormType getQuestionsAnswersForm() {
		return questionsAnswersForm;
	}

	/**
	 * Sets the value of the questionsAnswersForm property.
	 * 
	 * @param value
	 *            allowed object is {@link QuestionsAnswersFormType }
	 * 
	 */
	public void setQuestionsAnswersForm(QuestionsAnswersFormType value) {
		this.questionsAnswersForm = value;
	}

}
