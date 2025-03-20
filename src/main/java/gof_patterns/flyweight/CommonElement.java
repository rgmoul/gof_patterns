package gof_patterns.flyweight;

/**
 * A common element - ConcreteFlyweight in the Flyweight pattern.
 */
public class CommonElement implements Element {
    /** Element's periodic symbol. */
    private final String symbol;

    /** Element's atomic number. */
    private final int number;

    /** Element's atomic weight. */
    private final double weight;

    /** Element's name. */
    private final String name;

    /**
     * Constructor.
     *
     * @param name the element name
     * @param symbol the periodic symbol
     * @param number the atomic number
     * @param weight the  atomic weight
     */
    CommonElement(final String name, final String symbol, final int number,
                  final double weight) {
        this.name = name;
        this.symbol = symbol;
        this.number = number;
        this.weight = weight;
    }

    /**
     * Get the element name.
     *
     * @return the name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Get the atomic number.
     *
     * @return the atomic number
     */
    @Override
    public int getNumber() {
        return number;
    }

    /**
     * Get the periodic symbol.
     *
     * @return the symbol
     */
    @Override
    public String getSymbol() {
        return symbol;
    }

    /**
     * Get the atomic weight.
     *
     * @return the weight
     */
    @Override
    public double getWeight() {
        return weight;
    }

    /**
     * Is the element inert?
     * 
     * @return always false
     */
    @Override
    public boolean isInert() {
    	return false;
    }

    /**
     * Render the element at come position in a compount.  Would normally draw
     * it but for simplicity just  print it.
     *
     * @param position the location to draw the element at
     */
    @Override
    public void render(final Point3D position) {
        System.out.println(symbol + " [" + number + "] ["
                                         + position.x() + ", "
                                         + position.y() + ", "
                                         + position.y() + "] (id="
                                         + hashCode() + ")");
    }

}
