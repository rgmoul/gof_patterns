package gof_patterns.builder;

/**
 * A report composer - Director in Builder pattern.
 */
public final class ReportComposer {
    /**
     * Composes a report.
     *
     * @param builder the builder to use
     *
     * @return the report
     */
    String compose(final ReportBuilder builder) {
        StringBuilder buf = new StringBuilder();
        while (builder.hasMoreContent()) {
            buf.append(builder.createHeader());
            buf.append(builder.createBody());
            buf.append(builder.createFooter());
        }

        return buf.toString();
    }
}
