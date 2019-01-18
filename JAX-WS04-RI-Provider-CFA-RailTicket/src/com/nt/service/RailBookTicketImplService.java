
package com.nt.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RailBookTicketImplService", targetNamespace = "http://service.nt.com/", wsdlLocation = "file:/D:/Java%20Package/WebServices/JAX-WS04-RI-Provider-CFA-RailTicket/WebContent/WEB-INF/bookTicket.wsdl")
public class RailBookTicketImplService
    extends Service
{

    private final static URL RAILBOOKTICKETIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException RAILBOOKTICKETIMPLSERVICE_EXCEPTION;
    private final static QName RAILBOOKTICKETIMPLSERVICE_QNAME = new QName("http://service.nt.com/", "RailBookTicketImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/Java%20Package/WebServices/JAX-WS04-RI-Provider-CFA-RailTicket/WebContent/WEB-INF/bookTicket.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RAILBOOKTICKETIMPLSERVICE_WSDL_LOCATION = url;
        RAILBOOKTICKETIMPLSERVICE_EXCEPTION = e;
    }

    public RailBookTicketImplService() {
        super(__getWsdlLocation(), RAILBOOKTICKETIMPLSERVICE_QNAME);
    }

    public RailBookTicketImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RAILBOOKTICKETIMPLSERVICE_QNAME, features);
    }

    public RailBookTicketImplService(URL wsdlLocation) {
        super(wsdlLocation, RAILBOOKTICKETIMPLSERVICE_QNAME);
    }

    public RailBookTicketImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RAILBOOKTICKETIMPLSERVICE_QNAME, features);
    }

    public RailBookTicketImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RailBookTicketImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Ticket
     */
    @WebEndpoint(name = "RailBookTicketImplPort")
    public Ticket getRailBookTicketImplPort() {
        return super.getPort(new QName("http://service.nt.com/", "RailBookTicketImplPort"), Ticket.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Ticket
     */
    @WebEndpoint(name = "RailBookTicketImplPort")
    public Ticket getRailBookTicketImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.nt.com/", "RailBookTicketImplPort"), Ticket.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RAILBOOKTICKETIMPLSERVICE_EXCEPTION!= null) {
            throw RAILBOOKTICKETIMPLSERVICE_EXCEPTION;
        }
        return RAILBOOKTICKETIMPLSERVICE_WSDL_LOCATION;
    }

}
