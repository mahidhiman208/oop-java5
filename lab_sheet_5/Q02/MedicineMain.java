package lab_sheet_5.Q02;

class Medicine {
    private String medicineName;
    private String batchNo;
    private double price;

    Medicine(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    void displayMedicine() {
        System.out.println("Medicine: " + medicineName);
        System.out.println("Batch: " + batchNo);
        System.out.println("Price: " + price);
    }
}

public class MedicineMain {
    public static void main(String[] args) {
        Medicine firstMedicine = new Medicine("Pain Relief", "B100", 45.5);
        Medicine secondMedicine = new Medicine("Vitamin C", "B205", 78.0);

        firstMedicine.displayMedicine();
        secondMedicine.displayMedicine();
    }
}