package gof_patterns.mediator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A destination that attempts to eavesdrop on the messages and log them -
 * ConcreteColleague in Mediator pattern.
 */
public class Logger implements Destination {
    /** The logging object to log to. */
    static final java.util.logging.Logger logger =
           java.util.logging.Logger.getLogger(Logger.class.getName());
    
    private final ArrayList<MessageTrace> history =  new ArrayList<>();

    /**
     * Constructor, initializes the logger and registers with the router,
     * indicating it wants to receive-all messages.
     *
     * @param name the terminals name
     * @param router the router the terminal is connected to
     */
    public Logger(final String name, final Router router) {
        router.register(name, this, "receive-all");
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
        logger.info(src + " -> " + msg);
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
