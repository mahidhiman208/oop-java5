package lab_sheet_5.Q10;

class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}

public class PrivateAccessMain {
    public static void main(String[] args) {
        Employee employee = new Employee(501, "Ava Kim", 42000.0);
        System.out.println("Read through getters: " + employee.getEmployeeId() + ", "
                + employee.getEmployeeName() + ", " + employee.getSalary());
        employee.displayEmployee();

        // employee.salary is not allowed because salary is private.
    }
}