//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.11 at 12:05:39 PM IST 
//


package com.nt.req.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pNAme" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pAge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pMobile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerInfoType", propOrder = {
    "pnAme",
    "pAge",
    "pMobile"
})
@XmlRootElement(name="PassengerInfoType")
public class PassengerInfoType {

    @XmlElement(name = "pNAme", required = true)
    protected String pnAme;
    protected int pAge;
    protected int pMobile;

    /**
     * Gets the value of the pnAme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNAme() {
        return pnAme;
    }

    /**
     * Sets the value of the pnAme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNAme(String value) {
        this.pnAme = value;
    }

    /**
     * Gets the value of the pAge property.
     * 
     */
    public int getPAge() {
        return pAge;
    }

    /**
     * Sets the value of the pAge property.
     * 
     */
    public void setPAge(int value) {
        this.pAge = value;
    }

    /**
     * Gets the value of the pMobile property.
     * 
     */
    public int getPMobile() {
        return pMobile;
    }

    /**
     * Sets the value of the pMobile property.
     * 
     */
    public void setPMobile(int value) {
        this.pMobile = value;
    }

}
