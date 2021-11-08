
package com.backoffice.client.validatecustomer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for AgentType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AgentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="office" type="{http://girosyfinanzas.com/schema/DireccionCanales/OfficeType/}OfficeType" minOccurs="0"/>
 *         &lt;element name="parameters" type="{http://girosyfinanzas.com/schema/DireccionCanales/ParameterType/}ParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/AgentType/", propOrder = {
		"id", "valName", "office", "parameters" })
public class AgentType {

	protected String id;
	protected String valName;
	protected OfficeType office;
	protected List<ParameterType> parameters;

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Gets the value of the valName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValName() {
		return valName;
	}

	/**
	 * Sets the value of the valName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValName(String value) {
		this.valName = value;
	}

	/**
	 * Gets the value of the office property.
	 * 
	 * @return possible object is {@link OfficeType }
	 * 
	 */
	public OfficeType getOffice() {
		return office;
	}

	/**
	 * Sets the value of the office property.
	 * 
	 * @param value
	 *            allowed object is {@link OfficeType }
	 * 
	 */
	public void setOffice(OfficeType value) {
		this.office = value;
	}

	/**
	 * Gets the value of the parameters property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the parameters property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getParameters().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ParameterType }
	 * 
	 * 
	 */
	public List<ParameterType> getParameters() {
		if (parameters == null) {
			parameters = new ArrayList<ParameterType>();
		}
		return this.parameters;
	}

}
