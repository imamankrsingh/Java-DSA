
import java.util.Scanner;

public class gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter r : ");
        int r = sc.nextInt();
    
        for(int i=1;i<=r;i++){
            System.out.println(a);
            a*= r;
        }
    }
}
