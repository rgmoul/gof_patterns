package gof_patterns.composite;

import java.util.Optional;

/**
 * Part class - the Component in the Composite pattern.
 */
public abstract class Part {
    private final String partNum;
    private final String nomenclature;

    /**
     * Constructor.
     *
     * @param partNum the parts part number
     * @param nomenclature the part nomenclature
     */
    public Part(final String partNum, final String nomenclature) {
        this.partNum = partNum;
        this.nomenclature = nomenclature;
    }

    /**
     * Adds a sub-part to this part.
     *
     * @param p the part to add
     * @throws Exception if this part won't accept the sub-part
     */
    public void addPart(final Part p) throws Exception {
        throw new Exception("Sub-parts not supported.");
    }

    /**
     * Removes a sub-part of this part.
     *
     * @param p the part to remove
     * @throws Exception if this part doesn't have the sub-part
     */
    public void removePart(final Part p) throws Exception {
        throw new Exception("Sub-parts not supported.");
    }

    /**
     * Returns the number of sub-parts this part has.
     *
     * @return the number of sub-parts this part has
     */
    public int getPartCount() {
        return 0;
    }

    /**
     * Gets the nth sub-part of this part.
     *
     * @param n the index to the part
     *
     * @return the nth sub-part or null if the part doesn't have the sub-part
     */
    public Optional<Part> getPart(final int n) {
        return Optional.empty();
    }

    /**
     * The nomenclature of this part.
     *
     * @return the nomenclature
     */
    public String getNomenclature() {
        return nomenclature;
    }

    /**
     * The part number of this part.
     *
     * @return the part number
     */
    public String getPartNumber() {
        return partNum;
    }

    /**
     * Prints the part and all of its components - treats assemblies and
     * details identically.
     *
     * @param p the part
     * @param prefix a padding used to align components of the same indenture
     */
    public static void print(final Part p, final String prefix) {
        System.out.println(prefix + p.getPartNumber() + ", " + p.getNomenclature());
        int cnt = p.getPartCount();
        for (int i = 0; i < cnt; i++) {
            p.getPart(i).ifPresent(z -> print(z, "  " + prefix));
        }
    }

}
