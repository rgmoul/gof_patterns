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

package gof_patterns.command;

import gof_patterns.command.SensorSlewCommand.SlewDirection;

/**
 * A controller - Invoker in Command pattern.
 */
public class SensorController {
	/** The sensor being controlled. */
	private final Sensor sensor;
	
    private final Command collectCommand;

    private final Command idleCommand;

    /**
     * Constructor.
     *
     * @param sensor the sensor to control
     */
    public SensorController(Sensor sensor) {
    	this.sensor = sensor;
    	idleCommand = new SensorIdleCommand(sensor);
        collectCommand = new SensorCollectCommand(sensor);
    }

    /**
     * Executes the collect command.
     */
    public void collect() {
    	collectCommand.execute();
    }

    /**
     * Executes the slew command.
     * 
     * @param direction the direction to slew
     * @param degrees the amount to slew in degrees
     */
    public void slew(SlewDirection direction, int degrees) {
        Command slewCommand = new SensorSlewCommand(sensor, SlewDirection.UP, 4);
        slewCommand.execute();
    }

    /**
     * Executes the idle command.
     */
    public void idle() {
    	idleCommand.execute();
    }

}
