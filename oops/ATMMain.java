class ATM {

    private double balance;

    ATM(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class ATMMain {

    public static void main(String[] args) {

        ATM user1 = new ATM(5000);

        user1.checkBalance();
        user1.deposit(2000);
        user1.withdraw(3000);
        user1.checkBalance();

    }
}