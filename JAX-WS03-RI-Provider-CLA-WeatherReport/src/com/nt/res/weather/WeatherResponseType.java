//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.12 at 11:55:32 AM IST 
//


package com.nt.res.weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeatherResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WeatherResponseReport" type="{http://com/nt/res/weather}WeatherResponseReportType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherResponseType", propOrder = {
    "weatherResponseReport"
})
@XmlRootElement(name="WeatherResponseType")
public class WeatherResponseType {

    @XmlElement(name = "WeatherResponseReport", required = true)
    protected WeatherResponseReportType weatherResponseReport;

    /**
     * Gets the value of the weatherResponseReport property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherResponseReportType }
     *     
     */
    public WeatherResponseReportType getWeatherResponseReport() {
        return weatherResponseReport;
    }

    /**
     * Sets the value of the weatherResponseReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherResponseReportType }
     *     
     */
    public void setWeatherResponseReport(WeatherResponseReportType value) {
        this.weatherResponseReport = value;
    }

}