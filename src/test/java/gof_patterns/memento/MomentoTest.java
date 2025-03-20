package gof_patterns.memento;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

/**
 * Demonstrates the use of / tests the Momento pattern.
 */
public class MomentoTest {

	@Test
	void test() {		
        Application app = new Application();
        // Make changes with proper separation of concerns
        app.setProperty("theme", "light");
        app.setProperty("volume", "80");
        app.setProperty("theme", "dark");

        assertEquals("dark", app.getProperty("theme"));
        assertEquals("80", app.getProperty("volume"));

        // Undo last change
        app.undo();
        assertEquals("light", app.getProperty("theme"));
        
        app.removeProperty("theme");
        assertNull(app.getProperty("theme"));
        // Undo last change
        app.undo();
        assertEquals("light", app.getProperty("theme"));

        app.undo();
        assertEquals("light", app.getProperty("theme"));

        // Undo another change
        app.undo();
        assertNull(app.getProperty("volume"));
	}
}
