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

package gof_patterns.bridge;

/**
 * An interface for a generic automobile implementation - Implementor in the
 * Bridge pattern.  Note that this interface is different than that specified by
 * the Automobile class.
 */
public interface AutomobileImplementation {
    /**
     * Get the engine displacement in cubic centimeters.
     *
     * @return the engine displacement
     */
    int engineDisplacement();

    /**
     * Get the horsepower.
     *
     * @return the horsepower
     */
    int horsepower();

    /**
     * Get the seating capacity.
     *
     * @return the seating capacity
     */
    int seatingCapacity();

    /**
     * Get the weight.
     *
     * @return the weight
     */
    int weight();
}
