
package net.wsdl.webservicex;

import java.net.MalformedURLException;
import java.net.URL;

import javax.jws.HandlerChain;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.1 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "GeoIPService", targetNamespace = "http://www.webservicex.net/", wsdlLocation = "http://www.webservicex.net/geoipservice.asmx?WSDL")
@HandlerChain(file = "handler_chain.xml")
public class GeoIPService
    extends Service
{

    private final static URL GEOIPSERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("http://www.webservicex.net/geoipservice.asmx?WSDL");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        GEOIPSERVICE_WSDL_LOCATION = url;
    }

    public GeoIPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GeoIPService() {
        super(GEOIPSERVICE_WSDL_LOCATION, new QName("http://www.webservicex.net/", "GeoIPService"));
    }

    /**
     * 
     * @return
     *     returns GeoIPServiceSoap
     */
    @WebEndpoint(name = "GeoIPServiceSoap")
    public GeoIPServiceSoap getGeoIPServiceSoap() {
        return (GeoIPServiceSoap)super.getPort(new QName("http://www.webservicex.net/", "GeoIPServiceSoap"), GeoIPServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GeoIPServiceSoap
     */
    @WebEndpoint(name = "GeoIPServiceSoap")
    public GeoIPServiceSoap getGeoIPServiceSoap(WebServiceFeature... features) {
        return (GeoIPServiceSoap)super.getPort(new QName("http://www.webservicex.net/", "GeoIPServiceSoap"), GeoIPServiceSoap.class, features);
    }

}