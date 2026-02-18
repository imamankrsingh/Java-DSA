import java.util.Scanner;

public class InterestCalculator {

    public static double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static double calculateCI(double p, double r, double t) {
        return p * Math.pow((1 + r / 100), t) - p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Interest Calculator ===");
        System.out.println("1. Simple Interest");
        System.out.println("2. Compound Interest");
        System.out.print("Choose option (1 or 2): ");
        int choice = sc.nextInt();

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double t = sc.nextDouble();

        switch(choice) {
            case 1:
                double si = calculateSI(p, r, t);
                System.out.printf("Simple Interest = %.2f", si);
                break;

            case 2:
                double ci = calculateCI(p, r, t);
                System.out.printf("Compound Interest = %.2f", ci);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}

