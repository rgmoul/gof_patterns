package gof_patterns.command;

/**
 * A command interface - Command in the Command pattern.
 */
public interface Command {
    /**
     * Execute the command.
     * Typically, implemented as: 
     * <pre>
     *    public void execute() {
     *       receiver.action(this);
     *    }
     * </pre>
     * This must be implemented in each concrete Command, can't be inherited, as the compiler resolves
     * the type of 'this' and invokes the proper Command.  This is an example of double-dispatch.
     */
    void execute();
}
