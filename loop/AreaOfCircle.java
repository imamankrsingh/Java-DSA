import java.util.Scanner;

public class AreaOfCircle {


    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        if (r < 0) {
            System.out.println("Radius cannot be negative!");
        } else {
            double area = calculateArea(r);
            System.out.printf("Area of Circle = %.2f", area);
        }

        sc.close();
    }
}


