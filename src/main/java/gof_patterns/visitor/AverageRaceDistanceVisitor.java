package gof_patterns.visitor;

/**
 * Visitor to calculate the average race distance - Concrete Visitor in Visitor pattern.
 */
public class AverageRaceDistanceVisitor implements SportEventVisitor {
	private int raceCount = 0;
	private double totalDistance = 0;

	/**
	 * @see gof_patterns.visitor.SportEventVisitor#visit(FootballGame)
	 */
	@Override
	public void visit(F1Race r) {
		raceCount++;
		totalDistance += r.trackLength() * r.laps();
	}

	/**
	 * Get the average race distance.
	 * @return the average race distance
	 */
	public double getAverageRaceDistance() {
		return totalDistance / raceCount;
	}

}
