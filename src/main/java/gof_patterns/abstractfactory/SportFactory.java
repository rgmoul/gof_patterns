package gof_patterns.abstractfactory;

/**
 * Interface for creating sport related objects - AbstractFactory in the
 * Abstract Factory pattern.
 */
public interface SportFactory {
    /**
     * Create a sport team.
     *
     * @return the newly created sport team
     */
    SportTeam createTeam();

    /**
     * Create a ball.
     *
     * @return the newly created ball
     */
    Ball createBall();
}
