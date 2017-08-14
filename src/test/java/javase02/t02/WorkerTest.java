package javase02.t02;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WorkerTest {

    private Worker worker = new Worker();

    @Before
    public void setUp() {
        Stationery s1 = new Stationery("Pen", 20);
        Stationery s2 = new Stationery("Paper", 50);
        Stationery s3 = new Stationery("Pencil", 10);
        Stationery s4 = new Stationery("Rubber", 5);
        Stationery s = new Stationery(); // default cost = 100
        worker.addItemToStationary(s1);
        worker.addItemToStationary(s2);
        worker.addItemToStationary(s3);
        worker.addItemToStationary(s4);
        worker.addItemToStationary(s);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void removeItemFromStationary() {
        worker.removeItemFromStationary(1000);
    }

    @Test
    public void getStationeryCost() {
        assertEquals(185, worker.getStationeryCost());
    }
}