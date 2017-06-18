package com.leo.brewitbiab;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 */
@XmlRootElement(name = "fermentable")
public class BrewFermentable extends BrewItem {

    /**
     * Default constructor
     */
    public BrewFermentable() {
        super();
    }

    /**
     * 
     */
    private float ebc;

    /**
     * 
     */
    private float potentialGravity;

    /**
     * 
     */
    private float producedGravity;

    /**
     *
     */
    private boolean grainBillCalc;

    /**
     * @param ebc
     */
    @XmlElement(name = "ebc")
    public void setEBC(float ebc) {
        this.ebc = ebc;
    }

    /**
     * @return
     */
    public float getEBC() {
        return this.ebc;
    }

    /**
     * @param gravity
     */
    @XmlElement(name = "potentialGravity")
    public void setPotentialGravity(float gravity) {
        this.potentialGravity = gravity;
    }

    /**
     * @return
     */
    public float getPotentialGravity() {
        return this.potentialGravity;
    }

    /**
     * @return
     */
    public float getProducedGravity() {
        return this.producedGravity;
    }

    /**
     * Prints the object as a string
     * @return String describing the object
     */
    @Override
    public String toString() {
        return "Name: " + this.name + " Description: " + this.description + " Amount: " + this.amount + " " + this.unit + " EBC: " + this.ebc + " Potential: " + this.potentialGravity + " GrainBillCalc: " + this.grainBillCalc;
    }

    public boolean isGrainBillCalc() {
        return grainBillCalc;
    }

    @XmlElement(name = "grainBillCalc")
    public void setGrainBillCalc(boolean grainBillCalc) {
        this.grainBillCalc = grainBillCalc;
    }

    /**
     * Visitor pattern accept
     * @param visitor The visitor
     */
    @Override
    public void accept(BrewItemVisitor visitor) {
        visitor.visit(this);
    }
}