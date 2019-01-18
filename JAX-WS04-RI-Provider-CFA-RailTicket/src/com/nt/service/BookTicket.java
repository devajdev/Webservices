
package com.nt.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nt.req.bindings.JourneyInfoType;
import com.nt.req.bindings.PassengerInfoType;


/**
 * <p>Java class for bookTicket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerInfo" type="{http://com/nt/req/bindings}PassengerInfoType" minOccurs="0"/>
 *         &lt;element name="JourneyInfo" type="{http://com/nt/req/bindings}JourneyInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookTicket", propOrder = {
    "passengerInfo",
    "journeyInfo"
})
public class BookTicket {

    @XmlElement(name = "PassengerInfo")
    protected PassengerInfoType passengerInfo;
    @XmlElement(name = "JourneyInfo")
    protected JourneyInfoType journeyInfo;

    /**
     * Gets the value of the passengerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerInfoType }
     *     
     */
    public PassengerInfoType getPassengerInfo() {
        return passengerInfo;
    }

    /**
     * Sets the value of the passengerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerInfoType }
     *     
     */
    public void setPassengerInfo(PassengerInfoType value) {
        this.passengerInfo = value;
    }

    /**
     * Gets the value of the journeyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyInfoType }
     *     
     */
    public JourneyInfoType getJourneyInfo() {
        return journeyInfo;
    }

    /**
     * Sets the value of the journeyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyInfoType }
     *     
     */
    public void setJourneyInfo(JourneyInfoType value) {
        this.journeyInfo = value;
    }

}
