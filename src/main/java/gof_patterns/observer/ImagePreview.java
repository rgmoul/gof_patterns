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

import java.io.File;
import java.net.URL;

/**
 * Placeholder for an image viewer - ConcreteObserver id the Observe design pattern.
 * 
 * @see gof_patterns.observer.ObserverDemo
 */
public class ImagePreview implements Observer<URL> {
    private int imageCount;
    
	/**
	 * @see gof_patterns.observer.Observer#update(Object)
	 */
	@Override
	public void update(URL imageUrl) {
		imageCount++;
		File imageFile = new File(imageUrl.getFile());
		System.out.printf("Would display image: %s\n", imageFile.getName());		
	}

	/**
	 * Gets the image count.
	 * 
	 * @return the image count
	 */
	public int getImageCount() {
		return imageCount;
	}

}
