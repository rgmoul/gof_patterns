package gof_patterns.bridge;

/**
 * Creates Honda automobiles, a concrete factory.
 */
public class HondaFactory implements AutomobileFactory {

    /**
     * @see gof_patterns.bridge.AutomobileFactory#createSportscar()
     */
    @Override
    public Sportscar createSportscar() {
        return new Sportscar(new S2000());
    }

    /**
     * @see gof_patterns.bridge.AutomobileFactory#createSportUtility()
     */
    @Override
    public SportUtility createSportUtility() {
        return new SportUtility(new Pilot());
    }

}
