
import java.util.Scanner;

public class youngestage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of Ram : ");
        int a = sc.nextInt();
        System.out.println("Enter age of Shyam : ");
        int b = sc.nextInt();
        System.out.println("Enter age of Ajay : ");
        int c = sc.nextInt();
        if(a<b && b<c){
            System.out.println("Ram is youngest");
        }
        else if(b<a && b<c){
            System.out.println("Shyam is youngest");
        }
        else{
            System.out.println("Ajay is Youngest");
        }
    }
}
