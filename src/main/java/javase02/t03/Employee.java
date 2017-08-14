package javase02.t03;

import java.util.LinkedList;

@SuppressWarnings({"unused", "WeakerAccess"})
public class Employee {

    private String name;
    private LinkedList<Stationery> stationeryList = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addItemToStationary(Stationery item) {
        stationeryList.add(item);
    }

    public void removeItemFromStationary(int index) {
        stationeryList.remove(index);
    }

    public int getStationeryCost() {
        int sum = 0;
        for (Stationery aStationeryList : stationeryList)
            sum += aStationeryList.getCost();
        return sum;
    }
}
