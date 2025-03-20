/**
 * The Factory Method pattern, part of the Gang of Four (GoF) design patterns, defines an interface
 * for creating objects but allows subclasses to alter the type of objects that will be created.
 * Instead of calling a constructor directly to instantiate an object, the Factory Method provides
 * a way to delegate the object creation process to subclasses or specific methods, promoting loose
 * coupling. This pattern is useful when a class cannot anticipate the type of objects it needs to
 * create, or when the creation logic is complex or varies. By using the Factory Method, a class can
 * instantiate different types of objects without knowing their specific classes, relying on
 * subclasses or external factory methods to provide the necessary instances.
 */
package gof_patterns.factorymethod;
