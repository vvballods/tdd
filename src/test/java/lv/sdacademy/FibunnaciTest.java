package lv.sdacademy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FibunnaciTest {

    Fibunnaci fibunnaci = new Fibunnaci();

    @Test
    public void testFibunaci() {
        assertEquals(1, fibunnaci.number(1));
        assertEquals(1, fibunnaci.number(2));
        assertEquals(2, fibunnaci.number(3));
        assertEquals(3, fibunnaci.number(4));
        assertEquals(5, fibunnaci.number(5));
        assertEquals(8, fibunnaci.number(6));
        assertEquals(13, fibunnaci.number(7));
    }
}
