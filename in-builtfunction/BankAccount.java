
public class BankAccount {
    static String bankName = "State Bank of India";
    static int totalAccounts = 0;

    final int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: ₹" + balance);
        }
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts Created: " + totalAccounts);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001, "Ravi Kumar", 15000.00);
        BankAccount acc2 = new BankAccount(1002, "Sneha Sharma", 25000.00);

        acc1.displayDetails();
        System.out.println();
        acc2.displayDetails();
        System.out.println();
        BankAccount.getTotalAccounts();
    }
}