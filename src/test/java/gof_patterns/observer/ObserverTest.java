package gof_patterns.observer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Demonstrates the use of / tests the Observer design pattern.
 */
class ObserverTest {

	@Test
	void test() {
        Camera c = new Camera();
        ImageLogger logger = new ImageLogger();
        ImagePreview preview = new ImagePreview();
        
        c.addObserver(preview);
        c.addObserver(logger);
        
        c.captureImage();
        c.captureImage();
        
        assertEquals(2, logger.getImageCount());
        assertEquals(2, preview.getImageCount());        
	}

}
