package gof_patterns.factorymethod;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Utility for opening a file for input - ConcreteProduct in the Factory Method pattern.
 */
public class FileInputStreamInitializer implements InputStreamInitializer {
	/**
	 * Opens a file.
	 * 
	 * @param filePath file path to resource
	 * 
	 * @return InputputStream having resource at resourcePath as its source
	 * 
	 * @throws IOException if unable to open the resources
	 */

	@Override
	public InputStream open(String filePath) throws IOException {
		Path p = Path.of(filePath);
		return Files.newInputStream(p);
	}

}
