package gof_patterns.mediator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Demonstrates the use of / tests the Mediator pattern.
 */
public class MediatorTest {

    @Test
    void test() {
        Router router = new Forwarder();

        Terminal fredTerm = new Terminal("fred", router);
        Terminal barneyTerm = new Terminal("barney", router);
        Logger log = new Logger("logger", router);

        // the terminals would normally be somewhat autonomous
        fredTerm.send("barney", "Hello");
        barneyTerm.send("fred", "Hi");
        fredTerm.send("fred", "Talking to myself");
        
        // check receipts
        
        List<MessageTrace> h = fredTerm.history();
        assertEquals(2, h.size());
        assertEquals("Hi", h.get(0).message());
        assertEquals("Talking to myself", h.get(1).message());
        
        h = barneyTerm.history();
        assertEquals(1, h.size());
        assertEquals("Hello", h.get(0).message());

        h = log.history();
        assertEquals(3, h.size());
        assertEquals("Hello", h.get(0).message());
        assertEquals("Hi", h.get(1).message());
        assertEquals("Talking to myself", h.get(2).message());
    }

}
