// public class Sort012 {

//     static void display(int[] arr) {
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }

//     static void Swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     static void Sort012(int[] arr) {
//         int low = 0, mid = 0, high = arr.length - 1;

//         while (mid <= high) {
//             switch (arr[mid]) {
//                 case 0:
//                     Swap(arr, low, mid);
//                     low++;
//                     mid++;
//                     break;
//                 case 1:
//                     mid++;
//                     break;
//                 case 2:
//                     Swap(arr, mid, high);
//                     high--;
//                     break;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {0, 1, 2, 0, 1, 2};
//         Sort012(arr);
//         display(arr);
//         }
//     }

//     public static void sort012(int[] arr) {
//         int low = 0, mid = 0, high = arr.length - 1;

//         while (mid <= high) {
//             switch (arr[mid]) {
//                 case 0:
//                     swap(arr, low, mid);
//                     low++;
//                     mid++;
//                     break;
//                 case 1:
//                     mid++;
//                     break;
//                 case 2:
//                     swap(arr, mid, high);
//                     high--;
//                     break;
//             }
//         }
//     }

//     private static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }


public class Sort012 {

    static void display(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void Sort012(int[] arr) {

        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {

            switch (arr[mid]) {

                case 0:
                    Swap(arr, low, mid);
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    Swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 0, 1, 2};

        Sort012(arr);

        display(arr);
    }
}