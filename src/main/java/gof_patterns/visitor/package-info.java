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
 * The Visitor pattern, one of the Gang of Four (GoF) behavioral design patterns, allows you
 * to separate an algorithm from the objects it operates on by defining a new operation without
 * modifying the object structure. It achieves this by using a Visitor interface with methods
 * for each concrete element type, enabling double dispatch, where both the visitor and the
 * visited element determine the method execution. This pattern is useful when dealing with
 * complex object structures, such as trees or composite hierarchies, as it allows adding new
 * behaviors without altering existing classes. However, it requires modifying all element classes
 * to accept a visitor, making it less flexible if the element hierarchy frequently changes.
 *
 * @see java.nio.file.FileVisitor
 */
package gof_patterns.visitor;