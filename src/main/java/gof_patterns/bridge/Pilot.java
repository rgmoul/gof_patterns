package gof_patterns.bridge;

/**
 * One of Honda's SUVs - ConcreteImplementor in the Bridge pattern.
 */
public class Pilot implements AutomobileImplementation {

    /**
     * @see gof_patterns.bridge.Automobile#getEngineDisplacement()
     */
    @Override
    public int engineDisplacement() {
        return 3471;
    }
    /**
     * @see gof_patterns.bridge.Automobile#getHorsepower()
     */
    @Override
    public int horsepower() {
        return 255;
    }
    /**
     * @see gof_patterns.bridge.Automobile#getSeatingCapacity()
     */
    @Override
    public int seatingCapacity() {
        return 8;
    }
    /**
     * @see gof_patterns.bridge.Automobile#getWeight()
     */
    @Override
    public int weight() {
        return 4414;
    }
}
