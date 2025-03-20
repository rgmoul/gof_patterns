package gof_patterns.state;

/**
 * Represents a traffic camera.
 */
public class TrafficCamera {
	private boolean enabled;
	
	/**
	 * Sets teh enable/disabled state of the camera.
	 * 
	 * @param enable true to enable, false to disable
	 */
	public void enable(boolean enable) {
		enabled = enable;
	}

	/**
	 * Get the current state of the camera.
	 * 
	 * @return true if enabled, false otherwise
	 */
	public boolean isEnabled() {
		return enabled;
	}

}
