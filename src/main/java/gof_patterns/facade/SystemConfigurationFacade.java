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

package gof_patterns.facade;

import java.util.Properties;

/**
 * Simplifies access to system , user and invocation properties maintain by a single SystemConfiguration
 * respecting their precedence - Facade in the Facade pattern.
 */
public class SystemConfigurationFacade {
    private final SystemConfiguration config;

    /**
     * Constructor.
     */
    public SystemConfigurationFacade() {
        config = new SystemConfiguration();
    }

    /**
     * Constructor.
     * 
     * @param config system config to be fronted by the facade
     */
    public SystemConfigurationFacade(SystemConfiguration config) {
        this.config = config;
    }

    /**
     * Sets a system property.
     * 
     * @param name property name
     * @param value property value
     * 
     * @return prior value of property or null if not set
     */
    public String setSystemProperty(String name, String value) {
        return (String)config.getSystemProperties().setProperty(name, value);

    }

    /**
     * Sets a user property.
     * 
     * @param name property name
     * @param value property value
     * 
     * @return prior value of property or null if not set
     */
    public String setUserProperty(String name, String value) {
        return (String)config.getUserProperties().setProperty(name, value);
    }

    /**
     * Sets an invocation property.
     * 
     * @param name property name
     * @param value property value
     * 
     * @return prior value of property or null if not set
     */
   public String setInvocationProperty(String name, String value) {
        return (String)config.getInvocationProperties().setProperty(name, value);
    }

    /**
     * Returns the merged properties.
     *
     * @return the merged properties
     */
    public Properties retrieveConfiguration() {
        Properties p = new Properties();
        p.putAll(config.getSystemProperties());
        p.putAll(config.getUserProperties());
        p.putAll(config.getInvocationProperties());

        return p;
    }

    /**
     * Returns the value of a property.
     *
     * @param name the property name
     *
     * @return the property value or null if the property is not defined
     */
    public String getProperty(final String name) {
        String value;
        Properties cmdLineProps = config.getInvocationProperties();
        value = cmdLineProps.getProperty(name);
        if (value == null) {
            Properties userProps = config.getUserProperties();
            value = userProps.getProperty(name);
            if (value == null) {
                Properties sysProps = config.getSystemProperties();
                value = sysProps.getProperty(name);
            }
        }
        return value;
    }

}
