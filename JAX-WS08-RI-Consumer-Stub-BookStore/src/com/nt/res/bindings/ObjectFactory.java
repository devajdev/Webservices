
package com.nt.res.bindings;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
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
public class ObjectFactory {

    private final static QName _Book_QNAME = new QName("http://com/nt/res/bindings", "Book");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nt.res.bindings
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookResType }
     * 
     */
    public BookResType createBookResType() {
        return new BookResType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookResType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/nt/res/bindings", name = "Book")
    public JAXBElement<BookResType> createBook(BookResType value) {
        return new JAXBElement<BookResType>(_Book_QNAME, BookResType.class, null, value);
    }

}
