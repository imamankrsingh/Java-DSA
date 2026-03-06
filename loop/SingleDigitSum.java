import java.util.Scanner;

public class SingleDigitSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        while (num > 9) {   
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;  
                sum = sum + digit;     
                num = num / 10;        
            }

            num = sum;   
        }

        System.out.println("Final Single Digit: " + num);
    }
}
