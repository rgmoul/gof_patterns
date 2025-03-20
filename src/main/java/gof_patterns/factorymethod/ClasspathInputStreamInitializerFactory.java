package gof_patterns.factorymethod;

public class ClasspathInputStreamInitializerFactory implements InputStreamInitializerFactory {
	/**
	 * Creates an ClasspathInputStreamInitializer.
	 * 
	 * @return new ClasspathInputStreamInitializer
	 */
	@Override
	public InputStreamInitializer createInputStreamFactory() {
		return new ClasspathInputStreamInitializer();
	}

}
