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
