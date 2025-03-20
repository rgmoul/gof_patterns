package gof_patterns.abstractfactory;

/**
 * A baseball implementation of the SportTeam interface - Product int the
 * Abstract Factory pattern.
 */
public final class BaseballTeam implements SportTeam {

    /**
     * @see gof_patterns.abstractfactory.SportTeam#positions()
     */
    @Override
    public String[] positions() {
        return POSITIONS;
    }

    /** The baseball positions. */
    private static final String[] POSITIONS = {
        "Pitcher",
        "Catcher",
        "First Base",
        "Second Base",
        "Third Base",
        "Shortstop",
        "Left Filed",
        "Center Field",
        "Right Field"
    };
}
