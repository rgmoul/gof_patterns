/*
 * MIT License
 *
 * Copyright (c) 2025 Russ Moul
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
