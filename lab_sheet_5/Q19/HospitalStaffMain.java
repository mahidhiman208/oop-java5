package lab_sheet_5.Q19;

class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    private int employeeId;
    private double salary;
    private static int employeeCount;

    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        setSalary(salary);
        employeeCount++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return "Employee";
    }

    void displayRecord() {
        System.out.println(getRole() + " | ID: " + employeeId + " | Name: " + name
                + " | Age: " + age + " | Salary: " + salary);
    }

    static int getEmployeeCount() {
        return employeeCount;
    }
}

class Doctor extends Employee {
    private String specialization;

    Doctor(String name, int age, int employeeId, double salary, String specialization) {
        super(name, age, employeeId, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String getRole() {
        return "Doctor";
    }

    @Override
    void displayRecord() {
        super.displayRecord();
        System.out.println("Specialization: " + specialization);
    }
}

class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(String name, int age, int employeeId, double salary, String licenseNo) {
        super(name, age, employeeId, salary);
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
    void displayRecord() {
        super.displayRecord();
        System.out.println("License number: " + licenseNo);
    }
}

class HospitalStaffManager {
    void displayStaff(Employee[] staff) {
        int doctorCount = 0;
        for (int i = 0; i < staff.length; i++) {
            Employee employee = staff[i];
            employee.displayRecord();
            if (employee.getRole().equals("Doctor")) {
                doctorCount++;
                System.out.println("Department filter: medical staff");
            }
        }
        System.out.println("Doctors in staff list: " + doctorCount);
        System.out.println("Total employees created: " + Employee.getEmployeeCount());
    }
}

public class HospitalStaffMain {
    public static void main(String[] args) {
        Employee[] staff = {
            new Doctor("Leena Shah", 38, 1001, 95000.0, "Pediatrics"),
            new Pharmacist("Omar Khan", 29, 1002, 62000.0, "RX-1002")
        };
        HospitalStaffManager manager = new HospitalStaffManager();
        manager.displayStaff(staff);
    }
}