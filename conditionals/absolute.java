
import java.util.Scanner;

public class absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer: ");
        int n = sc.nextInt();
        if(n<0){
            n = n * (-1);
        }
        System.out.println("the absolute value is : "+n);
    }
}
