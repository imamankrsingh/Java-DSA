// import java.util.Scanner;

// public class countdigits {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int numOfDigits = 0;
//         int original_n = n;
//         while(n>0){
//             sumofdigits += n % 10;
//             n= n / 10;
//         }
//         System.out.println("number of digits in " + original_n + " = " + sumofdigits);
//     }    
// }





import java.util.Scanner;

public class countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int numOfDigits = 0;
        int original_n = n;

        while (n > 0) {
            numOfDigits++;
            n = n / 10;
        }

        System.out.println("Number of digits in " + original_n + " = " + numOfDigits);
    }
}

