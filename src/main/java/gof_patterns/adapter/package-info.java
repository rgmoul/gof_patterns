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
 * The Adapter design pattern, as described in the Gang of Four (GoF) Design Patterns,
 * is a structural pattern that allows incompatible interfaces to work together by
 * providing a bridge between them. It acts as a wrapper that translates one interface
 * into another expected by the client, enabling objects with different interfaces to
 * communicate without modifying their existing code. This pattern is commonly used when
 * integrating legacy systems or third-party libraries with an application’s existing
 * codebase. There are two main types of adapters: class adapters, which use inheritance,
 * and object adapters, which use composition.
 * <p>
 * The Adapter pattern, one of the Gang of Four (GoF) design patterns, is a structural pattern
 * that allows incompatible interfaces to work together. It acts as a bridge by creating an
 * intermediary object that converts the interface of a class into another interface that a client
 * expects. Essentially, it enables classes with incompatible interfaces to collaborate without
 * modifying their existing code. This is particularly useful when integrating legacy systems or
 * third-party libraries into an application, as it helps to make disparate components work together
 * seamlessly by providing a consistent interface.
 */
package gof_patterns.adapter;
