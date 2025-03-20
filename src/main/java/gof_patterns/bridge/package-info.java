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
