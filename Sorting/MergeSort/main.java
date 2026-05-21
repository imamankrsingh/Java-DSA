public class main {
    
    static void displayArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    static void mergeSort(int[] arr, int left, int right) {
        
    }


    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int n = arr.length;
        System.out.println("Given array:");
        displayArr(arr);
        mergeSort(arr, 0, n - 1);
        System.out.println("Sorted array:");
        displayArr(arr);
    }
}
