
package com.nt.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.nt.req.bindings.BookReqType;


/**
 * <p>Java class for searchBook complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchBook">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookId" type="{http://com/nt/req/bindings}BookReqType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchBook", propOrder = {
    "bookId"
})
public class SearchBook {

    protected BookReqType bookId;

    /**
     * Gets the value of the bookId property.
     * 
     * @return
     *     possible object is
     *     {@link BookReqType }
     *     
     */
    public BookReqType getBookId() {
        return bookId;
    }

    /**
     * Sets the value of the bookId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookReqType }
     *     
     */
    public void setBookId(BookReqType value) {
        this.bookId = value;
    }

}
