public class FindSquareRoot {

    public int sqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 1, right = x / 2, result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid == x / mid) {
                return mid; 
            } else if (mid < x / mid) {
                left = mid + 1;
                result = mid; 
            } else {
                right = mid - 1;
            }
        }

        return result; 
    }
    public static void main(String[] args) {
        int n = 16;
        FindSquareRoot fsr = new FindSquareRoot();
        int result = fsr.sqrt(n);
        System.out.println("The square root of " + n + " is: " + result);
    }

    public static int findSquareRoot(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        if (n == 0 || n == 1) {
            return n;
        }

        int low = 1;
        int high = n / 2;
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid * mid == n) {
                return mid; 
            } else if (mid * mid < n) {
                low = mid + 1;
                result = mid; 
            } else {
                high = mid - 1;
            }
        }

        return result; 
    }
}