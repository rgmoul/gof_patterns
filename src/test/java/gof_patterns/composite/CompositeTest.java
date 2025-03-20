package gof_patterns.composite;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Demonstrates the use of / tests the composite pattern.
 */
public class CompositeTest {

    @Test
    void test() throws Exception {
        Part comp = new Assembly("WD-101", "widget");
        comp.addPart(new Detail("AN105501", "bolt"));
        comp.addPart(new Detail("MS20341", "nut"));
        comp.addPart(new Detail("NAS70", "washer"));
        comp.addPart(new Detail("NAS70", "washer"));
        comp.addPart(new Detail("BRK-1", "bracket"));
        comp.addPart(new Detail("F-101", "fitting"));
        Part assy = new Assembly("ASSY-01", "assembly");

        assy.addPart(new Detail("MS35743", "rivet"));
        assy.addPart(comp);

        Part.print(assy, "");

        Part p = assy.getPart(0).get();
        assertTrue(p.getPartCount() == 0 && p instanceof Detail);
        assertTrue(p.getPart(0).isEmpty());

        p = assy.getPart(1).get();
        assertTrue(p.getPartCount() == 6 && p instanceof Assembly);
        assertTrue(p.getPart(0).isPresent());
    }
}
