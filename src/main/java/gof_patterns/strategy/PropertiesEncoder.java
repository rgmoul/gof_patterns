package gof_patterns.strategy;

import java.util.Properties;

/**
 * Class to encode the contents of a Properties object in a text document using a PropertiesFormatter - Context in the Strategy pattern.
 */
public class PropertiesEncoder {
    private final PropertiesFormatter strategy;
    
    /**
     * Constructor.
     * 
     * @param strategy PropertiesFormatter to use to encode Properties content
     */
    public PropertiesEncoder(PropertiesFormatter strategy) {
        this.strategy = strategy;
    }

    /**
     * Encodes the contents of a Properties object in a text document.
     * 
     * @param properties the Properties object to encode
     * 
     * @return textual representation of properties content
     */
    public String encodeProperties(Properties properties) {
        return strategy.toString(properties);
    }
}
