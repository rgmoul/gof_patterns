package gof_patterns.flyweight;

/**
 * A simple immutable dimensional point - not part of the Flyweight pattern.
 *
 * @param x X coordinate.
 * @param y Y coordinate.
 * @param z Z coordinate.
 */
public record Point3D(double x, double y, double z) {
    /**
     * Constructor.
     *
     * @param x the X coordinate
     * @param y the Y coordinate
     * @param z the Z coordinate
     */
    public Point3D {
    }

    /**
     * Get the X coordinate.
     *
     * @return Returns the X coordinate
     */
    @Override
    public double x() {
        return x;
    }

    /**
     * Get the Y coordinate.
     *
     * @return Returns the Y coordinate
     */
    @Override
    public double y() {
        return y;
    }

    /**
     * Get the Z coordinate.
     *
     * @return Returns the Z coordinate
     */
    @Override
    public double z() {
        return z;
    }

}
