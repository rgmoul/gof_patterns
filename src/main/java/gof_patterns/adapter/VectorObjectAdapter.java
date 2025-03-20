package gof_patterns.adapter;

import java.awt.Point;

/**
 * An object adapter - Adapter in the object Adapter pattern.
 */
public final class VectorObjectAdapter implements Vector {
    private final Line line;

    /**
     * Constructor.
     */
    public VectorObjectAdapter() {
        line = new Line();
    }

    /**
     * Constructor, adapts an existing Line object.
     *
     * @param line the line object to adapt
     */
    public VectorObjectAdapter(final Line line) {
        this.line = line;
    }

    /**
     * @see gof_patterns.adapter.Vector#getOrigin()
     */
    @Override
    public Point getOrigin() {

        return new Point(line.getX(), line.getY());
    }

    /**
     * @see gof_patterns.adapter.Vector#setOrigin(java.awt.Point)
     */
    @Override
    public void setOrigin(Point origin) {
        line.setX(origin.x);
        line.setY(origin.y);
    }

    /**
     * @see gof_patterns.adapter.Vector#getXMagnitude()
     */
    @Override
    public int getXMagnitude() {
        return line.getWidth();
    }

    /**
     * @see gof_patterns.adapter.Vector#setXMagnitude(int)
     */
    @Override
    public void setXMagnitude(final int magnitude) {
       line.setWidth(magnitude);
    }

    /**
     * @see gof_patterns.adapter.Vector#getYMagnitude()
     */
    @Override
    public int getYMagnitude() {
        return line.getHeight();
    }

    /**
     * @see gof_patterns.adapter.Vector#setYMagnitude(int)
     */
    @Override
    public void setYMagnitude(final int magnitude) {
        line.setHeight(magnitude);
    }

}
