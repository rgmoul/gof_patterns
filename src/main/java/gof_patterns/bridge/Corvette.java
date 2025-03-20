package gof_patterns.bridge;

/**
 * The Chevrolet sportscar - ConcreteImplementor in the Bridge pattern.
 */
public class Corvette implements AutomobileImplementation {

    /**
     * @see gof_patterns.bridge.Automobile#getEngineDisplacement()
     */
    @Override
    public int engineDisplacement() {
        return 6000;
    }

    /**
     * @see gof_patterns.bridge.Automobile#getHorsepower()
     */
    @Override
    public int horsepower() {
        return 400;
    }

    /**
     * @see gof_patterns.bridge.Automobile#getSeatingCapacity()
     */
    @Override
    public int seatingCapacity() {
        return 2;
    }

    /**
     * @see gof_patterns.bridge.Automobile#getWeight()
     */
    @Override
    public int weight() {
        return 3179;
    }

}
