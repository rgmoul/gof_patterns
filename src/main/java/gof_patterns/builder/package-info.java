/*
 * MIT License
 *
 * Copyright (c) 2025 Symbiont Software
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
