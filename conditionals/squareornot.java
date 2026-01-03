
import java.util.Scanner;

public class squareornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");
        int l = sc.nextInt();
        System.out.println("Enter breadth : ");
        int b = sc.nextInt();
        if(l==b) {
            System.out.println("yes it is a square : ");
        }
        else{
            System.out.println("No it is not a Square: ");
        }
    }
}
