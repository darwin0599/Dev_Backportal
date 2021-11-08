
package com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.girosyfinanzas.schema.direccioncanales.savingaccounttype.SavingAccountType;

/**
 * <p>
 * Java class for SavingAccountsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SavingAccountsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="savingAccount" type="{http://girosyfinanzas.com/schema/DireccionCanales/SavingAccountType/}SavingAccountType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SavingAccountsType", propOrder = { "savingAccount" })
public class SavingAccountsType {

	@XmlElement(required = true)
	protected List<SavingAccountType> savingAccount;

	/**
	 * Gets the value of the savingAccount property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the savingAccount property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSavingAccount().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link SavingAccountType }
	 * 
	 * 
	 */
	public List<SavingAccountType> getSavingAccount() {
		if (savingAccount == null) {
			savingAccount = new ArrayList<SavingAccountType>();
		}
		return this.savingAccount;
	}

}
