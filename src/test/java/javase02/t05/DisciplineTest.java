package javase02.t05;

import org.junit.Test;

import static org.junit.Assert.*;


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

    @SuppressWarnings("ConstantConditions")
    @Test
    public void bestStudentGradle() {
        music.addListener(Andrey, 6);
        sport.addListener(Andrey, 7.13);
        english.addListener(Andrey, 4);
        geography.addListener(Andrey, 5);
        french.addListener(Andrey, 2.94);
        math.addListener(Andrey, 8);

        english.addListener(Dima, 10);
        english.addListener(Petya, 9);
        math.addListener(Dima, 9);

        DisciplineListener listener = Discipline.bestStudentGradle(Andrey);
        assertEquals(8,listener.getGrade());
        assertEquals(Andrey,listener.getStudent());

        assertEquals(3, english.getListeners().size());
    }

    @Test
    public void catchNull() {
        Student Nikolai = new Student("Nikolai Nullcatcher", "5420");
        assertNull(Discipline.bestStudentGradle(Nikolai));
    }

}