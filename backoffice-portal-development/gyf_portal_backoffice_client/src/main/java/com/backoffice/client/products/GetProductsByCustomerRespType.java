
package com.backoffice.client.products;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for GetProductsByCustomerRespType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="GetProductsByCustomerRespType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextResponse" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextResponseType/}ContextResponseType"/>
 *         &lt;element name="productsList" type="{http://www.girosyfinanzas/servicios/DireccionCanales/SrvIntProduct/}ProductsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProductsByCustomerRespType", propOrder = { "contextResponse", "productsList" })
public class GetProductsByCustomerRespType {

	@XmlElement(required = true)
	protected ContextResponseType contextResponse;
	protected ProductsListType productsList;

	/**
	 * Gets the value of the contextResponse property.
	 * 
	 * @return possible object is {@link ContextResponseType }
	 * 
	 */
	public ContextResponseType getContextResponse() {
		return contextResponse;
	}

	/**
	 * Sets the value of the contextResponse property.
	 * 
	 * @param value
	 *            allowed object is {@link ContextResponseType }
	 * 
	 */
	public void setContextResponse(ContextResponseType value) {
		this.contextResponse = value;
	}

	/**
	 * Gets the value of the productsList property.
	 * 
	 * @return possible object is {@link ProductsListType }
	 * 
	 */
	public ProductsListType getProductsList() {
		return productsList;
	}

	/**
	 * Sets the value of the productsList property.
	 * 
	 * @param value
	 *            allowed object is {@link ProductsListType }
	 * 
	 */
	public void setProductsList(ProductsListType value) {
		this.productsList = value;
	}

}
