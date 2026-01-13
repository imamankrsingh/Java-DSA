import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle : ");
        float p = sc.nextFloat();

        System.out.println("Enter rate of Interest : ");
        float r = sc.nextFloat();

        System.out.println("Enter Time : ");
        Float t = sc.nextFloat();

        float si = (p * r * t)/100;

        System.out.println("principle : " + p);
        System.out.println("Rate : " + r);
        System.out.println("time : " + t);

        System.out.println("Simple Interest : " + si);
    }
}
