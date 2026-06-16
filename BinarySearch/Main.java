    public class main {
        static boolean binarySearch(int arr[], int l, int r, int x) {
            if (r >= l) {
                int mid = l + (r - l) / 2;
                if (arr[mid] == x)
                    return true;
                if (arr[mid] > x)
                    return binarySearch(arr, l, mid - 1, x);
                return binarySearch(arr, mid + 1, r, x);
            }
        
            return false;
        }

        public static void main(String args[]) {
            int arr[] = { 2, 4, 6, 8, 10 };
            int n = arr.length;
            int x = 6;
            if (binarySearch(arr, 0, n - 1, x))
                System.out.println("Element is present in array");
            else
                System.out.println("Element is not present in array");
        }
    }
