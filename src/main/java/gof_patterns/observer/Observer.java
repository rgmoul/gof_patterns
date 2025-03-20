package gof_patterns.observer;

/**
 * Defines the notification method for observers - Observer in the Observer design pattern.
 * 
 * @param <T> the type provided to the observer
 */
public interface Observer<T> {
	/**
	 * Provides the observer with the observed data.
	 * 
	 * @param value the observer with the observed data
	 */
    void update(T value);
}
