package gof_patterns.templatemethod;

/**
 * Represents a starter.
 */
public class Starter {
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
	 * Set the energized state of the starter.
	 * 
	 * @param energize desired state
	 */
	public void energize(boolean energize) {
		if (energized == energize) return;
		energized = energize;
	    if (energize) {
	    	System.out.println("  Starter: cranking");
	    } else {
	    	System.out.println("  Starter: off");
	    }
	}
     
}
