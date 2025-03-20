/*
 * MIT License
 *
 * Copyright (c) 2025 Symbiont Software
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
