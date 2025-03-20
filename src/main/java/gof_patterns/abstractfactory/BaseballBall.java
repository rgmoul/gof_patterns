package gof_patterns.abstractfactory;

/**
 * Baseball ball - Product in the Abstract Factory pattern.
 */
public final class BaseballBall implements Ball {

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
        return DIAMETER;
    }

    /**
     * @see gof_patterns.abstractfactory.Ball#coverMaterial()
     */
    @Override
    public String coverMaterial() {
        return "white horsehide or cowhide";
    }

    /**
     * @see gof_patterns.abstractfactory.Ball#weight()
     */
    @Override
    public double weight() {
        return WEIGHT;
    }


    private static final double DIAMETER = 2.9;
    private static final double WEIGHT = 5.125;
}
