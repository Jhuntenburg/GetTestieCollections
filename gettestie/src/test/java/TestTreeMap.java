import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

    @Test
    public void testPut(){
        Map<String, Integer> expected = new TreeMap<>();
        expected.put("Green Thumb", 2);
        expected.put("Ear Bells", 1);
        expected.put("Party Heart", 3);

        Assert.assertEquals(3, expected.size());

    }
    @Test
    public void testReplace(){
        Map<String, Integer> expected = new TreeMap<>();
        expected.put("Green Thumb", 2);
        expected.put("Ear Bells", 1);
        expected.put("Party Heart", 3);

        expected.replace("Green Thumb",2, 8);
        int actual = expected.get("Green Thumb");


        Assert.assertEquals(8,actual);

    }
    @Test
    public void testClear(){
        Map<String, Integer> expected = new TreeMap<>();
        expected.put("Green Thumb", 2);
        expected.put("Ear Bells", 1);
        expected.put("Party Heart", 3);

        expected.clear();

        Assert.assertEquals(0, expected.size());

    }
    @Test
    public void testContainsKey(){
        Map<String, Integer> expected = new TreeMap<>();
        expected.put("Green Thumb", 2);
        expected.put("Ear Bells", 1);
        expected.put("Party Heart", 3);

        Assert.assertTrue(expected.containsKey("Green Thumb"));

    }



}
