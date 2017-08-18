package javase05.t02;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Properties;

@SuppressWarnings("WeakerAccess")
public class PropertyReader {

    static String get(String path, String key, Charset charset) {
        InputStream iStream = PropertyReader.class.getClassLoader().getResourceAsStream(path);
        Properties property = new Properties();
        String result;
        if (iStream != null) {
            try(InputStreamReader in = new InputStreamReader(iStream, charset)) {
                property.load(in);
                result = property.getProperty(key);
                if (null == result)
                    result = String.format("Key '%s' not found in %s", key, path);
            } catch (IOException e) {
                result = "An error occurred when reading from the input stream";
            }
        }
        else
            result = String.format("%s file not found", path);
        return result;
    }
}
