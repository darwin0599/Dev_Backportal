
package com.backoffice.client.validatecustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for QuestionsAnswersFormType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="QuestionsAnswersFormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="questionsAnswers" type="{http://girosyfinanzas.com/schema/DireccionCanales/RequiredInformationClientType/}QuestionsAnswersType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuestionsAnswersFormType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/RequiredInformationClientType/", propOrder = {
		"codeForm", "questionsAnswers" })
public class QuestionsAnswersFormType {

	protected String codeForm;
	protected QuestionsAnswersType questionsAnswers;

	/**
	 * Gets the value of the codeForm property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCodeForm() {
		return codeForm;
	}

	/**
	 * Sets the value of the codeForm property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCodeForm(String value) {
		this.codeForm = value;
	}

	/**
	 * Gets the value of the questionsAnswers property.
	 * 
	 * @return possible object is {@link QuestionsAnswersType }
	 * 
	 */
	public QuestionsAnswersType getQuestionsAnswers() {
		return questionsAnswers;
	}

	/**
	 * Sets the value of the questionsAnswers property.
	 * 
	 * @param value
	 *            allowed object is {@link QuestionsAnswersType }
	 * 
	 */
	public void setQuestionsAnswers(QuestionsAnswersType value) {
		this.questionsAnswers = value;
	}

}
