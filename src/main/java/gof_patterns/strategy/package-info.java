/**
 * The Strategy pattern, one of the Gang of Four (GoF) behavioral design patterns, defines a family
 * of algorithms, encapsulates each one in a separate class, and makes them interchangeable at
 * runtime. It allows a client to choose an algorithm dynamically without modifying the code that
 * uses it, promoting flexibility and maintainability. The pattern consists of a strategy interface
 * that defines a common contract for all algorithms, multiple concrete strategy implementations, and
 * a context class that delegates execution to a selected strategy. This is useful when multiple
 * behaviors or algorithms exist for a task, such as different sorting methods or payment options,
 * enabling clean separation of concerns and easier code extension.
 * <p>
 * The Strategy pattern is manifest in java.util.Comparator.
 * @see java.util.Comparator
 */
package gof_patterns.strategy;