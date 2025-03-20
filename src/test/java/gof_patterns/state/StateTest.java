package gof_patterns.state;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Demonstrates the use of / tests the State design pattern.
 */
class StateTest {

	@Test
	void testStateEnum() {
		TrafficLightEnumImpl trafficLight = new TrafficLightEnumImpl();
		assertEquals("Red", trafficLight.getState());
		assertTrue(trafficLight.getCamera().isEnabled());
		
		trafficLight.changeLight();
		assertEquals("Green", trafficLight.getState());
		assertFalse(trafficLight.getCamera().isEnabled());

		trafficLight.changeLight();
		assertEquals("Yellow", trafficLight.getState());
		assertTrue(trafficLight.getCamera().isEnabled());

		trafficLight.changeLight();
		assertEquals("Red", trafficLight.getState());
		assertTrue(trafficLight.getCamera().isEnabled());
		
		// enter caution mode
		trafficLight.setMode(OperatingMode.CAUTION);
		trafficLight.changeLight();
		assertEquals("Flashing-Yellow", trafficLight.getState());
		assertFalse(trafficLight.getCamera().isEnabled());

		trafficLight.changeLight();
		assertEquals("Yellow", trafficLight.getState());
		assertTrue(trafficLight.getCamera().isEnabled());

		// enter stop mode
		trafficLight.setMode(OperatingMode.STOP);
		trafficLight.changeLight();
		assertEquals("Flashing-Red", trafficLight.getState());
		assertTrue(trafficLight.getCamera().isEnabled());

		trafficLight.changeLight();
		assertEquals("Red", trafficLight.getState());
		assertTrue(trafficLight.getCamera().isEnabled());
		
		trafficLight.changeLight();
		assertEquals("Green", trafficLight.getState());
		assertFalse(trafficLight.getCamera().isEnabled());
		
		System.out.println();
	}

	@Test
	void testState() {
		TrafficLight trafficLight = new TrafficLight();
		assertEquals("Red", trafficLight.getState());
		assertTrue(trafficLight.getCamera().isEnabled());
		
		trafficLight.changeLight();
		assertEquals("Green", trafficLight.getState());
		assertFalse(trafficLight.getCamera().isEnabled());

		trafficLight.changeLight();
		assertEquals("Yellow", trafficLight.getState());
		assertTrue(trafficLight.getCamera().isEnabled());

		trafficLight.changeLight();
		assertEquals("Red", trafficLight.getState());
		assertTrue(trafficLight.getCamera().isEnabled());
		
		// enter caution mode
		trafficLight.setMode(OperatingMode.CAUTION);
		trafficLight.changeLight();
		assertEquals("Flashing-Yellow", trafficLight.getState());
		assertFalse(trafficLight.getCamera().isEnabled());

		trafficLight.changeLight();
		assertEquals("Yellow", trafficLight.getState());
		assertTrue(trafficLight.getCamera().isEnabled());

		// enter stop mode
		trafficLight.setMode(OperatingMode.STOP);
		trafficLight.changeLight();
		assertEquals("Flashing-Red", trafficLight.getState());
		assertTrue(trafficLight.getCamera().isEnabled());

		trafficLight.changeLight();
		assertEquals("Red", trafficLight.getState());
		assertTrue(trafficLight.getCamera().isEnabled());
		
		trafficLight.changeLight();
		assertEquals("Green", trafficLight.getState());
		assertFalse(trafficLight.getCamera().isEnabled());
		
		System.out.println();

	}

}
