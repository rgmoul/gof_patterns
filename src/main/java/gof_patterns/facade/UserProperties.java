package gof_patterns.facade;

import java.util.Properties;

/**
 * Maintains user specific properties - a subsystem class in the facade pattern.
 */
public class UserProperties {
    private final Properties props;

    /**
     * Constructor. Sets hardcoded property values for simplicity.
     */
    public UserProperties() {
        props = new Properties();
        props.setProperty("font.size", "9");
        props.setProperty("color.background", "light-gray");
        props.setProperty("window.placement", "stacked");
    }

    /**
     * Returns the user properties.
     *
     * @return the user properties
     */
    public Properties getUserProperties() {
        return props;
    }

}
