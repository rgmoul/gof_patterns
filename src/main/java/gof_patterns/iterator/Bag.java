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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Bag collection - IterableCollection in Iterator pattern, implements Java Iterable interface.
 * <p>
 * <b>Use type-safe collections from the Java Collections Framework whenever possible.</b>
 */
public class Bag implements Iterable<Object> {
    private final ArrayList<Object> bagList = new ArrayList<>();
    private final HashSet<Object> bagSet = new HashSet<>();

    /**
     * Adds an object to the bag if not already in the bag.
     *
     * @param o object to add
     * @return true if the object was added otherwise false
     */
    public boolean add(Object o) {
        if (bagSet.contains(o)) {
            return false;
        }
        bagList.add(o);
        bagSet.add(o);
        return true;
    }

    /**
     * Removes an object from the bag
     *
     * @param o the object to remove
     *
     * @throws NoSuchElementException if the object is not in the bag
     */
    public void remove(Object o) throws NoSuchElementException {
        if (!bagSet.contains(o)) {
            throw new NoSuchElementException("Object not in bag.");
        }
        bagList.remove(o);
        bagSet.remove(o);
    }

    /**
     * Get the number of items in the bag.
     * @return the number of items in the bag
     */
    public int size() {
        return bagList.size();
    }

    /**
     * Get an iterator over the bag.
     *
     * @return an iterator over the bag
     */
    @Override
    public Iterator<Object> iterator() {
        return new BagIterator();
    }

    /**
     * BagIterator custom iterator - ConcreteIterator in Iterator pattern, implements Java Iterator interface.
     */
    private class BagIterator implements Iterator<Object> {
        private int index = 0;

        /**
         * Indicates if there are any items remaining in the iteration.
         *
         * @return true if there are items remaining in the iteration
         */
        @Override
        public boolean hasNext() {
            return index < bagList.size();
        }

        /**
         * Gets the next item from the iteration.
         *
         * @return the next item from the iteration
         * @throws NoSuchElementException if there are no more items in the iteration
         */
        @Override
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return bagList.get(index++);
        }
    }

}
