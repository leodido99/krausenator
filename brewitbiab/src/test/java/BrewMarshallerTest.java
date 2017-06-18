import com.leo.brewitbiab.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by leonard.bise on 31.03.17.
 */
public class BrewMarshallerTest {

    /**
     * Test creation of a list of objects from an xml file. The objects created are BrewItem.
     */
    @Test
    public void BrewMarshallerTest() {
        ArrayList<BrewItem> refItems = new ArrayList<>();
        refItems.add(new BrewItem() {{ setName("My Test Item #1"); setAmount(12.5f); setUnit("kg"); }});
        refItems.add(new BrewItem() {{ setName("This is item #2"); setDescription("This is a rad description"); setAmount(123123.234f); setUnit("m"); }});
        refItems.add(new BrewItem() {{ setName("Hello item #3"); setDescription("The most awesome item there is"); setAmount(-123.34f); setUnit("g"); }});

        /* Create marshaller for BrewItems */
        BrewMarshaller<BrewItems> myMarshaller = new BrewMarshaller<>(BrewItems.class, "items/test.xml");
        /* Check marshalled items */
        int idx = 0;
        for(BrewItem myItem : myMarshaller.getMarshalled().getItems()) {
            System.out.println(myItem);
            assertEquals(refItems.get(idx).getName(), myItem.getName());
            assertEquals(refItems.get(idx).getAmount(), myItem.getAmount());
            assertEquals(refItems.get(idx).getDescription(), myItem.getDescription());
            assertEquals(refItems.get(idx).getUnit(), myItem.getUnit());
            idx++;
        }
    }

    /**
     * Test creation of a list of objects from an xml file. The objects created inherit from BrewItem
     */
    @Test
    public void BrewMarshallerBrewFermentable() {
        ArrayList<BrewFermentable> refItems = new ArrayList<>();
        refItems.add(new BrewFermentable() {{ setName("Maris Otter"); setDescription("A very nice base malt used in many beers."); setEBC(4.0f); setPotentialGravity(1.035f); setAmount(0.0f); }});
        refItems.add(new BrewFermentable() {{ setName("Wheat Malt"); setDescription("Wheat malt is used to improve foam retention."); setEBC(2.0f); setPotentialGravity(1.030f); setAmount(0.0f); }});

        /* Create marshaller for BrewFermentable */
        BrewMarshaller<BrewFermentables> myMarshaller = new BrewMarshaller<>(BrewFermentables.class, "items/test_subclass.xml");
        /* Check marshalled items */
        int idx = 0;
        for(BrewFermentable myItem : myMarshaller.getMarshalled().getFermentables()) {
            System.out.println(myItem);
            assertEquals(refItems.get(idx).getName(), myItem.getName());
            assertEquals(refItems.get(idx).getAmount(), myItem.getAmount());
            assertEquals(refItems.get(idx).getDescription(), myItem.getDescription());
            assertEquals(refItems.get(idx).getUnit(), myItem.getUnit());
            assertEquals(refItems.get(idx).getEBC(), myItem.getEBC());
            assertEquals(refItems.get(idx).getPotentialGravity(), myItem.getPotentialGravity());
            idx++;
        }
    }
}
