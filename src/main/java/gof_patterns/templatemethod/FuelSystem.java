package gof_patterns.templatemethod;

/**
 * Represents a fuel system.
 */
public class FuelSystem {
    private boolean energized;

    /**
     * Gets the energized state.
     * 
     * @return true if energized otherwise false
     */
	public boolean isEnergized() {
		return energized;
	}

	/**
	 * Set the energized state of the fuel system.
	 * 
	 * @param energize desired state
	 */
	public void energize(boolean energize) {
		if (energized == energize) return;
		energized = energize;
	    if (energize) {
	    	System.out.println("  Fuel pump: on");
	    	System.out.println("  Fuel injection: on");
	    } else {
	    	System.out.println("  Fuel injection: off");
	    	System.out.println("  Fuel pump: off");
	    }
	}
     
}
