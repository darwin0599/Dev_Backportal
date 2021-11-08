
package com.backoffice.client.validatecustomer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for QuestionsAnswersType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="QuestionsAnswersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="questionAnswer" type="{http://girosyfinanzas.com/schema/DireccionCanales/QuestionAnswerType/}QuestionAnswerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuestionsAnswersType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/RequiredInformationClientType/", propOrder = {
		"questionAnswer" })
public class QuestionsAnswersType {

	protected List<QuestionAnswerType> questionAnswer;

	/**
	 * Gets the value of the questionAnswer property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the questionAnswer property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getQuestionAnswer().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link QuestionAnswerType }
	 * 
	 * 
	 */
	public List<QuestionAnswerType> getQuestionAnswer() {
		if (questionAnswer == null) {
			questionAnswer = new ArrayList<QuestionAnswerType>();
		}
		return this.questionAnswer;
	}

}
