import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double t = sc.nextDouble();

        double amount = p * Math.pow((1 + r / 100), t);
        double ci = amount - p;

        System.out.printf("Compound Interest = %.2f", ci);

        sc.close();
    }
}
