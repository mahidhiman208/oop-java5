package lab_sheet_5.Q08;

class BankAccount {
    private String accountNo;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    void withdraw(double amount) {
        boolean success;
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            success = true;
        } else {
            success = false;
        }

        if (success) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed.");
        }
    }

    double getBalance() {
        return balance;
    }

    void displayAccount() {
        System.out.println("Account: " + accountNo);
        System.out.println("Account holder: " + accountHolderName);
        System.out.println("Balance: " + getBalance());
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("AC-1001", "Noah Lee", 500.0);
        account.deposit(200.0);
        account.withdraw(150.0);
        account.displayAccount();
    }
}