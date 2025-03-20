package gof_patterns.abstractfactory;

/**
 * Factory for football related items - ConcreteFactory in the
 * Abstract Factory pattern.
 */
public final class FootballFactory implements SportFactory {

    /**
     * @see gof_patterns.abstractfactory.SportFactory#createTeam()
     */
    @Override
    public SportTeam createTeam() {
        return new FootballTeam();
    }

    /**
     * @see gof_patterns.abstractfactory.SportFactory#createBall()
     */
    @Override
    public Ball createBall() {
        return new FootballBall();
    }

}
