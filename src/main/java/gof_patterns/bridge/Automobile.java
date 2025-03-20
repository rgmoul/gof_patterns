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

package gof_patterns.bridge;

/**
 * An abstract type (could be an interface) for a generic automobile - Abstraction in the Bridge pattern.
 */
public abstract class Automobile {
    /**
     * Constructor.
     *
     * @param impl the concrete implementation object
     */
    public Automobile(final AutomobileImplementation impl) {
        auto = impl;
    }
    /**
     * Get the engine displacement in cubic centimeters.
     *
     * @return the engine displacement
     */
    int getEngineDisplacement() {
        return auto.engineDisplacement();
    }

    /**
     * Get the horsepower.
     *
     * @return the horsepower
     */
    int getHorsepower() {
        return auto.horsepower();
    }

    /**
     * Get the seating capacity.
     *
     * @return the seating capacity
     */
    int getSeatingCapacity() {
        return auto.seatingCapacity();
    }

    /**
     * Get the weight.
     *
     * @return the weight
     */
    int getWeight() {
        return auto.weight();
    }

    private final AutomobileImplementation auto;
}
