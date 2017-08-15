package javase02.t05;

public class DisciplineListener <T extends Number> {

    Student student;
    T[] grades;

    public DisciplineListener(Student student, T[] grades) {
        this.student = student;
        this.grades = grades;
    }

}
