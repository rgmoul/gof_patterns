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

package gof_patterns.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Demonstrates the use of / tests the Singleton implementations.
 */
public class SingletonTest {

	/** Test the coin record. */
	@Test
	void testCoinRecord() {
        int amount = 183;

        CoinRecord[] change = CoinRecord.makeChange(amount);
        int totalValue = 0;
        System.out.println("The coins:");
        for (CoinRecord element : change) {
            System.out.println("   " + element);

            // illustrates that the == operator works properly

            if (element == CoinRecord.DOLLAR) {
                totalValue += 100;
            }
            if (element == CoinRecord.HALF_DOLLAR) {
                totalValue += 50;
            }
            if (element == CoinRecord.QUARTER) {
                totalValue += 25;
            }
            if (element == CoinRecord.DIME) {
                totalValue += 10;
            }
            if (element == CoinRecord.NICKEL) {
                totalValue += 5;
            }
            if (element == CoinRecord.PENNY) {
                totalValue += 1;
            }
        }
        assertEquals(183, totalValue);
	}

	/** Test the enum coin implementation. */
	@Test
	void testCoinEnum() {
        int amount = 183;

        CoinEnum[] change = CoinEnum.makeChange(amount);
        int totalValue = 0;
        System.out.println("The coins:");
        for (CoinEnum element : change) {
            System.out.println("   " + element + ", " + element.value);

            if (element == CoinEnum.DOLLAR) {
                totalValue += 100;
            }
            if (element == CoinEnum.HALF_DOLLAR) {
                totalValue += 50;
            }
            if (element == CoinEnum.QUARTER) {
                totalValue += 25;
            }
            if (element == CoinEnum.DIME) {
                totalValue += 10;
            }
            if (element == CoinEnum.NICKEL) {
                totalValue += 5;
            }
            if (element == CoinEnum.PENNY) {
                totalValue += 1;
            }
        }
        assertEquals(183, totalValue);
	}

	@Test
	void testGlobalValues() {
        GlobalValues values = GlobalValues.instance();
        values.putGlobal("this", "that");

        GlobalValues globals = GlobalValues.instance();
        Object val = globals.getGlobal("this");
        assertEquals("that", val);
        assertSame(values, globals);
	}
}
