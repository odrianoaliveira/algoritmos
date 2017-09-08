package math;

import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void simetria() throws Exception {
        Point p1 = Point.simetria(0, 0, 1, 1);
        assertEquals(p1.getX(),2);
        assertEquals(p1.getY(),2);

        Point p2 = Point.simetria(1, 1, 2, 2);
        assertEquals(p2.getX(),3);
        assertEquals(p2.getY(),3);
    }

    @Test
    public void distance() throws Exception {
        double distance = Point.distance(0, 0, 1, 1);
        System.out.println(distance);
    }

}