package lab_sheet_5.Q03;

class Pharmacy {
    private String pharmacyName;
    private String location;
    static int pharmacyCount = 0;

    Pharmacy(String pharmacyName, String location) {
        this.pharmacyName = pharmacyName;
        this.location = location;
        pharmacyCount++;
    }

    void displayPharmacy() {
        System.out.println("Pharmacy: " + pharmacyName + ", " + location);
    }

    static void displayPharmacyCount() {
        System.out.println("Pharmacies created: " + pharmacyCount);
    }
}

public class PharmacyMain {
    public static void main(String[] args) {
        Pharmacy first = new Pharmacy("Green Cross", "North Street");
        Pharmacy second = new Pharmacy("Health Plus", "Lake Road");
        Pharmacy third = new Pharmacy("Care Point", "Market Square");

        first.displayPharmacy();
        second.displayPharmacy();
        third.displayPharmacy();
        Pharmacy.displayPharmacyCount();
    }
}