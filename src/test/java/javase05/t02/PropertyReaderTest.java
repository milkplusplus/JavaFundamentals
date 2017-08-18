package javase05.t02;

import org.junit.Test;
import static org.junit.Assert.*;

public class PropertyReaderTest {

    @Test
    public void get() {
        assertEquals(true, PropertyReader.get("Properties.properties",
                "k").equals("Hello?"));
    }

    @Test
    public void getWrongKey() {
        assertEquals(true,
                PropertyReader.get("Properties.properties", "key")
                        .equals("Key 'key' not found in Properties.properties"));
    }

    @Test
    public void getWrongPath() {
        assertEquals(true,
                PropertyReader.get("P.properties", "k")
                        .equals("P.properties file not found"));
    }
}