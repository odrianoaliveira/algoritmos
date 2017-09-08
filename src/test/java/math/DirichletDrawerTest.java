package math;

import org.junit.Test;

import static org.junit.Assert.*;

public class DirichletDrawerTest {
    @Test
    public void worstScenario() throws Exception {
        assertEquals(DirichletDrawer.worstScenario(10),11);
    }

}