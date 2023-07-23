import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class TestStack {

    @Test
    public void testStackPush() {
        Stack<String> expected = new Stack<>();
        expected.push("One");
        expected.push("Two");
        expected.push("Three");

        Assert.assertEquals(3, expected.size());

    }

    @Test
    public void testPop() {
        Stack<String> expected = new Stack<>();
        expected.push("One");
        expected.push("Two");
        expected.push("Three");

        String actual = expected.pop();

        Assert.assertEquals("Three", actual);
        Assert.assertEquals(2, expected.size());


    }

    @Test
    public void testPeek() {
        Stack<String> expected = new Stack<>();
        expected.push("One");
        expected.push("Two");
        expected.push("Three");

        String actual = expected.peek();

        Assert.assertEquals("Three", actual);
        Assert.assertEquals(3, expected.size());


    }
@Test
    public void testEmpty(){
    Stack<String> expected = new Stack<>();
    expected.push("One");
    expected.push("Two");
    expected.push("Three");

   Assert.assertFalse(expected.empty());


}

}
