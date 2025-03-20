package gof_patterns.factorymethod;

/**
 * Factory for FileInputStreamInitializer - Concrete Creator in Factory Method pattern.
 */
public class FileInputStreamInitializerFactory implements InputStreamInitializerFactory {
	/**
	 * Creates an FileInputStreamInitializer.
	 * 
	 * @return new FileInputStreamInitializer
	 */
	@Override
	public InputStreamInitializer createInputStreamFactory() {
		return new FileInputStreamInitializer();
	}

}
