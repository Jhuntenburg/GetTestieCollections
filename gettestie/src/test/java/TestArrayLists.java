import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestArrayLists {

    @Test
    public void testAdd() {
        List<String> expected = new ArrayList<>();
        expected.add("Chicken");
        expected.add("Beef");
        expected.add("Steak");

        Assert.assertEquals(3, expected.size());
    }

    @Test
    public void testRemove() {
        List<String> expected = new ArrayList<>();
        expected.add("Chicken");
        expected.add("Beef");
        expected.add("Steak");
//        when
        expected.remove(0);
//        then
        Assert.assertEquals(2, expected.size());
    }

    @Test
    public void testClear() {
        List<String> expected = new ArrayList<>();
        expected.add("Chicken");
        expected.add("Beef");
        expected.add("Steak");

//    when
        expected.clear();
//        then
        Assert.assertEquals(0, expected.size());
    }
    @Test
    public void testContains(){
        List<String> expected = new ArrayList<>();
        expected.add("Chicken");
        expected.add("Beef");
        expected.add("Steak");

        Assert.assertTrue(expected.contains("Steak"));

    }

}
