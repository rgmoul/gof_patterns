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
 * The Prototype pattern, as described in the Gang of Four (GoF) design patterns, is a creational pattern
 * that allows for the cloning of objects to create new instances rather than constructing them from
 * scratch. This pattern is particularly useful when object creation is a costly operation or when there
 * is a need to create multiple copies of an object with similar state. By defining a common interface for
 * cloning objects (often through a clone() method), the Prototype pattern enables the creation of new
 * instances by duplicating an existing prototype object, making it easier to manage and configure complex
 * object structures. It is commonly employed in scenarios where new objects are variations of an existing
 * instance and where the overhead of creating objects from scratch is prohibitive.
 */
package gof_patterns.prototype;
