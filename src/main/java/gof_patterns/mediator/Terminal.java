package gof_patterns.mediator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A terminal that may send messages and serve as a destination for messages -
 * ConcreteColleague in Mediator pattern.
 */
public class Terminal implements Destination {
    /** The terminal name. */
    private final String name;

    /** The router. */
    private final Router router;

    private final ArrayList<MessageTrace> history =  new ArrayList<>();

    /**
     * Constructor, initialises the terminal and registers with the router.
     *
     * @param name the terminals name
     * @param router the router the terminal is connected to
     */
    public Terminal(final String name, final Router router) {
        this.name = name;
        this.router = router;
        router.register(name, this, null);
    }

    /**
     * Sends a message to a destination, through the router.
     *
     * @param destination the destination name
     * @param message the message
     */
    public void send(final String destination, final String message) {
        router.deliver(name, destination, message);
    }

    /**
     * Receives a message from a named source, and prints the message.
     *
     * @param src the name of the message source
     * @param msg the message
     */
    @Override
    public void receive(String src, String msg) {
        history.add(new MessageTrace(src, msg));
        System.out.println("[" + name + ", received] " + msg);
    }

    /**
     * Get the history of this desination's messages received.
     * 
     * @return the list of received messages
     */
    @Override
    public List<MessageTrace> history() {
        return Collections.unmodifiableList(history);
    }

}
