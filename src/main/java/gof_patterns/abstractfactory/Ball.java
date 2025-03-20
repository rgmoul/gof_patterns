package gof_patterns.abstractfactory;

/**
 * Interface describing basic characteristics of a sport ball - AbstractProduct
 * in Abstract Factory pattern.
 */
public interface Ball {
    /**
     * Nominal length of the minor axis of the ball in inches.
     *
     * @return length of the minor axis
     */
    double minorAxis();

    /**
     * Nominal length of the major axis of the ball in inches.
     *
     * @return length of the major axis
     */
    double majorAxis();

    /**
     * The name of the material used to cover the ball.
     *
     * @return the name of the covering material
     */
    String coverMaterial();

    /**
     * The nominal weight in ounces.
     *
     * @return the nominal weight
     */
    double weight();
}
