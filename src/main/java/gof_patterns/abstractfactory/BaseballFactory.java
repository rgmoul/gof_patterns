package gof_patterns.abstractfactory;

/**
 * Factory for baseball related items - ConcreteFactory in the
 * Abstract Factory pattern.
 */
public final class BaseballFactory implements SportFactory {

    /**
     * @see gof_patterns.abstractfactory.SportFactory#createTeam()
     */
    @Override
    public SportTeam createTeam() {
        return new BaseballTeam();
    }

    /**
     * @see gof_patterns.abstractfactory.SportFactory#createBall()
     */
    @Override
    public Ball createBall() {
        return new BaseballBall();
    }

}
