package javase04.t04;

import java.io.*;
import java.util.*;

@SuppressWarnings("WeakerAccess")
public class Movies {

    private Map<String, Set<String>> collection = new HashMap<>();

    public Map<String, Set<String>> getCollection() {
        return collection;
    }

    @SuppressWarnings("unchecked")
    public void load(String path) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(path))) {
            collection = (Map<String, Set<String>>)in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save(String path) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path))) {
            out.writeObject(collection);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void add(String film, String actor) {
        if (collection.containsKey(film))
            collection.get(film).add(actor);
        else
            collection.put(film, new HashSet<>(Collections.singleton(actor)));
    }

    public Set<String> delete(String film) {
        return collection.remove(film);
    }
}
