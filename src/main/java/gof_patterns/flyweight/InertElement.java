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

package gof_patterns.flyweight;

/**
 * An inert element - UnsharedConcreteFlyweight in the Flyweight pattern.
 */
public class InertElement implements Element {
    /** Element's periodic symbol. */
    private final String symbol;

    /** Element's atomic number. */
    private final int number;

    /** Element's atomic weight. */
    private final double weight;

    /** Element's name. */
    private final String name;

    /**
     * Constructor.
     *
     * @param name the element name
     * @param symbol the periodic symbol
     * @param number the atomic number
     * @param weight the  atomic weight
     */
    InertElement(final String name, final String symbol, final int number,
                 final double weight) {
        this.name = name;
        this.symbol = symbol;
        this.number = number;
        this.weight = weight;
    }

    /**
     * Get the element name.
     *
     * @return the name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Get the atomic number.
     *
     * @return the atomic number
     */
    @Override
    public int getNumber() {
        return number;
    }

    /**
     * Get the periodic symbol.
     *
     * @return the symbol
     */
    @Override
    public String getSymbol() {
        return symbol;
    }

    /**
     * Get the atomic weight.
     *
     * @return the weight
     */
    @Override
    public double getWeight() {
        return weight;
    }

    /**
     * Is the element inert?
     * 
     * @return always true
     */
    @Override
    public boolean isInert() {
    	return true;
    }

    /**
     * Render the element at some position in a compound.  Inert elements don't
     * exist in compounds so positions is irrelevant.  Would normally draw it
     * but for simplicity just print it.
     *
     * @param position (not used)
     */
    @Override
    public void render(final Point3D position) {
        System.out.println(symbol + " [" + number + "]  [*,*,*] (id="
                                  + hashCode() + ")");
    }

}
