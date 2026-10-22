
import java.util.Scanner;

public class ReadChar {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter a Character");
        char ch = Sc.next().charAt(0);
        System.out.println("Character is : " + ch);
    }
} 
