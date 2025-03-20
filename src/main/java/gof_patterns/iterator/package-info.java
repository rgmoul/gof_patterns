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