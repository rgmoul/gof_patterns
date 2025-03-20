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
