/*
 * MIT License
 *
 * Copyright (c) 2025 Russ Moul
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

package gof_patterns.templatemethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Demonstrate the use of / test the TemplateMethod classes.
 */
class TemplateMethodTest {

	@Test
	void test() {
		System.out.println("Gasoline engine process");
		GasolineIgnition gas = new GasolineIgnition();
		gas.start();
		assertTrue(gas.isRunning());
		assertTrue(gas.isFuelSystemEnergized());
		assertFalse(gas.isSafetyChimeEnergized());
		assertTrue(gas.isFuelSystemEnergized());
		assertTrue(gas.isIgnitionSystemEnergized());
		assertFalse(gas.isStarterEnergized());

		System.out.println("--");
		gas.stop();
		assertFalse(gas.isRunning());
		assertFalse(gas.isFuelSystemEnergized());
		assertFalse(gas.isSafetyChimeEnergized());
		assertFalse(gas.isFuelSystemEnergized());
		assertFalse(gas.isIgnitionSystemEnergized());
		assertFalse(gas.isStarterEnergized());
		
		System.out.println();
		
		System.out.println("Diesel engine process");
		DieselIgnition diesel = new DieselIgnition();
		diesel.start();
		assertTrue(diesel.isRunning());
		assertTrue(diesel.isFuelSystemEnergized());
		assertFalse(diesel.isSafetyChimeEnergized());
		assertTrue(diesel.isFuelSystemEnergized());
		assertFalse(diesel.isPreheatSystemEnergized());
		assertFalse(diesel.isStarterEnergized());

		System.out.println("--");
		diesel.stop();
		assertFalse(gas.isRunning());
		assertFalse(gas.isFuelSystemEnergized());
		assertFalse(gas.isSafetyChimeEnergized());
		assertFalse(gas.isFuelSystemEnergized());
		assertFalse(diesel.isPreheatSystemEnergized());
		assertFalse(gas.isIgnitionSystemEnergized());
		assertFalse(gas.isStarterEnergized());
	}

}
