package com.brewitbiab;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;

/**
 * 
 */
@XmlRootElement(name = "finings")
@XmlAccessorType(XmlAccessType.FIELD)
public class BrewFinings {

    /**
     * Default constructor
     */
    public BrewFinings() {
    }

    /**
     * 
     */
    @XmlElement(name = "fining")
    private ArrayList<BrewFining> finings;

    /**
     * @return
     */
    public ArrayList<BrewFining> getFinings() {
        return this.finings;
    }

    /**
     * @param value
     */
    public void setFinings(ArrayList<BrewFining> value) {
        this.finings = value;
    }

}