import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDequeue {
@Test
    public void testAddFirst(){
    Deque<String> expected = new ArrayDeque<>();
    expected.add("chocolate");
    expected.add("strawberry");
    expected.addFirst("Vanilla");

    Assert.assertEquals("Vanilla", expected.peekFirst());
}

@Test
    public void testPeekLast(){
    Deque<String> expected = new ArrayDeque<>();
    expected.add("chocolate");
    expected.add("strawberry");
    expected.addFirst("Vanilla");

    String actual = expected.peekLast();

    Assert.assertEquals("strawberry", actual);

}
@Test
    public void testIsEmpty(){
    Deque<String> expected = new ArrayDeque<>();
    expected.add("chocolate");
    expected.add("strawberry");
    expected.addFirst("Vanilla");

    expected.remove();
    expected.remove();
    expected.remove();

    Assert.assertTrue(expected.isEmpty());
}

@Test
    public void testRemoveLast(){
    Deque<String> expected = new ArrayDeque<>();
    expected.add("chocolate");
    expected.add("strawberry");
    expected.addFirst("Vanilla");

    String actual = expected.removeLast();

    Assert.assertEquals("strawberry", actual);
}

}
