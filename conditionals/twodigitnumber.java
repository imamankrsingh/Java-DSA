
import java.util.Scanner;

public class twodigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer : ");
        int n = sc.nextInt();
        if(n>9 && n<99){
            System.out.print("This is a two digit number : ");
            System.out.println(n);
        }
        else{
            System.out.print("This is not a two digit number : ");
            System.out.println(n);
        }
    }
}
