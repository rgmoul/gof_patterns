package gof_patterns.strategy;

import java.util.Properties;

/**
 * Class to format the contents of a Properties object in XML - ConcreteStrategy in the Strategy pattern.
 */
public class XmlPropertiesFormatter implements PropertiesFormatter {
    private static final String nl = System.lineSeparator();
    private boolean useTags = false;
    
    /**
     * Allows selection of tag representation vs attribute representation.
     * 
     * @param useTags true to use tags, false to use attributes
     */
    public void setUseTags(boolean useTags) {
        this.useTags = useTags;
    }

    /**
     * @see gof_patterns.strategy.PropertiesFormatter#toString(java.util.Properties)
     */
    @Override
    public String toString(Properties properties) {
        return useTags ? asTags(properties) : asAttributes(properties);
    }

    /**
     * Produces an XML representations of the contents of the provided Properties
     * object, using tag contents for property name and value.
     *
     * @param properties to represent as string
     * 
     * @return an XML string representation of the contents of the provided Properties object
     */
    public String asAttributes(Properties properties) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")
        .append(nl)
        .append("<properties>")
        .append(nl);

        properties.forEach((k,v) -> sb.append("  <property> name=\"")
                                      .append(k)
                                      .append("\" value=\"")
                                      .append(v)
                                      .append("\"/>")
                                      .append(nl));
        sb.append("</properties>")
          .append(nl);

        return sb.toString();
    }

    /**
     * Produces an XML representations of the contents of the provided Properties
     * object, using attributes for property name and value.
     *
     * @param properties to represent as string
     * 
     * @return an XML string representation of the contents of the provided Properties object
     */
    public String asTags(Properties properties) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")
        .append(nl)
        .append("<properties>")
        .append(nl);

        properties.forEach((k,v) -> sb.append("  <property>")
                                      .append(nl)
                                      .append("    <name>")
                                      .append(k)
                                      .append("</name>")
                                      .append(nl)
                                      .append("    <value>")
                                      .append(v)
                                      .append("</value>")
                                      .append(nl)
                                      .append("  </property>")
                                      .append(nl));
        sb.append("</properties>")
          .append(nl);

        return sb.toString();
    }

}
