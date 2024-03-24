import com.example.Lab4.Entity.Item;
import com.example.Lab4.Service.ItemManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testCase {

    ItemManager is = new ItemManager();
    Item i;

    @Test
    public void testAddItem() {
        i = new Item(5, "Item32");
        Assertions.assertTrue(is.addItem(i));//Pass
//        Assertions.assertTrue(!is.addItem(i));//Failse
    }

    @Test
    public void testUpdateItem() {
        Assertions.assertTrue(is.updateItem(3, "Itemupdate"));//Pass
//        Assertions.assertTrue(!is.updateItem(3, "Itemupdate"));//Fail
    }

    @Test
    public void testDeleteItem() {
        int id = 1;
        Assertions.assertTrue(is.deleteItem(id));//Pass
//        Assertions.assertTrue(!is.deleteItem(id));//Failse
    }

}
