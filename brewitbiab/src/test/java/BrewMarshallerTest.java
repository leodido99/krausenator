import com.brewitbiab.items.*;
import com.brewitbiab.manager.BrewMarshaller;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Author: leonard.bise
 * Date: 31.03.17
 * Description:
 */
public class BrewMarshallerTest {

    /**
     * Test creation of a list of objects from an xml file. The objects created are BrewItem.
     */
    @Test
    public void BrewMarshallerTestMarshall() throws FileNotFoundException {
        ArrayList<BrewItem> refItems = new ArrayList<>();
        refItems.add(new BrewItem() {{ setName("My Test Item #1"); setAmount(12.5f); setUnit("kg"); }});
        refItems.add(new BrewItem() {{ setName("This is item #2"); setDescription("This is a rad description"); setAmount(123123.234f); setUnit("m"); }});
        refItems.add(new BrewItem() {{ setName("Hello item #3"); setDescription("The most awesome item there is"); setAmount(-123.34f); setUnit("g"); }});

        /* Create marshaller for BrewItems */
        BrewMarshaller<BrewItems> myMarshaller = new BrewMarshaller<>(BrewItems.class, "items/test/test.xml");
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
    public void BrewMarshallerBrewFermentable() throws FileNotFoundException {
        ArrayList<BrewFermentable> refItems = new ArrayList<>();
        refItems.add(new BrewFermentable() {{ setName("Maris Otter"); setDescription("A very nice base malt used in many beers."); setEBC(4.0f); setPotentialGravity(1.035f); setAmount(0.0f); setGrainBillCalc(true); }});
        refItems.add(new BrewFermentable() {{ setName("Wheat Malt"); setDescription("Wheat malt is used to improve foam retention."); setEBC(2.0f); setPotentialGravity(1.030f); setAmount(0.0f); setGrainBillCalc(false); }});

        /* Create marshaller for BrewFermentable */
        BrewMarshaller<BrewFermentables> myMarshaller = new BrewMarshaller<>(BrewFermentables.class, "items/test/test_subclass.xml");

        assertEquals(myMarshaller.getMarshalled().getFermentables().size(), refItems.size());

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
            assertEquals(refItems.get(idx).isGrainBillCalc(), myItem.isGrainBillCalc());
            idx++;
        }
    }

    @Test
    public void BrewMrashallerBrewHop() throws FileNotFoundException {
        ArrayList<BrewHop> refItems = new ArrayList<>();
        refItems.add(new BrewHop() { {setName("Cascade"); setDescription("Nice american floral hop."); setAlphaAcidPercentage(7.5f); } });
        refItems.add(new BrewHop() { {setName("Saaz"); setDescription("Nice european herbal hop."); setAlphaAcidPercentage(3.4f); } });

        BrewMarshaller<BrewHops> myMarshaller = new BrewMarshaller<>(BrewHops.class, "items/test/test_hops.xml");

        assertEquals(refItems.size(), myMarshaller.getMarshalled().getHops().size());
        int idx = 0;
        for(BrewHop myItem : myMarshaller.getMarshalled().getHops()) {
            System.out.println(myItem);
            assertEquals(refItems.get(idx).getName(), myItem.getName());
            assertEquals(refItems.get(idx).getAmount(), myItem.getAmount());
            assertEquals(refItems.get(idx).getDescription(), myItem.getDescription());
            assertEquals(refItems.get(idx).getAlphaAcidPercentage(), myItem.getAlphaAcidPercentage());
            idx++;
        }

    }

    @Test
    public void BrewMrashallerBrewYeast() throws FileNotFoundException {
        ArrayList<BrewYeast> refItems = new ArrayList<>();
        refItems.add(new BrewYeast() { {setName("WY1007 German Ale"); setDescription("A true top cropping yeast with low ester formation."); setAttenuationMin(73f); setAttenuationMax(77f); setTemperatureMin(12.7f); setTemperatureMax(20.0f); } });
        refItems.add(new BrewYeast() { {setName("WY1010 American Wheat"); setDescription("A strong fermenting, true top cropping yeast that produces a dry, slightly tart, crisp beer."); setAttenuationMin(74f); setAttenuationMax(78f); setTemperatureMin(14.4f); setTemperatureMax(23.3f); } });

        BrewMarshaller<BrewYeasts> myMarshaller = new BrewMarshaller<>(BrewYeasts.class, "items/test/test_yeasts.xml");

        assertEquals(refItems.size(), myMarshaller.getMarshalled().getYeasts().size());
        int idx = 0;
        for(BrewYeast myItem : myMarshaller.getMarshalled().getYeasts()) {
            System.out.println(myItem);
            assertEquals(refItems.get(idx).getName(), myItem.getName());
            assertEquals(refItems.get(idx).getAmount(), myItem.getAmount());
            assertEquals(refItems.get(idx).getDescription(), myItem.getDescription());
            assertEquals(refItems.get(idx).getAttenuationMax(), myItem.getAttenuationMax());
            assertEquals(refItems.get(idx).getAttenuationMin(), myItem.getAttenuationMin());
            assertEquals(refItems.get(idx).getTemperatureMax(), myItem.getTemperatureMax());
            assertEquals(refItems.get(idx).getTemperatureMin(), myItem.getTemperatureMin());
            idx++;
        }

    }

    @Test
    public void BrewMrashallerBrewFining() throws FileNotFoundException {
        ArrayList<BrewFining> refItems = new ArrayList<>();
        refItems.add(new BrewFining() { {setName("Irish Moss"); setDescription("Helps making clear beer");  } });
        refItems.add(new BrewFining() { {setName("Gelatin"); setDescription("Also helps making clear beer");  } });

        BrewMarshaller<BrewFinings> myMarshaller = new BrewMarshaller<>(BrewFinings.class, "items/test/test_finings.xml");

        assertEquals(refItems.size(), myMarshaller.getMarshalled().getFinings().size());
        int idx = 0;
        for(BrewFining myItem : myMarshaller.getMarshalled().getFinings()) {
            System.out.println(myItem);
            assertEquals(refItems.get(idx).getName(), myItem.getName());
            assertEquals(refItems.get(idx).getAmount(), myItem.getAmount());
            assertEquals(refItems.get(idx).getDescription(), myItem.getDescription());
            idx++;
        }

    }
}
