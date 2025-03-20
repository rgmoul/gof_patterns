/**
 * The Template Method pattern, one of the Gang of Four (GoF) behavioral design patterns, defines
 * the skeleton of an algorithm in a base class while allowing subclasses to override specific
 * steps of the algorithm without changing its overall structure. The base class provides a
 * template method that outlines the algorithm’s steps, with some steps implemented in the base
 * class and others left as abstract methods for subclasses to define. This promotes code reuse
 * and inversion of control, ensuring that the high-level logic remains unchanged while allowing
 * customization of certain behaviors. It is commonly used in frameworks where a predefined
 * workflow needs to be extended by client implementations.
 */
package gof_patterns.templatemethod;