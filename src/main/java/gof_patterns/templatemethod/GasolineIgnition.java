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

package gof_patterns.templatemethod;

/**
 * Process for starting a gasoline engine - ConcreteClass in TemplateMethod pattern. 
 */
public class GasolineIgnition extends IceIgnitionProcess {
    private final IgnitionSystem ignitionSys = new IgnitionSystem();

    /**
     * @see gof_patterns.templatemethod.IceIgnitionProcess#keyTurn()
     */
	@Override
	void keyTurn() {
		System.out.println("Key Turned:");
		ignitionSys.energize(true);
		starter.energize(true);
		running = true;
	}

    /**
     * @see gof_patterns.templatemethod.IceIgnitionProcess#keyRelease()
     */
	@Override
	void keyRelease() {
		System.out.println("Key Released:");
		starter.energize(false);
	}

    /**
     * @see gof_patterns.templatemethod.IceIgnitionProcess#accessoryOff()
     */
	@Override
	void accessoryOff() {
		super.accessoryOff();
		ignitionSys.energize(false);
	}

	/**
	 * Indicates if the ignition system is energized.
	 * 
	 * @return true if the ignition system is energized otherwise false
	 */
	public final boolean isIgnitionSystemEnergized() {
		return ignitionSys.isEnergized();
	}

}
