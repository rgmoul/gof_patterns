package gof_patterns.proxy;

import java.awt.Image;

/**
 * The real cartoon character - RealSubject in the Proxy pattern.
 *
 * @param name  The character's name.
 * @param image The character's image.
 */
public record RealCartoonCharacter(String name, Image image) implements CartoonCharacter {

    /**
     * Constructor.
     *
     * @param name  the character's name
     * @param image the character's image
     */
    public RealCartoonCharacter {
    }

    /**
     * Gets the character's name.
     *
     * @return the character's name
     */
    @Override
    public String name() {
        return name;
    }

    /**
     * Gets the character's image.
     *
     * @return the character's image
     */
    @Override
    public Image image() {
        return image;
    }

}
