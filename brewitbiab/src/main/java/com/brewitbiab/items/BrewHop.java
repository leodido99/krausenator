package com.brewitbiab.items;

import com.brewitbiab.manager.BrewItemVisitor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 */
@XmlRootElement(name = "hop")
public class BrewHop extends BrewItem {

    /**
     * Default constructor
     */
    public BrewHop() { super(); }

    /**
     * Copy constructor
     * @param item item to copy
     */
    public BrewHop(BrewHop item) {
        super(item);
        this.alphaAcidPercentage = item.alphaAcidPercentage;
        this.duration = item.duration;
        this.use = item.use;
    }

    /**
     * 
     */
    private float alphaAcidPercentage;

    /**
     * 
     */
    private float duration;

    /**
     * 
     */
    private BrewHopUsage use;

    /**
     * @param aa
     */
    @XmlElement(name = "alphaacid")
    public void setAlphaAcidPercentage(float aa) {
        this.alphaAcidPercentage = aa;
    }

    /**
     * @return
     */
    public float getAlphaAcidPercentage() {
        return this.alphaAcidPercentage;
    }

    /**
     * @param duration
     */
    public void setDuration(float duration) {
        this.duration = duration;
    }

    /**
     * @return
     */
    public float getDuration() {
        return this.duration;
    }

    /**
     * @param use
     */
    public void setUse(BrewHopUsage use) {
        this.use = use;
    }

    /**
     * @return
     */
    public BrewHopUsage getUse() {
        return this.use;
    }

    /**
     * Returns a string describing the object
     * @return
     */
    @Override
    public String toString() {
        return "Name: " + this.name + " Description: " + this.description + " Amount: " + this.amount + " " + this.unit + " Use: " + this.use + " AA: " + this.alphaAcidPercentage + " Duration: " + this.duration;
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