package gof_patterns.visitor;

/**
 * Sporting events, interface for accepting visitors - Element in Visitor pattern
 */
public interface SportEvent {
	/**
	 * Provides a visitor to the event for invocation.
	 * <p>
	 * Typically, implemented as: 
	 * <p><code>
	 * 		v.visit(this); 
	 * </code><p>
     * This must be implemented in each concrete SportEvent as the compiler resolves the type of 'this' 
     * and invokes the proper visitor method.  This is an example of double-dispatch.
     * 
	 * @param v the visitor
	 */
    void accept(SportEventVisitor v);
}
