package gof_patterns.flyweight;

/**
 * Structure for maintiaining an element in a position.
 *
 * @param element  The element.
 * @param position The position of the element within the compound.
 */
public record ElementInCompound(Element element, Point3D position) {}