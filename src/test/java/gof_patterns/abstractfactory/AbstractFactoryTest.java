package gof_patterns.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Demonstrates the use of / tests the sport abstract factories.
 */
public class AbstractFactoryTest {

    @Test
    void test() {
        SportFactory factory;

        factory = new BaseballFactory();
        assertInstanceOf(BaseballBall.class, factory.createBall());
        assertEquals(9, factory.createTeam().positions().length);

        factory = new FootballFactory();
        assertInstanceOf(FootballBall.class, factory.createBall());
        assertEquals(22, factory.createTeam().positions().length);
    }

}
