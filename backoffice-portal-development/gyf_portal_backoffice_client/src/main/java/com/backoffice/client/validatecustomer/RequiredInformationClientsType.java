
package com.backoffice.client.validatecustomer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for RequiredInformationClientsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="RequiredInformationClientsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requiredInformationClient" type="{http://girosyfinanzas.com/schema/DireccionCanales/RequiredInformationClientType/}RequiredInformationClientType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredInformationClientsType", propOrder = { "requiredInformationClient" })
public class RequiredInformationClientsType {

	protected List<RequiredInformationClientType> requiredInformationClient;

	/**
	 * Gets the value of the requiredInformationClient property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the requiredInformationClient property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getRequiredInformationClient().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link RequiredInformationClientType }
	 * 
	 * 
	 */
	public List<RequiredInformationClientType> getRequiredInformationClient() {
		if (requiredInformationClient == null) {
			requiredInformationClient = new ArrayList<RequiredInformationClientType>();
		}
		return this.requiredInformationClient;
	}

}
