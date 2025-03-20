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

import java.util.HashMap;

/**
 * Factory for creating elements, common elements are shared inert elements
 * are not, - FlyweightFactory in the Flyweight pattern.
 */
public class ElementFactory {
    /** The single factory. */
    private static final ElementFactory factory = new ElementFactory();

    /** The shared atoms. */
    private final HashMap<String,Element> elements = new HashMap<>();

    /**
     * Constructor, prevents external instantiation.
     */
    private ElementFactory() {}

    /**
     * Retrieves the ElementFactory instance.
     *
     * @return the ElementFactory instance
     */
    public static synchronized ElementFactory getInstance() {
        return factory;
    }

    /**
     * Retrieves the named element, creating it if required.
     *
     * @param periodicSymbol the periodic symbol for the atomic element
     *
     * @return the named atom
     */
    public synchronized Element createElement(final String periodicSymbol) {
        Element element = elements.get(periodicSymbol);
        if (element == null) {
            element = switch (periodicSymbol) {
                case "C" -> new CommonElement("carbon", "C", 6, 12.0107);
                case "H" -> new CommonElement("hydrogen", "H", 1, 1.00794);
                case "O" -> new CommonElement("oxygen", "O", 8, 15.9994);
                case "N" -> new CommonElement("carbon", "N", 7, 14.0067);
                default -> null;
            };
            // other elements...

            // other rare elements...
            element = switch (periodicSymbol) {
                case "He" -> new InertElement("helium ", "He", 2, 4.002602);
                case "Ne" -> new InertElement("neon ", "Ne", 10, 20.1797);
                case "Ar" -> new InertElement("argon ", "Ar", 18, 39.948);
                default -> element;
            };
            // other rare elements...

            elements.put(element.getSymbol(), element);
        }
        return element;
    }

}
