package com.brewitbiab.items;

import com.brewitbiab.manager.BrewItemVisitor;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 */
@XmlRootElement(name = "fining")
public class BrewFining extends BrewItem {

    /**
     * Default constructor
     */
    public BrewFining() { super(); }

    /**
     * Copy constructor
     * @param item item to copy
     */
    public BrewFining(BrewFining item) {
        super(item);
        this.use = item.use;
    }

    /**
     * 
     */
    private BrewFiningUsage use;

    /**
     * @param use
     */
    public void setUse(BrewFiningUsage use) {
        this.use = use;
    }

    /**
     * @return
     */
    public BrewFiningUsage getUse() {
        return this.use;
    }

    /**
     * Returns a string describing the object
     * @return
     */
    @Override
    public String toString() {
        return "Name: " + this.name + " Description: " + this.description + " Amount: " + this.amount + " " + this.unit + " Use: " + this.use;
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