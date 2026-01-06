 import java.util.Scanner;
public class reversepallindrome {
   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  
        int temp = n;           

        int digits = 0;
        int reverse = 0;

        while (temp > 0) {
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            digits++;
            temp = temp / 10;
        }

        System.out.println("Digits = " + digits);
        System.out.println("Reverse = " + reverse);

        if (n == reverse)
            System.out.println("Palindrome = YES");
        else
            System.out.println("Palindrome = NO");
    }
}


