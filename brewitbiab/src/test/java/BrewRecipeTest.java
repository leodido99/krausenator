import com.brewitbiab.*;
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
import org.junit.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by leonard.bise on 31.03.17.
 */
public class BrewRecipeTest {

    BrewFermentable inGrainBill;
    BrewFermentable notInGrainBill;

    ArrayList<BrewFermentable> fermentables;
    ArrayList<BrewHop> hops;
    ArrayList<BrewFining> finings;
    ArrayList<BrewYeast> yeasts;

    @Before
    public void setUp() throws FileNotFoundException {
        /* Fermentables */
        BrewMarshaller<BrewFermentables> myFermMarshaller = new BrewMarshaller<>(BrewFermentables.class, "items/test/test_fermentables.xml");
        this.fermentables = new ArrayList<>(myFermMarshaller.getMarshalled().getFermentables());
        for(BrewFermentable myItem : myFermMarshaller.getMarshalled().getFermentables()) {
            if (this.inGrainBill == null &&  myItem.isGrainBillCalc() == true) {
                this.inGrainBill = myItem;
            }
            if (this.notInGrainBill == null &&  myItem.isGrainBillCalc() == false) {
                this.notInGrainBill = myItem;
            }
        }
        /* Hops */
        BrewMarshaller<BrewHops> myHopMarshaller = new BrewMarshaller<>(BrewHops.class, "items/test/test_hops.xml");
        this.hops = new ArrayList<>(myHopMarshaller.getMarshalled().getHops());

        /* Finings */
        BrewMarshaller<BrewFinings> myFinMarshaller = new BrewMarshaller<>(BrewFinings.class, "items/test/test_finings.xml");
        this.finings = new ArrayList<>(myFinMarshaller.getMarshalled().getFinings());

        /* Yeasts */
        BrewMarshaller<BrewYeasts> myYeastMarshaller = new BrewMarshaller<>(BrewYeasts.class, "items/test/test_yeasts.xml");
        this.yeasts = new ArrayList<>(myYeastMarshaller.getMarshalled().getYeasts());
    }

    @Test
    public void BrewRecipteTestGrainBillCalc() {
        BrewRecipe myRecipe = new BrewRecipe();
        BrewFermentable ferm;
        BrewHop hop;
        BrewFining fining;
        BrewYeast yeast;
        float expected_grain_bill = 23.93f;

        /* Add items */
        ferm = new BrewFermentable(inGrainBill);
        ferm.setAmount(1.00f);
        myRecipe.addItem(ferm);
        hop = new BrewHop(this.hops.get(0));
        hop.setAmount(5.55f);
        myRecipe.addItem(hop);
        ferm = new BrewFermentable(notInGrainBill);
        ferm.setAmount(45.34f);
        myRecipe.addItem(ferm);
        fining = new BrewFining((this.finings.get(0)));
        fining.setAmount(17.7f);
        myRecipe.addItem(fining);
        ferm = new BrewFermentable(inGrainBill);
        ferm.setAmount(1.70f);
        myRecipe.addItem(ferm);
        yeast = new BrewYeast((this.yeasts.get(0)));
        yeast.setAmount(23.56f);
        myRecipe.addItem(yeast);
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
