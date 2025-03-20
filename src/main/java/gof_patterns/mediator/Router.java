package gof_patterns.mediator;

/**
 * Interface for routing messages to their destinations - Mediator in the
 * Mediator pattern.
 */
public interface Router {
    /**
     * Deliver the message to the named destination.
     *
     * @param src the name of the sender
     * @param destination the name of the destination to deliver the message to
     * @param message the message
     */
    void deliver(String src, String destination, String message);

    /**
     * Resisters a destination under a given name
     *
     * @param name the name to register under
     * @param dest the destination to register
     * @param modifiers router specific strings that influence the registration
     *                  process
     */
    void register(String name, Destination dest, String modifiers);

    /**
     * Resign (cancel) a registration.
     *
     * @param name the registration name ro resign
     */
    void resign(String name);
}
