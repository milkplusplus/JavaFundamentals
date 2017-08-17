package javase04.t03;

import org.junit.Test;

public class TranscodingTest {

    @Test
    public void transcode(){
        Transcoding.transcode("src/test/resources/TranscodingFromjavase04.t03.txt",
                "src/test/resources/TranscodingTojavase04.t03.txt");
    }
}