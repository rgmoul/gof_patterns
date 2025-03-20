package gof_patterns.command;

/**
 * Command to idle the sensor - ConcreteCommand in Command pattern
 * 
 * @param receiver the object the command is dispatched to
 */
public record SensorIdleCommand(Sensor receiver) implements Command {
    /**
     * Execute idle, on the sensor.
     */
    @Override
    public void execute() {
        receiver.action(this);
    }
}
