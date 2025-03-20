package gof_patterns.flyweight;

/**
 * An interface for periodical elements - Flyweight in the Flyweight pattern.
 */
public interface Element {

    /**
     * Get the name of the element.
     *
     * @return the name of the element
     */
    String getName();

    /**
     * Get the atomic number.
     *
     * @return the atomic number
     */
    int getNumber();

    /**
     * Get the periodic symbol.
     *
     * @return the symbol
     */
    String getSymbol();

    /**
     * Get the atomic weight.
     *
     * @return the weight
     */
    double getWeight();

    /**
     * Is the element inert?
     * 
     * @return true if the element is inert
     */
    boolean isInert();

    /**
     * Render the element at some position within a compound.
     *
     * @param position the position of the element within a compound
     */
    void render(final Point3D position);
}