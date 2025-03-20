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

package gof_patterns.decorator;

import java.util.Properties;

/**
 * A base decorator for inventory items - Decorator in the Decorator pattern.
 */
public abstract class InventoryItemDecorator implements Inventoryable {
    private final Inventoryable decoratedItem;

    /**
     * Constructor.
     *
     * @param decoratedItem the decorated item
     */
    public InventoryItemDecorator(final Inventoryable decoratedItem) {
        this.decoratedItem = decoratedItem;
    }

    /**
     * Returns the description.
     *
     * @return the description
     */
    @Override
    public String description() {
        return decoratedItem.description();
    }

    /**
     * Returns the inventory id.
     *
     * @return the inventory id
     */
    @Override
    public String inventoryId() {
        return decoratedItem.inventoryId();
    }

    /**
     * Get properties associated with the item.
     *
     * @return the items properties
     */
    @Override
    public Properties getProperties() {
        return decoratedItem.getProperties();
    }

}
