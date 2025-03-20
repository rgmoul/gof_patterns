package gof_patterns.bridge;

/**
 * An abstract type (could be an interface) for a generic automobile - Abstraction in the Bridge pattern.
 */
public abstract class Automobile {
    /**
     * Constructor.
     *
     * @param impl the concrete implementation object
     */
    public Automobile(final AutomobileImplementation impl) {
        auto = impl;
    }
    /**
     * Get the engine displacement in cubic centimeters.
     *
     * @return the engine displacement
     */
    int getEngineDisplacement() {
        return auto.engineDisplacement();
    }

    /**
     * Get the horsepower.
     *
     * @return the horsepower
     */
    int getHorsepower() {
        return auto.horsepower();
    }

    /**
     * Get the seating capacity.
     *
     * @return the seating capacity
     */
    int getSeatingCapacity() {
        return auto.seatingCapacity();
    }

    /**
     * Get the weight.
     *
     * @return the weight
     */
    int getWeight() {
        return auto.weight();
    }

    private final AutomobileImplementation auto;
}
