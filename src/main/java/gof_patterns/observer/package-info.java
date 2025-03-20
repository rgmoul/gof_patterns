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