package gof_patterns.decorator;

import java.util.Properties;

/**
 * Interface for an item maintained in an inventory system - Component in the
 * Decorator pattern
 */
public interface Inventoryable {
    /**
     * Returns the description.
     *
     * @return the description
     */
    String description();

    /**
     * Returns the inventory id.
     *
     * @return the inventory id
     */
    String inventoryId();

    /**
     * Get properties associated with the item, minimally description and inventory id.
     *
     * @return the items properties
     */
    Properties getProperties();

    /**
     * Displays this items information.
     */
    default void display() {
        getProperties().forEach((k,v) -> System.out.println(k +": " + v));
    }

}