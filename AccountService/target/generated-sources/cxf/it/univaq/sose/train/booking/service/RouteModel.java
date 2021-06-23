
package it.univaq.sose.train.booking.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import it.univaq.sose.train.schedule.service.ItineraryModel;


/**
 * <p>Classe Java per routeModel complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="routeModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="availability" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="schedule" type="{http://service.schedule.train.sose.univaq.it/}itineraryModel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routeModel", propOrder = {
    "availability",
    "schedule"
})
public class RouteModel {

    protected int availability;
    protected ItineraryModel schedule;

    /**
     * Recupera il valore della proprietà availability.
     * 
     */
    public int getAvailability() {
        return availability;
    }

    /**
     * Imposta il valore della proprietà availability.
     * 
     */
    public void setAvailability(int value) {
        this.availability = value;
    }

    /**
     * Recupera il valore della proprietà schedule.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryModel }
     *     
     */
    public ItineraryModel getSchedule() {
        return schedule;
    }

    /**
     * Imposta il valore della proprietà schedule.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryModel }
     *     
     */
    public void setSchedule(ItineraryModel value) {
        this.schedule = value;
    }

}
