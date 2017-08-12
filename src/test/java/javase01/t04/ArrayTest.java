package javase01.t04;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayTest {

    @Test
    public void maxVal() {
        double[] array = {1.0, 9.0, 8.0, 4.0};
        assertEquals(17, Array.maxVal(array), 0.0001);
    }

}