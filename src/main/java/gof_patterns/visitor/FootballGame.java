package gof_patterns.visitor;

/**
 * Represents a football game/event - ConcreteElement in Visitor pattern.
 */
public record FootballGame(int winningScore, int losingScore, int ticketPrice) implements SportEvent {
	/**
	 * @see gof_patterns.visitor.SportEvent#accept(SportEventVisitor)
	 */
	@Override
	public void accept(SportEventVisitor v) {
		v.visit(this);  // double-dispatch, compiler resolves 'this' and invokes proper method
	}

}
