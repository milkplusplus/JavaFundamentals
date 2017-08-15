package javase02.t05;

import java.util.Comparator;
import java.util.LinkedList;

@SuppressWarnings("unused")
public enum Discipline {

    MATH(GradeType.DECIMAL),
    MUSIC(GradeType.INTEGER),
    SPORT(GradeType.INTEGER),
    GEOGRAPHY(GradeType.INTEGER),
    ENGLISH(GradeType.INTEGER);

    private LinkedList<DisciplineListener> listeners = new LinkedList<>();
    private GradeType gradeType;

    Discipline(GradeType gradeType) {
        this.gradeType = gradeType;
    }

    @SuppressWarnings("unchecked")
    public void addListener(Student student, int grade) {
        switch (this.gradeType) {
            case INTEGER: listeners.add(new DisciplineListener(student, grade, this));
            case DECIMAL: listeners.add(new DisciplineListener(student, grade, this));
        }
    }

    public static DisciplineListener bestStudentGradle(Student targetStudent) {
        LinkedList <DisciplineListener> intGrades = new LinkedList<>();
        for (Discipline discipline: Discipline.values()) {
            for (int i = 0; i < discipline.listeners.size(); i++) {
                if (discipline.listeners.get(i).getStudent() == targetStudent)
                    intGrades.add(discipline.listeners.get(i));
            }
        }
        if (intGrades.size() != 0) {
            intGrades.sort(new Comparator<DisciplineListener>() {      // Will realize it now not only for Integers
                @Override
                public int compare(DisciplineListener o1, DisciplineListener o2) {

                    return (int) o1.getGrade() - (int) o2.getGrade();
                }
            });
            return intGrades.getLast();
        }
        return null;
    }

    public GradeType getGradeType() {
        return gradeType;
    }

    public LinkedList<DisciplineListener> getListeners() {
        return listeners;
    }
}
