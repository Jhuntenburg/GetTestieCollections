import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {


    @Test
    public void testIterator(){
        List<String> expected = new ArrayList<>();
        expected.add("Chicken");
        expected.add("Beef");
        expected.add("Steak");

        Iterator<String> iterator = expected.iterator();

        Assert.assertTrue(iterator.hasNext());

    }
    @Test
    public void testNext(){
        List<String> expected = new ArrayList<>();
        expected.add("Chicken");
        expected.add("Beef");
        expected.add("Steak");

        Iterator<String> iterator = expected.iterator();

        Assert.assertEquals("Chicken", iterator.next());
        Assert.assertEquals("Beef", iterator.next());

    }

    @Test
    public void testRemove(){
        List<String> expected = new ArrayList<>();
        expected.add("Chicken");
        expected.add("Beef");
        expected.add("Steak");

        Iterator<String> iterator = expected.iterator();


        iterator.next();
        iterator.remove();

        Assert.assertEquals(2, expected.size());

    }

    @Test
    public void testForEachRemaining(){
        List<String> expected = new ArrayList<>();
        expected.add("Chicken");
        expected.add("Beef");
        expected.add("Steak");

        Iterator<String> iterator = expected.iterator();


        iterator.next();
        iterator.remove();

        List<String> actual = new ArrayList<>();
        iterator.forEachRemaining(actual::add);
        Assert.assertEquals(2, actual.size());

    }


}
