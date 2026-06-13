// public static void SortPosNeg(int[] arr) {
//     int n = arr.length;
//     for (int i = 0; i < n - 1; i++) {
//         for (int j = 0; j < n - i - 1; j++) {
//             if (arr[j] > arr[j + 1]) {
                
//                 int temp = arr[j];
//                 arr[j] = arr[j + 1];
//                 arr[j + 1] = temp;
//             }
//         }
//     }
// }

// static void Partition(int[] arr) {
//     int n = arr.length;
//     for (int i = 0; i < n - 1; i++) {
//         for (int j = 0; j < n - i - 1; j++) {
//             if (arr[j] > arr[j + 1]) {
               
//                 int temp = arr[j];
//                 arr[j] = arr[j + 1];
//                 arr[j + 1] = temp;
//             }
//         }
//     }
// }


// static void display(int[] arr) {
//     for (int i = 0; i < arr.length; i++) {
//         System.out.print(arr[i] + " ");
//     }
//     System.out.println();
// }
// static void main(String[] args) {
//     int[] arr = { 1, -2, 3, -4, 5, -6 };
//     SortPosNeg(arr);
//     display(arr);
// }




// public class Main {

//     static void SortPosNeg(int[] arr) {
//         int left = 0;
//         int right = arr.length - 1;

//         while (left < right) {

            
//             while (arr[left] < 0) {
//                 left++;
//             }

           
//             while (arr[right] >= 0) {
//                 right--;
//             }

            
//             if (left < right) {
//                 int temp = arr[left];
//                 arr[left] = arr[right];
//                 arr[right] = temp;
//             }
//         }
//     }

//     static void display(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {

//         int[] arr = {1, -2, 3, -4, 5, -6};

//         SortPosNeg(arr);

//         display(arr);
//     }
// }



public class SortPosNeg {

    static void SortPosNeg(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (arr[left] < 0) {
                left++;
            }

            while (arr[right] >= 0) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }

    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {1, -2, 3, -4, 5, -6};

        SortPosNeg(arr);

        display(arr);
    }
}