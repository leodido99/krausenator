package com.brewitbiab;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;

/**
 * 
 */
@XmlRootElement(name = "yeast")
public class BrewYeast extends BrewItem {

    /**
     * Default constructor
     */
    public BrewYeast() {
    }

    /**
     * 
     */
    private Date packageDate;

    /**
     * 
     */
    private int cellsPerPackage;

    /**
     * 
     */
    private float viability;

    /**
     *
     */
    private float attenuationMin;

    /**
     *
     */
    private float attenuationMax;

    /**
     *
     */
    private float temperatureMin;

    /**
     *
     */
    private float temperatureMax;

    /**
     * @return
     */
    public Date getPackageDate() {
        return this.packageDate;
    }

    /**
     * @param value
     */
    public void setPackageDate(Date value) {
        this.packageDate = value;
    }

    /**
     * @return
     */
    public int getCellsPerPackage() {
        return this.cellsPerPackage;
    }

    /**
     * @param value
     */
    public void setCellsPerPackage(int value) {
        this.cellsPerPackage = value;
    }

    /**
     * @return
     */
    public float getViability() {
        return this.viability;
    }

    /**
     * Returns a string describing the object
     * @return
     */
    @Override
    public String toString() {
        return "Name: " + this.name + " Description: " + this.description + " Amount: " + this.amount + " " + this.unit + " PkgDate: " + this.packageDate + " CellsPerPkg: " + this.cellsPerPackage + " Viability:  " + this.viability;
    }
    
    /**
     * Visitor pattern accept
     * @param visitor The visitor
     */
    @Override
    public void accept(BrewItemVisitor visitor) {
        visitor.visit(this);
    }

    public float getAttenuationMin() {
        return attenuationMin;
    }

    @XmlElement(name = "attenuationmin")
    public void setAttenuationMin(float attenuationMin) {
        this.attenuationMin = attenuationMin;
    }

    public float getAttenuationMax() {
        return attenuationMax;
    }

    @XmlElement(name = "attenuationmax")
    public void setAttenuationMax(float attenuationMax) {
        this.attenuationMax = attenuationMax;
    }

    public float getTemperatureMin() {
        return temperatureMin;
    }

    @XmlElement(name = "temperaturemin")
    public void setTemperatureMin(float temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    public float getTemperatureMax() {
        return temperatureMax;
    }

    @XmlElement(name = "temperaturemax")
    public void setTemperatureMax(float temperatureMax) {
        this.temperatureMax = temperatureMax;
    }
}