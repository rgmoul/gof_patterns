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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import gof_patterns.command.SensorSlewCommand.SlewDirection;

/**
 * Demonstrates the use of /tests the command pattern - Client in Command pattern.
 * Uses the controller to control disparent classes.
 */
public class CommandTest {

    @Test
    void test() {



        // create a controller to control the sensor
        Sensor sensor = new Sensor();
    	SensorController cntrl = new SensorController(sensor);

        cntrl.collect();
        assertTrue(sensor.isCollecting());
        cntrl.slew(SlewDirection.UP, 4);
        assertEquals("UP:4", sensor.getLastSlew());

        cntrl.idle();
        assertFalse(sensor.isCollecting());
    }

}
