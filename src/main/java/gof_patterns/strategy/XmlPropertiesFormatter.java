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
