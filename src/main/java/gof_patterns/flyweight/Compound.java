package gof_patterns.flyweight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * A compound - Client in the Flyweight pattern.
 */
public class Compound implements Iterable<ElementInCompound> {
    /**
     * Render the compound.
     */
    public void renderElement() {
        for (ElementInCompound elemInComp : elements) {
            elemInComp.element().render(elemInComp.position());
        }
    }

    /**
     * Adds an element to the compound at a specific position.
     *
     * @param element the element
     * @param position the position
     */
    public void addElement(final Element element, final Point3D position) {
        elements.add(new ElementInCompound(element, position));
    }

    @Override
    public Iterator<ElementInCompound> iterator() {
        return Collections.unmodifiableList(elements).iterator();
    }
    /** The elements making up a compound. */
    private final ArrayList<ElementInCompound> elements = new ArrayList<>();
}
