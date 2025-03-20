package gof_patterns.flyweight;

/**
 * Where there are a known set of instances an enum may implement the Flyweight -
 * ConcreteFlyweight and FlyweightFactory in the Flyweight pattern.
 */
public enum ElementEnum implements Element {
    C("carbon", 6, 12.0107, false),
    H("hydrogen", 1, 1.00794, false),
    O("oxygen", 8, 15.9994, false),
    N("carbon", 7, 14.0067, false),

    He("helium ", 2 , 4.002602, true),
    Ne("neon ", 10, 20.1797, true),
    Ar("argon ", 18, 39.948, true);

    /** Element's atomic number. */
    private final int number;

    /** Element's atomic weight. */
    private final double weight;

    /** Element's name. */
    private final String name;

    /** Indicates if the element is inert. */
    private final boolean inert;

    /**
     * Constructor.
     * 
     * @param name element name
     * @param number element periodic number
     * @param weight element periodic weight
     * @param inert indicates if the element is inert
     */
   ElementEnum(final String name, final int number, final double weight, boolean inert) {
        this.name = name;
        this.number = number;
        this.weight = weight;
        this.inert = inert;
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
     * Get the atomic weight.
     *
     * @return the weight
     */
    @Override
    public double getWeight() {
        return weight;
    }

    /**
     * Get the periodic symbol.
     *
     * @return the symbol
     */
    @Override
    public String getSymbol() {
        return name();
    }

    /**
     * Is the element inert?
     * 
     * @return true if inert otherwise false
     */
    @Override
    public boolean isInert() {
    	return inert;
    }

    /**
     * Render the element at some position in a compound. Would normally draw it
     * but for simplicity just print it.
     *
     * @param position the location to draw the element at
     */
    @Override
    public void render(final Point3D position) {
        System.out.println(name() + " [" + number + "] ["
                + (inert ? "*,*,*" : position.x() + ", " + position.y() + ", " + position.y()) + "] (id="
                + hashCode() + ")");
    }

}
