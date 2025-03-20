package gof_patterns.facade;

import java.util.Properties;

/**
 * Maintains system wide properties - a subsystem class in the facade pattern.
 */
public class SystemProperties {
    private final Properties props;

    /**
     * Constructor. Sets hardcoded property values for simplicity.
     */
    public SystemProperties() {
        props = new Properties();
        props.put("font.family", "times");
        props.put("font.style", "plain");
        props.put("font.size", "10");
        props.put("color.background", "white");
        props.put("color.foreground", "black");
    }

    /**
     * Returns the system properties.
     *
     * @return the system properties
     */
    public Properties getProperties() {
        return props;
    }

}
