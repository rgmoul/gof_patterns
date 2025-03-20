package gof_patterns.adapter;

/**
 * A simple Line representations - Adaptee in the Adapter pattern.
 */
public class Line {
    private int x;
    private int y;
    private int width;
    private int height;

    /**
     * Get the height.
     *
     * @return the height
     */
    public final int getHeight() {
        return height;
    }

    /**
     * Set the height.
     *
     * @param height the height value
     */
    public final void setHeight(final int height) {
        this.height = height;
    }

    /**
     * Get the width.
     *
     * @return the width
     */
    public final int getWidth() {
        return width;
    }

    /**
     * Set the width.
     *
     * @param width the width value
     */
    public final void setWidth(final int width) {
        this.width = width;
    }

    /**
     * Get the X value.
     *
     * @return the X value
     */
    public final int getX() {
        return x;
    }
    /**
     * Sets the X value.
     *
     * @param x the X value
     */
    public final void setX(final int x) {
        this.x = x;
    }

    /**
     * Get the Y value.
     *
     * @return the Y value
     */
    public final int getY() {
        return y;
    }

    /**
     * Sets the Y value.
     *
     * @param y the Y value
     */
    public final void setY(final int y) {
        this.y = y;
    }

}
