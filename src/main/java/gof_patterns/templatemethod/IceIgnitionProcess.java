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
