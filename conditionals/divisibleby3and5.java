
import java.util.Scanner;

public class divisibleby3and5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer number : ");
        int n = sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.print("Divisible by 5 and 3 : ");
            System.out.println(n);
        }
        else{
            System.out.print("Not divisible by 5 and 3 : ");
            System.out.println(n);
        
        }

    }
}











