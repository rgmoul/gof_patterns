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

package gof_patterns.chainofreponsibility;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.jupiter.api.Test;

/**
 * Demonstrates the use of /tests the Chain of Responsibility pattern.
 */
class ChainOfResponsibilityTest {

    @Test
    void test() {
        String lineSep = System.lineSeparator();
        StringWriter sw = new StringWriter();
        // assemble the chain
        PrintHandler h1 = new StringPrintHandler(new PrintWriter(sw, true));
        PrintHandler h2 = new IntegerPrintHandler(new PrintWriter(sw, true));
        PrintHandler h3 = new NumberPrintHandler(new PrintWriter(sw, true));
        PrintHandler h4 = new ObjectPrintHandler(new PrintWriter(sw, true));

        h3.setSuccessor(h4);
        h2.setSuccessor(h3);
        h1.setSuccessor(h2);

        // process some requests
        h1.handleRequest(3);
        assertTrue(sw.toString().endsWith(String.join(lineSep, "INTEGER: 3", "NUMBER: 3", "OBJECT: 3", "")));

        h1.handleRequest(3.14);
        assertTrue(sw.toString().endsWith(String.join(lineSep, "NUMBER: 3.14", "OBJECT: 3.14", "")));

        h1.handleRequest("Hello");
        assertTrue(sw.toString().endsWith(String.join(lineSep, "STRING: Hello", "OBJECT: Hello", "")));

        h1.handleRequest(Boolean.valueOf("true"));
        assertTrue(sw.toString().endsWith(String.join(lineSep, "OBJECT: true", "")));
    }

}
