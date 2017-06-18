import com.brewitbiab.BrewItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by leonard.bise on 17.03.17.
 */
public class BrewItemTest {

    @Test
    public void BrewItemName() {
        BrewItem myItem = new BrewItem();
        String myName = "my name #1";
        myItem.setName(myName);
        assertEquals(myName, myItem.getName());
    }

    @Test
    public void BrewItemAmount() {
        BrewItem myItem = new BrewItem();
        float myAmount = 98.5f;
        myItem.setAmount(myAmount);
        assertEquals(myAmount, myItem.getAmount());
    }
}
