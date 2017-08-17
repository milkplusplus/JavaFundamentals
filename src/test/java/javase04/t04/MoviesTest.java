package javase04.t04;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class MoviesTest {

    private Movies collection = new Movies();

    @Test
    public void addDeleteAndSaveCollection() {
        collection.add("Killer", "Sam");
        collection.add("Killer", "Dima");
        collection.add("Killer", "Dima");
        collection.add("Killer", "Billy");
        collection.add("Killer", "Alfred");
        collection.add("Killer", "Alfred");
        collection.add("Killer", "Alfred");
        collection.add("The THING", "Sara");
        collection.add("The THING", "John");
        assertEquals(4, collection.getCollection().get("Killer").size());
        assertEquals(2, collection.getCollection().size());
        Set<String> s = collection.delete("The THING");
        assertEquals(2,s.size());
        assertEquals(1, collection.getCollection().size());
        collection.save("src/test/resources/Movie.ser");
    }

    @Test
    public void loadCollection() {
        Movies coll = new Movies();
        coll.load("src/test/resources/Movie.ser");
        assertEquals(4, coll.getCollection().get("Killer").size());
        assertEquals(1, coll.getCollection().size());
    }
}