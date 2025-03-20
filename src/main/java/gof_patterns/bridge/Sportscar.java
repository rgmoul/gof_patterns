package gof_patterns.bridge;

/**
 * A generic sportscar - RefinedAbstraction in the Bridge pattern.
 */
public class Sportscar extends Automobile {
    /**
     * Constructor.
     *
     * @param impl the implementation object
     */
    public Sportscar(final AutomobileImplementation impl) {
        super(impl);
    }

    /**
     * Get the power to weight ratio.
     *
     * @return the power to weight ratio
     */
    double getPowerWeightRatio() {
        return (double)getHorsepower() / (double)getWeight();
    }
}
