package gof_patterns.templatemethod;

/**
 * Represents an ignition system.
 */
public class IgnitionSystem {
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
	 * Set the energized state of the ignition system.
	 * 
	 * @param energize desired state
	 */
	public void energize(boolean energize) {
		if (energized == energize) return;
		energized = energize;
	    if (energize) {
	    	System.out.println("  Ignition system: on");
	    } else {
	    	System.out.println("  Ignition system: off");
	    }
	}
     
}
