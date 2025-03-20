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
