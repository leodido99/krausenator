package com.leo.brewitbiab;

import java.util.*;

/**
 * 
 */
public class BrewFining extends BrewItem {

    /**
     * Default constructor
     */
    public BrewFining() {
    }

    /**
     * 
     */
    private e_BrewIt_FiningUse use;

    /**
     * @param use
     */
    public void setUse(e_BrewIt_FiningUse use) {
        this.use = use;
    }

    /**
     * @return
     */
    public e_BrewIt_FiningUse getUse() {
        return this.use;
    }

}