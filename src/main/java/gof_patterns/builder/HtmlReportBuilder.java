/*
 * MIT License
 *
 * Copyright (c) 2025 Russ Moul
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
