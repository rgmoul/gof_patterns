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

/**
 * Uses Context and ChangeHistory manage properties - client of Momento design pattern.
 */
public class Application {
    private final Context context = new Context();
    private final ChangeHistory caretaker = new ChangeHistory();

    /**
     * Constructor, initializes properties to include system properties.
     */
    public Application() {
    	// initialize properties -  can't undo
    	System.getProperties().keySet().forEach(n -> context.setProperty((String)n, System.getProperty((String)n)));
    }

    /**
     * Removes a property.
     * 
     * @param name name of property to remove
     * 
     * @return prior property value or null if property was not set
     */
    public String removeProperty(String name) {
    	String priorValue = context.removeProperty(name);
    	PropertyChangeMomento memento = context.createRemoveMomento(name, priorValue);    		
        caretaker.save(memento); // Save it in the history
    	return priorValue;
    }

    /**
     * Sets the named property to the provided value.
     * 
     * @param name name of property to set
     * @param value value to set property to
     * 
     * @return prior property value or null if property was not set
     */
    public String setProperty(String name, String value) {
    	String priorValue = context.setProperty(name, value);
    	PropertyChangeMomento memento = (priorValue == null) ? context.createAddMomento(name)
    			                                    : context.createUpdateMomento(name, priorValue);    		
        caretaker.save(memento); // Save it in the history
    	return priorValue;
    }

    /**
     * Gets the value of the named property.
     * 
     * @param name name of property to retrieve
     * 
     * @return property value or null if property is not set
     */
    public String getProperty(String name) {
    	return context.getProperty(name);
    }

    /**
     * Undo the last change to properties.
     */
    public void undo() {
        OpaqueMomento lc = caretaker.lastChange();
        context.undo(lc);
    }

    /* Remainder of application. */
}
