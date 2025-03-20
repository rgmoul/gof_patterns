/**
 * The Visitor pattern, one of the Gang of Four (GoF) behavioral design patterns, allows you
 * to separate an algorithm from the objects it operates on by defining a new operation without
 * modifying the object structure. It achieves this by using a Visitor interface with methods
 * for each concrete element type, enabling double dispatch, where both the visitor and the
 * visited element determine the method execution. This pattern is useful when dealing with
 * complex object structures, such as trees or composite hierarchies, as it allows adding new
 * behaviors without altering existing classes. However, it requires modifying all element classes
 * to accept a visitor, making it less flexible if the element hierarchy frequently changes.
 *
 * @see java.nio.file.FileVisitor
 */
package gof_patterns.visitor;