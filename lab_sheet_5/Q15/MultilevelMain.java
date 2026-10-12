package lab_sheet_5.Q15;

// Person is the top-level superclass.
class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Employee is both Person's child and Manager's intermediate superclass.
class Employee extends Person {
    private int employeeId;

    Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    protected int getEmployeeId() {
        return employeeId;
    }
}

// Manager is the final child in the Person -> Employee -> Manager chain.
class Manager extends Employee {
    private int teamSize;

    Manager(String name, int age, int employeeId, int teamSize) {
        super(name, age, employeeId);
        this.teamSize = teamSize;
    }

    void displayManager() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Team size: " + teamSize);
    }
}

public class MultilevelMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Sara Lee", 42, 8001, 7);
        manager.displayManager();
    }
}