/**
 * The Composite design pattern, part of the Gang of Four (GoF) structural patterns, allows treating
 * individual objects and compositions of objects uniformly by organizing them into a tree structure.
 * It enables clients to interact with both single objects and groups of objects through a common interface,
 * typically by defining a Component interface that both Leaf (individual objects) and Composite (containers
 * of objects) classes implement. This pattern simplifies client code by allowing recursive structures, such
 * as file systems, UI hierarchies, and organizational charts, where operations can be performed on either a
 * single object or an entire group without needing to differentiate between them.
 */
package gof_patterns.composite;
