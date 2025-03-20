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
