package com.brewitbiab;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;

/**
 * 
 */
@XmlRootElement(name = "yeasts")
@XmlAccessorType(XmlAccessType.FIELD)
public class BrewYeasts {

    /**
     * Default constructor
     */
    public BrewYeasts() {
    }

    /**
     * 
     */
    @XmlElement(name = "yeast")
    private ArrayList<BrewYeast> yeasts;

    /**
     * @return
     */
    public ArrayList<BrewYeast> getYeasts() {
        return this.yeasts;
    }

    /**
     * @param value
     */
    public void setYeasts(ArrayList<BrewYeast> value) {
        this.yeasts = value;
    }

}