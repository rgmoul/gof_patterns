package gof_patterns.visitor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Demonstrates the use of / tests the Visitor pattern.
 */
public class VisitorTest {

	@Test
	void test() {
		F1Race bahrainRace = new F1Race(5.4, 57, 400);
		F1Race vegasRace = new F1Race(6.2, 50, 350);
		FootballGame champGame = new FootballGame(40, 22, 700);
		FootballGame playoffGame = new FootballGame(55, 23, 450);
	
		SportEvents events = new SportEvents();
		events.addEvent(bahrainRace);
		events.addEvent(vegasRace);
		events.addEvent(champGame);
		events.addEvent(playoffGame);
		
		AverageCostVisitor costVisitor = new AverageCostVisitor();
		events.applyVisitor(costVisitor);
		assertEquals(475, costVisitor.getAverageCost());
		
		AverageRaceDistanceVisitor raceDistanceVisitor = new AverageRaceDistanceVisitor();
		events.applyVisitor(raceDistanceVisitor);
		assertEquals(308.9, raceDistanceVisitor.getAverageRaceDistance());

		AverageScoresVisitor scoresVisitor = new AverageScoresVisitor();
		events.applyVisitor(scoresVisitor);
		assertEquals(47.5, scoresVisitor.getAverageWinningScore());
		assertEquals(22.5, scoresVisitor.getAverageLoosingScore());
	}

}
