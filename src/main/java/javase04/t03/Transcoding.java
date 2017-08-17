package javase04.t03;

import java.io.*;
import java.nio.charset.StandardCharsets;

@SuppressWarnings("WeakerAccess")
public class Transcoding {

    public static void transcode(String pathFrom, String pathTo) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(pathFrom),
                StandardCharsets.UTF_8)); BufferedWriter out =
                new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathTo), StandardCharsets.UTF_16BE))) {
            while (in.ready())
                content.append((char)in.read());
            out.write(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
