package com.brewitbiab.manager;

import com.brewitbiab.items.BrewYeast;
import com.brewitbiab.items.BrewFermentable;
import com.brewitbiab.items.BrewFining;
import com.brewitbiab.items.BrewHop;
import com.brewitbiab.items.BrewItem;

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

    /**
     * @param item
     */
    public void visit(BrewItem item);
}