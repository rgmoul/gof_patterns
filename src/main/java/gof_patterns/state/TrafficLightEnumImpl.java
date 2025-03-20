/*
 * MIT License
 *
 * Copyright (c) 2025 Russ Moul
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package gof_patterns.state;

/**
 * A traffic light using enum to implement state - Context in State design pattern.
 */
public class TrafficLightEnumImpl {
	private OperatingMode mode;
	private TrafficLightStateEnum state;
	private final TrafficCamera camera;
	
	/**
	 * Constructor.
	 */
	public TrafficLightEnumImpl() {
		mode = OperatingMode.NORMAL;
		state = TrafficLightStateEnum.RED;
		camera = new TrafficCamera();
		camera.enable(true);
	}

	/**
	 * Set the state.
	 * 
	 * @param state desired state
	 */
	void setState(TrafficLightStateEnum state) {
		this.state = state;
	}

	/**
	 * Get the current state.
	 * 
	 * @return the current state
	 */
	String getState() {
		return state.getCommonName();
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
