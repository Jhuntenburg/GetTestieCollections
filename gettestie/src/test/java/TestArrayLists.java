import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestArrayLists {

    @Test
    public void testAdd(){
        List<String> expected = new ArrayList<>();
        expected.add("Chicken");
        expected.add("Beef");
        expected.add("Steak");

        Assert.assertEquals(3, expected.size());
    }







}
