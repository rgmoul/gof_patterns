package gof_patterns.chainofreponsibility;

/**
 * An abstract print handler that implements the succession chain.
 */
public abstract class PrintHandler {
    private PrintHandler successor;

    /**
     * Passes the object to be printed on to a succesor if one exists.
     *
     * @param obj the object to print
     */
    public void handleRequest(Object obj) {
        if (successor != null) {
            successor.handleRequest(obj);
        }
    }

    /**
     * Gets teh successor.
     *
     * @return the successor
     */
    public final PrintHandler getSuccessor() {
        return successor;
    }

    /**
     * Sets the successor.
     *
     * @param successor the successor to set
     */
    public final void setSuccessor(PrintHandler successor) {
        this.successor = successor;
    }
}
