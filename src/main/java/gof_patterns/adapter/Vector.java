package gof_patterns.adapter;

import java.awt.Point;

/**
 * Desired interface for the adapters - Target in the Adapter pattern.
 */
public interface Vector {
    /**
     * Gets the origin of this vector.
     *
     * @return the origin
     */
    Point getOrigin();

    /**
     * Sets the origin of this vector.
     *
     * @param origin the vector's origin
     */
    void setOrigin(Point origin);

    /**
     * Gets the X magnitude.
     *
     * @return the X magnitude
     */
    int getXMagnitude();

    /**
     * Sets the X magnitude.
     *
     * @param magnitude the X magnitude
     */
    void setXMagnitude(int magnitude);

    /**
     * Gets the Y magnitude.
     *
     * @return the Y magnitude
     */
    int getYMagnitude();

    /**
     * Sets the Y magnitude.
     *
     * @param magnitude the Y magnitude
     */
    void setYMagnitude(int magnitude);
}
