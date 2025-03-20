package gof_patterns.decorator;

import java.util.Properties;

/**
 * Decorates an inventory item with a refrigeration requirement -
 * ConcreteDecorator in the Decorator pattern.
 */
public class RefrigerationDecorator extends InventoryItemDecorator {
    private final int storageTemp;

    /**
     * Constructor.
     *
     * @param decoratedItem the item to be decorated
     * @param storageTemp the temperature this item must be stored at
     */
    public RefrigerationDecorator(final Inventoryable decoratedItem,
                                  final int storageTemp) {
        super(decoratedItem);
        this.storageTemp = storageTemp;
    }

    /**
     * @see gof_patterns.decorator.Inventoryable#getProperties()
     */
    @Override
    public Properties getProperties() {
        Properties p = super.getProperties();
        p.setProperty("Storage Temperature", Integer.toString(storageTemp));
        return p;
    }
}
