
import java.util.Scanner;

public class largestof3numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number A : ");
        int a = sc.nextInt();
        System.out.println("Enter a number B : ");
        int b = sc.nextInt();
        System.out.println("Enter a number C : ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println(a +" is largest");
        }
        else if (b>a && b>c) {
            System.out.println(b +" is largest");
        }
        else{
            System.out.println(c +" is largest");
        }
    }
}
