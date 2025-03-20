package gof_patterns.bridge;

/**
 * Honda's sports car - ConcreteImplementor in the Bridge pattern.
 */
public class S2000 implements AutomobileImplementation {

    /**
     * @see gof_patterns.bridge.Automobile#getEngineDisplacement()
     */
    @Override
    public int engineDisplacement() {
        return 2157;
    }

    /**
     * @see gof_patterns.bridge.Automobile#getHorsepower()
     */
    @Override
    public int horsepower() {
        return 240;
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
        return 2835;
    }

}
