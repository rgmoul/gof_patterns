/*
 * MIT License
 *
 * Copyright (c) 2025 Symbiont Software
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
 * Enum defining the states abstract operation and all the concrete states - State and ConcreteState
 */
public enum TrafficLightStateEnum {
	RED("Red") {
		public void changeLight(TrafficLightEnumImpl trafficLight) {
			switch (trafficLight.getMode()) {
			    case NORMAL -> {
			        System.out.println("Red -> Green");
			        trafficLight.getCamera().enable(false);
			        trafficLight.setState(GREEN);
			    }
			    case CAUTION -> {
				    System.out.println("Red -> Flashing-Yellow");
		            trafficLight.getCamera().enable(false);
				    trafficLight.setState(FLASHING_YELLOW);
			    } case STOP -> {
				    System.out.println("Red -> Flashing-Red");
				    trafficLight.setState(FLASHING_RED);
			    }
			}
		}
	},
	YELLOW("Yellow") {
		public void changeLight(TrafficLightEnumImpl trafficLight) {
			switch (trafficLight.getMode()) {
			    case NORMAL ->  {
			        System.out.println("Yellow -> Red");
			        trafficLight.setState(RED);
			    } 
			    case CAUTION -> {
				    System.out.println("Yellow -> Flashing-Yellow");
		            trafficLight.getCamera().enable(false);
				    trafficLight.setState(FLASHING_YELLOW);
			    }
			    case STOP -> {
				    System.out.println("Red -> Flashing-Red");
				    trafficLight.setState(FLASHING_RED);
			    }
			}
		}
	},
	GREEN("Green") {
		public void changeLight(TrafficLightEnumImpl trafficLight) {
			switch (trafficLight.getMode()) {
			    case NORMAL -> {
			        System.out.println("Green -> Yellow");
			        trafficLight.setState(YELLOW);
			        trafficLight.getCamera().enable(true);
			    }
			    case CAUTION -> {
				    System.out.println("Green -> Flashing-Yellow");
				    trafficLight.setState(FLASHING_YELLOW);
			    }
			    case STOP -> {
				    System.out.println("Green -> Flashing-Red");
		            trafficLight.getCamera().enable(false);
				    trafficLight.setState(FLASHING_RED);
			    }
			}
		}
	},
	FLASHING_RED("Flashing-Red") {
		public void changeLight(TrafficLightEnumImpl trafficLight) {
			trafficLight.setMode(OperatingMode.NORMAL);
			System.out.println("Flashing-Red -> Red");
			trafficLight.setState(RED);
			trafficLight.getCamera().enable(true);
		}
	},
	FLASHING_YELLOW("Flashing-Yellow") {
		public void changeLight(TrafficLightEnumImpl trafficLight) {
			trafficLight.setMode(OperatingMode.NORMAL);
			System.out.println("Flashing-Yellow -> Yellow");
			trafficLight.setState(YELLOW);
			trafficLight.getCamera().enable(true);
		}
	};

	private final String commonName;
	
	/**
	 * Constructor.
	 * 
	 * @param commonName for the enumerated value
	 */
    TrafficLightStateEnum(String commonName) {
		this.commonName = commonName;
	}
	
	/**
	 * Changes the state - the abstract method from State in the State design pattern.
	 * 
	 * @param trafficLight the context state is associated with
	 */
	public abstract void changeLight(TrafficLightEnumImpl trafficLight);

	/**
	 * Get the common name for this state.
	 * 
	 * @return the common name for this state
	 */
	public String getCommonName() {
		return commonName;
	}
}
