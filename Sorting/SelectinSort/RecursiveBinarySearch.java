public class RecursiveBinarySearch {

    static int binarySearch(int[] arr, int start, int end, int target) {

        
        if (start > end) {
            return -1;
        }

    
        int mid = (start + end) / 2;

    
        if (arr[mid] == target) {
            return mid;
        }

        
        else if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, end, target);
        }

        
        else {
            return binarySearch(arr, start, mid - 1, target);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11, 15};

        int target = 9;

        int ans = binarySearch(arr, 0, arr.length - 1, target);

        System.out.println(ans);
    }
}