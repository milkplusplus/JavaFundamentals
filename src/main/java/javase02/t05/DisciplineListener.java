package javase02.t05;

@SuppressWarnings("WeakerAccess")
public class DisciplineListener <T extends Number> {

    private Student student;
    private T grade;
    private Discipline discipline;

    public DisciplineListener(Student student, T grade, Discipline discipline) {
        this.student = student;
        this.grade = grade;
        this.discipline = discipline;
    }

    public Student getStudent() {
        return student;
    }

    public T getGrade() {
        return grade;
    }

    public Discipline getDiscipline() {
        return discipline;
    }
}
