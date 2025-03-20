package gof_patterns.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Collection of sporting events.
 */
public class SportEvents {
	private final List<SportEvent> list = new ArrayList<>();

	/**
	 * Add am event.
	 * 
	 * @param event the event to add
	 */
	public void addEvent(SportEvent event) {
		list.add(event);
	}

	/**
	 * Initiate visitation to all events.
	 * 
	 * @param v the visitor
	 */
	public void applyVisitor(SportEventVisitor v) {
	    list.forEach(e -> e.accept(v));
	}
}
