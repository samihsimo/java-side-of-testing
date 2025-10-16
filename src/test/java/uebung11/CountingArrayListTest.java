package uebung11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountingArrayListTest {

    @Test
    public void testCount() {
        CountingArrayList<String> list = new CountingArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");

        assertEquals(2, list.count("apple"));
        assertEquals(1, list.count("banana"));
        assertEquals(0, list.count("cherry"));
    }

    @Test
    public void testGetCount() {
        CountingArrayList<String> list = new CountingArrayList<>();
        list.add("apple");
        list.add("apple");
        list.add("banana");

        assertEquals(3, list.getCount());
    }

    @Test
    public void testUnique() {
        CountingArrayList<String> list = new CountingArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");

        assertEquals(2, list.unique());
    }
}
