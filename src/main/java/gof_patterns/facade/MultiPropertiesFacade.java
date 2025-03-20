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

package gof_patterns.facade;

import java.util.Properties;

/**
 * Consolidates system, user and invocation properties mainted in separate Properties objects
 * respecting their precedence - Facade in the Facade pattern.
 */
public class MultiPropertiesFacade {
    private final Properties config;

    /**
     * Constructor.  Merges the properties from the various sources.
     */
    public MultiPropertiesFacade() {
        config = new Properties();

        // load properties in reverse order of precedence; SystemProperties,
        // UserProperties, InvocationProperties (as provided by -D)

        SystemProperties sysProps = new SystemProperties();
        Properties sp = sysProps.getProperties();
        UserProperties userProps = new UserProperties();
        Properties up = userProps.getUserProperties();
        InvocationProperties cmdLineProps = new InvocationProperties();
        Properties in = cmdLineProps.properties();

        config.putAll(sp);
        config.putAll(up);
        config.putAll(in);
    }

    /**
     * Returns the merged properties.
     *
     * @return the merged properties
     */
    public Properties retrieveConfiguration() {
        return config;
    }

    /**
     * Returns the value of a property.
     *
     * @param name the property name
     *
     * @return the property value or null if the property is not defined
     */
    public String getProperty(final String name) {
        return config.getProperty(name);
    }

}
