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
