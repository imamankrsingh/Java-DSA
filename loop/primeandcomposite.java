import java.util.Scanner;
public class primeandcomposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        boolean flag = false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag = true;
                break;
            }
        }
        if(n==1)
            System.out.println("neither prime nor composite");
        else if(flag==false)
            System.out.println("Prime number");
        else
            System.out.println("Composite number");
    }
}
