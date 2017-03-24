package com.leo.brewitbiab;

import java.util.*;

/**
 * 
 */
public class BrewFermentable extends BrewItem {

    /**
     * Default constructor
     */
    public BrewFermentable() {
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
     * @param ebc
     */
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

}