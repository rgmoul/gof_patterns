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

import java.util.HashMap;

/**
 * An example of the Singleton pattern, for storing globally available values -
 * Singleton in the Singleton pattern.
 */
public final class GlobalValues {
    /** The singleton. Uses initialization-on-demand holder idiom. */
    private static class InstanceHolder {
        static final GlobalValues instance = new GlobalValues();
    }

    private final HashMap<String,Object> valueMap = new HashMap<>();

    /**
     * Prevent external instantiation.
     */
    private GlobalValues() {
    }

    /**
     * Get the "singleton".
     *
     * @return return the single instance of this class
     */
    public static GlobalValues instance() {
        return InstanceHolder.instance;
    }

    /**
     * Add a value to the global value map.
     *
     * @param name the name for this value
     * @param value the value
     */
    public synchronized void putGlobal(final String name, final Object value) {
        valueMap.put(name, value);
    }

    /**
     * Get a value from the global value map.
     *
     * @param name the name of the value to retrieve
     */
    public synchronized Object getGlobal(final String name) {
        return valueMap.get(name);
    }

}
