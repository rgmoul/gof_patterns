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
