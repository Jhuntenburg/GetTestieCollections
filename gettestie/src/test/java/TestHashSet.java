import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {


    @Test
        public void testAdd(){


    Set<String> set = new HashSet<>();
    set.add("Joe");
    set.add("Jessi");
    set.add("Charlie");

        Assert.assertEquals(3, set.size());

    }

    @Test
    public void testRemove(){
        Set<String> set = new HashSet<>();
        set.add("Joe");
        set.add("Jessi");
        set.add("Charlie");
//        when
        set.remove("Joe");
//        then
        Assert.assertEquals(2,set.size());
    }

@Test
    public void testIsEmpty(){
    Set<String> set = new HashSet<>();

    Assert.assertTrue(set.isEmpty());

}

@Test
    public void testClone(){
//        Given
    Set<String> set = new HashSet<>();
    set.add("Joe");
    set.add("Jessi");
    set.add("Charlie");
//    when
    Set<String> clone = new HashSet<>(set);
//    then
    Assert.assertEquals(set, clone);


}


}
