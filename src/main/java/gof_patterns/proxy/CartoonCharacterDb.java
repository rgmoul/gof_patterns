package gof_patterns.proxy;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

/**
 * A cartoon character database.
 */
public final class CartoonCharacterDb {
    /** The db instance. */
    private static CartoonCharacterDb instance;

    /** The database contents. */
    private final String[][] db = {
        {"Charlie Brown","charlie_brown.gif"},
        {"Franklin","franklin.gif"},
        {"Linus","linus.gif"},
        {"Lucy","lucy.gif"},
        {"Marcy","marcie.gif"},
        {"Peppermint Patty","peppermint_patty.gif"},
        {"Pig Pen","pig_pen.gif"},
        {"Rerun","rerun.gif"},
        {"Sally","sally.gif"},
        {"Schroeder","schroede.gif"},
        {"Snoopy","snoopy.gif"},
        {"Woodstock","woodstock.gif"}
    };

    /**
     * Constructor - prevents external instantiation.
     */
    private CartoonCharacterDb() {
    }

    /**
     * Obtain the single instance.
     *
     * @return the database instance
     */
    public static synchronized CartoonCharacterDb getDb() {
        if (instance == null) {
            instance = new CartoonCharacterDb();
        }
        return instance;
    }

    /**
     * Get all of the characters.
     *
     * @return an array of character proxies
     */
    public CartoonCharacter[] getCharacters() {
        CartoonCharacter[] characters =
            new CartoonCharacter[db.length];
        for (int i = 0; i < characters.length; i++) {
            System.out.println("Creating a proxy for - " + db[i][0]);
            characters[i] = new CartoonCharacterProxy(db[i][0]);
        }
        return characters;
    }

    /**
     * Get the named character.
     *
     * @param name the name of the desired character
     *
     * @return the desired character (a real character)
     */
    public CartoonCharacter getCharacter(final String name) {
        CartoonCharacter character = null;
        for (String[] element : db) {
            if (name.equals(element[0])) {
                URL url = this.getClass().getResource("images/" + element[1]);
                Toolkit tk = Toolkit.getDefaultToolkit();
                Image image = tk.createImage(url);
                System.out.println("Creating a real character for - " + name);
                character = new RealCartoonCharacter(name, image);
                break;
            }
        }
        return character;
    }

}
