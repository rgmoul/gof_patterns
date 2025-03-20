package gof_patterns.templatemethod;

/**
 * Represents a pre-heat system (glow plugs).
 */
public class PreheatSystem {
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
	 * Set the energized state of the pre-heat system.
	 * 
	 * @param energize desired state
	 */
	public void energize(boolean energize) {
		if (energized == energize) return;
		energized = energize;
	    if (energize) {
	    	System.out.println("  Preheat: on");
	    } else {
	    	System.out.println("  Preheat: off");
	    }
	}
     
}
