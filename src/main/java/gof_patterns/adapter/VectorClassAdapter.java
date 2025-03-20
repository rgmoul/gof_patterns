package gof_patterns.adapter;

import java.awt.Point;

/**
 * A class adapter - Adapter in the class Adapter pattern.
 */
public class VectorClassAdapter extends Line implements Vector {

    /**
     * @see gof_patterns.adapter.Vector#getOrigin()
     */
    @Override
    public Point getOrigin() {
        return new Point(getX(), getY());
    }

    /**
     * @see gof_patterns.adapter.Vector#setOrigin(java.awt.Point)
     */
    @Override
    public void setOrigin(final Point origin) {
        setX(origin.x);
        setY(origin.y);
    }

    /**
     * @see gof_patterns.adapter.Vector#getXMagnitude()
     */
    @Override
    public int getXMagnitude() {
        return getWidth();
    }

    /**
     * @see gof_patterns.adapter.Vector#setXMagnitude(int)
     */
    @Override
    public void setXMagnitude(final int magnitude) {
        setWidth(magnitude);
    }

    /**
     * @see gof_patterns.adapter.Vector#getYMagnitude()
     */
    @Override
    public int getYMagnitude() {
        return getHeight();
    }

    /**
     * @see gof_patterns.adapter.Vector#setYMagnitude(int)
     */
    @Override
    public void setYMagnitude(final int magnitude) {
        setHeight(magnitude);
    }

}
