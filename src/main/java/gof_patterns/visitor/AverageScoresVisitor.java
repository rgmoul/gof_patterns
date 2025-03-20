package gof_patterns.visitor;

/**
 * Tallies the average winning and loosing scores for football games - Concrete Visitor in Visitor pattern.
 */
public class AverageScoresVisitor implements SportEventVisitor {
	private int gameCount = 0;
	private int totalWinningScore = 0;
	private int totalLoosingScore = 0;

	/**
	 * @see gof_patterns.visitor.SportEventVisitor#visit(FootballGame)
	 */
	@Override
	public void visit(FootballGame g) {
		gameCount++;
		totalWinningScore += g.winningScore();
		totalLoosingScore += g.losingScore();
	}

	/**
	 * Gets the average winning score for football games.
	 * 
	 * @return the average winning score for football games
	 */
	public double getAverageWinningScore() {
		return (double) totalWinningScore / gameCount;
	}

	/**
	 * Gets the average loosing score for football games.
	 * 
	 * @return the average loosing score for football games
	 */
	public double getAverageLoosingScore() {
		return (double) totalLoosingScore / gameCount;
	}

}
