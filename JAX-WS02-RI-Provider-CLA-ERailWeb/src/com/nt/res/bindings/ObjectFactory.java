//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.11 at 12:05:31 PM IST 
//


package com.nt.res.bindings;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nt.res.bindings package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
@XmlRootElement(name="ObjectFactory")
public class ObjectFactory {

    private final static QName _Ticket_QNAME = new QName("http://com/nt/res/bindings", "Ticket");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nt.res.bindings
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TicketType }
     * 
     */
    public TicketType createTicketType() {
        return new TicketType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/nt/res/bindings", name = "Ticket")
    public JAXBElement<TicketType> createTicket(TicketType value) {
        return new JAXBElement<TicketType>(_Ticket_QNAME, TicketType.class, null, value);
    }

}
