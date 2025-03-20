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
