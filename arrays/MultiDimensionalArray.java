import java.util.Scanner;

public class MultiDimensionalArray {
    static Scanner Sc = new Scanner(System.in);

    static void printArray(int[][] arr ) {

        for (int i = 0 ; i < arr.length; i++) {
            // System.out.println(arr(i));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();

            }
        }


        public static void main(String[] args) {
            Scanner Sc = new Scanner(System.in);
            System.out.println("Enter the number of rows: ");
            int r = Sc.nextInt();
            System.out.println("Enter the number of columns: ");
            int c = Sc.nextInt();
            
            int [] [] arr = new int [r] [c];

            System.out.println("Enter " + r*c + " elements");
            for (int i = 0; i < r; i++){
                for(int j = 0; j < c; j++) {
                    arr[i][j] = Sc.nextInt();
                }
            }

            printArray(arr);


            // int [] [] arr2 = {
            //     {1, 5 , 6},
            //     {7, 9, 11},
            //     {8, 1, 1}
            // };

            // printArray(arr2);
        }
}
