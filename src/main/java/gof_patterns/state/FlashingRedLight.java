package gof_patterns.state;

/**
 * Represents a flashing red light - ConcreteState in the State pattern.
 */
public class FlashingRedLight extends TrafficLightState {
	/** Constructor. */
	FlashingRedLight() {
		super("Flashing-Red");
	}

	/**
	 * @see gof_patterns.state.TrafficLightState#changeLight(TrafficLight)
	 */
	@Override
	public void changeLight(TrafficLight trafficLight) {
		trafficLight.setMode(OperatingMode.NORMAL);
		System.out.println("Flashing-Red -> Red");
		trafficLight.setState(new RedLight());
		trafficLight.getCamera().enable(true);
	}

}
