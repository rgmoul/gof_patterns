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
