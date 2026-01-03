
import java.util.Scanner;

public class threedigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n>99 && n<1000){
            System.out.print("This is a three digit number : ");
            System.out.println(n);
        }
        else{
            System.out.print("This is not a three digit number : ");
            System.out.println(n);
        }
    }
}

