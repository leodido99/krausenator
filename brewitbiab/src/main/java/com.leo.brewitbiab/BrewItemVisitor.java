package com.leo.brewitbiab;

import java.util.*;

/**
 * 
 */
public interface BrewItemVisitor {

    /**
     * @param item
     */
    public void visit(BrewFining item);

    /**
     * @param item
     */
    public void visit(BrewFermentable item);

    /**
     * @param item
     */
    public void visit(BrewHop item);

    /**
     * @param item
     */
    public void visit(BrewYeast item);

}