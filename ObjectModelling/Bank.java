class Bank {
    String name;

    Bank(String name) {
        this.name = name;
    }

    void openAccount(Customer customer, String accountType) {
        customer.setAccount(new Account(accountType, this));
        System.out.println("Account opened for " + customer.name + " in " + name);
    }
}

class Account {
    String type;
    Bank bank;
    double balance = 1000; // Default balance

    Account(String type, Bank bank) {
        this.type = type;
        this.bank = bank;
    }

    double getBalance() {
        return balance;
    }
}

class Customer {
    String name;
    Account account;

    Customer(String name) {
        this.name = name;
    }

    void setAccount(Account account) {
        this.account = account;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: ₹" + account.getBalance());
    }
}

public class AssociationDemo {
    public static void main(String[] args) {
        Bank sbi = new Bank("SBI");
        Customer drishya = new Customer("Drishya");

        sbi.openAccount(drishya, "Savings");
        drishya.viewBalance();
    }
}