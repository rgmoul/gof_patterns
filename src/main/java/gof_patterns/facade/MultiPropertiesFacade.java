package gof_patterns.facade;

import java.util.Properties;

/**
 * Consolidates system, user and invocation properties mainted in separate Properties objects
 * respecting their precedence - Facade in the Facade pattern.
 */
public class MultiPropertiesFacade {
    private final Properties config;

    /**
     * Constructor.  Merges the properties from the various sources.
     */
    public MultiPropertiesFacade() {
        config = new Properties();

        // load properties in reverse order of precedence; SystemProperties,
        // UserProperties, InvocationProperties (as provided by -D)

        SystemProperties sysProps = new SystemProperties();
        Properties sp = sysProps.getProperties();
        UserProperties userProps = new UserProperties();
        Properties up = userProps.getUserProperties();
        InvocationProperties cmdLineProps = new InvocationProperties();
        Properties in = cmdLineProps.properties();

        config.putAll(sp);
        config.putAll(up);
        config.putAll(in);
    }

    /**
     * Returns the merged properties.
     *
     * @return the merged properties
     */
    public Properties retrieveConfiguration() {
        return config;
    }

    /**
     * Returns the value of a property.
     *
     * @param name the property name
     *
     * @return the property value or null if the property is not defined
     */
    public String getProperty(final String name) {
        return config.getProperty(name);
    }

}
