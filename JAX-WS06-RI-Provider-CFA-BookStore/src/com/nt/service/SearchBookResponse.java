
package com.nt.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nt.res.bindings.BookResType;


/**
 * <p>Java class for searchBookResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchBookResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{http://com/nt/res/bindings}BookResType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchBookResponse", propOrder = {
    "response"
})
public class SearchBookResponse {

    @XmlElement(name = "Response")
    protected BookResType response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link BookResType }
     *     
     */
    public BookResType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookResType }
     *     
     */
    public void setResponse(BookResType value) {
        this.response = value;
    }

}
