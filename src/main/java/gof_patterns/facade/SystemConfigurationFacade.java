package gof_patterns.facade;

import java.util.Properties;

/**
 * Simplifies access to system , user and invocation properties maintain by a single SystemConfiguration
 * respecting their precedence - Facade in the Facade pattern.
 */
public class SystemConfigurationFacade {
    private final SystemConfiguration config;

    /**
     * Constructor.
     */
    public SystemConfigurationFacade() {
        config = new SystemConfiguration();
    }

    /**
     * Constructor.
     * 
     * @param config system config to be fronted by the facade
     */
    public SystemConfigurationFacade(SystemConfiguration config) {
        this.config = config;
    }

    /**
     * Sets a system property.
     * 
     * @param name property name
     * @param value property value
     * 
     * @return prior value of property or null if not set
     */
    public String setSystemProperty(String name, String value) {
        return (String)config.getSystemProperties().setProperty(name, value);

    }

    /**
     * Sets a user property.
     * 
     * @param name property name
     * @param value property value
     * 
     * @return prior value of property or null if not set
     */
    public String setUserProperty(String name, String value) {
        return (String)config.getUserProperties().setProperty(name, value);
    }

    /**
     * Sets an invocation property.
     * 
     * @param name property name
     * @param value property value
     * 
     * @return prior value of property or null if not set
     */
   public String setInvocationProperty(String name, String value) {
        return (String)config.getInvocationProperties().setProperty(name, value);
    }

    /**
     * Returns the merged properties.
     *
     * @return the merged properties
     */
    public Properties retrieveConfiguration() {
        Properties p = new Properties();
        p.putAll(config.getSystemProperties());
        p.putAll(config.getUserProperties());
        p.putAll(config.getInvocationProperties());

        return p;
    }

    /**
     * Returns the value of a property.
     *
     * @param name the property name
     *
     * @return the property value or null if the property is not defined
     */
    public String getProperty(final String name) {
        String value;
        Properties cmdLineProps = config.getInvocationProperties();
        value = cmdLineProps.getProperty(name);
        if (value == null) {
            Properties userProps = config.getUserProperties();
            value = userProps.getProperty(name);
            if (value == null) {
                Properties sysProps = config.getSystemProperties();
                value = sysProps.getProperty(name);
            }
        }
        return value;
    }

}
