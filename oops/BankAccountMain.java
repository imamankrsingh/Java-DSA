class BankAccount {

    private String accountHolderName;
    private int accountNumber;
    private double balance;

    // Constructor
    BankAccount(String name, int accNo, double balance) {
        this.accountHolderName = name;
        this.accountNumber = accNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void showDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Aman", 12345, 5000);

        acc1.showDetails();

        acc1.deposit(2000);
        acc1.withdraw(1000);

        System.out.println("\nUpdated Balance: " + acc1.getBalance());
    }
}