package javase05.t02;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Properties;

@SuppressWarnings("WeakerAccess")
public class PropertyReader {

    Properties property = new Properties();

    static String get(String path, String key, Charset charset) {
        InputStream in = PropertyReader.class.getClassLoader().getResourceAsStream(path);
        if (in != null) {

        }
        else
            System.out.println(".properties file file not found");
        return "";
    }
}
