
package com.girosyfinanzas.schema.direccioncanales.insurance.beneficiaryinsurancetype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.girosyfinanzas.schema.direccioncanales.insurance.typebeneficiarytype.TypeBeneficiaryType;
import com.girosyfinanzas.schema.direccioncanales.persontype.PersonType;

/**
 * <p>
 * Java class for BeneficiaryInsuranceType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="BeneficiaryInsuranceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeBeneficiary" type="{http://girosyfinanzas.com/schema/DireccionCanales/Insurance/TypeBeneficiaryType/}TypeBeneficiaryType"/>
 *         &lt;element name="person" type="{http://girosyfinanzas.com/schema/DireccionCanales/PersonType/}PersonType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeneficiaryInsuranceType", propOrder = { "typeBeneficiary", "person" })
public class BeneficiaryInsuranceType {

	@XmlElement(required = true)
	protected TypeBeneficiaryType typeBeneficiary;
	@XmlElement(required = true)
	protected PersonType person;

	/**
	 * Gets the value of the typeBeneficiary property.
	 * 
	 * @return possible object is {@link TypeBeneficiaryType }
	 * 
	 */
	public TypeBeneficiaryType getTypeBeneficiary() {
		return typeBeneficiary;
	}

	/**
	 * Sets the value of the typeBeneficiary property.
	 * 
	 * @param value
	 *            allowed object is {@link TypeBeneficiaryType }
	 * 
	 */
	public void setTypeBeneficiary(TypeBeneficiaryType value) {
		this.typeBeneficiary = value;
	}

	/**
	 * Gets the value of the person property.
	 * 
	 * @return possible object is {@link PersonType }
	 * 
	 */
	public PersonType getPerson() {
		return person;
	}

	/**
	 * Sets the value of the person property.
	 * 
	 * @param value
	 *            allowed object is {@link PersonType }
	 * 
	 */
	public void setPerson(PersonType value) {
		this.person = value;
	}

}
