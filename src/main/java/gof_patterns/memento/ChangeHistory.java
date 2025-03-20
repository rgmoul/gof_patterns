package gof_patterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Maintains change history - Caretaker in Momento pattern.
 */
public class ChangeHistory {
    private final List<OpaqueMomento> revisionHistory = new ArrayList<>();

    /**
     * Adds a change record to the history.
     * 
     * @param m the record to add
     */
    public void save(OpaqueMomento m) {
    	revisionHistory.add(m);
    }

    /**
     * Removes and returns the most recent change record.
     * 
     * @return the most recent change record
     */
    public OpaqueMomento lastChange() {
    	OpaqueMomento m = null;
    	if (!revisionHistory.isEmpty()) {
    	    m = revisionHistory.removeLast();
    	}
    	return m;
    }
}
