/*
 * MIT License
 *
 * Copyright (c) 2025 Symbiont Software
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
