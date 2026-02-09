import java.util.Scanner;

public class SumOfCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();


        int sum = (n * (n + 1) / 2);
        int result = sum * sum;

        System.out.println("Sum of cubes of first " + n + " numbers = " + result);
    }
}
