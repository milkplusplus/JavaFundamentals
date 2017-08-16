package javase03.t01;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class CrazyLoggerTest {

    private CrazyLogger crazyLogger = new CrazyLogger();

    @Before
    public void setUp() {
        crazyLogger.addMess("Test1");
        crazyLogger.addMess("TestTestTestTest");
        crazyLogger.addMess("    TestTest");
        crazyLogger.addMess("Test    ");
        crazyLogger.addMess("Test");
        crazyLogger.addMess("QWERTY");
    }

    @Test
    public void searchExactMatch(){
        LinkedList<String> list1 = crazyLogger.searchExactMatch("Test");
        assertEquals(true, ((list1.size() == 1) && list1.getFirst().contains("Test")));
        System.out.println(list1.toString());
    }

    @Test
    public void searchContains(){
        LinkedList<String> list2 = crazyLogger.searchContains("Test");
        assertEquals(true, (list2.size() == 5));
        System.out.println(list2.toString());
    }
}