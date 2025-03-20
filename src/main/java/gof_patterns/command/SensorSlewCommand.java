package gof_patterns.command;

/**
 * Command to slew (point) the sensor - ConcreteCommand in Command pattern
 * @param receiver the object the command is dispatched to
 * @param direction the direction to slew
 * @param degrees the amount to slew in degrees
 */
public record SensorSlewCommand(Sensor receiver, 
                                SlewDirection direction, int degrees) implements Command {
	/** Vaalid directions for the slew command. */
	public enum SlewDirection {LEFT, RIGHT, UP, DOWN}
	
	/**
     * Execute idle, on the sensor.
     */
    @Override
    public void execute() {
        receiver.action(this);
    }
}
