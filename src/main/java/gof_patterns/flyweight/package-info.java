/**
 * The Flyweight pattern, part of the Gang of Four (GoF) structural patterns is used to optimize memory
 * usage by sharing common, immutable objects instead of creating new ones. It is particularly useful
 * when an application needs to manage a large number of similar objects that have identical intrinsic
 * state. The pattern divides the object state into two categories: intrinsic state, which is shared and
 * stored externally, and extrinsic state, which varies and is passed in by the client. By reusing shared
 * intrinsic state and storing only the variable extrinsic state, the Flyweight pattern reduces memory
 * consumption and improves performance, especially in situations where many objects with similar data
 * are required.
 */
package gof_patterns.flyweight;
