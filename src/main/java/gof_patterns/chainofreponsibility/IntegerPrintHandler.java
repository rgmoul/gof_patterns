package gof_patterns.chainofreponsibility;

import java.io.PrintWriter;

/**
 * Print handler for printing Integer objects - Handler in the Chain of
 * Responsibility pattern.
 */
public class IntegerPrintHandler extends PrintHandler {
    private final PrintWriter wrtr;

    public IntegerPrintHandler(PrintWriter wrtr) {
        this.wrtr = wrtr;
    }

    /**
     * Prints the object if it is an Integer, and passes the object on to a
     * succesor if one exists.
     *
     * @param obj the object to print
     */
    @Override
    public void handleRequest(Object obj) {
        if (obj instanceof Integer) {
            wrtr.println("INTEGER: " + obj);
        }
        super.handleRequest(obj);
    }
}
