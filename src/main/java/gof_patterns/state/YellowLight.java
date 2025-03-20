package gof_patterns.state;

/**
 * Represents a yellow light - ConcreteState in the State pattern.
 */
public class YellowLight extends TrafficLightState {
	/** Constructor. */
	YellowLight() {
		super("Yellow");
	}

	/**
	 * @see gof_patterns.state.TrafficLightState#changeLight(TrafficLight)
	 */
	@Override
	public void changeLight(TrafficLight trafficLight) {
		switch (trafficLight.getMode()) {
		    case NORMAL ->  {
		        System.out.println("Yellow -> Red");
		        trafficLight.setState(new RedLight());
		    } 
		    case CAUTION -> {
			    System.out.println("Yellow -> Flashing-Yellow");
	            trafficLight.getCamera().enable(false);
			    trafficLight.setState(new FlashingYellowLight());
		    }
		    case STOP -> {
			    System.out.println("Red -> Flashing-Red");
			    trafficLight.setState(new FlashingRedLight());
		    }
		}
	}

}
