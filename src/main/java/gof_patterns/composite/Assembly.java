package gof_patterns.composite;

import java.util.ArrayList;
import java.util.Optional;

/**
 * An assembly, accepts (requires?) sub-parts - Composite in the Composite
 * pattern.
 */
public class Assembly extends Part {
    private final ArrayList<Part> components = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param partNum the part's part number
     * @param nomenclature the part nomenclature
     */
    public Assembly(final String partNum, final String nomenclature) {
        super(partNum, nomenclature);
    }

    /**
     * @see gof_patterns.composite.Part#addPart(gof_patterns.composite.Part)
     */
    @Override
    public void addPart(final Part p) {
        components.add(p);
    }

    /**
     * @see gof_patterns.composite.Part#removePart(gof_patterns.composite.Part)
     */
    @Override
    public void removePart(final Part p) {
        components.remove(p);
    }

    /**
     * @see gof_patterns.composite.Part#getPartCount()
     */
    @Override
    public int getPartCount() {
        return components.size();
    }

    /**
     * @see gof_patterns.composite.Part#getPart(int)
     */
    @Override
    public Optional<Part> getPart(final int n) {
        Part comp = null;
        if (n < components.size()) {
            comp = components.get(n);
        }
        return Optional.ofNullable(comp);
    }

}
