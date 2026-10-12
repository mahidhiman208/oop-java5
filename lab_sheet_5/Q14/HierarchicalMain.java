package lab_sheet_5.Q14;

// Person is the superclass shared by the Doctor and Nurse child classes.
class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Doctor extends Person {
    private String specialization;

    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    void displayDoctor() {
        System.out.println("Doctor record:");
        displayPerson();
        System.out.println("Specialization: " + specialization);
    }
}

class Nurse extends Person {
    private String ward;

    Nurse(String name, int age, String ward) {
        super(name, age);
        this.ward = ward;
    }

    void displayNurse() {
        System.out.println("Nurse record:");
        displayPerson();
        System.out.println("Ward: " + ward);
    }
}

public class HierarchicalMain {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Leena Shah", 38, "Pediatrics");
        Nurse nurse = new Nurse("Omar Khan", 29, "Emergency");
        doctor.displayDoctor();
        nurse.displayNurse();
    }
}