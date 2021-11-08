
package com.backoffice.client.support;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for supportServiceResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="supportServiceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="respoServicesTO" type="{http://integration.services.support.gyf.com/}supportServicesTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supportServiceResponse", propOrder = { "respoServicesTO" })
public class SupportServiceResponse {

	@XmlElement(nillable = true)
	protected List<SupportServicesTO> respoServicesTO;

	/**
	 * Gets the value of the respoServicesTO property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the respoServicesTO property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getRespoServicesTO().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link SupportServicesTO }
	 * 
	 * 
	 */
	public List<SupportServicesTO> getRespoServicesTO() {
		if (respoServicesTO == null) {
			respoServicesTO = new ArrayList<SupportServicesTO>();
		}
		return this.respoServicesTO;
	}

}
