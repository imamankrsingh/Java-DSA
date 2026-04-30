import java.util.ArrayList;
import java.util.Scanner;

public class PallindromeInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Palindrome numbers:");

        for (int num : list) {
            if (isPalindrome(num)) {
                System.out.println(num);
            }
        }
    }

    static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return original == reverse;
    }
}