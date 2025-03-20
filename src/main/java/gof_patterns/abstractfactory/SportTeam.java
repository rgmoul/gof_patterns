package gof_patterns.abstractfactory;

/**
 * A simple interface for sports teams - AbstractProduct
 * in Abstract Factory pattern.
 */
public interface SportTeam {
    /**
     * Obtains a list of positions required on the team.
     *
     * @return an array of position names
     */
    String[] positions();
}
