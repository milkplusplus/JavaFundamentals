package javase04.t02;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordHunterByCharTest {

    @Test
    public void findWords() {
        assertEquals(27, WordHunterByChar.findWords("src/test/resources/TestFromjavase04.t02.txt",
                "src/test/resources/TestTojavase04.t02.txt"));
    }
}