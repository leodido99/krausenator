package com.brewitbiab;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;

/**
 * 
 */
@XmlRootElement(name = "hops")
@XmlAccessorType(XmlAccessType.FIELD)
public class BrewHops {

    /**
     * Default constructor
     */
    public BrewHops() {
    }

    /**
     * 
     */
    @XmlElement(name = "hop")
    private ArrayList<BrewHop> hops;

    /**
     * @return
     */
    public ArrayList<BrewHop> getHops() {
        return this.hops;
    }

    /**
     * @param value
     */
    public void setHops(ArrayList<BrewHop> value) {
        this.hops = value;
    }

}