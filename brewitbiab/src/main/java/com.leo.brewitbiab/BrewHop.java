package com.leo.brewitbiab;

/**
 * 
 */
public class BrewHop extends BrewItem {

    /**
     * Default constructor
     */
    public BrewHop() {
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
    private e_BrewIt_HopUse use;

    /**
     * @param aa
     */
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
    public void setUse(e_BrewIt_HopUse use) {
        this.use = use;
    }

    /**
     * @return
     */
    public e_BrewIt_HopUse getUse() {
        return this.use;
    }

}