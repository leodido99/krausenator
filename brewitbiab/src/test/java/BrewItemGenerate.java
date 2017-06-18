import com.leo.brewitbiab.BrewItem;
import com.leo.brewitbiab.BrewItems;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by leonard.bise on 31.03.17.
 */
public class BrewItemGenerate {
    /**
     * Tests the creation of brew items from xml files
     */
    @Test
    public void BrewItemGenerateTest() {
        try {
            /* Get file from resource folder */
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("items/test.xml").getFile());
            //File file = new File("items/test.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(BrewItems.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            BrewItems myItems = (BrewItems)jaxbUnmarshaller.unmarshal(file);
            for (BrewItem myItem : myItems.getItems()) {
                System.out.println(myItem);
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
