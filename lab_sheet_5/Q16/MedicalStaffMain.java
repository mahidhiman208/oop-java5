package lab_sheet_5.Q16;

class MedicalStaff {
    protected int staffId;
    protected String staffName;

    MedicalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }
}

class Doctor extends MedicalStaff {
    private String specialization;

    Doctor(int staffId, String staffName, String specialization) {
        super(staffId, staffName);
        this.specialization = specialization;
    }

    void displayDoctor() {
        System.out.println("Doctor ID: " + staffId);
        System.out.println("Doctor name: " + staffName);
        System.out.println("Specialization: " + specialization);
    }
}

class Pharmacist extends MedicalStaff {
    private String licenseNo;

    Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        System.out.println("Pharmacist ID: " + staffId);
        System.out.println("Pharmacist name: " + staffName);
        System.out.println("License number: " + licenseNo);
    }
}

public class MedicalStaffMain {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(901, "Ava Kim", "Cardiology");
        Pharmacist pharmacist = new Pharmacist(902, "Noah Lee", "RX-902");
        doctor.displayDoctor();
        pharmacist.displayPharmacist();
    }
}