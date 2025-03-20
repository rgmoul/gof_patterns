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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

/**
 * Demonstrates the use of /tests the bridge pattern.
 */
public class BridgeTest {

    private void compare(AutomobileImplementation a, Automobile b) {
        // Note AutomobileImplementation and Automobile are not in the same hierarchy
        assertFalse(a.getClass().isAssignableFrom(b.getClass()));
        assertFalse(b.getClass().isAssignableFrom(a.getClass()));

        assertEquals(a.engineDisplacement(), b.getEngineDisplacement());
        assertEquals(a.horsepower(), b.getHorsepower());
        assertEquals(a.seatingCapacity(), b.getSeatingCapacity());
        assertEquals(a.weight(), b.getWeight());
        if (a instanceof Sportscar s) {
            assertNotEquals(0, s.getPowerWeightRatio());
        }
    }

    @Test
    void test() {
        AutomobileFactory factory;
        Sportscar car;
        SportUtility suv;

        factory = new ChevroletFactory();
        car = factory.createSportscar();
        compare(new Corvette(), car);
        car.getPowerWeightRatio();

        suv = factory.createSportUtility();
        compare(new Tahoe(), suv);

        factory = new HondaFactory();
        car = factory.createSportscar();
        compare(new S2000(), car);

        suv = factory.createSportUtility();
        compare(new Pilot(), suv);
    }

}
