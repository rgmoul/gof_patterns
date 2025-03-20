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

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Properties;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Demonstrates the use of / tests the Facade pattern.
 */
public class FacadeTest {
    final SystemConfiguration config = new SystemConfiguration();

    @BeforeEach
    public void setUp() {
        Properties sysProps = config.getSystemProperties();
        sysProps.setProperty("font.family", "times");
        sysProps.setProperty("font.style", "plain");
        sysProps.setProperty("font.size", "10");
        sysProps.setProperty("color.background", "white");
        sysProps.setProperty("color.foreground", "black");

        Properties userProps = config.getUserProperties();
        userProps.setProperty("font.size", "9");
        userProps.setProperty("color.background", "light-gray");
        userProps.setProperty("window.placement", "stacked");

        Properties invokeProps = config.getInvocationProperties();
        invokeProps.setProperty("font.size", "11");
        invokeProps.setProperty("orientation", "portrait");
        invokeProps.setProperty("window.placement", "tiled");
    }

    @Test
    void testSystemConfigurationFacade() {
        // find the value of the color.foreground property, without facade
        String propName = "color.foreground";

        String value;
        InvocationProperties cmdLineProps = new InvocationProperties();
        value = cmdLineProps.properties().getProperty(propName);
        if (value == null) {
            UserProperties userProps = new UserProperties();
            value = userProps.getUserProperties().getProperty(propName);
            if (value == null) {
                SystemProperties sysProps = new SystemProperties();
                value = sysProps.getProperties().getProperty(propName);
            }
        }
        assertEquals("black", value);

        // find the property using the facade
        SystemConfigurationFacade facade = new SystemConfigurationFacade(config);
        assertEquals("black", facade.getProperty(propName));


        // set configuration through the facade
        facade = new SystemConfigurationFacade();
        facade.setSystemProperty("font.family", "times");
        facade.setSystemProperty("font.style", "plain");
        facade.setSystemProperty("font.size", "10");
        facade.setSystemProperty("color.background", "white");
        facade.setSystemProperty("color.foreground", "black");

        facade.setUserProperty("font.size", "9");
        facade.setUserProperty("color.background", "light-gray");
        facade.setUserProperty("window.placement", "stacked");

        facade.setInvocationProperty("font.size", "11");
        facade.setInvocationProperty("orientation", "portrait");
        facade.setInvocationProperty("window.placement", "tiled");
        assertEquals("black", facade.getProperty(propName));

        // dump the properties
        facade.retrieveConfiguration().list(System.out);

    }

    @Test
    void testMultiPropertiesFacade() {
        // find the value of the color.foreground property, without facade
        String propName = "color.foreground";

        String value;
        InvocationProperties cmdLineProps = new InvocationProperties();
        value = cmdLineProps.properties().getProperty(propName);
        if (value == null) {
            UserProperties userProps = new UserProperties();
            value = userProps.getUserProperties().getProperty(propName);
            if (value == null) {
                SystemProperties sysProps = new SystemProperties();
                value = sysProps.getProperties().getProperty(propName);
            }
        }
        assertEquals("black", value);

        // find the property using the facade
        MultiPropertiesFacade config = new MultiPropertiesFacade();
        value = config.retrieveConfiguration().getProperty(propName);
        assertEquals("black", value);

        // dump the properties
        config.retrieveConfiguration().list(System.out);
    }

}
