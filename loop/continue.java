import java.util.Scanner;

public class con {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i==14 || i==27) continue;
            if(i%2==0 || i%3==0)
                System.out.println("i");
        }
    }
}
