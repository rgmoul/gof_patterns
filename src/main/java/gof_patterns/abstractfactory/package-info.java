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
 * The Abstract Factory design pattern, as described by the Gang of Four (GoF),
 * provides an interface for creating families of related or dependent objects
 * without specifying their concrete classes. It allows clients to produce objects
 * that share a common theme, ensuring consistency across related components. The
 * pattern typically involves an abstract factory interface with multiple concrete
 * implementations, each responsible for creating variants of objects that adhere
 * to a specific theme or configuration. This promotes loose coupling, making it
 * easier to introduce new product families without modifying existing client code.
 * It is often used in UI toolkits, database connections, and cross-platform
 * development to manage different implementations seamlessly.
 * <p>
 * The Abstract Factory pattern is a creational design pattern that provides an interface
 * for creating families of related or dependent objects without specifying their concrete
 * classes. It allows a client to create objects from multiple related product families
 * without knowing the exact class of the objects being created. This pattern typically
 * involves creating abstract product classes and concrete product families, with an abstract
 * factory class that defines methods for creating each product. The concrete factory
 * subclasses implement these methods to instantiate specific product families. This pattern
 * is useful when the system needs to be independent of how its products are created, composed,
 * and represented, ensuring that products from a specific family are used together.
 */
package gof_patterns.abstractfactory;
