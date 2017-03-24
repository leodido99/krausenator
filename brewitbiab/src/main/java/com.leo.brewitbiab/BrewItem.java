package com.leo.brewitbiab;

import java.util.*;

/**
 * 
 */
public class BrewItem {

    /**
     * Default constructor
     */
    public BrewItem() {
    }

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private float amount;

    /**
     * 
     */
    public String unit;

    /**
     * @param name 
     * @param amount
     */
    public void BrewItem(String name, float amount) {
        this.name = name;
        this.amount = amount;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param amount
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }

    /**
     * @return
     */
    public float getAmount() {
        return this.amount;
    }

    /**
     * @return
     */
    public String getUnit() {
        return this.unit;
    }

    /**
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

}