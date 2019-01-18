
package com.nt.res.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TicketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pNAme" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pAge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="doj" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="pMobile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="trainNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketType", propOrder = {
    "pnr",
    "pnAme",
    "pAge",
    "doj",
    "pMobile",
    "trainNumber"
})
public class TicketType {

    protected int pnr;
    @XmlElement(name = "pNAme", required = true)
    protected String pnAme;
    protected int pAge;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar doj;
    protected int pMobile;
    protected int trainNumber;

    /**
     * Gets the value of the pnr property.
     * 
     */
    public int getPnr() {
        return pnr;
    }

    /**
     * Sets the value of the pnr property.
     * 
     */
    public void setPnr(int value) {
        this.pnr = value;
    }

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
     * Gets the value of the doj property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDoj() {
        return doj;
    }

    /**
     * Sets the value of the doj property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDoj(XMLGregorianCalendar value) {
        this.doj = value;
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

    /**
     * Gets the value of the trainNumber property.
     * 
     */
    public int getTrainNumber() {
        return trainNumber;
    }

    /**
     * Sets the value of the trainNumber property.
     * 
     */
    public void setTrainNumber(int value) {
        this.trainNumber = value;
    }

}
