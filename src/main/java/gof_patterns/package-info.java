/*
 * MIT License
 *
 * Copyright (c) 2025 Russ Moul
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/**
 * A collection of simple examples of the Gang of For (Gof) design patterns. The GoF's (Erich Gamma, Richard Helm,
 * Ralph Johnson &amp;John Vlissides) seminal work on design patterns was published in 1994 and remains relevant to
 * this day. A truly timeless work.
 *
 * <ul>
 *  <ol>Creational Patterns
 *  <ul>
 *    <li>Factory Method - Defines an interface for creating objects but lets subclasses decide which class to
 *        instantiate, promoting loose coupling by delegating instantiation to subclasses.
 *    <li>Abstract Factory - Provides an interface for creating families of related or dependent objects without specifying their concrete classes, ensuring consistency among created objects.
 *    <li>Builder - Separates the construction of a complex object from its representation, allowing step-by-step creation with different configurations while keeping the final object immutable or flexible.
 *    <li>Prototype - Creates new objects by copying an existing object (a prototype), reducing the cost of creating new instances while preserving state.
 *    <li>Singleton - Ensures that a class has only one instance and provides a global point of access to it, commonly used for managing shared resources.
 *  </ul></ol>
 *  <ol>Structural Patterns
 * <ul>
 *    <li>Adapter - Converts the interface of a class into another interface expected by clients, enabling interoperability between incompatible interfaces without modifying their source code.
 *    <li>Bridge - Decouples an abstraction from its implementation so that the two can vary independently, promoting flexibility in extending both components.
 *    <li>Composite - Composes objects into tree structures to represent part-whole hierarchies, allowing clients to treat individual objects and compositions of objects uniformly.
 *    <li>Decorator - Dynamically adds behaviors or responsibilities to objects at runtime by wrapping them in decorator classes, providing an alternative to subclassing.
 *    <li>Facade - Provides a simplified, unified interface to a set of interfaces in a subsystem, making it easier for clients to use the system while hiding underlying complexities.
 *    <li>Flyweight - Optimizes memory usage by sharing common object instances instead of creating new ones, useful for managing a large number of similar objects.
 *    <li>Proxy - Acts as a surrogate or placeholder for another object, controlling access to it, adding security, caching, or lazy initialization features.
 *  </ul></ol>
 *<ol>Behavioral Patterns
 *<ul>
 *    <li>Chain of Responsibility - Passes requests along a chain of handlers, allowing multiple objects to handle the request without the sender specifying the receiver explicitly.
 *    <li>Command - Encapsulates a request as an object, allowing parameterization of requests, queuing, logging, and undoable operations.
 *    <li>Interpreter - Defines a grammar for a language and provides an interpreter to process sentences in that language, typically used in compilers or configuration parsers.
 *    <li>Iterator - Provides a way to access elements of a collection sequentially without exposing its underlying structure, improving encapsulation.
 *    <li>Mediator - Centralizes communication between objects, reducing direct dependencies between them, improving maintainability and decoupling components.
 *    <li>Memento - Captures an object’s state so it can be restored later without violating encapsulation, useful for undo mechanisms.
 *    <li>Observer - Establishes a dependency between objects so that when one object changes state, all its dependents (observers) are notified automatically.
 *    <li>State - Allows an object to change its behavior when its internal state changes, making state transitions more manageable and encapsulated.
 *    <li>Strategy - Defines a family of algorithms and makes them interchangeable at runtime, allowing dynamic behavior modification without altering client code.
 *    <li>Template Method - Defines the structure of an algorithm in a base class while allowing subclasses to customize certain steps without altering the algorithm’s overall structure.
 *    <li>Visitor - Separates algorithms from object structures, allowing new operations to be added to existing class hierarchies without modifying the classes themselves
 *  </ul></ol>
 */
package gof_patterns;
