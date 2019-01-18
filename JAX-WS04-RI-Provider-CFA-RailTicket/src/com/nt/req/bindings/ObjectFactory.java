
package com.nt.req.bindings;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nt.req.bindings package. 
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
public class ObjectFactory {

    private final static QName _PassengerInfoType_QNAME = new QName("http://com/nt/req/bindings", "PassengerInfoType");
    private final static QName _JourneyInfoType_QNAME = new QName("http://com/nt/req/bindings", "JourneyInfoType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nt.req.bindings
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PassengerInfoType }
     * 
     */
    public PassengerInfoType createPassengerInfoType() {
        return new PassengerInfoType();
    }

    /**
     * Create an instance of {@link JourneyInfoType }
     * 
     */
    public JourneyInfoType createJourneyInfoType() {
        return new JourneyInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/nt/req/bindings", name = "PassengerInfoType")
    public JAXBElement<PassengerInfoType> createPassengerInfoType(PassengerInfoType value) {
        return new JAXBElement<PassengerInfoType>(_PassengerInfoType_QNAME, PassengerInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JourneyInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/nt/req/bindings", name = "JourneyInfoType")
    public JAXBElement<JourneyInfoType> createJourneyInfoType(JourneyInfoType value) {
        return new JAXBElement<JourneyInfoType>(_JourneyInfoType_QNAME, JourneyInfoType.class, null, value);
    }

}
