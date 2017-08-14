package javase02.t01;

import java.util.Objects;

@SuppressWarnings({"WeakerAccess", "unused"})
public class Pen {

    private String name;
    private int cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return cost == pen.cost && Objects.equals(name, pen.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }

    @Override
    public String toString() {
        return "Pen(" + "name='" + this.name + '\'' + ", cost=" + this.cost + ')';
    }
}
