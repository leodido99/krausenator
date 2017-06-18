package com.brewitbiab;

import java.util.*;

/**
 * 
 */
public class BrewMashTemp {

    /**
     * Default constructor
     */
    public BrewMashTemp() {
        this.steps = new ArrayList<>();
    }

    /**
     * 
     */
    private ArrayList<BrewTemp> steps;

    /**
     * @return
     */
    public ArrayList<BrewTemp> getSteps() {
        return this.steps;
    }

    /**
     * @param value
     */
    public void setSteps(ArrayList<BrewTemp> value) {
        this.steps = value;
    }

}