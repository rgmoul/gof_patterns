package gof_patterns.state;

/**
 * Represents a green light - ConcreteState in the State pattern.
 */
public class GreenLight extends TrafficLightState {
	/** Constructor. */
	GreenLight() {
		super("Green");
	}

	/**
	 * @see gof_patterns.state.TrafficLightState#changeLight(TrafficLight)
	 */
	@Override
	public void changeLight(TrafficLight trafficLight) {
		switch (trafficLight.getMode()) {
		    case NORMAL -> {
		        System.out.println("Green -> Yellow");
		        trafficLight.setState(new YellowLight());
		        trafficLight.getCamera().enable(true);
		    }
		    case CAUTION -> {
			    System.out.println("Green -> Flashing-Yellow");
			    trafficLight.setState(new FlashingYellowLight());
		    }
		    case STOP -> {
			    System.out.println("Green -> Flashing-Red");
	            trafficLight.getCamera().enable(false);
			    trafficLight.setState(new FlashingRedLight());
		    }
	    }
	}

}
