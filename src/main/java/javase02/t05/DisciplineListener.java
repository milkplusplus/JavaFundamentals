package javase02.t05;

public class DisciplineListener <T extends Number> {

    Student student;
    T grade;

    public DisciplineListener(Student student, T grade) {
        this.student = student;
        this.grade = grade;
    }

}
