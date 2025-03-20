package gof_patterns.observer;

import java.util.ArrayList;
import java.util.List;
/**
 * Defines the notification mechanism for observable subjects  - Subject in the Observer design pattern.
 * 
 * @param <T> the type provided to the observer
 */
public class Subject<T> {
    private final List<Observer<T>> observers = new ArrayList<>();

    /**
     * Adds an observer to this subject.
     * 
     * @param observer the observer to add
     */
    public void addObserver(Observer<T> observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from this subject.
     * 
     * @param observer the observer to remove
     */
    public void removeObserver(Observer<T> observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all observes of a value/data change.
     * 
     * @param value the changed value/data
     */
    public void notifyObservers(T value) {
        for (Observer<T> observer : observers) {
            observer.update(value);
        }
    }

}
