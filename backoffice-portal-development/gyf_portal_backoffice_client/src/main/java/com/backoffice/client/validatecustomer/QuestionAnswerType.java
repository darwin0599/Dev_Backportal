
package com.backoffice.client.validatecustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for QuestionAnswerType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="QuestionAnswerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="question" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuestionAnswerType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/QuestionAnswerType/", propOrder = {
		"question", "answer" })
public class QuestionAnswerType {

	protected String question;
	protected String answer;

	/**
	 * Gets the value of the question property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * Sets the value of the question property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setQuestion(String value) {
		this.question = value;
	}

	/**
	 * Gets the value of the answer property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * Sets the value of the answer property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAnswer(String value) {
		this.answer = value;
	}

}
