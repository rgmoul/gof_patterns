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

package gof_patterns.adapter;

import java.awt.Point;

/**
 * Desired interface for the adapters - Target in the Adapter pattern.
 */
public interface Vector {
    /**
     * Gets the origin of this vector.
     *
     * @return the origin
     */
    Point getOrigin();

    /**
     * Sets the origin of this vector.
     *
     * @param origin the vector's origin
     */
    void setOrigin(Point origin);

    /**
     * Gets the X magnitude.
     *
     * @return the X magnitude
     */
    int getXMagnitude();

    /**
     * Sets the X magnitude.
     *
     * @param magnitude the X magnitude
     */
    void setXMagnitude(int magnitude);

    /**
     * Gets the Y magnitude.
     *
     * @return the Y magnitude
     */
    int getYMagnitude();

    /**
     * Sets the Y magnitude.
     *
     * @param magnitude the Y magnitude
     */
    void setYMagnitude(int magnitude);
}
