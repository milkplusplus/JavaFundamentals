package javase06.t02;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

@SuppressWarnings("WeakerAccess")
public class PropertyWithMapReader {

    static HashMap<Object, Object> get(String path) {
        InputStream in = PropertyWithMapReader.class.getClassLoader().getResourceAsStream(path);
        Properties property = new Properties();
        HashMap<Object, Object> result = new HashMap<>();
        if (in != null) {
            try {
                property.load(in);
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println("An I/O error occurred when file was closing");
                    e.printStackTrace();
                }
                result = new HashMap<>(property);
            } catch (IOException e) {
                System.out.println("An error occurred when reading from the input stream");
                e.printStackTrace();
            }
        }
        else
            System.out.println(String.format("%s file not found", path));
        return result;
    }
}

