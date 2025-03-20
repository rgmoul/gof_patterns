package gof_patterns.decorator;

import java.util.Properties;

/**
 * A base decorator for inventory items - Decorator in the Decorator pattern.
 */
public abstract class InventoryItemDecorator implements Inventoryable {
    private final Inventoryable decoratedItem;

    /**
     * Constructor.
     *
     * @param decoratedItem the decorated item
     */
    public InventoryItemDecorator(final Inventoryable decoratedItem) {
        this.decoratedItem = decoratedItem;
    }

    /**
     * Returns the description.
     *
     * @return the description
     */
    @Override
    public String description() {
        return decoratedItem.description();
    }

    /**
     * Returns the inventory id.
     *
     * @return the inventory id
     */
    @Override
    public String inventoryId() {
        return decoratedItem.inventoryId();
    }

    /**
     * Get properties associated with the item.
     *
     * @return the items properties
     */
    @Override
    public Properties getProperties() {
        return decoratedItem.getProperties();
    }

}
