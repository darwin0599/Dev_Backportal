
package com.girosyfinanzas.servicios.direccioncanales.srvintproductscustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.girosyfinanzas.schema.direccioncanales.contextresponsetype.ContextResponseType;

/**
 * <p>
 * Java class for ProductMovementsRespType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ProductMovementsRespType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextResponse" type="{http://girosyfinanzas.com/schema/DireccionCanales/ContextResponseType/}ContextResponseType"/>
 *         &lt;element name="movementsList" type="{http://www.girosyfinanzas.com/servicios/DireccionCanales/SrvIntProductsCustomer/}MovementListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductMovementsRespType", propOrder = { "contextResponse", "movementsList" })
public class ProductMovementsRespType {

	@XmlElement(required = true)
	protected ContextResponseType contextResponse;
	protected MovementListType movementsList;

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
	 * Gets the value of the movementsList property.
	 * 
	 * @return possible object is {@link MovementListType }
	 * 
	 */
	public MovementListType getMovementsList() {
		return movementsList;
	}

	/**
	 * Sets the value of the movementsList property.
	 * 
	 * @param value
	 *            allowed object is {@link MovementListType }
	 * 
	 */
	public void setMovementsList(MovementListType value) {
		this.movementsList = value;
	}

}
