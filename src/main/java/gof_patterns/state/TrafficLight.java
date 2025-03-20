package gof_patterns.state;

/**
 * A traffic light - Context in State design pattern.
 */
public class TrafficLight {
	private OperatingMode mode;
	private TrafficLightState state;
	private final TrafficCamera camera;
	
	/**
	 * Constructor.
	 */
	public TrafficLight() {
		mode = OperatingMode.NORMAL;
		state = new RedLight();
		camera = new TrafficCamera();
		camera.enable(true);
	}

	/**
	 * Set the state.
	 * 
	 * @param state desired state
	 */
	void setState(TrafficLightState state) {
		this.state = state;
	}

	/**
	 * Get the current state.
	 * 
	 * @return the current state
	 */
	String getState() {
		return state.getName();
	}

	/**
	 * Get the current operating mode.
	 * 
	 * @return the current operating mode
	 */
	OperatingMode getMode() {
		return mode;
	}

	/**
	 * Set the operating mode.
	 * 
	 * @param mode desired mode
	 */
	void setMode(OperatingMode mode) {
		this.mode = mode;
	}

	/**
	 * Get the traffic camera.
	 * 
	 * @return the traffic camera 
	 */
	TrafficCamera getCamera() {
		return camera;
	}

	/**
	 * Change the light to the next state, if in CAUTION or STOP mode will transition to NORMAL.
	 */
	void changeLight() {
		state.changeLight(this);
	}
	
}
