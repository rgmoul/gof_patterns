package gof_patterns.facade;

import java.util.Properties;

/**
 * Maintains user specific properties - a subsystem class in the facade pattern.
 */
public class InvocationProperties {
    private final Properties props;

    /**
     * Constructor. Sets hardcoded property values for simplicity.
     */
    public InvocationProperties() {
        props = new Properties();
        props.put("font.size", "11");
        props.put("orientation", "portrait");
        props.put("window.placement", "tiled");
    }

    /**
     * Returns the invocation properties.
     *
     * @return the invocation properties
     */
    public Properties properties() {
        return props;
    }

}
