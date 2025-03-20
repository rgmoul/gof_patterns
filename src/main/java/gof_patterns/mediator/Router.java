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
