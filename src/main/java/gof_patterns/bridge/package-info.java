/**
 * The Bridge pattern, one of the Gang of Four (GoF) structural design patterns,
 * is used to decouple an abstraction from its implementation, allowing them to
 * evolve independently. It achieves this by introducing a bridge interface that
 * separates high-level abstractions from low-level implementation details. Instead
 * of tightly coupling a class hierarchy, the Bridge pattern uses composition-where
 * an abstraction holds a reference to an implementation interface. This is
 * particularly useful when dealing with complex class structures that would otherwise
 * lead to an explosion of subclasses. A common example is separating device
 * functionality (implementation) from control logic (abstraction), such as a remote
 * control interface that can work with different device implementations (TV, radio,
 * etc.) without modifying their core logic.
 */
package gof_patterns.bridge;
