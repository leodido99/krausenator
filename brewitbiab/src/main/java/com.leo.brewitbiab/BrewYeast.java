package com.leo.brewitbiab;

import java.util.*;

/**
 * 
 */
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

}