import com.brewitbiab.*;
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
import org.junit.*;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by leonard.bise on 31.03.17.
 */
public class BrewRecipeTest {

    BrewFermentable inGrainBill;
    BrewFermentable notInGrainBill;

    @Before
    public void setUp() throws FileNotFoundException {
        BrewMarshaller<BrewFermentables> myMarshaller = new BrewMarshaller<>(BrewFermentables.class, "items/test/test_fermentables.xml");

        /* Find items */
        for(BrewFermentable myItem : myMarshaller.getMarshalled().getFermentables()) {
            if (this.inGrainBill == null &&  myItem.isGrainBillCalc() == true) {
                this.inGrainBill = myItem;
            }
            if (this.notInGrainBill == null &&  myItem.isGrainBillCalc() == false) {
                this.notInGrainBill = myItem;
            }
        }


    }

    @Test
    public void BrewRecipteTestGrainBillCalc() {
        BrewRecipe myRecipe = new BrewRecipe();
        BrewFermentable ferm;
        float expected_grain_bill = 24.93f;

        /* Add items */
        ferm = new BrewFermentable(inGrainBill);
        ferm.setAmount(2.00f);
        myRecipe.addItem(ferm);
        ferm = new BrewFermentable(notInGrainBill);
        ferm.setAmount(45.34f);
        myRecipe.addItem(ferm);
        ferm = new BrewFermentable(inGrainBill);
        ferm.setAmount(1.70f);
        myRecipe.addItem(ferm);
        ferm = new BrewFermentable(inGrainBill);
        ferm.setAmount(21.23f);
        myRecipe.addItem(ferm);
        ferm = new BrewFermentable(notInGrainBill);
        ferm.setAmount(100.23f);
        myRecipe.addItem(ferm);

        /* Update recipe */
        myRecipe.update();

        assertEquals(expected_grain_bill, myRecipe.getGrainBill());
        System.out.println("Calculated Grain Bill: " + myRecipe.getGrainBill());

    }


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
