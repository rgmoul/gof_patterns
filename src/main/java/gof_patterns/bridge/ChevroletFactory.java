package gof_patterns.bridge;

/**
 * Creates Chevrolet automobiles, a concrete factory.
 */
public class ChevroletFactory implements AutomobileFactory {

    /**
     * @see gof_patterns.bridge.AutomobileFactory#createSportscar()
     */
    @Override
    public Sportscar createSportscar() {
        return new Sportscar(new Corvette());
    }

    /**
     * @see gof_patterns.bridge.AutomobileFactory#createSportUtility()
     */
    @Override
    public SportUtility createSportUtility() {
        return new SportUtility(new Tahoe());
    }

}
