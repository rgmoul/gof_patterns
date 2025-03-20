package gof_patterns.proxy;

import java.awt.Image;

/**
 * An interface for cartoon characters - Subject in the Proxy pattern.
 */
public interface CartoonCharacter {
    /**
     * Gets the character's name.
     *
     * @return the character's name
     */
    String name();

    /**
     * Gets the character's image.
     *
     * @return the character's image
     */
    Image image();
}
