
package com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.girosyfinanzas.schema.direccioncanales.creditaccounttype.CreditAccountType;

/**
 * <p>
 * Java class for CreditAccountsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CreditAccountsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditAccount" type="{http://girosyfinanzas.com/schema/DireccionCanales/CreditAccountType/}CreditAccountType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditAccountsType", propOrder = { "creditAccount" })
public class CreditAccountsType {

	@XmlElement(required = true)
	protected List<CreditAccountType> creditAccount;

	/**
	 * Gets the value of the creditAccount property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the creditAccount property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getCreditAccount().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CreditAccountType }
	 * 
	 * 
	 */
	public List<CreditAccountType> getCreditAccount() {
		if (creditAccount == null) {
			creditAccount = new ArrayList<CreditAccountType>();
		}
		return this.creditAccount;
	}

}
