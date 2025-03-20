package gof_patterns.templatemethod;

/**
 * Process for starting a diesel engine - ConcreteClass in TemplateMethod pattern. 
 */
public class DieselIgnition extends IceIgnitionProcess {
	private final PreheatSystem heater = new PreheatSystem();
    
    /**
     * @see gof_patterns.templatemethod.IceIgnitionProcess#accessoryOn()
     */
	@Override
	void accessoryOn() {
		super.accessoryOn();
		heater.energize(true);
	}

    /**
     * @see gof_patterns.templatemethod.IceIgnitionProcess#keyTurn()
     */
	@Override
	void keyTurn() {
		System.out.println("Key Turned:");
		heater.energize(false);
		starter.energize(true);
		running = true;
	}

	/**
	 * Indicates if the ignition system is energized.
	 * 
	 * @return true if the ignition system is energized otherwise false
	 */
	public final boolean isPreheatSystemEnergized() {
		return heater.isEnergized();
	}

}
