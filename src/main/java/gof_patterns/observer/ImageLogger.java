package gof_patterns.observer;

import java.io.File;
import java.net.URL;

/**
 * Logs information about a captured image - ConcreteObserver id the Observe design pattern.
 */
public class ImageLogger implements Observer<URL> {
	private int imageCount;

	/**
	 * @see gof_patterns.observer.Observer#update(Object)
	 */
	@Override
	public void update(URL imageUrl) {
		imageCount++;
		File imageFile = new File(imageUrl.getFile());
		System.out.printf("Captured image: %s, size: %d\n", imageFile.getName(), imageFile.length() );
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
