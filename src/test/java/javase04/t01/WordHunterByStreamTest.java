package javase04.t01;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordHunterByStreamTest {

    @Test
    public void findWords() {
        assertEquals(28, WordHunterByStream.findWords("src/test/resources/TestFromjavase04.t01.txt",
                "src/test/resources/TestTojavase04.t01.txt"));
    }
}