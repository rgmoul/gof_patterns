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

/**
 * The Observer pattern, one of the Gang of Four (GoF) behavioral design patterns, defines a one-to-many
 * dependency between objects, ensuring that when one object (the subject) changes state, all its
 * dependent objects (observers) are notified and updated automatically. This promotes loose coupling,
 * as the subject does not need to know the specific details of its observers—only that they implement a
 * common interface for receiving updates. Commonly used in event-driven programming, MVC architectures,
 * and publish-subscribe systems, the Observer pattern allows dynamic relationships between objects.
 * <p>
 * Observer is widely used Java’s for change notification.  The java.util.Observer interface and
 * java.util.Observable class are deprecated in Java 9 and removed in Java 17.
 * 
 * @see java.util.EventListener
 * @see java.beans.PropertyChangeListener
 */
package gof_patterns.observer;