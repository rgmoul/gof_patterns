package gof_patterns.visitor;

/**
 * Visits each sport event and tallies the average cost to attend - Concrete Visitor in Visitor pattern.
 */
public class AverageCostVisitor implements SportEventVisitor {
	private int eventCount = 0;
	private int accumulatedCost = 0;

	/**
	 * @see gof_patterns.visitor.SportEventVisitor#visit(F1Race)
	 */
	@Override
	public void visit(F1Race e) {
		eventCount++;
		accumulatedCost += e.admissionFee();
		System.out.println("Visitor1 visiting ConcreteVisitableA: " + e);
	}

	/**
	 * @see gof_patterns.visitor.SportEventVisitor#visit(FootballGame)
	 */
	@Override
	public void visit(FootballGame e) {
		eventCount++;
		accumulatedCost += e.ticketPrice();
		System.out.println("Visitor1 visiting ConcreteVisitableB: " + e);
	}

	/**
	 * Gets the average cost.
	 * @return the average cost
	 */
	public int getAverageCost() {
		return accumulatedCost / eventCount;
	}

}
