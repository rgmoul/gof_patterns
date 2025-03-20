/**
 * The Builder design pattern, part of the Gang of Four (GoF) patterns,
 * is a creational pattern that separates the construction of a complex
 * object from its representation, allowing the same construction process
 * to create different representations. It provides a step-by-step approach
 * to building objects by using a Builder class that assembles the object’s
 * components and a Director class (optional) that controls the construction
 * process. This pattern is particularly useful when an object has multiple
 * optional fields or complex initialization logic, improving code
 * readability, maintainability, and flexibility by avoiding large
 * constructors with numerous parameters (i.e., the telescoping constructor
 * problem).
 * <p>
 * Numerous occurrences of the Builder pattern occur in the standard libraries.
 * @see java.lang.StringBuilder
 * @see java.lang.ProcessBuilder
 */
package gof_patterns.builder;
