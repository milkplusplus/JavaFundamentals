package javase02.t05;

import java.util.Comparator;
import java.util.LinkedList;

@SuppressWarnings("unused")
public enum Discipline {

    MATH(GradeType.DECIMAL),
    MUSIC(GradeType.INTEGER),
    SPORT(GradeType.DECIMAL),
    GEOGRAPHY(GradeType.INTEGER),
    ENGLISH(GradeType.DECIMAL);

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

    // need to optimize this function later
    // (dunno why i decided to realize this with LinkedList instead of single DisciplineListener)
    private static DisciplineListener findBestListenerGrade(LinkedList<DisciplineListener> gradeList) {
            gradeList.sort(Comparator.comparingInt(d -> d.getDiscipline().getGradeType().ordinal()));
            LinkedList<DisciplineListener> IntegerGradeList = new LinkedList<>();
            LinkedList<DisciplineListener> DoubleGradeList = new LinkedList<>();
            int counter = 0;
            for (; (counter < gradeList.size()) && (gradeList.get(counter).getDiscipline().getGradeType() ==
                    GradeType.INTEGER); counter++)
                IntegerGradeList.add(gradeList.get(counter));
            for (; counter < gradeList.size(); counter++)
                DoubleGradeList.add(gradeList.get(counter));
            if ((IntegerGradeList.size() == 0) || (DoubleGradeList.size() == 0)) {
                 if (IntegerGradeList.size() == 0){
                     DoubleGradeList.sort( (DisciplineListener lis1, DisciplineListener lis2) ->
                             (Double.compare((Double)lis1.getGrade(), (Double)lis2.getGrade())));
                     return DoubleGradeList.getLast();
                 }
                 else {
                     IntegerGradeList.sort( (DisciplineListener lis1, DisciplineListener lis2) ->
                             (Integer)lis1.getGrade() - (Integer) lis2.getGrade());
                     return IntegerGradeList.getLast();
                 }
            }
            DoubleGradeList.sort( (DisciplineListener lis1, DisciplineListener lis2) ->
                    (Double.compare((Double)lis1.getGrade(), (Double)lis2.getGrade())));
            IntegerGradeList.sort( (DisciplineListener lis1, DisciplineListener lis2) ->
                    (Integer)lis1.getGrade() - (Integer) lis2.getGrade());
            if ( Double.compare(IntegerGradeList.getLast().getGrade().doubleValue(),
                    DoubleGradeList.getLast().getGrade().doubleValue()) >= 0 )
                return IntegerGradeList.getLast();
            return DoubleGradeList.getLast();
    }

    public GradeType getGradeType() {
        return gradeType;
    }

    public LinkedList<DisciplineListener> getListeners() {
        return listeners;
    }
}
