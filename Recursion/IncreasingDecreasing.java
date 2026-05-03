import java.util.Scanner;

public class IncreasingDecreasing {

    static void PrintDecreasing(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }

        System.out.println(n);
        PrintDecreasing(n - 1);
    }

    static void PrintIncreasing(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        PrintIncreasing(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        PrintIncreasing(n);
        PrintDecreasing(n);
    }
}