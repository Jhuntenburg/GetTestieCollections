package rocks.zipcode;

import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;

public class TestHashMaps {

    @Test
    public void testPut() {
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("Joe", 39);
        expected.put("Jessi", 38);
        expected.put("Charlie", 9);


//        Then
        Assert.assertEquals(3, expected.size());
    }

    @Test
    public void testGet() {
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("Joe", 39);
        expected.put("Jessi", 38);
        expected.put("Charlie", 9);
//        When
        Integer actual = expected.get("Joe");
//        Then
        Assert.assertEquals(39, actual.intValue());
    }

    @Test
    public void testRemove() {
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("Joe", 39);
        expected.put("Jessi", 38);
        expected.put("Charlie", 9);
//        When
        expected.remove("Joe");
//        Then
        Assert.assertEquals(2, expected.size());
    }

    @Test
    public void testContainsKey() {
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("Joe", 39);
        expected.put("Jessi", 38);
        expected.put("Charlie", 9);

        Assert.assertTrue(expected.containsKey("Joe"));

    }


}
