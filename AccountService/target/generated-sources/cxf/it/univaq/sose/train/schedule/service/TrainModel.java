
package it.univaq.sose.train.schedule.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trainModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trainModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="trainId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "trainNo"
})
public class TrainModel {

    protected int capacity;
    protected int trainId;
    protected int trainNo;

    /**
     * Gets the value of the capacity property.
     * 
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     */
    public void setCapacity(int value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the trainId property.
     * 
     */
    public int getTrainId() {
        return trainId;
    }

    /**
     * Sets the value of the trainId property.
     * 
     */
    public void setTrainId(int value) {
        this.trainId = value;
    }

    /**
     * Gets the value of the trainNo property.
     * 
     */
    public int getTrainNo() {
        return trainNo;
    }

    /**
     * Sets the value of the trainNo property.
     * 
     */
    public void setTrainNo(int value) {
        this.trainNo = value;
    }

}