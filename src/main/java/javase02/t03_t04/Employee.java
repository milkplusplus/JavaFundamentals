package javase02.t03_t04;

import java.util.Comparator;
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

    public void printStationery() {
        for (Stationery aStationeryList : stationeryList)
            aStationeryList.printAllFields();
    }

    public void sortByCost(){
         this.stationeryList.sort(Comparator.comparing(Stationery::getCost));
    }

    public void sortByName(){
        this.stationeryList.sort(Comparator.comparing(Stationery::getName));
    }

    public void sortByCostAndName(){
        this.stationeryList.sort(Comparator.comparing(Stationery::getCost).thenComparing(Stationery::getName));
    }

}
