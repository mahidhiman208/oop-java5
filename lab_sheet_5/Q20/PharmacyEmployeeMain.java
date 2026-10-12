package lab_sheet_5.Q20;

class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    private static int employeeCount;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        setSalary(salary);
        employeeCount++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must not be negative.");
        }
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public String getRole() {
        return "Employee";
    }

    protected void displayBasicDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + employeeName
                + ", Salary: " + salary);
    }

    void displayDetails() {
        System.out.println(getRole());
        displayBasicDetails();
    }
}

class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(int employeeId, String employeeName, double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    @Override
    public String getRole() {
        return "Pharmacist";
    }

    @Override
    void displayDetails() {
        System.out.println(getRole());
        displayBasicDetails();
        System.out.println("License: " + licenseNo);
    }
}

class StoreManager extends Employee {
    private int storeSection;

    StoreManager(int employeeId, String employeeName, double salary, int storeSection) {
        super(employeeId, employeeName, salary);
        this.storeSection = storeSection;
    }

    public int getStoreSection() {
        return storeSection;
    }

    public void setStoreSection(int storeSection) {
        this.storeSection = storeSection;
    }

    @Override
    public String getRole() {
        return "Store Manager";
    }

    @Override
    void displayDetails() {
        System.out.println(getRole());
        displayBasicDetails();
        System.out.println("Store section: " + storeSection);
    }
}

class PharmacyEmployeeManager {
    // Default-access method processes the staff array and uses local totals.
    void processEmployees(Employee[] employees) {
        double totalSalary = 0;
        int pharmacistCount = 0;

        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            employee.displayDetails();
            totalSalary += employee.getSalary();
            if (employee instanceof Pharmacist) {
                pharmacistCount++;
            }
        }

        System.out.println("Total salary: " + totalSalary);
        System.out.println("Pharmacists: " + pharmacistCount);
        System.out.println("Employees created: " + Employee.getEmployeeCount());
    }
}

public class PharmacyEmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
            new Pharmacist(2001, "Mina Patel", 58000.0, "RX-2001"),
            new StoreManager(2002, "Ethan Brooks", 72000.0, 4)
        };
        PharmacyEmployeeManager manager = new PharmacyEmployeeManager();
        manager.processEmployees(employees);
    }
}