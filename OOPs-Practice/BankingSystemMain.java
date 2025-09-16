// Abstract class BankAccount
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters and Setters
    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }

    public double getBalance() { return balance; }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid or Insufficient Balance!");
        }
    }

    // Abstract method
    public abstract double calculateInterest();

    // Display account details
    public void displayDetails() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + holderName + ", Balance: " + balance);
    }
}

// Loanable interface
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// SavingsAccount class
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04; // 4% annual interest

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan request submitted for Savings Account: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000; // Eligible if balance >= 5000
    }
}

// CurrentAccount class
class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate = 0.02; // 2% annual interest

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan request submitted for Current Account: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000; // Eligible if balance >= 10000
    }
}

// Main class
public class BankingSystemMain {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[2];

        accounts[0] = new SavingsAccount("S1001", "Alice", 8000);
        accounts[1] = new CurrentAccount("C2001", "Bob", 12000);

        for (BankAccount acc : accounts) {
            acc.displayDetails();

            acc.deposit(2000);
            acc.withdraw(1500);

            System.out.println("Interest: " + acc.calculateInterest());

            Loanable loanAcc = (Loanable) acc;
            loanAcc.applyForLoan(50000);
            System.out.println("Loan Eligibility: " + loanAcc.calculateLoanEligibility());
            System.out.println("----------------------------------");
        }
    }
}
