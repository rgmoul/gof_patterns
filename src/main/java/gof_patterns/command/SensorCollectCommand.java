package gof_patterns.command;

/**
 * Command to initiate sensor collection - ConcreteCommand in Command pattern
 */
public record SensorCollectCommand(Sensor receiver) implements Command {
    /**
     * Execute collect, on the sensor.
     */
    @Override
    public void execute() {
        receiver.action(this);
    }
}
