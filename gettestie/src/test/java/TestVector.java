import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class TestVector {

    @Test
    public void testCapacity(){
        Vector<String> expected = new Vector<>();

        Assert.assertEquals(10, expected.capacity());


    }

    @Test
    public void testAdd(){
        Vector<String> expected = new Vector<>();
        expected.add("Monday");
        expected.add("Tuesday");
        expected.add("Wednesday");

        Assert.assertTrue(expected.contains("Monday"));


    }

    @Test
    public void testRemove(){
        Vector<String> expected = new Vector<>();
        expected.add("Monday");
        expected.add("Tuesday");
        expected.add("Wednesday");

       expected.remove("Monday");

       Assert.assertFalse(expected.contains("Monday"));

    }
@Test
    public void testRemoveAllElements(){
    Vector<String> expected = new Vector<>();
    expected.add("Monday");
    expected.add("Tuesday");
    expected.add("Wednesday");

    expected.removeAllElements();


    Assert.assertFalse(expected.contains("Monday"));
    Assert.assertFalse(expected.contains("Tuesday"));
    Assert.assertFalse(expected.contains("Wednesday"));



}


}
