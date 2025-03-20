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
 * The Strategy pattern, one of the Gang of Four (GoF) behavioral design patterns, defines a family
 * of algorithms, encapsulates each one in a separate class, and makes them interchangeable at
 * runtime. It allows a client to choose an algorithm dynamically without modifying the code that
 * uses it, promoting flexibility and maintainability. The pattern consists of a strategy interface
 * that defines a common contract for all algorithms, multiple concrete strategy implementations, and
 * a context class that delegates execution to a selected strategy. This is useful when multiple
 * behaviors or algorithms exist for a task, such as different sorting methods or payment options,
 * enabling clean separation of concerns and easier code extension.
 * <p>
 * The Strategy pattern is manifest in java.util.Comparator.
 * @see java.util.Comparator
 */
package gof_patterns.strategy;