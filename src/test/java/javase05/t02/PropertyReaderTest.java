package javase05.t02;

import org.junit.Test;

import java.nio.charset.StandardCharsets;
import static org.junit.Assert.*;

public class PropertyReaderTest {

    @Test
    public void get() {
        assertEquals(true, PropertyReader.get("Properties.properties",
                "k", StandardCharsets.UTF_8).equals("Hello?"));
    }

    @Test
    public void getWrongKey() {
        assertEquals(true,
                PropertyReader.get("Properties.properties", "key", StandardCharsets.UTF_8)
                        .equals("Key 'key' not found in Properties.properties"));
    }

    @Test
    public void getWrongPath() {
        assertEquals(true,
                PropertyReader.get("P.properties", "k", StandardCharsets.UTF_8)
                        .equals("P.properties file not found"));
    }
}