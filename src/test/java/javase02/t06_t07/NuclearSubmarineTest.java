package javase02.t06_t07;

import org.junit.Test;

import static org.junit.Assert.*;

public class NuclearSubmarineTest {

    private NuclearSubmarine nuclearSubmarine = new NuclearSubmarine();

    @Test
    public void takeATrip() throws Exception {
        nuclearSubmarine.setNuclearFuelLevel(6);
        for (int i = 0; i < 3; i++)
            nuclearSubmarine.takeATrip();
        assertEquals(3,nuclearSubmarine.getNuclearFuelLevel());
        for (int i = 0; i < 4; i++)
            nuclearSubmarine.takeATrip();
        assertEquals(0,nuclearSubmarine.getNuclearFuelLevel());
    }

}