public class RecursiveBubbleSort {

    static void bubbleSort(int[] arr, int n) {

    
        if (n == 1) {
            return;
        }

    
        for (int i = 0; i < n - 1; i++) {

            if (arr[i] > arr[i + 1]) {

                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }


        bubbleSort(arr, n - 1);
    }

    static void printArray(int[] arr) {

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 1, 4, 2};

        bubbleSort(arr, arr.length);

        printArray(arr);
    }
}