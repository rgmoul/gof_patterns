package gof_patterns.abstractfactory;

/**
 * A football implementation of Ball - Product in the Abstract Factory
 * pattern.
 */
public final class FootballBall implements Ball {

    /**
     * @see gof_patterns.abstractfactory.Ball#minorAxis()
     */
    @Override
    public double minorAxis() {
        return DIAMETER;
    }

    /**
     * @see gof_patterns.abstractfactory.Ball#majorAxis()
     */
    @Override
    public double majorAxis() {
        return LENGTH;
    }

    /**
     * @see gof_patterns.abstractfactory.Ball#coverMaterial()
     */
    @Override
    public String coverMaterial() {
        return "pigskin";
    }

    /**
     * @see gof_patterns.abstractfactory.Ball#weight()
     */
    @Override
    public double weight() {
        return WEIGHT;
    }

    private static final double DIAMETER = 3.54;
    private static final double LENGTH = 11.25;
    private static final double WEIGHT = 14.5;
}
