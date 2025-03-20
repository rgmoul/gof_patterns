package gof_patterns.visitor;

/**
 * Represents an F1 race/event - ConcreteElement in Visitor pattern.
 */
public record F1Race(double trackLength, int laps, int admissionFee) implements SportEvent {
	/**
	 * @see gof_patterns.visitor.SportEvent#accept(SportEventVisitor)
	 */
	@Override
	public void accept(SportEventVisitor v) {
		v.visit(this);  // double-dispatch, compiler resolves 'this' and invokes proper method
	}

}
