/*
 * MIT License
 *
 * Copyright (c) 2025 Symbiont Software
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
