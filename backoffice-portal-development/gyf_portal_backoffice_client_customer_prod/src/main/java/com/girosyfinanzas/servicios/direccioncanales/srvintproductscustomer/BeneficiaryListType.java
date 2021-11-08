
package com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.girosyfinanzas.schema.direccioncanales.insurance.beneficiaryinsurancetype.BeneficiaryInsuranceType;

/**
 * <p>
 * Java class for BeneficiaryListType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="BeneficiaryListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beneficiary" type="{http://girosyfinanzas.com/schema/DireccionCanales/Insurance/BeneficiaryInsuranceType/}BeneficiaryInsuranceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeneficiaryListType", propOrder = { "beneficiary" })
public class BeneficiaryListType {

	@XmlElement(required = true)
	protected List<BeneficiaryInsuranceType> beneficiary;

	/**
	 * Gets the value of the beneficiary property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the beneficiary property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getBeneficiary().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link BeneficiaryInsuranceType }
	 * 
	 * 
	 */
	public List<BeneficiaryInsuranceType> getBeneficiary() {
		if (beneficiary == null) {
			beneficiary = new ArrayList<BeneficiaryInsuranceType>();
		}
		return this.beneficiary;
	}

}
