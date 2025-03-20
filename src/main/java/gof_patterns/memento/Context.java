package gof_patterns.memento;

import java.util.HashMap;
import java.util.Objects;

/**
 * Maintains a set of properties, and supports undoing changes - Originator in the Momento pattern.
 */
public class Context {
	/** Property map. */
    private final HashMap<String, String> props = new HashMap<>();

    /**
     * Set a property.
     * 
     * @param name property name
     * @param value property value
     * 
     * @return prior value of the property, or null if the property was not set
     */
    public String setProperty(String name, String value) {
    	if (Objects.isNull(name) || Objects.isNull(value)) {
    		throw new IllegalArgumentException("Null not allowed for key or value.");
    	}
    	return props.put(name, value);
    }

    /**
     * Remove a property.
     * 
     * @param name name of property to remove
     * 
     * @return prior value of the property, or null if the property was not set
     */
    public String removeProperty(String name) {
    		return props.remove(name);
    }

    /**
     * Get a properties value.
     * 
     * @param name name of property to retrieve
     * 
     * @return value of the property, or null if the property was not set
     */
    public String getProperty(String name) {
    	return props.get(name);
    }

    /**
     * Undo the last property change.
     * 
     * @param m property change momento
     */
    public void undo(OpaqueMomento m) {
    	if (m instanceof PropertyChangeMomento pc ) {
    		switch (pc.changeType()) {
		        case ADD -> props.remove(pc.name());
		        case UPDATE, DELETE -> props.put(pc.name(), pc.priorValue());
            }
		}
    }

    /**
     * Creates a momento for a property removal.
     * 
     * @param name the property name
     * @param priorValue the property value prior to removal
     * 
     * @return the new momento
     */
	public PropertyChangeMomento createRemoveMomento(String name, String priorValue) {
    	return PropertyChangeMomento.newDeletion(name, priorValue); 
	}
	
    /**
     * Creates a momento for a property update.
     * 
     * @param name the property name
     * @param priorValue the property value prior to update
     * 
     * @return the new momento
     */
	public PropertyChangeMomento createUpdateMomento(String name, String priorValue) {
    	return PropertyChangeMomento.newUpdate(name, priorValue);
	}

    /**
     * Creates a momento for addition of a property.
     * 
     * @param name the property name
     * 
     * @return the new momento
     */
	public PropertyChangeMomento createAddMomento(String name) {
    	return PropertyChangeMomento.newAddition(name);
    }

}
