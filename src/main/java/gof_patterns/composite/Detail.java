package gof_patterns.composite;

/**
 * A detail part - doesn't accept sub-parts - Leaf in the Composite pattern.
 */
public class Detail extends Part {
    /**
     * Constructor.
     *
     * @param partNum the parts part number
     * @param nomenclature the part nomenclature
     */
    public Detail(final String partNum, final String nomenclature) {
        super(partNum, nomenclature);
    }
}
