package gof_patterns.proxy;

import java.awt.Image;

/**
 * A proxy for cartoon characters - Proxy in the Proxy pattern.
 * Accessing anything other the image will cause the real character to be instantiated.
 */
public class CartoonCharacterProxy implements CartoonCharacter {
    /** The character's name. */
    private final String name;

    /** The character's name. */
    private CartoonCharacter realCharacter;

    /**
     * Constructor.
     *
     * @param name the character's name
     */
    public CartoonCharacterProxy(final String name) {
        this.name = name;
    }

    /**
     * Gets the character's name.
     *
     * @return the character's name
     */
    @Override
    public String name() {
        String n;
        if (realCharacter == null) {
            n = name;
        } else {
            n = realCharacter.name();
        }
        return n;
    }

    /**
     * Gets the character's image.  The proxy will delegate to the real
     * character, creating it if it doesn't exist.
     *
     * @return the character's image
     */
   @Override
   public Image image() {
       if (realCharacter == null) {
           CartoonCharacterDb db = CartoonCharacterDb.getDb();
           realCharacter = db.getCharacter(name);
       }
       return realCharacter.image();
    }

   boolean isResolved() {
       return realCharacter != null;
   }
   /**
    * Returns the string representation of this character - just the name.
    *
    * @return the character's string representation
    */
   @Override
   public String toString() {
       return name;
   }

}
