/*
 * MIT License
 *
 * Copyright (c) 2025 Symbiont Software
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
