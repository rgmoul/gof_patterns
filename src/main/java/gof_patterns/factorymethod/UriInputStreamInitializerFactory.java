package gof_patterns.factorymethod;

public class UriInputStreamInitializerFactory implements InputStreamInitializerFactory {
	/**
	 * Creates an UriInputStreamInitializer.
	 * 
	 * @return new UriInputStreamInitializer
	 */
	@Override
	public InputStreamInitializer createInputStreamFactory() {
		return new UriInputStreamInitializer();
	}

}
