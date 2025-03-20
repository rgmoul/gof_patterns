package gof_patterns.memento;

/**
 * Uses Context and ChangeHistory manage properties - client of Momento design pattern.
 */
public class Application {
    private final Context context = new Context();
    private final ChangeHistory caretaker = new ChangeHistory();

    /**
     * Constructor, initializes properties to include system properties.
     */
    public Application() {
    	// initialize properties -  can't undo
    	System.getProperties().keySet().forEach(n -> context.setProperty((String)n, System.getProperty((String)n)));
    }

    /**
     * Removes a property.
     * 
     * @param name name of property to remove
     * 
     * @return prior property value or null if property was not set
     */
    public String removeProperty(String name) {
    	String priorValue = context.removeProperty(name);
    	PropertyChangeMomento memento = context.createRemoveMomento(name, priorValue);    		
        caretaker.save(memento); // Save it in the history
    	return priorValue;
    }

    /**
     * Sets the named property to the provided value.
     * 
     * @param name name of property to set
     * @param value value to set property to
     * 
     * @return prior property value or null if property was not set
     */
    public String setProperty(String name, String value) {
    	String priorValue = context.setProperty(name, value);
    	PropertyChangeMomento memento = (priorValue == null) ? context.createAddMomento(name)
    			                                    : context.createUpdateMomento(name, priorValue);    		
        caretaker.save(memento); // Save it in the history
    	return priorValue;
    }

    /**
     * Gets the value of the named property.
     * 
     * @param name name of property to retrieve
     * 
     * @return property value or null if property is not set
     */
    public String getProperty(String name) {
    	return context.getProperty(name);
    }

    /**
     * Undo the last change to properties.
     */
    public void undo() {
        OpaqueMomento lc = caretaker.lastChange();
        context.undo(lc);
    }

    /* Remainder of application. */
}
