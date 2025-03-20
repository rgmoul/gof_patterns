package gof_patterns.chainofreponsibility;

import java.io.PrintWriter;

/**
 * Print handler for printing strings - ConcreteHandler in the Chain of
 * Responsibility pattern.
 */
public class StringPrintHandler extends PrintHandler {
    private final PrintWriter wrtr;

    /**
     * Constructor.
     * 
     * @param wrtr writer to write to
     */
    public StringPrintHandler(PrintWriter wrtr) {
        this.wrtr = wrtr;
    }

    /**
     * Prints the object if it is a string, and passes the object on to a
     * succesor if one exists.
     *
     * @param obj the object to print
     */
    @Override
    public void handleRequest(Object obj) {
        if (obj instanceof String) {
            wrtr.println("STRING: " + obj);
        }
        super.handleRequest(obj);
    }
}
