package gof_patterns.state;

/**
 * Class defining the traffic light state  - State in the State pattern
 */
public abstract class TrafficLightState {
	private final String name;
	
	/**
	 * Constructor.
	 * 
	 * @param name for the enumerated value
	 */
	protected TrafficLightState(String name) {
		this.name = name;
	}
	
	/**
	 * Changes the state - the abstract method from State in the State design pattern.
	 * 
	 * @param trafficLight the context state is associated with
	 */
	public abstract void changeLight(TrafficLight trafficLight);

	/**
	 * Get the common name for this state.
	 * 
	 * @return the common name for this state
	 */
	public String getName() {
		return name;
	}
}
