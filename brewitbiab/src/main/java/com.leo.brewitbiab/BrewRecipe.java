package com.leo.brewitbiab;

import java.util.*;

/**
 * 
 */
public class BrewRecipe {

    /**
     * Default constructor
     */
    public BrewRecipe() {
        this.items = new ArrayList<>();
    }

    /**
     * 
     */
    private ArrayList<BrewItem> items;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String brewer;

    /**
     * 
     */
    private int boilDuration;

    /**
     * 
     */
    private float batchSize;

    /**
     * 
     */
    private BrewMashTemp mashTemps;

    /**
     * 
     */
    private float estimatedOG;

    /**
     * 
     */
    private float estimatedFG;

    /**
     * 
     */
    private float estimatedIBU;

    /**
     * 
     */
    private float estimatedEBC;

    /**
     * 
     */
    private float estimatedABV;

    /**
     * 
     */
    public float efficiency;

    /**
     * @param item
     */
    public void addItem(BrewItem item) {
        this.items.add(item);
    }

    /**
     * @param item
     */
    public void removeItem(BrewItem item) {
        this.items.remove(item);
    }

    /**
     * @param value
     */
    public void setItems(ArrayList<BrewItem> value) {
        this.items = value;
    }

    /**
     * @return
     */
    public ArrayList<BrewItem> getItems() {
        return this.items;
    }

    /**
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param value
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * @return
     */
    public String getBrewer() {
        return this.brewer;
    }

    /**
     * @param value
     */
    public void setBrewer(String value) {
        this.brewer = value;
    }

    /**
     * @return
     */
    public int getBoilDuration() {
        return this.boilDuration;
    }

    /**
     * @param value
     */
    public void setBoilDuration(int value) {
        this.boilDuration = value;
    }

    /**
     * @return
     */
    public float getBatchSize() {
        return this.batchSize;
    }

    /**
     * @param value
     */
    public void setBatchSize(float value) {
        this.batchSize = value;
    }

    /**
     * @return
     */
    public BrewMashTemp getMashTemps() {
        return this.mashTemps;
    }

    /**
     * @param value
     */
    public void setMashTemps(BrewMashTemp value) {
        this.mashTemps = value;
    }

    /**
     * @return
     */
    public float getEstimatedOG() {
        return this.estimatedOG;
    }

    /**
     * @return
     */
    public float getEstimatedFG() {
        return this.estimatedFG;
    }

    /**
     * @return
     */
    public float getEstimatedIBU() {
        return this.estimatedIBU;
    }

    /**
     * @return
     */
    public float getEstimatedEBC() {
        return this.estimatedEBC;
    }

    /**
     * @return
     */
    public float getEstimatedABV() {
        return this.estimatedABV;
    }

    /**
     * @return
     */
    public float getEfficiency() {
        return this.efficiency;
    }

    /**
     * @param value
     */
    public void setEfficiency(float value) {
        this.efficiency = value;
    }


    /**
     * http://howtobrew.com/book/section-2/what-is-malted-grain/table-of-typical-malt-yields
     */
    private void calculateEstimatedOG() {

    }

}