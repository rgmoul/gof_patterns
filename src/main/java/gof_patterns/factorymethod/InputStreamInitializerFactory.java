package gof_patterns.factorymethod;

/**
 * Factory interface for input stream initializers - Creator in the Factory Method pattern.
 */
public interface InputStreamInitializerFactory {
	/**
	 * Creates an InputStreamInitializer.
	 * 
	 * @return new InputStreamInitializer
	 */
	InputStreamInitializer createInputStreamFactory();
}
