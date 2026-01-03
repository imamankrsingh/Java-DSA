
// import java.util.Scanner;

// public class takinginput {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter arrar size : ");
//         int n = sc.nextInt();
//         int[] arr= new int[n];
//         // input 
//         System.out.println("Enter array elements : ");
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("------------------");
//         // output 
//         for(int i =0;i<n;i++){
//             System.out.println(arr[i]+ " ");
//         }
//     }
// }









import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arrar size : ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        // input 
        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("------------------");
        // output 
        for(int i =0;i<n;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
