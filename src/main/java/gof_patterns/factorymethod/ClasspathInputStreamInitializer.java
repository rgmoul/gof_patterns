package gof_patterns.factorymethod;

import java.io.IOException;
import java.io.InputStream;

/**
 * Utility for opening a file for input - ConcreteProduct in the Factory Method pattern.
 */
public class ClasspathInputStreamInitializer implements InputStreamInitializer {
	/**
	 * Opens a file.
	 * 
	 * @param classPath classpath to resource
	 * 
	 * @return InputputStream having resource at resourcePath as its source
	 * 
	 * @throws IOException if unable to open the resources
	 */
	@Override
	public InputStream open(String classPath) throws IOException {
		return ClassLoader.getSystemResourceAsStream(classPath);
	}

}
