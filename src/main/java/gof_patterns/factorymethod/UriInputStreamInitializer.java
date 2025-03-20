package gof_patterns.factorymethod;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

/**
 * Utility for opening a file for input - ConcreteProduct in the Factory Method pattern.
 */
public class UriInputStreamInitializer implements InputStreamInitializer {
	/**
	 * Opens a URL.
	 * 
	 * @param urlString URL to resource
	 * 
	 * @return InputputStream having resource at resourcePath as its source
	 * 
	 * @throws IOException if unable to open the resources
	 */

	@Override
	public InputStream open(String urlString) throws IOException {
		try {
		    URL url = URI.create(urlString).toURL();
		    return url.openStream();
		} catch (Exception e) {
			throw new IOException("Failed to open resource.", e);
		}
	}

}
