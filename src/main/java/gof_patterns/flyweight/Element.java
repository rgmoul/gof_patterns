/*
 * MIT License
 *
 * Copyright (c) 2025 Russ Moul
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

package gof_patterns.flyweight;

/**
 * An interface for periodical elements - Flyweight in the Flyweight pattern.
 */
public interface Element {

    /**
     * Get the name of the element.
     *
     * @return the name of the element
     */
    String getName();

    /**
     * Get the atomic number.
     *
     * @return the atomic number
     */
    int getNumber();

    /**
     * Get the periodic symbol.
     *
     * @return the symbol
     */
    String getSymbol();

    /**
     * Get the atomic weight.
     *
     * @return the weight
     */
    double getWeight();

    /**
     * Is the element inert?
     * 
     * @return true if the element is inert
     */
    boolean isInert();

    /**
     * Render the element at some position within a compound.
     *
     * @param position the position of the element within a compound
     */
    void render(final Point3D position);
}