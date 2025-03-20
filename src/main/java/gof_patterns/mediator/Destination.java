package gof_patterns.mediator;

import java.util.List;

/**
 * A destination for messages - Colleague in the Mediator pattern.
 */
public interface Destination {
    /**
     * Receives a message from a named source.
     *
     * @param src the name of the message source
     * @param msg the message
     */
    void receive(String src, String msg);
    
    /**
     * Get the history of this desination's messages received.
     * 
     * @return the list of received messages
     */
    List<MessageTrace> history();
}
