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
