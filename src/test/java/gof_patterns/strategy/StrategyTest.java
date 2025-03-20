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

package gof_patterns.strategy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;

import org.junit.jupiter.api.Test;

/**
 * Demonstrates use of /tests the Strategy pattern.
 */
public class StrategyTest {
    static private final Properties TEST_PROPERTIES;
    static {
        TEST_PROPERTIES = new Properties();
        TEST_PROPERTIES.setProperty("pi", "3.14");
        TEST_PROPERTIES.setProperty("pie", "apple");
    }

    static private final String EXPECTED_JSON = """
                                {
                                  "pi" : "3.14",
                                  "pie" : "apple"
                                }
                                """;

    static private final String EXPECTED_NAME_VALUE = """
                                pi=3.14
                                pie=apple
                                """;

    static private final String EXPECTED_XML_ATTRIBUTES = """
                                <?xml version="1.0" encoding="UTF-8"?>
                                <properties>
                                  <property> name="pi" value="3.14"/>
                                  <property> name="pie" value="apple"/>
                                </properties>
                                """;
    
    static private final String EXPECTED_XML_TAGS = """
                                <?xml version="1.0" encoding="UTF-8"?>
                                <properties>
                                  <property>
                                    <name>pi</name>
                                    <value>3.14</value>
                                  </property>
                                  <property>
                                    <name>pie</name>
                                    <value>apple</value>
                                  </property>
                                </properties>
                                """;

    @Test
    void test() {
        PropertiesFormatter f = new NameValuePropertiesFormatter();
        PropertiesEncoder encoder = new PropertiesEncoder(f);
        String s = encoder.encodeProperties(TEST_PROPERTIES);
        assertEquals(EXPECTED_NAME_VALUE, s);

         f = new JsonPropertiesFormatter();
         encoder = new PropertiesEncoder(f);
        s = encoder.encodeProperties(TEST_PROPERTIES);
        assertEquals(EXPECTED_JSON, s);
        
        XmlPropertiesFormatter x = new XmlPropertiesFormatter();
         encoder = new PropertiesEncoder(x);
        s = encoder.encodeProperties(TEST_PROPERTIES);
        assertEquals(EXPECTED_XML_ATTRIBUTES, s);        
        
        x.setUseTags(true);
        s = encoder.encodeProperties(TEST_PROPERTIES);
        assertEquals(EXPECTED_XML_TAGS, s);
    }

}
