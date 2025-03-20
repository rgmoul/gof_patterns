package gof_patterns.strategy;

import java.util.Properties;

/**
 * Class to format the contents of a Properties object in JSON - ConcreteStrategy in the Strategy pattern.
 */
public class JsonPropertiesFormatter implements PropertiesFormatter {
    private static final String nl = System.lineSeparator();

    /**
     * @see gof_patterns.strategy.PropertiesFormatter#toString(java.util.Properties)
     */
    @Override
    public String toString(Properties properties) {
        StringBuilder sb = new StringBuilder();
        sb.append("{")
          .append(nl);
        properties.forEach((k,v) -> sb.append("  \"")
                                      .append(k)
                                      .append("\" : \"")
                                      .append(v)
                                      .append("\",")
                                      .append(nl));
        sb.deleteCharAt(sb.length()-2)
          .append("}")
          .append(nl);

        return sb.toString();
    }

}
