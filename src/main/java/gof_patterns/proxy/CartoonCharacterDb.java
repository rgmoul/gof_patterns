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
