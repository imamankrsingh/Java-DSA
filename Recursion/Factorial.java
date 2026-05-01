import java.util.Scanner;

public class Factorial {
    
    static void printIncreasing(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        printIncreasing(n - 1);
        System.out.print(n);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
