
package com.nt.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nt.service package. 
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

    private final static QName _SearchBook_QNAME = new QName("http://service.nt.com/", "searchBook");
    private final static QName _SearchBookResponse_QNAME = new QName("http://service.nt.com/", "searchBookResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nt.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchBookResponse }
     * 
     */
    public SearchBookResponse createSearchBookResponse() {
        return new SearchBookResponse();
    }

    /**
     * Create an instance of {@link SearchBook }
     * 
     */
    public SearchBook createSearchBook() {
        return new SearchBook();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nt.com/", name = "searchBook")
    public JAXBElement<SearchBook> createSearchBook(SearchBook value) {
        return new JAXBElement<SearchBook>(_SearchBook_QNAME, SearchBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.nt.com/", name = "searchBookResponse")
    public JAXBElement<SearchBookResponse> createSearchBookResponse(SearchBookResponse value) {
        return new JAXBElement<SearchBookResponse>(_SearchBookResponse_QNAME, SearchBookResponse.class, null, value);
    }

}
