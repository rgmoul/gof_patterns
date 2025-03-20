package gof_patterns.builder;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import org.junit.jupiter.api.Test;

/**
 * Demonstrates the use of /tests the Builder pattern.
 */
public class BuilderTest {
    private static final String content =
            """
               We hold these truths to be self-evident, that all men are created
               equal, that they are endowed by their Creator with certain
               unalienable Rights, that among these are Life, Liberty, and the
               pursuit of Happiness. That to secure these rights, Governments are
               instituted among Men, deriving their just powers from the consent
               of the governed. That whenever any Form of Government becomes
               destructive of these ends, it is the Right of the People to alter
               or to abolish it, and to institute new Government, laying its
               foundation on such principles and organizing its powers in such
               form, as to them shall seem most likely to effect their Safety
               and Happiness.""";

    @Test
    void test() throws IOException {
        String first5Libes;
        String second5Lines;
        String lastLine;

        try (BufferedReader reader = new BufferedReader(new StringReader(content))) {
            String[] lines = reader.lines().toArray(String[]::new);
            first5Libes = String.join("\n", lines[0], lines[1],lines[2],lines[3],lines[4]);
            second5Lines = String.join("\n", lines[5], lines[6],lines[7],lines[8],lines[9]);
            lastLine = lines[10];
        }

        ReportComposer composer = new ReportComposer();
        String report;
        ReportBuilder builder;

        builder = new PagedReportBuilder("Preamble", content, 5);
        report = composer.compose(builder);

        assertTrue(report.contains(first5Libes));
        assertTrue(report.contains(second5Lines));
        assertTrue(report.contains(lastLine));


        builder = new HtmlReportBuilder("Preamble", content);
        report = composer.compose(builder);
        assertTrue(report.startsWith("<html>\r\n  <head>"));
        assertTrue(report.contains("</head>\r\n  <body>"));
        assertTrue(report.contains("<body>\r\n"+content+"\r\n  </body>"));
        assertTrue(report.endsWith("</body>\r\n</html>"));
        System.out.println(report);

    }

}
