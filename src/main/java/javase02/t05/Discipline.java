package javase02.t05;

import java.util.LinkedList;

public enum Discipline {

    MATH(GrageType.DECIMAL),
    MUSIC(GrageType.INTEGER),
    SPORT(GrageType.INTEGER);

    LinkedList<DisciplineListener> listeners = new LinkedList<>();
    GrageType grageType;

    Discipline(GrageType st) {
        this.grageType = st;
    }

    public void addListener (Student student) {
        switch (this.grageType) {
            case INTEGER: listeners.add(new DisciplineListener(student, new Integer[100]));
            case DECIMAL: listeners.add(new DisciplineListener(student, new Double[100]));
        }
    }

    public LinkedList<DisciplineListener> getListeners() {
        return listeners;
    }
}
