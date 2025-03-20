package gof_patterns.visitor;

/**
 * Defines operations for visiting concrete SportEvent - Visitor in Visitor pattern
 */
public interface SportEventVisitor {
    /**
     * Operation for visiting F1 race events. Default behavior is no-op.
     * 
     * @param r the race event
     */
	default void visit(F1Race r) {}

    /**
     * Operation for visiting football games/events. Default behavior is no-op.
     * 
     * @param g the game/event
     */
	default void visit(FootballGame g) {}
}
