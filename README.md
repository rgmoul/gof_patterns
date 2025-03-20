### License

This project is licensed under the **MIT License**.  
See the [LICENSE](LICENSE) file for more details.

A collection of simple examples of the Gang of For (Gof) design patterns. The GoF's (Erich Gamma, Richard Helm,
Ralph Johnson & John Vlissides) seminal work on design patterns was published in 1994 and remains relevant to
this day. A truly timeless work.

Each of the patterns is placed in its own package and includes a test case which serves as the client or context for the pattern elements and demonstrate their use.  In a few cases the is also a *Demo class which is an application demonstrating the patterns use.

### Creational Patterns

* Factory Method - Defines an interface for creating objects but lets subclasses decide which class to instantiate, promoting loose coupling by delegating instantiation to subclasses.
* Abstract Factory - Provides an interface for creating families of related or dependent objects without specifying their concrete classes, ensuring consistency among created objects.
* Builder - Separates the construction of a complex object from its representation, allowing step-by-step creation with different configurations while keeping the final object immutable or flexible.
* Prototype - Creates new objects by copying an existing object (a prototype), reducing the cost of creating new instances while preserving state.
* Singleton - Ensures that a class has only one instance and provides a global point of access to it, commonly used for managing shared resources.

### Structural Patterns

* Adapter - Converts the interface of a class into another interface expected by clients, enabling interoperability between incompatible interfaces without modifying their source code.
* Bridge - Decouples an abstraction from its implementation so that the two can vary independently, promoting flexibility in extending both components.
* Composite - Composes objects into tree structures to represent part-whole hierarchies, allowing clients to treat individual objects and compositions of objects uniformly.
* Decorator - Dynamically adds behaviors or responsibilities to objects at runtime by wrapping them in decorator classes, providing an alternative to subclassing.
* Facade - Provides a simplified, unified interface to a set of interfaces in a subsystem, making it easier for clients to use the system while hiding underlying complexities.
* Flyweight - Optimizes memory usage by sharing common object instances instead of creating new ones, useful for managing a large number of similar objects.
* Proxy - Acts as a surrogate or placeholder for another object, controlling access to it, adding security, caching, or lazy initialization features.

### Behavioral Patterns

* Chain of Responsibility - Passes requests along a chain of handlers, allowing multiple objects to handle the request without the sender specifying the receiver explicitly.
* Command - Encapsulates a request as an object, allowing parameterization of requests, queuing, logging, and undoable operations.
* Interpreter - Defines a grammar for a language and provides an interpreter to process sentences in that language, typically used in compilers or configuration parsers.
* Iterator - Provides a way to access elements of a collection sequentially without exposing its underlying structure, improving encapsulation.
* Mediator - Centralizes communication between objects, reducing direct dependencies between them, improving maintainability and decoupling components.
* Memento - Captures an object’s state so it can be restored later without violating encapsulation, useful for undo mechanisms.
* Observer - Establishes a dependency between objects so that when one object changes state, all its dependents (observers) are notified automatically.
* State - Allows an object to change its behavior when its internal state changes, making state transitions more manageable and encapsulated.
* Strategy - Defines a family of algorithms and makes them interchangeable at runtime, allowing dynamic behavior modification without altering client code.
* Template Method - Defines the structure of an algorithm in a base class while allowing subclasses to customize certain steps without altering the algorithm’s overall structure.
* Visitor - Separates algorithms from object structures, allowing new operations to be added to existing class hierarchies without modifying the classes themselves
