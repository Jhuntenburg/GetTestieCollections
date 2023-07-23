import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TestLinkedLists {


@Test
    public void testAdd(){
    Queue<String> expected = new LinkedList<>();
    expected.add("Cat");
    expected.add("Dog");
    expected.add("Pig");

    Assert.assertEquals(3, expected.size());


}
@Test
    public void testPeek(){
    Queue<String> expected = new LinkedList<>();
    expected.add("Cat");
    expected.add("Dog");
    expected.add("Pig");
//    when
    String actual = expected.peek();

    Assert.assertEquals("Cat",
        actual);
}

@Test
    public void testPoll(){
    Queue<String> expected = new LinkedList<>();
    expected.add("Cat");
    expected.add("Dog");
    expected.add("Pig");
//    when
    expected.poll();

    Assert.assertEquals(2, expected.size());
}

@Test
    public void testContains(){
    Queue<String> expected = new LinkedList<>();
    expected.add("Cat");
    expected.add("Dog");
    expected.add("Pig");
//    when
    Assert.assertTrue( expected.contains("Cat"));
}


}
