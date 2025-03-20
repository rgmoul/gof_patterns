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
 * The Chevrolet sportscar - ConcreteImplementor in the Bridge pattern.
 */
public class Corvette implements AutomobileImplementation {

    /**
     * @see gof_patterns.bridge.Automobile#getEngineDisplacement()
     */
    @Override
    public int engineDisplacement() {
        return 6000;
    }

    /**
     * @see gof_patterns.bridge.Automobile#getHorsepower()
     */
    @Override
    public int horsepower() {
        return 400;
    }

    /**
     * @see gof_patterns.bridge.Automobile#getSeatingCapacity()
     */
    @Override
    public int seatingCapacity() {
        return 2;
    }

    /**
     * @see gof_patterns.bridge.Automobile#getWeight()
     */
    @Override
    public int weight() {
        return 3179;
    }

}
