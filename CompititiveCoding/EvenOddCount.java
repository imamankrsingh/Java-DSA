import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        
        System.out.print("Enter size of array: ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        } else {
            System.out.println("Invalid input! Please enter an integer.");
            return;
        }

        int even = 0, odd = 0;

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                int num = sc.nextInt();

                if (num % 2 == 0)
                    even++;
                else
                    odd++;
            } else {
                System.out.println("Invalid input! Only integers allowed.");
                return;
            }
        }

        System.out.println("Even numbers count: " + even);
        System.out.println("Odd numbers count: " + odd);
    }
}


