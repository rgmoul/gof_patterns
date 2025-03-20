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
