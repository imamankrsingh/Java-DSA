
    
import java.util.Scanner;

public class Apppp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
            for(int i=1;i<=3*n-1;i+=4){
                System.out.println(i);
            }
    }
}


