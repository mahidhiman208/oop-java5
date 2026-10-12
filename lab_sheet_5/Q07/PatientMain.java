package lab_sheet_5.Q07;

class Patient {
    private String patientName;
    private int age;
    private double weight;

    Patient(String patientName, int age, double weight) {
        this.patientName = patientName;
        setAge(age);
        setWeight(weight);
    }

    public String getPatientName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age must not be negative; update rejected.");
        }
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be positive; update rejected.");
        }
    }

    void displayPatient() {
        System.out.println("Patient: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient patient = new Patient("Maya", 24, 62.5);
        patient.setAge(25);
        patient.setWeight(63.0);
        patient.setAge(-2);
        patient.setWeight(0);
        patient.displayPatient();
    }
}