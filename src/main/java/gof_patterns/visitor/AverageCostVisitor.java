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
