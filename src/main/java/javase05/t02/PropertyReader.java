package javase05.t02;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@SuppressWarnings("WeakerAccess")
public class PropertyReader {

    static String get(String path, String key) {
        InputStream in = PropertyReader.class.getClassLoader().getResourceAsStream(path);
        Properties property = new Properties();
        String result;
        if (in != null) {
            try {
                property.load(in);
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println("An I/O error occurs when file was closing");
                }
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
