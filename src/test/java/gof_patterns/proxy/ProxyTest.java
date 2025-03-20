package gof_patterns.proxy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Demonstrates the use of / tests the Proxy pattern.
 */
public class ProxyTest {

    @Test
    void test() {
        CartoonCharacterDb db = CartoonCharacterDb.getDb();
        CartoonCharacter[] characters = db.getCharacters();
        
        CartoonCharacter c = characters[0];
        c.name();

        assertInstanceOf(CartoonCharacterProxy.class, c);
        
        CartoonCharacterProxy proxy = (CartoonCharacterProxy)c;
        assertFalse(proxy.isResolved());
        c.image();
        assertTrue(proxy.isResolved());

        c = db.getCharacter(c.name());
        assertInstanceOf(RealCartoonCharacter.class, c);
    }

}
