package gof_patterns.builder;

/**
 * The builder interface - Builder in the Builder pattern.
 */
public interface ReportBuilder {
    /**
     * Creates the header text.
     *
     * @return the header text
     */
    String createHeader();

    /**
     * Creates the report's body.
     *
     * @return the report's body
     */
    String createBody();

    /**
     * Creates the footer text.
     *
     * @return the footer text
     */
    String createFooter();

    /**
     * Determine if there is more content to be processed.
     *
     * @return returns true if there is more content
     */
    boolean hasMoreContent();
}
