import java.util.Scanner;
public class divisibleby3or5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n%5==0 || n%3==0){
            System.out.print("The number is divisible by either 3 or 5: ");
            System.out.println(n);
        }
        else{
            System.out.print("Not divisible by either 3 or 5 : ");
            System.out.println(n);
        }

    }
}
