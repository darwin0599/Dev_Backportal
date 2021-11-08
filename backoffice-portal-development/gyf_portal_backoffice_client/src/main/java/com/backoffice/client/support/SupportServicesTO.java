
package com.backoffice.client.support;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for supportServicesTO complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="supportServicesTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valueDomain" type="{http://integration.services.support.gyf.com/}valueDomainTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supportServicesTO", propOrder = { "valueDomain" })
public class SupportServicesTO {

	@XmlElement(nillable = true)
	protected List<ValueDomainTO> valueDomain;

	/**
	 * Gets the value of the valueDomain property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the valueDomain property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getValueDomain().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ValueDomainTO }
	 * 
	 * 
	 */
	public List<ValueDomainTO> getValueDomain() {
		if (valueDomain == null) {
			valueDomain = new ArrayList<ValueDomainTO>();
		}
		return this.valueDomain;
	}

}
