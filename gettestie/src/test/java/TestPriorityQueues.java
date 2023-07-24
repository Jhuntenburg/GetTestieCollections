import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class TestPriorityQueues {


    @Test
    public void testAdd() {
        PriorityQueue<Integer> expected = new PriorityQueue<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);

        Assert.assertEquals(3, expected.size());
    }

    @Test
    public void testRemove() {
        PriorityQueue<Integer> expected = new PriorityQueue<>();
        expected.add(10);
        expected.add(20);
        expected.add(3);

        int removed = expected.remove();

        Assert.assertEquals(3, removed);
    }

    @Test
    public void testPeek() {
        PriorityQueue<Integer> expected = new PriorityQueue<>();
        expected.add(10);
        expected.add(20);
        expected.add(3);

        int peek = expected.peek();

        Assert.assertEquals(3, peek);
    }
    @Test
    public void testIsEmpty() {
        PriorityQueue<Integer> expected = new PriorityQueue<>();
        expected.add(10);
        expected.add(20);
        expected.add(3);

        expected.remove();
        expected.remove();
        expected.remove();

        Assert.assertTrue(expected.isEmpty());


    }
}
