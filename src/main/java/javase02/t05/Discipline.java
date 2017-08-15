package javase02.t05;

import java.util.LinkedList;

public enum Discipline {

    MATH(GradeType.DECIMAL),
    MUSIC(GradeType.INTEGER),
    SPORT(GradeType.INTEGER);

    LinkedList<DisciplineListener> listeners = new LinkedList<>();
    GradeType gradeType;

    Discipline(GradeType st) {
        this.gradeType = st;
    }

    public void addListener (Student student, int grade) {
        switch (this.gradeType) {
            case INTEGER: listeners.add(new DisciplineListener(student, grade));
            case DECIMAL: listeners.add(new DisciplineListener(student, grade));
        }
    }

}
