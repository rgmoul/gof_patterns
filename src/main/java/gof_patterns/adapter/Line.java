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

package gof_patterns.adapter;

/**
 * A simple Line representations - Adaptee in the Adapter pattern.
 */
public class Line {
    private int x;
    private int y;
    private int width;
    private int height;

    /**
     * Get the height.
     *
     * @return the height
     */
    public final int getHeight() {
        return height;
    }

    /**
     * Set the height.
     *
     * @param height the height value
     */
    public final void setHeight(final int height) {
        this.height = height;
    }

    /**
     * Get the width.
     *
     * @return the width
     */
    public final int getWidth() {
        return width;
    }

    /**
     * Set the width.
     *
     * @param width the width value
     */
    public final void setWidth(final int width) {
        this.width = width;
    }

    /**
     * Get the X value.
     *
     * @return the X value
     */
    public final int getX() {
        return x;
    }
    /**
     * Sets the X value.
     *
     * @param x the X value
     */
    public final void setX(final int x) {
        this.x = x;
    }

    /**
     * Get the Y value.
     *
     * @return the Y value
     */
    public final int getY() {
        return y;
    }

    /**
     * Sets the Y value.
     *
     * @param y the Y value
     */
    public final void setY(final int y) {
        this.y = y;
    }

}
