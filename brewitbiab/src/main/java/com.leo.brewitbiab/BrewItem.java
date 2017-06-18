package com.leo.brewitbiab;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;

/**
 * 
 */
@XmlRootElement(name = "item")
public class BrewItem {

    /**
     * Default constructor
     */
    public BrewItem() {
        this.name = "";
        this.description = "";
        this.amount = 0.0f;
        this.unit = "";
    }

    /**
     * 
     */
    protected String name;

    /**
     * 
     */
    protected float amount;

    /**
     * 
     */
    protected String unit;

    /**
     * The item description
     */
    protected String description;

    /**
     * @param name
     */
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param amount
     */
    @XmlElement
    public void setAmount(float amount) {
        this.amount = amount;
    }

    /**
     * @return
     */
    public float getAmount() {
        return this.amount;
    }

    /**
     * @return
     */
    public String getUnit() {
        return this.unit;
    }

    /**
     * @param unit
     */
    @XmlElement
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Returns a string describing the object
     * @return
     */
    @Override
    public String toString() {
        return "Name: " + this.name + " Description: " + this.description + " Amount: " + this.amount + " " + this.unit;
    }

    /**
     * Returns the item's description
     * @return item's description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the item's description
     * @param description Item's description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}