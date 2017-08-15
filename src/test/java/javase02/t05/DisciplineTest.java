package javase02.t05;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@SuppressWarnings("unused")
public class DisciplineTest {

    private Discipline music = Discipline.MUSIC;
    private Discipline sport = Discipline.SPORT;
    private Discipline english = Discipline.ENGLISH;
    private Discipline geography = Discipline.GEOGRAPHY;
    private Discipline math = Discipline.MATH;
    private Discipline french = Discipline.FRENCH;

    private Student Dima = new Student("Dima Ivanov", "5420");
    private Student Andrey = new Student("Andrey Belov", "5420");
    private Student Petya = new Student("Petya Javist", "5420");

    @Before
    public void setUp() {


    }

    @Test
    public void addListener() {
        music.addListener(Dima, 5);
        music.addListener(Petya, 5.5);
        assertEquals(5, music.getListeners().get(0).getGrade());
        assertEquals(5, music.getListeners().get(1).getGrade());
        sport.addListener(Dima, 2);
        sport.addListener(Petya, 4.29);
        assertEquals(2, (double) sport.getListeners().get(0).getGrade(), 0.0001);
        assertEquals(4.29, (double) sport.getListeners().get(1).getGrade(), 0.0001);
    }

    @Test
    public void bestStudentGradle() {
        System.out.println(music.getListeners().size());
    }

}