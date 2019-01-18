
package com.nt.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.nt.res.bindings.TicketType;


/**
 * <p>Java class for bookTicketResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookTicketResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://com/nt/res/bindings}TicketType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookTicketResponse", propOrder = {
    "request"
})
public class BookTicketResponse {

    protected TicketType request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link TicketType }
     *     
     */
    public TicketType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketType }
     *     
     */
    public void setRequest(TicketType value) {
        this.request = value;
    }

}
