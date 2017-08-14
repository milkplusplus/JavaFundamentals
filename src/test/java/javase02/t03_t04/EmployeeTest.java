package javase02.t03_t04;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    private Employee employee = new Employee();

    @Before
    public void setUp() {
        Pencil p1 = new Pencil("Pencil 1", 200, true, "2H");
        Pencil p2 = new Pencil("Pencil 2", 500, false, "5B");
        Pencil p3 = new Pencil("Pencil 3", 150, true, "4H");
        Pencil p4 = new Pencil("Pencil 4", 10, false, "2B");
        Notepad n1 = new Notepad("Notepad 1", 14, 20, "White");
        Notepad n2 = new Notepad("Notepad 2", 100, 100, "White");
        Notepad n3 = new Notepad("Notepad 3", 100, 2000, "Red");
        Rubber r1 = new Rubber("Rubber 1", 5);
        Rubber r2 = new Rubber("Rubber 2", 100);
        employee.addItemToStationary(p1);
        employee.addItemToStationary(p2);
        employee.addItemToStationary(p3);
        employee.addItemToStationary(p4);
        employee.addItemToStationary(n1);
        employee.addItemToStationary(n2);
        employee.addItemToStationary(n3);
        employee.addItemToStationary(r1);
        employee.addItemToStationary(r2);
    }

    @Test
    public void t03Test() {
        assertEquals(1179,employee.getStationeryCost());
    }

    @Test
    public void t04Test() {
        employee.printStationery();
        System.out.println("-----------------------------------SORTED_BY_COST-----------------------------------");
        employee.sortByCost();
        employee.printStationery();
        System.out.println("-----------------------------------SORTED_BY_NAME-----------------------------------");
        employee.sortByName();
        employee.printStationery();
        System.out.println("------------------------------SORTED_BY_COST_AND_NAME-------------------------------");
        employee.sortByCostAndName();
        employee.printStationery();
    }

}