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
