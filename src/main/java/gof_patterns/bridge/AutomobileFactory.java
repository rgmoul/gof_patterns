package gof_patterns.bridge;

/**
 * Interface for an abstract factory that creates automobiles for a particular
 * manufactured. Not part of the Bridge pattern though abstract factories are
 * commonly used with bridge implementations.
 */
public interface AutomobileFactory {
    /**
     * Creates the manufactures sports car.
     *
     * @return a new sports car
     */
    Sportscar createSportscar();

    /**
     * Creates the manufactures sport utility vehicle.
     *
     * @return a new sport utility vehicle
     */
    SportUtility createSportUtility();
}
