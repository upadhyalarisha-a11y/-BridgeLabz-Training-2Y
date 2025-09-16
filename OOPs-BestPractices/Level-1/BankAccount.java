// File: BankAccount.java
public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public methods to access and modify private balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC123", "Ravi Kumar", 15000);
        acc.displayAccountDetails();

        System.out.println();

        acc.setBalance(20000);
        System.out.println("Updated Balance: " + acc.getBalance());
    }
}

// Subclass to demonstrate use of protected and public members
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder (protected): " + accountHolder);
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("ACC456", "Sita Sharma", 30000, 4.5);
        savings.displaySavingsDetails();
    }
}
