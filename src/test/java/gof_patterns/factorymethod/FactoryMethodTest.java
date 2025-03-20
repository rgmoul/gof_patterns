package gof_patterns.factorymethod;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;

/**
 * Demonstrates the use of / tests the Factory Method factories.
 */
public class FactoryMethodTest {
	/**
	 * Use the factory to open an input stream and read the resource.
	 * 
	 * @param factory a factory
	 * @param resourcePath the path to the resource
	 * 
	 * @throws IOException if the resource can't be accessed
	 */
	private void testHelper(InputStreamInitializerFactory factory, String resourcePath) throws IOException {
		System.out.println("Testing factory class: " + factory.getClass().getName());
	    InputStreamInitializer init = factory.createInputStreamFactory();

	    try (InputStream in = init.open(resourcePath);
	    	 BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
		    assertEquals(12, br.lines().count());
		}
	}

	@Test
	void test() throws Exception {
		InputStreamInitializerFactory ff = new FileInputStreamInitializerFactory();
		InputStreamInitializerFactory cf = new ClasspathInputStreamInitializerFactory();
		InputStreamInitializerFactory uf = new UriInputStreamInitializerFactory();
		
		String classPath = "preamble.txt";
		Path path = Path.of("target/test-classes/preamble.txt");
		URI uri = path.toUri();

		testHelper(cf, classPath);
		testHelper(ff, path.toString());
		testHelper(uf, uri.toString());		
	}

}
