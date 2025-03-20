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
