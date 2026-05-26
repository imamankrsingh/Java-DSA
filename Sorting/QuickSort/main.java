public class main {
    
    static void displayArr(int[] arr) {
        for(int val : arr) {
            System.out.print(val + " ");
        }
    }
static void swap(int[] arr, int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
}

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }


public static void main(String[] args) {
    int[] arr = {10, 7, 8, 9, 1, 5};
    System.out.println("Array before sorting");
    displayArr(arr);
    System.out.println("");

    quickSort(arr, 0, arr.length - 1);

    System.out.println("Array after sorting");
    displayArr(arr);
    }



}



