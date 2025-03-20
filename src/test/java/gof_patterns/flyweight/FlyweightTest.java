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

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

/**
 * Demonstrates the use of / tests the flyweight pattern.
 */
public class FlyweightTest {

    /**
     * Creates and uses shared and unshared concrete flyweight objects.
     */
    @Test
    public void testElement() {
        ElementFactory factory = ElementFactory.getInstance();
        Compound compound = new Compound();

        compound.addElement(factory.createElement("H"),
                            new Point3D(-1.14937, -3.04328, -3.67266));
        compound.addElement(factory.createElement("C"),
                            new Point3D(-0.34354, -2.64179, -3.04915));
        compound.addElement(factory.createElement("C"),
                            new Point3D(1.70961, -1.65418, -1.47979));
        compound.addElement(factory.createElement("C"),
                            new Point3D(-0.60766, -1.56214, -2.20086));
        compound.addElement(factory.createElement("C"),
                            new Point3D(0.92269, -3.21090, -3.10934));
        compound.addElement(factory.createElement("C"),
                            new Point3D(1.96759, -2.72261, -2.32098));
        compound.addElement(factory.createElement("C"),
                            new Point3D(0.42293, -1.07194, -1.42089));
        compound.addElement(factory.createElement("H"),
                            new Point3D(-1.60973, -1.12145, -2.15064));
        compound.addElement(factory.createElement("H"),
                            new Point3D(1.10566, -4.05612, -3.78129));
        compound.addElement(factory.createElement("H"),
                            new Point3D(2.96477, -3.17298, -2.36242));
        compound.addElement(factory.createElement("H"),
                            new Point3D(1.83912,  1.62859,  1.58965));
        compound.addElement(factory.createElement("C"),
                            new Point3D(2.58144, -0.95071, -0.54135));
        compound.addElement(factory.createElement("C"),
                            new Point3D(3.75749,  0.63359,  1.39456));
        compound.addElement(factory.createElement("C"),
                            new Point3D(1.83367,  0.06956,  0.09322));
        compound.addElement(factory.createElement("C"),
                            new Point3D(3.90949, -1.16740, -0.21924));
        compound.addElement(factory.createElement("C"),
                            new Point3D(4.49358, -0.35755,  0.75785));
        compound.addElement(factory.createElement("C"),
                            new Point3D(2.41546,  0.85640,  1.06981));
        compound.addElement(factory.createElement("H"),
                            new Point3D(4.22900,  1.24681,  2.16992));
        compound.addElement(factory.createElement("H"),
                            new Point3D(4.48209, -1.95974, -0.71231));
        compound.addElement(factory.createElement("H"),
                            new Point3D(5.54258, -0.51492,  1.03005));
        compound.addElement(factory.createElement("C"),
                            new Point3D(0.41263,  0.08890, -0.44036));
        compound.addElement(factory.createElement("C"),
                            new Point3D(-0.00556,  1.40901, -1.16296));
        compound.addElement(factory.createElement("C"),
                            new Point3D(-0.63464, -0.05891,  0.64344));
        compound.addElement(factory.createElement("C"),
                            new Point3D(-1.47378,  0.99799,  0.68064));
        compound.addElement(factory.createElement("C"),
                            new Point3D(-0.68372, -1.24894,  1.52606));
        compound.addElement(factory.createElement("C"),
                            new Point3D(-2.59805,  1.24208,  1.62903));
        compound.addElement(factory.createElement("N"),
                            new Point3D(-1.23204,  3.29961, -0.01051));
        compound.addElement(factory.createElement("H"),
                            new Point3D(-0.42261,  1.15524, -2.17274));
        compound.addElement(factory.createElement("N"),
                            new Point3D(-1.18662,  1.95036, -0.37375));
        compound.addElement(factory.createElement("C"),
                            new Point3D(1.08189,  2.40346, -1.37512));
        compound.addElement(factory.createElement("C"),
                            new Point3D(-0.30043,  4.12637, -0.38410));
        compound.addElement(factory.createElement("C"),
                            new Point3D(0.91564,  3.69413, -1.05765));
        compound.addElement(factory.createElement("H"),
                            new Point3D(2.00908,  2.02137, -1.81810));
        compound.addElement(factory.createElement("H"),
                            new Point3D(-0.45447,  5.18029, -0.12432));
        compound.addElement(factory.createElement("H"),
                            new Point3D(1.68550,  4.44722, -1.25358));
        compound.addElement(factory.createElement("O"),
                            new Point3D(0.15946, -1.63921,  2.30422));
        compound.addElement(factory.createElement("O"),
                            new Point3D(-1.85645, -1.94582,  1.38988));
        compound.addElement(factory.createElement("O"),
                            new Point3D(-2.50683,  1.63964,  2.76815));
        compound.addElement(factory.createElement("O"),
                            new Point3D(-3.90254,  1.00262,  1.31638));
        compound.addElement(factory.createElement("C"),
                            new Point3D(-2.05174, -3.09560,  2.18550));
        compound.addElement(factory.createElement("C"),
                            new Point3D(-4.22748,  0.53549,  0.02760));
        compound.addElement(factory.createElement("H"),
                            new Point3D(-3.61380, -0.32008, -0.27896));
        compound.addElement(factory.createElement("H"),
                            new Point3D(-4.14453,  1.33657, -0.71435));
        compound.addElement(factory.createElement("H"),
                            new Point3D(-5.27210,  0.23153,  0.13488));
        compound.addElement(factory.createElement("H"),
                            new Point3D(-1.99335, -2.87058,  3.25594));
        compound.addElement(factory.createElement("H"),
                            new Point3D(-1.33502, -3.88407,  1.93295));
        compound.addElement(factory.createElement("H"),
                            new Point3D(-3.06617, -3.39783,  1.91314));

        checkElementUniqueness(compound);

        System.out.println("Render compound...");
        compound.renderElement();

        Element neon = factory.createElement("Ne");
        System.out.println();
        System.out.println("Render element...");
        neon.render(null);

        Element neon2 = factory.createElement("Ne");
        neon2.render(null);
        assertEquals(neon, neon2);
    }

    /**
     * Creates and uses shared and unshared concrete flyweight enum objects.
     */
    @Test
    public void testElementEnum() {
        Compound compound = new Compound();

        compound.addElement(ElementEnum.H,
                            new Point3D(-1.14937, -3.04328, -3.67266));
        compound.addElement(ElementEnum.C,
                            new Point3D(-0.34354, -2.64179, -3.04915));
        compound.addElement(ElementEnum.C,
                            new Point3D(1.70961, -1.65418, -1.47979));
        compound.addElement(ElementEnum.C,
                            new Point3D(-0.60766, -1.56214, -2.20086));
        compound.addElement(ElementEnum.C,
                            new Point3D(0.92269, -3.21090, -3.10934));
        compound.addElement(ElementEnum.C,
                            new Point3D(1.96759, -2.72261, -2.32098));
        compound.addElement(ElementEnum.C,
                            new Point3D(0.42293, -1.07194, -1.42089));
        compound.addElement(ElementEnum.H,
                            new Point3D(-1.60973, -1.12145, -2.15064));
        compound.addElement(ElementEnum.H,
                            new Point3D(1.10566, -4.05612, -3.78129));
        compound.addElement(ElementEnum.H,
                            new Point3D(2.96477, -3.17298, -2.36242));
        compound.addElement(ElementEnum.H,
                            new Point3D(1.83912,  1.62859,  1.58965));
        compound.addElement(ElementEnum.C,
                            new Point3D(2.58144, -0.95071, -0.54135));
        compound.addElement(ElementEnum.C,
                            new Point3D(3.75749,  0.63359,  1.39456));
        compound.addElement(ElementEnum.C,
                            new Point3D(1.83367,  0.06956,  0.09322));
        compound.addElement(ElementEnum.C,
                            new Point3D(3.90949, -1.16740, -0.21924));
        compound.addElement(ElementEnum.C,
                            new Point3D(4.49358, -0.35755,  0.75785));
        compound.addElement(ElementEnum.C,
                            new Point3D(2.41546,  0.85640,  1.06981));
        compound.addElement(ElementEnum.H,
                            new Point3D(4.22900,  1.24681,  2.16992));
        compound.addElement(ElementEnum.H,
                            new Point3D(4.48209, -1.95974, -0.71231));
        compound.addElement(ElementEnum.H,
                            new Point3D(5.54258, -0.51492,  1.03005));
        compound.addElement(ElementEnum.C,
                            new Point3D(0.41263,  0.08890, -0.44036));
        compound.addElement(ElementEnum.C,
                            new Point3D(-0.00556,  1.40901, -1.16296));
        compound.addElement(ElementEnum.C,
                            new Point3D(-0.63464, -0.05891,  0.64344));
        compound.addElement(ElementEnum.C,
                            new Point3D(-1.47378,  0.99799,  0.68064));
        compound.addElement(ElementEnum.C,
                            new Point3D(-0.68372, -1.24894,  1.52606));
        compound.addElement(ElementEnum.C,
                            new Point3D(-2.59805,  1.24208,  1.62903));
        compound.addElement(ElementEnum.N,
                            new Point3D(-1.23204,  3.29961, -0.01051));
        compound.addElement(ElementEnum.H,
                            new Point3D(-0.42261,  1.15524, -2.17274));
        compound.addElement(ElementEnum.N,
                            new Point3D(-1.18662,  1.95036, -0.37375));
        compound.addElement(ElementEnum.C,
                            new Point3D(1.08189,  2.40346, -1.37512));
        compound.addElement(ElementEnum.C,
                            new Point3D(-0.30043,  4.12637, -0.38410));
        compound.addElement(ElementEnum.C,
                            new Point3D(0.91564,  3.69413, -1.05765));
        compound.addElement(ElementEnum.H,
                            new Point3D(2.00908,  2.02137, -1.81810));
        compound.addElement(ElementEnum.H,
                            new Point3D(-0.45447,  5.18029, -0.12432));
        compound.addElement(ElementEnum.H,
                            new Point3D(1.68550,  4.44722, -1.25358));
        compound.addElement(ElementEnum.O,
                            new Point3D(0.15946, -1.63921,  2.30422));
        compound.addElement(ElementEnum.O,
                            new Point3D(-1.85645, -1.94582,  1.38988));
        compound.addElement(ElementEnum.O,
                            new Point3D(-2.50683,  1.63964,  2.76815));
        compound.addElement(ElementEnum.O,
                            new Point3D(-3.90254,  1.00262,  1.31638));
        compound.addElement(ElementEnum.C,
                            new Point3D(-2.05174, -3.09560,  2.18550));
        compound.addElement(ElementEnum.C,
                            new Point3D(-4.22748,  0.53549,  0.02760));
        compound.addElement(ElementEnum.H,
                            new Point3D(-3.61380, -0.32008, -0.27896));
        compound.addElement(ElementEnum.H,
                            new Point3D(-4.14453,  1.33657, -0.71435));
        compound.addElement(ElementEnum.H,
                            new Point3D(-5.27210,  0.23153,  0.13488));
        compound.addElement(ElementEnum.H,
                            new Point3D(-1.99335, -2.87058,  3.25594));
        compound.addElement(ElementEnum.H,
                            new Point3D(-1.33502, -3.88407,  1.93295));
        compound.addElement(ElementEnum.H,
                            new Point3D(-3.06617, -3.39783,  1.91314));

        checkElementUniqueness(compound);

        System.out.println("Render compound...");
        compound.renderElement();

        Element neon = ElementEnum.Ne;
        System.out.println();
        System.out.println("Render element...");
        neon.render(null);

        Element neon2 = ElementEnum.Ne;
        neon2.render(null);
        assertEquals(neon, neon2);
    }

    /**
     * Helper method to verify there is a single flyweight for each element in the compound.
     *
     * @param compound the compound to check
     */
    private void checkElementUniqueness(Compound compound) {
        HashMap<String, Element> uniqueElements = new HashMap<>();
        for(ElementInCompound ce : compound) {
            if (uniqueElements.containsKey(ce.element().getSymbol())) {
                assertEquals(ce.element(),  uniqueElements.get(ce.element().getSymbol()));
            } else {
                uniqueElements.put(ce.element().getSymbol(), ce.element());
            }
        }
    }

}
