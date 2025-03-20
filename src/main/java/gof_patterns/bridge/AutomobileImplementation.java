package gof_patterns.bridge;

/**
 * An interface for a generic automobile implementation - Implementor in the
 * Bridge pattern.  Note that this interface is different than that specified by
 * the Automobile class.
 */
public interface AutomobileImplementation {
    /**
     * Get the engine displacement in cubic centimeters.
     *
     * @return the engine displacement
     */
    int engineDisplacement();

    /**
     * Get the horsepower.
     *
     * @return the horsepower
     */
    int horsepower();

    /**
     * Get the seating capacity.
     *
     * @return the seating capacity
     */
    int seatingCapacity();

    /**
     * Get the weight.
     *
     * @return the weight
     */
    int weight();
}
