package gof_patterns.memento;

import java.util.Objects;

/**
 * Captures information about a change so it can be undone - Momento in the Momento pattern.
 */
public record PropertyChangeMomento (ChangeType changeType, String name, String priorValue) 
       implements OpaqueMomento {
	/** Valid types of changes. */
	enum ChangeType {ADD, DELETE, UPDATE}

	/**
	 * Validation constructor.
	 * 
	 * @param changeType the type of change
	 * @param name the property name
	 * @param priorValue the prior value for the property, null for ADDITION records
	 */
	public PropertyChangeMomento {
    	if (Objects.isNull(changeType) || Objects.isNull(name)) {
    		throw new IllegalArgumentException("Null not allowed for change type or key.");
    	}
	}

	/**
	 * Create an addition record. Undo will delete the property.
	 * 
	 * @param name the property name
	 * 
	 * @return a new addition record
	 */
	public static PropertyChangeMomento newAddition(String name) {
		return new PropertyChangeMomento (ChangeType.ADD, name, null);
	}

	/**
	 * Create an update record. Undo will update the property with its prior value.
	 * 
	 * @param name the property name
	 * @param priorValue the prior value for the property
	 * 
	 * @return a new update record
	 */
	public static PropertyChangeMomento newUpdate(String name, String priorValue) {
		return new PropertyChangeMomento (ChangeType.UPDATE, name, priorValue);
	}

	/**
	 * Create a deletion record.  Undo will recreate the property with its prior value.
	 * 
	 * @param name the property name
	 * @param priorValue the prior value for the property
	 * 
	 * @return a new deletion record
	 */
	public static PropertyChangeMomento newDeletion(String name, String priorValue) {
		return new PropertyChangeMomento (ChangeType.DELETE, name, priorValue);
	}

}
