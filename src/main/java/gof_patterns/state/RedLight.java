package gof_patterns.state;

/**
 * Represents a red light - ConcreteState in the State pattern.
 */
public class RedLight extends TrafficLightState {
	/** Constructor. */
	RedLight() {
		super("Red");
	}

	/**
	 * @see gof_patterns.state.TrafficLightState#changeLight(TrafficLight)
	 */
	@Override
	public void changeLight(TrafficLight trafficLight) {
		switch (trafficLight.getMode()) {
		    case NORMAL -> {
		        System.out.println("Red -> Green");
		        trafficLight.getCamera().enable(false);
		        trafficLight.setState(new GreenLight());
		    }
		    case CAUTION -> {
			    System.out.println("Red -> Flashing-Yellow");
	            trafficLight.getCamera().enable(false);
			    trafficLight.setState(new FlashingYellowLight());
		    } case STOP -> {
			    System.out.println("Red -> Flashing-Red");
			    trafficLight.setState(new FlashingRedLight());
		    }
		}
	}

}
