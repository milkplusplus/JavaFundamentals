package javase04.t04;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoviesTest {

    private Movies collection = new Movies();

    @Before
    public void setUp() {
    }

    @Test
    public void getCollection() {
    }

    @Test
    public void saveCollection() {
        collection.saveCollection("src/test/resources/Movie.ser");
    }

    @Test
    public void loadCollection() {
        collection.loadCollection("src/test/resources/Movie.ser");
    }
}