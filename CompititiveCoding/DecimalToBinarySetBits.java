import java.util.Scanner;

public class DecimalToBinarySetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        int original = n;     
        int binary = 0;
        int place = 1;
        int count = 0;

        while (n > 0) {
            int remainder = n % 2; 
            if (remainder == 1) {
                count++;             
            }

            binary = binary + (remainder * place);
            place = place * 10;
            n = n / 2;
        }

        System.out.println("Binary: " + binary);
        System.out.println("Total 1's: " + count);
    }
}