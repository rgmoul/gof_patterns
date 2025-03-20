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

package gof_patterns.templatemethod;

/**
 * Process for starting and internal combustion engine - AbstractClass in Template Method design pattern.
 */
public abstract class IceIgnitionProcess {
	protected final SafetyChime chime = new SafetyChime();
	protected final FuelSystem fuelSys = new FuelSystem();
	protected final Starter starter = new Starter();
	protected boolean running;

	/**
	 * Key is inserted in switch, may be overridden - a Template Method
	 */
	void keyInsert() {
		System.out.println("Key insert:");
		chime.energize(true);
	}
	
	/**
	 * Switch is moved to accessory position from off, may be overridden - a Template Method
	 */
	void accessoryOn() {
		System.out.println("Accessory On:");
		chime.energize(false);
		fuelSys.energize(true);
	}
	
	/**
	 * Switch is moved to (and held) in start position - a Template Method
	 */
    abstract void keyTurn();
	
	/**
	 * Switch is released from start position, may be overridden - a Template Method
	 */
	void keyRelease() {
		System.out.println("Key Release:");
		starter.energize(false);
	}

	/**
	 * Switch is moved from accessory to off position, may be overridden - a Template Method
	 */
	void accessoryOff() {
		System.out.println("Accessory Off:");
		fuelSys.energize(false);
		chime.energize(true);
		running = false;
	}

	/**
	 * Key is removed from switch, may be overridden - a Template Method
	 */
	void keyRemoval() {
		System.out.println("Key Removed:");
		chime.energize(false);
	}

	/**
	 * Process to start the engine.
	 */
	public final void start() {
		keyInsert();
		accessoryOn();
		keyTurn(); 
		keyRelease();
	}

	/**
	 * Process to stop then engine.
	 */
	public final void stop() {
		accessoryOff();
		keyRemoval();
	}

	/**
	 * Indicates if the engine is running.
	 * 
	 * @return true if the engine is running otherwise false
	 */
	public final boolean isRunning() {
		return running;
	}
    
	/**
	 * Indicates if the safety chime is energized.
	 * 
	 * @return true if the safety chime is energized otherwise false
	 */
	public final boolean isSafetyChimeEnergized() {
		return chime.isEnergized();
	}
	
	/**
	 * Indicates if the fuel system is energized.
	 * 
	 * @return true if the fuel system is energized otherwise false
	 */
	public final boolean isFuelSystemEnergized() {
		return fuelSys.isEnergized();
	}

	/**
	 * Indicates if the starter is energized.
	 * 
	 * @return true if the starter is energized otherwise false
	 */
	public final boolean isStarterEnergized() {
		return starter.isEnergized();
	}
}
