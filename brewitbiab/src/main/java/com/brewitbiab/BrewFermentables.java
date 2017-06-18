package com.brewitbiab;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;

/**
 * 
 */
@XmlRootElement(name = "fermentables")
@XmlAccessorType(XmlAccessType.FIELD)
public class BrewFermentables {

    /**
     * Default constructor
     */
    public BrewFermentables() {
    }

    /**
     * 
     */
    @XmlElement(name = "fermentable")
    private ArrayList<BrewFermentable> fermentables;

    /**
     * @return
     */
    public ArrayList<BrewFermentable> getFermentables() {
        return this.fermentables;
    }

    /**
     * @param value
     */
    public void setFermentables(ArrayList<BrewFermentable> value) {
        this.fermentables = value;
    }

}