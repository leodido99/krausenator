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
    public void accept(BrewItemVisitor visitor) {
        visitor.visit(this);
    }
}