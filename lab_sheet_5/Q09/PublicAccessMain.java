package lab_sheet_5.Q09;

class Hospital {
    // Public members can be accessed directly from Main.
    public String hospitalName;
    public String hospitalCode;

    public Hospital() {
        hospitalName = "City Care Hospital";
        hospitalCode = "CCH-01";
    }

    public void displayHospital() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Code: " + hospitalCode);
    }
}

public class PublicAccessMain {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        System.out.println("Name read directly: " + hospital.hospitalName);
        System.out.println("Code read directly: " + hospital.hospitalCode);
        hospital.displayHospital();
    }
}