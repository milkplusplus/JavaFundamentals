package javase03.t01;

import org.junit.Test;

import static org.junit.Assert.*;

public class CrazyLoggerTest {

    private CrazyLogger crazyLogger = new CrazyLogger();

    @Test
    public void addMess(){
        crazyLogger.addMess("Test string");
        assertEquals(0,"2017-08-16 - Test string".compareTo(crazyLogger.getStringBuilder().toString()));
    }

}