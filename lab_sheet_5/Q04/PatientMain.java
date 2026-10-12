package lab_sheet_5.Q04;

class Patient {
    private int patientId;
    private String patientName;
    private int age;

    Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    void displayPatient() {
        System.out.println("ID: " + patientId + ", Name: " + patientName + ", Age: " + age);
    }
}

class PatientManager {
    void displayAllPatients(Patient[] patients) {
        for (int i = 0; i < patients.length; i++) {
            patients[i].displayPatient();
        }
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient[] patients = {
            new Patient(1, "Maya", 24),
            new Patient(2, "Noah", 31),
            new Patient(3, "Lina", 19),
            new Patient(4, "Omar", 42),
            new Patient(5, "Ivy", 28)
        };
        PatientManager manager = new PatientManager();
        manager.displayAllPatients(patients);
    }
}