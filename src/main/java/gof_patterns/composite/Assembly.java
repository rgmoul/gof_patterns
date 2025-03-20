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

import java.util.ArrayList;
import java.util.Optional;

/**
 * An assembly, accepts (requires?) sub-parts - Composite in the Composite
 * pattern.
 */
public class Assembly extends Part {
    private final ArrayList<Part> components = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param partNum the part's part number
     * @param nomenclature the part nomenclature
     */
    public Assembly(final String partNum, final String nomenclature) {
        super(partNum, nomenclature);
    }

    /**
     * @see gof_patterns.composite.Part#addPart(gof_patterns.composite.Part)
     */
    @Override
    public void addPart(final Part p) {
        components.add(p);
    }

    /**
     * @see gof_patterns.composite.Part#removePart(gof_patterns.composite.Part)
     */
    @Override
    public void removePart(final Part p) {
        components.remove(p);
    }

    /**
     * @see gof_patterns.composite.Part#getPartCount()
     */
    @Override
    public int getPartCount() {
        return components.size();
    }

    /**
     * @see gof_patterns.composite.Part#getPart(int)
     */
    @Override
    public Optional<Part> getPart(final int n) {
        Part comp = null;
        if (n < components.size()) {
            comp = components.get(n);
        }
        return Optional.ofNullable(comp);
    }

}
