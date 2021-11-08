
package com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for InsurancesType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="InsurancesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="insuranceCompound" type="{http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/}InsuranceCompoundType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsurancesType", propOrder = { "insuranceCompound" })
public class InsurancesType {

	@XmlElement(required = true)
	protected List<InsuranceCompoundType> insuranceCompound;

	/**
	 * Gets the value of the insuranceCompound property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the insuranceCompound property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getInsuranceCompound().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link InsuranceCompoundType }
	 * 
	 * 
	 */
	public List<InsuranceCompoundType> getInsuranceCompound() {
		if (insuranceCompound == null) {
			insuranceCompound = new ArrayList<InsuranceCompoundType>();
		}
		return this.insuranceCompound;
	}

}
