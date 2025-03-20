package gof_patterns.iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

/**
 * Demonstrates the use of / tests the Iterator pattern.
 */
public class IteratorTest {

    @Test
    void test() {
        Bag bag = new Bag();

        bag.add(42);
        bag.add("Hello");
        bag.add(3.14);
        bag.add(false);
        bag.add("Goodbye");

        assertFalse(bag.add(3.14)); // duplicate

        assertEquals(5, bag.size());

        // use the Iterator interface methods
        int counter = 0;
        for (Object o : bag) {
            System.out.println(o);
            counter++;
        }
        assertEquals(5,counter);

        bag.remove("Hello");
        assertEquals(4, bag.size());

        // or use the enhanced for loop
        System.out.println();
        counter = 0;
        for (Object o : bag) {
            System.out.println(o);
            counter++;
        }
        assertEquals(4,counter);
    }

}
