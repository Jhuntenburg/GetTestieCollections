import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

    @Test
    public void testAdd(){
        Set<String> expected = new TreeSet<>();
        expected.add("Baseball");
        expected.add("Football");
        expected.add("Basketball");

        Assert.assertEquals(3, expected.size());

    }
    @Test
    public void testRemove(){
        Set<String> expected = new TreeSet<>();
        expected.add("Baseball");
        expected.add("Football");
        expected.add("Basketball");

        boolean actual = expected.remove("Basketball");

        Assert.assertTrue(actual);
        Assert.assertEquals(2, expected.size());

    }
@Test
    public void testContains(){
    Set<String> expected = new TreeSet<>();
    expected.add("Baseball");
    expected.add("Football");
    expected.add("Basketball");

    Assert.assertTrue(expected.contains("Baseball"));
    Assert.assertFalse(expected.contains("Dance"));

}
@Test
    public void testIsEmpty(){
    Set<String> expected = new TreeSet<>();

    Assert.assertTrue(expected.isEmpty());

}
}
