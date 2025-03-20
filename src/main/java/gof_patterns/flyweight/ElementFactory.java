package gof_patterns.flyweight;

import java.util.HashMap;

/**
 * Factory for creating elements, common elements are shared inert elements
 * are not, - FlyweightFactory in the Flyweight pattern.
 */
public class ElementFactory {
    /** The single factory. */
    private static final ElementFactory factory = new ElementFactory();

    /** The shared atoms. */
    private final HashMap<String,Element> elements = new HashMap<>();

    /**
     * Constructor, prevents external instantiation.
     */
    private ElementFactory() {}

    /**
     * Retrieves the ElementFactory instance.
     *
     * @return the ElementFactory instance
     */
    public static synchronized ElementFactory getInstance() {
        return factory;
    }

    /**
     * Retrieves the named element, creating it if required.
     *
     * @param periodicSymbol the periodic symbol for the atomic element
     *
     * @return the named atom
     */
    public synchronized Element createElement(final String periodicSymbol) {
        Element element = elements.get(periodicSymbol);
        if (element == null) {
            element = switch (periodicSymbol) {
                case "C" -> new CommonElement("carbon", "C", 6, 12.0107);
                case "H" -> new CommonElement("hydrogen", "H", 1, 1.00794);
                case "O" -> new CommonElement("oxygen", "O", 8, 15.9994);
                case "N" -> new CommonElement("carbon", "N", 7, 14.0067);
                default -> null;
            };
            // other elements...

            // other rare elements...
            element = switch (periodicSymbol) {
                case "He" -> new InertElement("helium ", "He", 2, 4.002602);
                case "Ne" -> new InertElement("neon ", "Ne", 10, 20.1797);
                case "Ar" -> new InertElement("argon ", "Ar", 18, 39.948);
                default -> element;
            };
            // other rare elements...

            elements.put(element.getSymbol(), element);
        }
        return element;
    }

}
