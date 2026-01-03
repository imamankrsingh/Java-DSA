
import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int Sum = 0;
        while(n!=0){
            int lastDigit = n%10;
            Sum += lastDigit;
            n/=10;
        }
        System.out.println(Sum);
    }
}
