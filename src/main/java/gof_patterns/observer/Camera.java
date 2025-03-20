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

package gof_patterns.observer;

import java.net.URL;

/**
 * Simulated camera - ConcreteSubject in the Observer design pattern.
 */
public class Camera extends Subject<URL> {
	private final String[] images = {"antartica.jpg",
			                   "coca_falls.jpg",
			                   "virunga_mountains.jpg"
			                  };
	private int index;
	private URL lastImage;

	/**
	 * Captures an image, initiates observer notification.
	 */
	public void captureImage() {
		// capture image and notify
		String imageName = images[index++ % 3];
		System.out.println(imageName);
		lastImage = this.getClass().getResource("images/" + imageName);

		// The Observer pattern as originally specified does not dictate self-initiated 
		// notifications.  Self self-initiated notifications are generally preferred.
		notifyObservers(lastImage);
		//System.exit(0);
	}

	/**
	 * Gets the last captured image.
	 *
	 * @return url to the captured image
	 */
	public URL getLastImage() {
		return lastImage;
	}

}
