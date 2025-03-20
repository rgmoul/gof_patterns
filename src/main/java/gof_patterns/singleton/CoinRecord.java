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

package gof_patterns.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * An enumerated value record for coins - variant of Singleton in the Singleton
 * pattern.
 * <p>
 * Each defined value is implemented as a specialized variety of
 * the Singleton pattern.  Each of the enumerated values is essentially
 * a "singleton" of the same class.
 */
public record CoinRecord(int value, String name) {
    // Using eager initialization
    
    /** A dollar. */
    public static final CoinRecord DOLLAR = new CoinRecord(100, "dollar");

    /** A half-dollar. */
    public static final CoinRecord HALF_DOLLAR = new CoinRecord(50, "half-dollar");

    /** A quarter. */
    public static final CoinRecord QUARTER = new CoinRecord(25, "quarter");

    /** A dime. */
    public static final CoinRecord DIME = new CoinRecord(10, "dime");

    /** A nickel. */
    public static final CoinRecord NICKEL = new CoinRecord(5, "nickel");

    /** A penny. */
    public static final CoinRecord PENNY = new CoinRecord(1, "penny");

    /**
     * Makes change for a given amount.
     *
     * @param amount the ammount of change required - in cents
     *
     * @return an array of coins equaling the required amount
     */
    public static CoinRecord[] makeChange(final int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Can't make change for amounts less than zero.");
        }
        List<CoinRecord> change = new ArrayList<>(10);
        int balance = amount;
        if (balance > DOLLAR.value) {
            balance -= addCoins(balance, DOLLAR, change);
        }
        if (balance > HALF_DOLLAR.value) {
            balance -= addCoins(balance, HALF_DOLLAR, change);
        }
        if (balance > QUARTER.value) {
            balance -= addCoins(balance, QUARTER, change);
        }
        if (balance > DIME.value) {
            balance -= addCoins(balance, DIME, change);
        }
        if (balance > NICKEL.value) {
            balance -= addCoins(balance, NICKEL, change);
        }
        if (balance > PENNY.value) {
            addCoins(balance, PENNY, change);
        }

        return change.toArray(CoinRecord[]::new);
    }

    /**
     * Adds the maximum number of the specified coin to the coin collection
     * possible without exceeding the balance.
     *
     * @param balance the total amount of change required
     * @param coin the type of coin to add
     * @param change the coin collection to add to
     *
     * @return the value of the added coins
     */
    private static int addCoins(final int balance, final CoinRecord coin, final List<CoinRecord> change) {
        int coinCnt = balance / coin.value;
        for (int i = 0; i < coinCnt; i++) {
            change.add(coin);
        }
        return coinCnt * coin.value;
    }

}
