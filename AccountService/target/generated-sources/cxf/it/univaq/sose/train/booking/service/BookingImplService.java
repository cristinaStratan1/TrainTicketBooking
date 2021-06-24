package it.univaq.sose.train.booking.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.7
 * 2021-06-24T18:51:34.681+02:00
 * Generated source version: 3.3.7
 *
 */
@WebServiceClient(name = "BookingImplService",
                  wsdlLocation = "file:/C:/Users/giuse/eclipse-workspace/TrainTicketBooking/AccountService/src/main/resources/booking.wsdl",
                  targetNamespace = "http://service.booking.train.sose.univaq.it/")
public class BookingImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.booking.train.sose.univaq.it/", "BookingImplService");
    public final static QName BookingImplPort = new QName("http://service.booking.train.sose.univaq.it/", "BookingImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/giuse/eclipse-workspace/TrainTicketBooking/AccountService/src/main/resources/booking.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BookingImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/giuse/eclipse-workspace/TrainTicketBooking/AccountService/src/main/resources/booking.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BookingImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BookingImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookingImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public BookingImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public BookingImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public BookingImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Booking
     */
    @WebEndpoint(name = "BookingImplPort")
    public Booking getBookingImplPort() {
        return super.getPort(BookingImplPort, Booking.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Booking
     */
    @WebEndpoint(name = "BookingImplPort")
    public Booking getBookingImplPort(WebServiceFeature... features) {
        return super.getPort(BookingImplPort, Booking.class, features);
    }

}
