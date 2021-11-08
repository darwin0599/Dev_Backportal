
package com.backoffice.client.bank;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for AccountListType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AccountListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enrolledAccountInfo" type="{http://girosyfinanzas.com/schema/DireccionCanales/VoucherBankAccountType/}EnrolledAccountInfoType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountListType", namespace = "http://girosyfinanzas.com/schema/DireccionCanales/VoucherBankAccountType/", propOrder = {
		"enrolledAccountInfo" })
public class AccountListType {

	@XmlElement(required = true)
	protected List<EnrolledAccountInfoType> enrolledAccountInfo;

	/**
	 * Gets the value of the enrolledAccountInfo property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the enrolledAccountInfo property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getEnrolledAccountInfo().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link EnrolledAccountInfoType }
	 * 
	 * 
	 */
	public List<EnrolledAccountInfoType> getEnrolledAccountInfo() {
		if (enrolledAccountInfo == null) {
			enrolledAccountInfo = new ArrayList<EnrolledAccountInfoType>();
		}
		return this.enrolledAccountInfo;
	}

}
