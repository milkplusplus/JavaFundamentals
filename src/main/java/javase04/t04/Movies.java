package javase04.t04;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Movies {

    private Map<String, Set<String>> collection = new HashMap<>();

    public Map<String, Set<String>> getCollection() {
        return collection;
    }

    public void loadCollection(String path) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(path))) {
            collection = (Map<String, Set<String>>)in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveCollection(String path) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path))) {
            out.writeObject(collection);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
