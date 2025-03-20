package gof_patterns.strategy;

import java.util.Properties;

/**
 * An interface for properties string formatter - Strategy in the Strategy pattern.
 */
public interface PropertiesFormatter {

    /**
     * Produces a string representation of the contents of the provided Properties object.
     *
     * @param properties to represent as string
     * 
     * @return a string representation of the contents of the provided Properties object
     */
    String toString(Properties properties);

}
