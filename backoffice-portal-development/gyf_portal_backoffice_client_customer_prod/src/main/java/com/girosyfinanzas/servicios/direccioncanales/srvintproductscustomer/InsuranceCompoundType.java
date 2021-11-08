
package com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.girosyfinanzas.schema.direccioncanales.insurance.insurancetype.InsuranceType;

/**
 * <p>
 * Java class for InsuranceCompoundType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceCompoundType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="insurance" type="{http://girosyfinanzas.com/schema/DireccionCanales/Insurance/InsuranceType/}InsuranceType" minOccurs="0"/>
 *         &lt;element name="beneficiaryList" type="{http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/}BeneficiaryListType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceCompoundType", propOrder = { "insurance", "beneficiaryList", "description" })
public class InsuranceCompoundType {

	protected InsuranceType insurance;
	protected BeneficiaryListType beneficiaryList;
	protected String description;

	/**
	 * Gets the value of the insurance property.
	 * 
	 * @return possible object is {@link InsuranceType }
	 * 
	 */
	public InsuranceType getInsurance() {
		return insurance;
	}

	/**
	 * Sets the value of the insurance property.
	 * 
	 * @param value
	 *            allowed object is {@link InsuranceType }
	 * 
	 */
	public void setInsurance(InsuranceType value) {
		this.insurance = value;
	}

	/**
	 * Gets the value of the beneficiaryList property.
	 * 
	 * @return possible object is {@link BeneficiaryListType }
	 * 
	 */
	public BeneficiaryListType getBeneficiaryList() {
		return beneficiaryList;
	}

	/**
	 * Sets the value of the beneficiaryList property.
	 * 
	 * @param value
	 *            allowed object is {@link BeneficiaryListType }
	 * 
	 */
	public void setBeneficiaryList(BeneficiaryListType value) {
		this.beneficiaryList = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

}
