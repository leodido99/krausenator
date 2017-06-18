package com.brewitbiab;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;

/**
 * 
 */
@XmlRootElement(name = "items")
@XmlAccessorType(XmlAccessType.FIELD)
public class BrewItems {

    /**
     * Default constructor
     */
    public BrewItems() {
    }

    /**
     * 
     */
    @XmlElement(name = "item")
    private ArrayList<BrewItem> items;

    /**
     * @return
     */
    public ArrayList<BrewItem> getItems() {
        return this.items;
    }

    /**
     * @param value
     */
    public void setItems(ArrayList<BrewItem> value) {
        this.items = value;
    }

}