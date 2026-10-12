package lab_sheet_5.Q05;

class Medicine {
    private String medicineName;
    private int ageLimit;

    Medicine(String medicineName, int ageLimit) {
        this.medicineName = medicineName;
        this.ageLimit = ageLimit;
    }

    String checkEligibility(int patientAge) {
        String result;
        if (patientAge >= ageLimit) {
            result = "Eligible";
        } else {
            result = "Not Eligible";
        }
        return result;
    }

    String getMedicineName() {
        return medicineName;
    }
}

public class EligibilityMain {
    public static void main(String[] args) {
        Medicine medicine = new Medicine("Adult Cough Medicine", 18);
        System.out.println("Age 20 for " + medicine.getMedicineName() + ": "
                + medicine.checkEligibility(20));
        System.out.println("Age 15 for " + medicine.getMedicineName() + ": "
                + medicine.checkEligibility(15));
    }
}