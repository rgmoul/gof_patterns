package gof_patterns.state;

/**
 * Represents a flashing yellow light - ConcreteState in the State pattern.
 */
public class FlashingYellowLight extends TrafficLightState {
	/** Constructor. */
	FlashingYellowLight() {
		super("Flashing-Yellow");
	}

	/**
	 * @see gof_patterns.state.TrafficLightState#changeLight(TrafficLight)
	 */
	@Override
	public void changeLight(TrafficLight trafficLight) {
		trafficLight.setMode(OperatingMode.NORMAL);
		System.out.println("Flashing-Yellow -> Yellow");
		trafficLight.setState(new YellowLight());
		trafficLight.getCamera().enable(true);
	}

}
