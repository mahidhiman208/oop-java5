package lab_sheet_5.Q01;

// The Student class keeps its own display behavior.
class Student {
    private String name;
    private int rollNo;
    private double marks;

    Student() {
        name = "Aarav Sharma";
        rollNo = 101;
        marks = 88.5;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayDetails();
    }
}