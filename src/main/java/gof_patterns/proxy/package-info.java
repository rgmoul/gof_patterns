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
 * The Proxy pattern, one of the Gang of Four (GoF) design patterns, provides a surrogate or placeholder
 * object that controls access to another object, typically to manage the performance, security, or
 * resource consumption of the original object. The Proxy acts as an intermediary, allowing the client to
 * interact with it instead of the real object. It can be used in different contexts, such as virtual
 * proxies, which delay the creation of resource-intensive objects until needed; remote proxies, which
 * represent objects in a different address space (e.g., across a network); and protection proxies, which
 * control access to sensitive or restricted objects based on certain conditions. The Proxy pattern helps
 * in decoupling object responsibilities and controlling access to resources.
 */
package gof_patterns.proxy;
