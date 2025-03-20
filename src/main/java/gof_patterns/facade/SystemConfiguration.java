package gof_patterns.facade;

import java.util.Properties;

public class SystemConfiguration {
    private final Properties systemProps = new Properties();
    private final Properties userProps = new Properties();
    private final Properties invocationProps = new Properties();

    /**
     * Get the system properties.
     * 
     * @return the system properties
     */
    public Properties getSystemProperties() {
        return systemProps;
    }

    /**
     * Get the user properties.
     * 
     * @return the user properties
     */
    public Properties getUserProperties() {
        return userProps;
    }

    /**
     * Get the invocation properties.
     * 
     * @return the invocation properties
     */
    public Properties getInvocationProperties() {
        return invocationProps;
    }

}
