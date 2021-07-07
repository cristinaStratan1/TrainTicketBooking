
package it.univaq.sose.train.schedule.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per trainModel complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="trainModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="trainId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="trainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trainNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trainModel", propOrder = {
    "capacity",
    "trainId",
    "trainName",
    "trainNo"
})
public class TrainModel {

    protected int capacity;
    protected int trainId;
    protected String trainName;
    protected int trainNo;

    /**
     * Recupera il valore della proprietà capacity.
     * 
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Imposta il valore della proprietà capacity.
     * 
     */
    public void setCapacity(int value) {
        this.capacity = value;
    }

    /**
     * Recupera il valore della proprietà trainId.
     * 
     */
    public int getTrainId() {
        return trainId;
    }

    /**
     * Imposta il valore della proprietà trainId.
     * 
     */
    public void setTrainId(int value) {
        this.trainId = value;
    }

    /**
     * Recupera il valore della proprietà trainName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainName() {
        return trainName;
    }

    /**
     * Imposta il valore della proprietà trainName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainName(String value) {
        this.trainName = value;
    }

    /**
     * Recupera il valore della proprietà trainNo.
     * 
     */
    public int getTrainNo() {
        return trainNo;
    }

    /**
     * Imposta il valore della proprietà trainNo.
     * 
     */
    public void setTrainNo(int value) {
        this.trainNo = value;
    }

}
