package javase06.t02;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class PropertyWithMapReaderTest {

    @Test
    public void get() {
        HashMap<Object,Object> hashMap = new HashMap<>();
        hashMap.put("k", "Hello?");
        hashMap.put("p", "QWERTY");
        assertEquals(true, hashMap.equals(PropertyWithMapReader.get("Properties.properties")));
    }

    @Test // new key will overwrite previous value of this key
    public void getWrongPath() {
        HashMap<Object,Object> readed = PropertyWithMapReader.get("Properties.properties");
        readed.put("k", "YTREWQ");
        HashMap<Object,Object> created = new HashMap<>();
        created.put("k", "YTREWQ");
        created.put("p", "QWERTY");
        assertEquals(true, readed.equals(created));
    }
}