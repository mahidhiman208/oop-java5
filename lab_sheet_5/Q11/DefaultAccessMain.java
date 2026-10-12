package lab_sheet_5.Q11;

class Pharmacy {
    // These fields use default (package-private) access.
    String medicineName;
    double price;

    // This constructor uses default (package-private) access.
    Pharmacy() {
        medicineName = "Vitamin C";
        price = 78.0;
    }

    // This method uses default (package-private) access.
    void displayMedicine() {
        System.out.println("Medicine: " + medicineName);
        System.out.println("Price: " + price);
    }
}

public class DefaultAccessMain {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        System.out.println("Direct access: " + pharmacy.medicineName + " costs " + pharmacy.price);
        pharmacy.displayMedicine();
    }
}