package gof_patterns.strategy;

import java.util.Properties;

/**
 * Class to format the contents of a Properties object in traditional properties text - ConcreteStrategy in the Strategy pattern.
 */
public class NameValuePropertiesFormatter implements PropertiesFormatter {
    private static final String nl = System.lineSeparator();

    /**
     * @see gof_patterns.strategy.PropertiesFormatter#toString(java.util.Properties)
     */
    @Override
    public String toString(Properties properties) {
        StringBuilder sb = new StringBuilder();
        properties.forEach((k,v) -> sb.append(k)
                                      .append("=")
                                      .append(v)
                                      .append(nl));

        return sb.toString();
    }

}
