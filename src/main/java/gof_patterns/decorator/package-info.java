/**
 * The Decorator design pattern is a structural pattern that allows you to dynamically add behavior
 * to an object at runtime without altering its structure. It achieves this by creating a set of
 * wrapper classes that “decorate” the original object, adding new functionality while maintaining
 * the object’s original interface. The decorator classes implement the same interface as the object
 * being decorated and are composed of the original object, enabling multiple decorators to be
 * combined to extend the object’s behavior in a flexible and reusable manner. This pattern is often
 * used when you need to add features to objects in a scalable way, such as adding new functionalities
 * to user interface components without modifying the base class.
 * <p>
 * The Decorator pattern plays a crucial role in stream I/O in the Java libraries.
 * @see java.io.FilterInputStream
 * @see java.io.FilterOutputStream
 * @see java.io.FilterReader
 * @see java.io.FilterWriter
 *
 */
package gof_patterns.decorator;
