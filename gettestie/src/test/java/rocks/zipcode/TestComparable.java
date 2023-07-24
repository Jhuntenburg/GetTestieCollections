package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class TestComparable {

    @Test
    public void testComparable(){
        Person joe = new Person("Joe", 1984);
        Person manny = new Person("Manny", 2000);
//        Person min = new Person("Min", 1996);

        Assert.assertTrue(joe.compareTo(manny) <= 0);
    }
}
