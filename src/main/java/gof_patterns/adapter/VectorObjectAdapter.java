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
 * An object adapter - Adapter in the object Adapter pattern.
 */
public final class VectorObjectAdapter implements Vector {
    private final Line line;

    /**
     * Constructor.
     */
    public VectorObjectAdapter() {
        line = new Line();
    }

    /**
     * Constructor, adapts an existing Line object.
     *
     * @param line the line object to adapt
     */
    public VectorObjectAdapter(final Line line) {
        this.line = line;
    }

    /**
     * @see gof_patterns.adapter.Vector#getOrigin()
     */
    @Override
    public Point getOrigin() {

        return new Point(line.getX(), line.getY());
    }

    /**
     * @see gof_patterns.adapter.Vector#setOrigin(java.awt.Point)
     */
    @Override
    public void setOrigin(Point origin) {
        line.setX(origin.x);
        line.setY(origin.y);
    }

    /**
     * @see gof_patterns.adapter.Vector#getXMagnitude()
     */
    @Override
    public int getXMagnitude() {
        return line.getWidth();
    }

    /**
     * @see gof_patterns.adapter.Vector#setXMagnitude(int)
     */
    @Override
    public void setXMagnitude(final int magnitude) {
       line.setWidth(magnitude);
    }

    /**
     * @see gof_patterns.adapter.Vector#getYMagnitude()
     */
    @Override
    public int getYMagnitude() {
        return line.getHeight();
    }

    /**
     * @see gof_patterns.adapter.Vector#setYMagnitude(int)
     */
    @Override
    public void setYMagnitude(final int magnitude) {
        line.setHeight(magnitude);
    }

}
