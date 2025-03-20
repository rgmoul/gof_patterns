package gof_patterns.bridge;

/**
 * A generic SUV - RefinedAbstraction in the Bridge pattern, though it defines
 * no refinements.
 */
public class SportUtility extends Automobile {

    /**
     * Constructor.
     *
     * @param impl the implementation object
     */
    public SportUtility(final AutomobileImplementation impl) {
        super(impl);
    }
}
