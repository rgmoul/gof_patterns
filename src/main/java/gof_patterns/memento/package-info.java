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
 * The Memento pattern, one of the Gang of Four (GoF) behavioral design patterns, is used to capture
 * and restore an object’s state without violating encapsulation. It enables an object to save its
 * internal state in a separate Memento object, which can later be restored to revert changes. This
 * pattern is particularly useful for implementing undo/redo functionality in applications. The pattern
 * involves three key components: the Originator, which creates and restores Mementos; the Memento,
 * which stores the state; and the Caretaker, which manages Mementos without exposing the internal
 * details of the Originator. By keeping the internal structure hidden from external objects, the
 * Memento pattern preserves encapsulation while allowing state rollback when needed.
 */
package gof_patterns.memento;
