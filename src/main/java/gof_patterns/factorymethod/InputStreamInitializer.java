package gof_patterns.factorymethod;

import java.io.IOException;
import java.io.InputStream;

/**
 * Interface for opening a resource for input - Product in the Factory Method pattern.
 */
public interface InputStreamInitializer {
	/**
	 * Open resource at path.
	 * 
	 * @param resourcePath implementation specific path to resource
	 * 
	 * @return InputputStream have resource at resourcePath as its source
	 * 
	 * @throws IOException if unable to open the resources
	 */
    InputStream open(String resourcePath) throws IOException;
}
