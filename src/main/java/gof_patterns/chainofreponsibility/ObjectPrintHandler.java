package gof_patterns.chainofreponsibility;

import java.io.PrintWriter;

/**
 * Print handler for printing all objects - ConcreteHandler in the Chain of
 * Responsibility pattern.
 */
public class ObjectPrintHandler extends PrintHandler {
    private final PrintWriter wrtr;

    /**
     * Constructor.
     * 
     * @param wrtr writer to write to
     */
    public ObjectPrintHandler(PrintWriter wrtr) {
        this.wrtr = wrtr;
    }

    /**
     * Prints the object, and passes the object on to a successor if one exists.
     *
     * @param obj the object to print
     */
    @Override
    public void handleRequest(Object obj) {
        wrtr.println("OBJECT: " + obj);
        super.handleRequest(obj);
    }
}
