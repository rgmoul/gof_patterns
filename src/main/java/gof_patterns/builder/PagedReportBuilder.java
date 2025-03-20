/*
 * MIT License
 *
 * Copyright (c) 2025 Symbiont Software
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
