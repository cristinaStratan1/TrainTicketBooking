
package it.univaq.sose.train.schedule.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per itineraryModel complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="itineraryModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="departureTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itineraryId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="train" type="{http://service.schedule.train.sose.univaq.it/}trainModel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itineraryModel", propOrder = {
    "arrivalTime",
    "departureTime",
    "from",
    "itineraryId",
    "to",
    "train"
})
public class ItineraryModel {

    protected String arrivalTime;
    protected String departureTime;
    protected String from;
    protected int itineraryId;
    protected String to;
    protected TrainModel train;

    /**
     * Recupera il valore della proprietà arrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Imposta il valore della proprietà arrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }

    /**
     * Recupera il valore della proprietà departureTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Imposta il valore della proprietà departureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * Recupera il valore della proprietà from.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Imposta il valore della proprietà from.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Recupera il valore della proprietà itineraryId.
     * 
     */
    public int getItineraryId() {
        return itineraryId;
    }

    /**
     * Imposta il valore della proprietà itineraryId.
     * 
     */
    public void setItineraryId(int value) {
        this.itineraryId = value;
    }

    /**
     * Recupera il valore della proprietà to.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Imposta il valore della proprietà to.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Recupera il valore della proprietà train.
     * 
     * @return
     *     possible object is
     *     {@link TrainModel }
     *     
     */
    public TrainModel getTrain() {
        return train;
    }

    /**
     * Imposta il valore della proprietà train.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainModel }
     *     
     */
    public void setTrain(TrainModel value) {
        this.train = value;
    }

}
