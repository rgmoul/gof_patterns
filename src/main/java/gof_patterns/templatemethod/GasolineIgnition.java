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
