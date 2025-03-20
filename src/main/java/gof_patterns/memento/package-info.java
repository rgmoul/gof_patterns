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
