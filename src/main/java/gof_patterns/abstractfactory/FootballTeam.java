package gof_patterns.abstractfactory;

/**
 * A football implementation of the SportTeam interface - Product int the
 * Abstract Factory pattern.
 */
public final class FootballTeam implements SportTeam {

    /**
     * @see gof_patterns.abstractfactory.SportTeam#positions()
     */
    @Override
    public String[] positions() {
        return POSITIONS;
    }

    /** The football positions. */
    private static final String[] POSITIONS = {
        "Center",
        "Left Guard",
        "Right Guard",
        "Left Tackle",
        "Right Tackle",
        "Tight End",
        "Wide Receiver",
        "Slotback",
        "Quarterback",
        "Fullback",
        "Tailback",

        "Left Tackle",
        "Right Tackle",
        "Left Defensive End",
        "Right Defensive End",
        "Strongside Linebacker",
        "Middle Linebacker",
        "Weakside Linebacker",
        "Left Cornerback",
        "Right Cornerback",
        "Strong Safety",
         "Free Safety"
    };
}
