
package it.univaq.sose.train.booking.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.univaq.sose.train.booking.service package. 
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

    private final static QName _GetRoutes_QNAME = new QName("http://service.booking.train.sose.univaq.it/", "getRoutes");
    private final static QName _GetRoutesResponse_QNAME = new QName("http://service.booking.train.sose.univaq.it/", "getRoutesResponse");
    private final static QName _GetTicketsByItinerary_QNAME = new QName("http://service.booking.train.sose.univaq.it/", "getTicketsByItinerary");
    private final static QName _GetTicketsByItineraryResponse_QNAME = new QName("http://service.booking.train.sose.univaq.it/", "getTicketsByItineraryResponse");
    private final static QName _GetUserBooking_QNAME = new QName("http://service.booking.train.sose.univaq.it/", "getUserBooking");
    private final static QName _GetUserBookingResponse_QNAME = new QName("http://service.booking.train.sose.univaq.it/", "getUserBookingResponse");
    private final static QName _SetBooking_QNAME = new QName("http://service.booking.train.sose.univaq.it/", "setBooking");
    private final static QName _SetBookingResponse_QNAME = new QName("http://service.booking.train.sose.univaq.it/", "setBookingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.univaq.sose.train.booking.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRoutes }
     * 
     */
    public GetRoutes createGetRoutes() {
        return new GetRoutes();
    }

    /**
     * Create an instance of {@link GetRoutesResponse }
     * 
     */
    public GetRoutesResponse createGetRoutesResponse() {
        return new GetRoutesResponse();
    }

    /**
     * Create an instance of {@link GetTicketsByItinerary }
     * 
     */
    public GetTicketsByItinerary createGetTicketsByItinerary() {
        return new GetTicketsByItinerary();
    }

    /**
     * Create an instance of {@link GetTicketsByItineraryResponse }
     * 
     */
    public GetTicketsByItineraryResponse createGetTicketsByItineraryResponse() {
        return new GetTicketsByItineraryResponse();
    }

    /**
     * Create an instance of {@link GetUserBooking }
     * 
     */
    public GetUserBooking createGetUserBooking() {
        return new GetUserBooking();
    }

    /**
     * Create an instance of {@link GetUserBookingResponse }
     * 
     */
    public GetUserBookingResponse createGetUserBookingResponse() {
        return new GetUserBookingResponse();
    }

    /**
     * Create an instance of {@link SetBooking }
     * 
     */
    public SetBooking createSetBooking() {
        return new SetBooking();
    }

    /**
     * Create an instance of {@link SetBookingResponse }
     * 
     */
    public SetBookingResponse createSetBookingResponse() {
        return new SetBookingResponse();
    }

    /**
     * Create an instance of {@link RouteModel }
     * 
     */
    public RouteModel createRouteModel() {
        return new RouteModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoutes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRoutes }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.booking.train.sose.univaq.it/", name = "getRoutes")
    public JAXBElement<GetRoutes> createGetRoutes(GetRoutes value) {
        return new JAXBElement<GetRoutes>(_GetRoutes_QNAME, GetRoutes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoutesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRoutesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.booking.train.sose.univaq.it/", name = "getRoutesResponse")
    public JAXBElement<GetRoutesResponse> createGetRoutesResponse(GetRoutesResponse value) {
        return new JAXBElement<GetRoutesResponse>(_GetRoutesResponse_QNAME, GetRoutesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketsByItinerary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTicketsByItinerary }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.booking.train.sose.univaq.it/", name = "getTicketsByItinerary")
    public JAXBElement<GetTicketsByItinerary> createGetTicketsByItinerary(GetTicketsByItinerary value) {
        return new JAXBElement<GetTicketsByItinerary>(_GetTicketsByItinerary_QNAME, GetTicketsByItinerary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketsByItineraryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTicketsByItineraryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.booking.train.sose.univaq.it/", name = "getTicketsByItineraryResponse")
    public JAXBElement<GetTicketsByItineraryResponse> createGetTicketsByItineraryResponse(GetTicketsByItineraryResponse value) {
        return new JAXBElement<GetTicketsByItineraryResponse>(_GetTicketsByItineraryResponse_QNAME, GetTicketsByItineraryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserBooking }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserBooking }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.booking.train.sose.univaq.it/", name = "getUserBooking")
    public JAXBElement<GetUserBooking> createGetUserBooking(GetUserBooking value) {
        return new JAXBElement<GetUserBooking>(_GetUserBooking_QNAME, GetUserBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserBookingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserBookingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.booking.train.sose.univaq.it/", name = "getUserBookingResponse")
    public JAXBElement<GetUserBookingResponse> createGetUserBookingResponse(GetUserBookingResponse value) {
        return new JAXBElement<GetUserBookingResponse>(_GetUserBookingResponse_QNAME, GetUserBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBooking }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetBooking }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.booking.train.sose.univaq.it/", name = "setBooking")
    public JAXBElement<SetBooking> createSetBooking(SetBooking value) {
        return new JAXBElement<SetBooking>(_SetBooking_QNAME, SetBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBookingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetBookingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.booking.train.sose.univaq.it/", name = "setBookingResponse")
    public JAXBElement<SetBookingResponse> createSetBookingResponse(SetBookingResponse value) {
        return new JAXBElement<SetBookingResponse>(_SetBookingResponse_QNAME, SetBookingResponse.class, null, value);
    }

}
