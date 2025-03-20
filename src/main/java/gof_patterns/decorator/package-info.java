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
 * The Decorator design pattern is a structural pattern that allows you to dynamically add behavior
 * to an object at runtime without altering its structure. It achieves this by creating a set of
 * wrapper classes that “decorate” the original object, adding new functionality while maintaining
 * the object’s original interface. The decorator classes implement the same interface as the object
 * being decorated and are composed of the original object, enabling multiple decorators to be
 * combined to extend the object’s behavior in a flexible and reusable manner. This pattern is often
 * used when you need to add features to objects in a scalable way, such as adding new functionalities
 * to user interface components without modifying the base class.
 * <p>
 * The Decorator pattern plays a crucial role in stream I/O in the Java libraries.
 * @see java.io.FilterInputStream
 * @see java.io.FilterOutputStream
 * @see java.io.FilterReader
 * @see java.io.FilterWriter
 *
 */
package gof_patterns.decorator;
