import java.util.*;

class Employee implements Comparable<Employee> {
    String name;
    String id;
    public Employee(String name, String id) {
        this.id = id;
        this.name = name;
    }
    // It accually compares the value only for sorting order... Else it doesn't have any function......
    @Override
    public int compareTo(Employee var) {
        return this.id.compareTo(var.id);
    }
    @Override
    public String toString() {
        return "Employee{ name: "+name+" ,id: "+id+" }";
    }
}

public class COLLEDGE_CompareableClass {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ashmin", "14");
        Employee emp2 = new Employee("Rahul", "7");
        Employee emp3 = new Employee("Anuj", "8");

        Set<Employee> treeSet = new TreeSet<>();
        // Adding elements......
        treeSet.add(emp1);
        treeSet.add(emp2);
        treeSet.add(emp3);

        // Printing Values....
        System.out.println("Treeset: "+treeSet);
    }
}
