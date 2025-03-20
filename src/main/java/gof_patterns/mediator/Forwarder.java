package gof_patterns.mediator;

import java.util.HashMap;
import java.util.HashSet;

/**
 * A simple forwarding implementation of the Router interface - ConcreteMediator in the
 * Mediator pattern.
 */
public class Forwarder implements Router {
    /** The destination registry. */
    private final HashMap<String,Destination> destinations = new HashMap<>();
    /** The receive-all registry. */
    private final HashSet<String> receiveAlls = new HashSet<>();

    /**
     * Deliver the message to the named destination, and any destinations
     * registered with the "receive-all" modifier.
     *
     * @param src the name of the sender
     * @param destination the name of the destination to deliver the message to
     * @param message the message
     */
    @Override
    public void deliver(final String src, final String destination,
                        final String message) {
        Destination d = destinations.get(destination);
        d.receive(src, message);

        for (String name : receiveAlls) {
            if (!name.equals(destination)) {
                d = destinations.get(name);
                d.receive(src, message);
            }
        }
    }

    /**
     * Resisters a destination under a given name
     *
     * @param name the name to register under
     * @param dest the destination to register
     * @param modifiers maybe "receive-all", to indicate all messages are to
     *                  routed to this destination, or null
     */
    @Override
    public void register(final String name, final Destination dest,
                         final String modifiers) {
        destinations.put(name, dest);
        if ("receive-all".equals(modifiers)) {
            receiveAlls.add(name);
        }
    }

    /**
     * Resign (cancel) a registration.
     *
     * @param name the registration name ro resign
     */
    @Override
    public void resign(final String name) {
        destinations.remove(name);
    }

}
