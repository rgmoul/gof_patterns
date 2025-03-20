package gof_patterns.bridge;

/**
 * One of Chevrolet's SUVs - ConcreteImplementor in the Bridge pattern.
 */
public class Tahoe implements AutomobileImplementation {

    /**
     * @see gof_patterns.bridge.Automobile#getEngineDisplacement()
     */
    @Override
    public int engineDisplacement() {
        return 5300;
    }

    /**
     * @see gof_patterns.bridge.Automobile#getHorsepower()
     */
    @Override
    public int horsepower() {
        return 295;
    }

    /**
     * @see gof_patterns.bridge.Automobile#getSeatingCapacity()
     */
    @Override
    public int seatingCapacity() {
        return 9;
    }

    /**
     * @see gof_patterns.bridge.Automobile#getWeight()
     */
    @Override
    public int weight() {
        return 6800;
    }

}
