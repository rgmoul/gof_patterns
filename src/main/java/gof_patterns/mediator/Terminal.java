/*
 * MIT License
 *
 * Copyright (c) 2025 Russ Moul
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
