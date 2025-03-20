package gof_patterns.chainofreponsibility;

import java.io.PrintWriter;

/**
 * Print handler for printing Number objects - ConcreteHandler in the
 * Chain of Responsibility pattern.
 */
public class NumberPrintHandler extends PrintHandler {
    private final PrintWriter wrtr;

    /**
     * Constructor.
     * 
     * @param wrtr writer to write to
     */
    public NumberPrintHandler(PrintWriter wrtr) {
        this.wrtr = wrtr;
    }

    /**
     * Prints the object if it is a Number, and passes the object on to a
     * succesor if one exists.
     *
     * @param obj the object to print
     */
    @Override
    public void handleRequest(Object obj) {
        if (obj instanceof Number) {
            wrtr.println("NUMBER: " + obj);
        }
        super.handleRequest(obj);
    }
}
