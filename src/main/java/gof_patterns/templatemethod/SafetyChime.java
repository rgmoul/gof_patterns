package gof_patterns.templatemethod;

/**
 * Represents a safety chime.
 */
public class SafetyChime {
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
	 * Set the energized state of the safety chime.
	 * 
	 * @param energize desired state
	 */
	public void energize(boolean energize) {
		if (energized == energize) return;
		energized = energize;
	    if (energize) {
	    	System.out.println("  Chime: Chiming");
	    } else {
	    	System.out.println("  Chime: Silent");
	    }
	}
     
}
