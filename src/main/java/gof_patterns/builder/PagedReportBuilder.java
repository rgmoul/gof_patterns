package gof_patterns.builder;

/**
 * A report builder that breaks the report into pages - ConcreteBuilder in
 * Builder pattern.
 */
public final class PagedReportBuilder implements ReportBuilder {
    private final String title;
    private int pageNum = 1;
    private final int linesPerPage;
    private int linePosition = 0;
    private final String[] lines;

    /**
     * Constructor.
     *
     * @param title the report title
     * @param content the report contents
     * @param linesPerPage the number of lines per page
     */
   public PagedReportBuilder(final String title, final String content,
                             final int linesPerPage) {
       this.title = title;
       lines = content.split("(?:\r\n)|\r|\n");
       this.linesPerPage = linesPerPage;
   }
    /**
     * @see gof_patterns.builder.ReportBuilder#createHeader()
     */
    @Override
    public String createHeader() {

        return "\n-- " + title + " --\n\n";
    }

    /**
     * @see gof_patterns.builder.ReportBuilder#createBody()
     */
    @Override
    public String createBody() {
        StringBuilder buf = new StringBuilder();
        for(int i = 0; i < linesPerPage; i++) {
            if (linePosition < lines.length) {
                buf.append(lines[linePosition++]);
            }
            buf.append("\n");
        }

        return buf.toString();
    }

    /**
     * @see gof_patterns.builder.ReportBuilder#createFooter()
     */
    @Override
    public String createFooter() {
        return "\n- " + pageNum++ + " -\n\n"
        + "------------------------ p a g e   b r e a k ------------------------\n";
    }

    /**
     * @see gof_patterns.builder.ReportBuilder#hasMoreContent()
     */
    @Override
    public boolean hasMoreContent() {
        return linePosition < lines.length;
    }

}
