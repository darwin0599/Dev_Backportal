
package com.backoffice.client.bank;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for InfoAccountsListType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="InfoAccountsListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infoAccount" type="{http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntBankAccount/}InfoAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoAccountsListType", propOrder = { "infoAccount" })
public class InfoAccountsListType {

	protected List<InfoAccountType> infoAccount;

	/**
	 * Gets the value of the infoAccount property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the infoAccount property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getInfoAccount().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link InfoAccountType }
	 * 
	 * 
	 */
	public List<InfoAccountType> getInfoAccount() {
		if (infoAccount == null) {
			infoAccount = new ArrayList<InfoAccountType>();
		}
		return this.infoAccount;
	}

}
