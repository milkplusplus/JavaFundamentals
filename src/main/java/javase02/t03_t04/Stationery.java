package javase02.t03_t04;

@SuppressWarnings("unused")
public abstract class Stationery {

    private String name;
    private int cost;

    public abstract void printAllFields();

    Stationery(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    int getCost() {
        return cost;
    }
}
