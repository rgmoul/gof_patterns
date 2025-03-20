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
 * The Flyweight pattern, part of the Gang of Four (GoF) structural patterns is used to optimize memory
 * usage by sharing common, immutable objects instead of creating new ones. It is particularly useful
 * when an application needs to manage a large number of similar objects that have identical intrinsic
 * state. The pattern divides the object state into two categories: intrinsic state, which is shared and
 * stored externally, and extrinsic state, which varies and is passed in by the client. By reusing shared
 * intrinsic state and storing only the variable extrinsic state, the Flyweight pattern reduces memory
 * consumption and improves performance, especially in situations where many objects with similar data
 * are required.
 */
package gof_patterns.flyweight;
