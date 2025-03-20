/**
 * The Iterator pattern, one of the Gang of Four (GoF) design patterns, is a behavioral pattern that
 * provides a way to access elements of a collection sequentially without exposing its underlying
 * representation. It encapsulates the iteration logic within a separate object, allowing different
 * types of collections to be traversed using a common interface. This promotes loose coupling
 * between the collection and the client code, enabling flexibility in how elements are accessed and
 * iterated over. The pattern typically consists of an Iterator interface defining traversal methods
 * (e.g., next(), hasNext()) and a ConcreteIterator that implements them for a specific collection.
 * <p>
 * This pattern is widely used in Java, notably in the java.util.Iterator interface.
 *
 * @see java.util.Iterator
 * @see java.lang.Iterable
 * @see java.util.Enumeration
 *
 */
package gof_patterns.iterator;