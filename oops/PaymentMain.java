interface Payment {

    void pay(double amount);
}

class UPI implements Payment {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class CreditCard implements Payment {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

public class PaymentMain {

    public static void main(String[] args) {

        Payment p1 = new UPI();
        p1.pay(500);

        Payment p2 = new CreditCard();
        p2.pay(1000);
    }
}