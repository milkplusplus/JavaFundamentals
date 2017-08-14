package javase02.t03;

@SuppressWarnings({"unused", "WeakerAccess"})
public class Rubber extends Stationery {

    public Rubber(String name, int cost) {
        super(name, cost);
    }

    @Override
    public void printAllFields() {
        System.out.println("\nRubber:");
        System.out.println("name = " + getName());
        System.out.println("cost = " + getCost());
    }
}
