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

package gof_patterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Maintains change history - Caretaker in Momento pattern.
 */
public class ChangeHistory {
    private final List<OpaqueMomento> revisionHistory = new ArrayList<>();

    /**
     * Adds a change record to the history.
     * 
     * @param m the record to add
     */
    public void save(OpaqueMomento m) {
    	revisionHistory.add(m);
    }

    /**
     * Removes and returns the most recent change record.
     * 
     * @return the most recent change record
     */
    public OpaqueMomento lastChange() {
    	OpaqueMomento m = null;
    	if (!revisionHistory.isEmpty()) {
    	    m = revisionHistory.removeLast();
    	}
    	return m;
    }
}
