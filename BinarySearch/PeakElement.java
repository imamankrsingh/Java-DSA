public class PeakElement {

    static int findPeak(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low; 
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 20, 4, 1, 0};

        int index = findPeak(arr);

        System.out.println("Peak Element: " + arr[index]);
        System.out.println("Index: " + index);
    }
}