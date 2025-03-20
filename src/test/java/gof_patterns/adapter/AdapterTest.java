package gof_patterns.adapter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Point;

import org.junit.jupiter.api.Test;

/**
 * Demonstrate the use of / test the adapter classes.
 */
public class AdapterTest {

    @Test
    void test() {
        Point origin = new Point(3, 5);

        VectorClassAdapter vca = new VectorClassAdapter();
        vca.setOrigin(origin);
        vca.setXMagnitude(7);
        vca.setYMagnitude(11);

        Vector v = vca;
        Line l = vca;

        assertEquals(3, v.getOrigin().x);
        assertEquals(5, v.getOrigin().y);
        assertEquals(7, v.getXMagnitude());
        assertEquals(11, v.getYMagnitude());

        assertEquals(3, l.getX());
        assertEquals(5, l.getY());
        assertEquals(7, l.getWidth());
        assertEquals(11, l.getHeight());

        v = new VectorObjectAdapter();
        v.setOrigin(origin);
        v.setXMagnitude(7);
        v.setYMagnitude(11);
        assertEquals(3, v.getOrigin().x);
        assertEquals(5, v.getOrigin().y);
        assertEquals(7, v.getXMagnitude());
        assertEquals(11, v.getYMagnitude());

        Line line = new Line();
        line.setX(13);
        line.setY(17);
        line.setWidth(19);
        line.setHeight(23);
        v = new VectorObjectAdapter(line);
        assertEquals(13, v.getOrigin().x);
        assertEquals(17, v.getOrigin().y);
        assertEquals(19, v.getXMagnitude());
        assertEquals(23, v.getYMagnitude());
    }
}
