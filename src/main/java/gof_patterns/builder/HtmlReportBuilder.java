package gof_patterns.builder;

/**
 * A report builder that formats the report as an HTML document -
 * ConcreteBuilder in Builder pattern.
 */
public final class HtmlReportBuilder implements ReportBuilder {
    private final String title;
    private final String content;
    private boolean moreContent;

    /**
     * Constructor.
     *
     * @param title the report title
     * @param content the report contents
     */
   public HtmlReportBuilder(final String title, final String content) {
       this.title = title;
       this.content = content;
       moreContent = !content.trim().isEmpty();
   }
    /**
     * @see gof_patterns.builder.ReportBuilder#createHeader()
     */
    @Override
    public String createHeader() {
        return "<html>\r\n"
                      + "  <head>\r\n"
                      + "    <title>" + title + "</title>\r\n"
                      + "  </head>\r\n";
    }

    /**
     * @see gof_patterns.builder.ReportBuilder#createBody()
     */
    @Override
    public String createBody() {
        String body = "  <body>\r\n"
                    + content
                    + "\r\n  </body>\r\n";
        moreContent = false;
        return body;
    }

    /**
     * @see gof_patterns.builder.ReportBuilder#createFooter()
     */
    @Override
    public String createFooter() {
        return "</html>";
    }

    /**
     * @see gof_patterns.builder.ReportBuilder#hasMoreContent()
     */
    @Override
    public boolean hasMoreContent() {
        return moreContent;
    }

}
