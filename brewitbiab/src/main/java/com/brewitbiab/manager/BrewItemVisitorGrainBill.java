package com.brewitbiab.manager;

import com.brewitbiab.items.BrewYeast;
import com.brewitbiab.items.BrewFermentable;
import com.brewitbiab.items.BrewFining;
import com.brewitbiab.items.BrewHop;
import com.brewitbiab.items.BrewItem;

/**
 * 
 */
public class BrewItemVisitorGrainBill implements BrewItemVisitor {

    /**
     * The grain bill calculated
     */
    private float grainBill;

    /**
     * Default constructor
     */
    public BrewItemVisitorGrainBill() {
        this.grainBill = 0;
    }

    /**
     * @param item The item
     */
    public void visit(BrewFining item) {
        // TODO implement here
    }

    /**
     * Calculates the total grain bill of the fermentables
     * @param item The item
     */
    public void visit(BrewFermentable item) {
        if (item.isGrainBillCalc()) {
            this.grainBill += item.getAmount();
        }
    }

    /**
     * @param item The item
     */
    public void visit(BrewHop item) {
        // TODO implement here
    }

    /**
     * @param item The item
     */
    public void visit(BrewYeast item) {
        // TODO implement here
    }

    public void visit(BrewItem item) {
        // TODO implement here
    }

    public float getGrainBill() {
        return grainBill;
    }

    public void setGrainBill(float grainBill) {
        this.grainBill = grainBill;
    }
}