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
