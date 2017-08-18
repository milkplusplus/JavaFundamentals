package javase05.t02;

import org.junit.Test;

import java.nio.charset.StandardCharsets;
import static org.junit.Assert.*;

public class PropertyReaderTest {

    @Test
    public void get() {
        String s = PropertyReader.get("Properties.properties", "k", StandardCharsets.UTF_8);
        assertEquals(true, s.equals("Hello?"));
    }
}