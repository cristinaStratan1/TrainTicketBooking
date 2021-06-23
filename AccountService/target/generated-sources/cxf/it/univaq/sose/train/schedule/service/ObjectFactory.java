
package it.univaq.sose.train.schedule.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.univaq.sose.train.schedule.service package. 
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

    private final static QName _GetItineraryById_QNAME = new QName("http://service.schedule.train.sose.univaq.it/", "getItineraryById");
    private final static QName _GetItineraryByIdResponse_QNAME = new QName("http://service.schedule.train.sose.univaq.it/", "getItineraryByIdResponse");
    private final static QName _GetSchedule_QNAME = new QName("http://service.schedule.train.sose.univaq.it/", "getSchedule");
    private final static QName _GetScheduleResponse_QNAME = new QName("http://service.schedule.train.sose.univaq.it/", "getScheduleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.univaq.sose.train.schedule.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetItineraryById }
     * 
     */
    public GetItineraryById createGetItineraryById() {
        return new GetItineraryById();
    }

    /**
     * Create an instance of {@link GetItineraryByIdResponse }
     * 
     */
    public GetItineraryByIdResponse createGetItineraryByIdResponse() {
        return new GetItineraryByIdResponse();
    }

    /**
     * Create an instance of {@link GetSchedule }
     * 
     */
    public GetSchedule createGetSchedule() {
        return new GetSchedule();
    }

    /**
     * Create an instance of {@link GetScheduleResponse }
     * 
     */
    public GetScheduleResponse createGetScheduleResponse() {
        return new GetScheduleResponse();
    }

    /**
     * Create an instance of {@link ItineraryModel }
     * 
     */
    public ItineraryModel createItineraryModel() {
        return new ItineraryModel();
    }

    /**
     * Create an instance of {@link TrainModel }
     * 
     */
    public TrainModel createTrainModel() {
        return new TrainModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItineraryById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetItineraryById }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.schedule.train.sose.univaq.it/", name = "getItineraryById")
    public JAXBElement<GetItineraryById> createGetItineraryById(GetItineraryById value) {
        return new JAXBElement<GetItineraryById>(_GetItineraryById_QNAME, GetItineraryById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItineraryByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetItineraryByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.schedule.train.sose.univaq.it/", name = "getItineraryByIdResponse")
    public JAXBElement<GetItineraryByIdResponse> createGetItineraryByIdResponse(GetItineraryByIdResponse value) {
        return new JAXBElement<GetItineraryByIdResponse>(_GetItineraryByIdResponse_QNAME, GetItineraryByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSchedule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSchedule }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.schedule.train.sose.univaq.it/", name = "getSchedule")
    public JAXBElement<GetSchedule> createGetSchedule(GetSchedule value) {
        return new JAXBElement<GetSchedule>(_GetSchedule_QNAME, GetSchedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScheduleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetScheduleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.schedule.train.sose.univaq.it/", name = "getScheduleResponse")
    public JAXBElement<GetScheduleResponse> createGetScheduleResponse(GetScheduleResponse value) {
        return new JAXBElement<GetScheduleResponse>(_GetScheduleResponse_QNAME, GetScheduleResponse.class, null, value);
    }

}
