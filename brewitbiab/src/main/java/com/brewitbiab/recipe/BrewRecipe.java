package com.brewitbiab.recipe;

import com.brewitbiab.items.BrewFermentable;
import com.brewitbiab.items.BrewItem;
import com.brewitbiab.manager.BrewItemVisitorGrainBill;

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
     * Copy constructor
     * @param item item to copy
     */
    public BrewRecipe(BrewRecipe item) {
        this.items = new ArrayList<>(item.items);
        this.name = item.name;
        this.brewer = item.brewer;
        this.boilDuration = item.boilDuration;
        this.batchSize = item.batchSize;
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
     * The estimated Original Gravity is the wort gravity expected to be achieved before fermentation.
     */
    private float estimatedOG;

    /**
     * The estimated Final Gravity is the wort gravity expected to be reached after fermenation occurred.
     */
    private float estimatedFG;

    /**
     * The estimated IBU is the expected wort bitterness level.
     */
    private float estimatedIBU;

    /**
     * EBC is the beer color.
     */
    private float estimatedEBC;

    /**
     * ABV - Alcohol by Volume, is the amount of alcohol contained in the beer.
     */
    private float estimatedABV;

    /**
     * Total amount of grain
     */
    private float grainBill;

    /**
     * The brewer efficiency. The expected percentage of sugar that can be extracted from the grain with the brewer's
     * equipment and setup.
     * User defined.
     */
    private float efficiency;

    /**
     * Returns the grain bill
     * @return the grain bill
     */
    public float getGrainBill() {
        return this.grainBill;
    }

    /**
     * Update the grain bill provided by the item
     * @param item Fermentable item to be added to grain bill
     */
    private void updateGrainBill(BrewFermentable item) {
        this.grainBill += item.getAmount();
    }

    /**
     * Update the classes values from the added item
     * @param item added item
     */
    private void update(BrewItem item){
        if (item instanceof BrewFermentable) {
            BrewFermentable itemFerm = (BrewFermentable)item;
            if (itemFerm.isGrainBillCalc()) {
                this.updateGrainBill(itemFerm);
            }
            /* TODO */
        }
    }

    /**
     * Updates all values of the class
     */
    public void update() {
        BrewItemVisitorGrainBill grainBillVisitor = new BrewItemVisitorGrainBill();

        for(BrewItem item : this.items) {
            item.accept(grainBillVisitor);
        }
        /* Grain Bill */
        this.grainBill = grainBillVisitor.getGrainBill();
    }

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

    /**
     * The estimated Original Gravity is the wort gravity expected to be achieved before fermentation.
     * It is calculated using the fermentable grain extract potential with the fermentable amount.
     * grain1 amount * grain1 potential + grain2 amount * grain2 potential + grainN amount * grainN potential
     * = total points (fractional part of potential)
     * This gives the theoretical potential, an efficiency factor has to be applied on it.
     * Lastly it must be divided by the into fermenter volume to get an estimatedOG/PerLiters
     *
     * http://brewgr.com/calculations/original-gravity
     */
    private void calculateEstimatedOG(float totalGravityPoints) {
        /* TODO Add division by into fermenter volume */
        this.estimatedOG = totalGravityPoints * this.efficiency;
    }

    private float getAttenuation() {
        return 0.0f;
    }

    /**
     * The estimated Final Gravity is the wort gravity expected to be reached after fermenation occurred.
     * It is calculated from the Original Gravity and the yeast Attenuation percentage (the amount of sugar the yeast
     * will consume).
     * Final Gravity = 1 + ((Total Gravity Points * (1 - Attenuation Percent)) / 1000)
     *
     * http://brewgr.com/calculations/final-gravity
     */
    private void calculateEstimatedFG(float totalGravityPoints) {
        this.estimatedFG = 1 + ((totalGravityPoints * (1 - this.getAttenuation()))/ 1000);
    }

    /**
     * The estimated IBU is the expected wort bitterness level.
     * It is calculated by taking into account the Alpha Acid % of the hops used.
     * Most commonly used formula is called the Tinseth formula.
     *
     * http://brewgr.com/calculations/ibu-hop-bitterness
     */
    private void calculateEstimatedIBU() {

    }

    /**
     * EBC is the beer color.
     * It is calculated by taking each grain color value and amount.
     *
     * http://brewgr.com/calculations/srm-beer-color
     */
    private void calculateEstimatedEBC() {

    }

    /**
     * ABV - Alcohol by Volume, is the amount of alcohol contained in the beer.
     * It is calculated by using the FG and OG.
     *
     * http://brewgr.com/calculations/alcohol-content
     */
    private void calculateEstimatedABV() {

    }

}