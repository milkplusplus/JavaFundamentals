package javase02.t05;

import java.util.Comparator;
import java.util.LinkedList;

@SuppressWarnings("unused")
public enum Discipline {

    MATH(GradeType.INTEGER),
    MUSIC(GradeType.INTEGER),
    SPORT(GradeType.DECIMAL),
    GEOGRAPHY(GradeType.INTEGER),
    ENGLISH(GradeType.INTEGER),
    FRENCH(GradeType.DECIMAL);

    private LinkedList<DisciplineListener> listeners = new LinkedList<>();
    private GradeType gradeType;

    Discipline(GradeType gradeType) {
        this.gradeType = gradeType;
    }

    @SuppressWarnings("unchecked")
    public <T extends Number> void addListener (Student student, T grade) {
        switch (this.gradeType) {
            case INTEGER:
                listeners.add(new DisciplineListener(student, grade.intValue(), this));
                    break;
            case DECIMAL: listeners.add(new DisciplineListener(student, grade.doubleValue(), this));
                    break;
        }
    }

    public static DisciplineListener bestStudentGradle(Student targetStudent) {
        LinkedList <DisciplineListener> gradeList = new LinkedList<>();
        for (Discipline discipline: Discipline.values()) {
            for (int i = 0; i < discipline.listeners.size(); i++) {
                if (discipline.listeners.get(i).getStudent() == targetStudent)
                    gradeList.add(discipline.listeners.get(i));
            }
        }
        if (gradeList.size() != 0)
            return findBestListenerGrade(gradeList);
        return null;
    }

    @SuppressWarnings("unchecked")
    private static DisciplineListener findBestListenerGrade(LinkedList<DisciplineListener> gradeList) {
            gradeList.sort(Comparator.comparingInt(d -> d.getDiscipline().getGradeType().ordinal()));
            DisciplineListener maxIntegerGrade = new DisciplineListener(new Student("Default name",
                    "Default group"), 0, Discipline.values()[0]);
            DisciplineListener maxDoubleGrade = new DisciplineListener(new Student("Default name",
                    "Default group"), 0.0, Discipline.values()[0]);
            int counter = 0;
            for (; (counter < gradeList.size()) && (gradeList.get(counter).getDiscipline().getGradeType() ==
                    GradeType.INTEGER); counter++)
                if ( (int)gradeList.get(counter).getGrade() > (int)maxIntegerGrade.getGrade())
                    maxIntegerGrade = gradeList.get(counter);
            for (; counter < gradeList.size(); counter++)
                if ( (double)gradeList.get(counter).getGrade() > (double)maxDoubleGrade.getGrade())
                    maxDoubleGrade = gradeList.get(counter);
            if ((Double.compare(0.0, maxIntegerGrade.getGrade().doubleValue()) == 0) || (Double.compare(0.0, (Double)maxDoubleGrade.getGrade()) == 0)) {
                if (Double.compare(0.0, maxIntegerGrade.getGrade().doubleValue()) == 0)
                    return maxDoubleGrade;
                else
                    return maxIntegerGrade;
            }
            if (Double.compare(maxIntegerGrade.getGrade().doubleValue(), (double)maxDoubleGrade.getGrade()) > 0)
                return maxIntegerGrade;
            else
                return maxDoubleGrade;
    }

    public GradeType getGradeType() {
        return gradeType;
    }

    public LinkedList<DisciplineListener> getListeners() {
        return listeners;
    }
}
