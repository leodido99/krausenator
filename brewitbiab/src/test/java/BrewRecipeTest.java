import com.leo.brewitbiab.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by leonard.bise on 31.03.17.
 */
public class BrewRecipeTest {




    @Test
    public void BrewRecipeTestItems() {
        BrewRecipe myRecipe = new BrewRecipe();
        BrewItem myBrewItem = new BrewItem();
        BrewFermentable myBrewFermentable = new BrewFermentable();
        BrewFining myBrewFining = new BrewFining();
        BrewHop myBrewHop = new BrewHop();
        BrewYeast myBrewYeast = new BrewYeast();

        /* Add all items */
        myRecipe.addItem(myBrewItem);
        myRecipe.addItem(myBrewFermentable);
        myRecipe.addItem(myBrewFining);
        myRecipe.addItem(myBrewHop);
        myRecipe.addItem(myBrewYeast);

        assertEquals(myRecipe.getItems().size(), 5);

        /* Remove all */
        myRecipe.removeItem(myBrewItem);
        myRecipe.removeItem(myBrewFermentable);
        myRecipe.removeItem(myBrewFining);
        myRecipe.removeItem(myBrewHop);
        myRecipe.removeItem(myBrewYeast);

        assertEquals(myRecipe.getItems().size(), 0);

        /* Add all items */
        myRecipe.addItem(myBrewItem);
        myRecipe.addItem(myBrewFermentable);
        myRecipe.addItem(myBrewFining);
        myRecipe.addItem(myBrewHop);
        myRecipe.addItem(myBrewYeast);

        assertEquals(myRecipe.getItems().size(), 5);

        for(BrewItem myItem : myRecipe.getItems()) {
            System.out.println(myItem);
        }





    }



}
