
package com.girosyfinanzas.schema.direccioncanales.insurance.typebeneficiarytype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for TypeBeneficiaryType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="TypeBeneficiaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relationship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="handicapped" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeBeneficiaryType", propOrder = { "relationship", "percent", "sex", "handicapped" })
public class TypeBeneficiaryType {

	protected String relationship;
	protected String percent;
	protected String sex;
	protected String handicapped;

	/**
	 * Gets the value of the relationship property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRelationship() {
		return relationship;
	}

	/**
	 * Sets the value of the relationship property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRelationship(String value) {
		this.relationship = value;
	}

	/**
	 * Gets the value of the percent property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPercent() {
		return percent;
	}

	/**
	 * Sets the value of the percent property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPercent(String value) {
		this.percent = value;
	}

	/**
	 * Gets the value of the sex property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * Sets the value of the sex property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSex(String value) {
		this.sex = value;
	}

	/**
	 * Gets the value of the handicapped property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHandicapped() {
		return handicapped;
	}

	/**
	 * Sets the value of the handicapped property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHandicapped(String value) {
		this.handicapped = value;
	}

}
