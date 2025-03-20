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

package gof_patterns.command;

import gof_patterns.command.SensorSlewCommand.SlewDirection;

/**
 * A simple sensor - Receiver in the Command pattern.
 */
public class Sensor {
    private boolean collecting;
    private String lastSlew;
    
    /**
     * Action to take for the SensorIdleCommand.
     * 
     * @param cmd the command
     */
    public void action(SensorIdleCommand cmd) {
        collecting = false;
        System.out.println("SENSOR: Idle");
    }
 
    /**
     * Action to take for the SensorCollectCommand.
     * 
     * @param cmd the command
     */
    public void action(SensorCollectCommand cmd) {
        collecting = true;
        System.out.println("SENSOR: Collect");
    }

    /**
     * Action to take for the SensorSlewCommand.
     * 
     * @param cmd the command
     */
    public void action(SensorSlewCommand cmd) {
        collecting = true;
    	SlewDirection direction = cmd.direction();
    	int degrees = cmd.degrees();
        lastSlew = direction.name() + ":" + degrees;
        System.out.printf("SENSOR: Slewing %s degrees %s\n",
        		           degrees, direction.name().toLowerCase());
    }

    /**
     * Gets the collecting state.
     * 
     * @return the collecting state
     */
    public boolean isCollecting() {
        return collecting;
    }
    
    /**
     * Gets a string representing the last slew commands direction and magnitude.
     * 
     * @return a string representing the last slew commands direction and magnitude
     */

    public String getLastSlew() {
    	return lastSlew;
    }
}
