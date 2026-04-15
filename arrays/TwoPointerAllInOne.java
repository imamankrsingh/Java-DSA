public class TwoPointerAllInOne {

    static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.print("Reversed: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }


    static void twoSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Two Sum Pair: " + arr[left] + ", " + arr[right]);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("No Pair Found");
    }

    
    static void moveZeros(int[] arr) {
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.print("Zeros Moved: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }

    
    static void removeDuplicates(int[] arr) {
        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        System.out.print("Unique Elements: ");
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    
    static void maxWater(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int area = h * width;

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Max Water Area: " + maxArea);
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        reverse(arr1);

        int[] arr2 = {1, 2, 3, 4, 6};
        twoSum(arr2, 6);

        int[] arr3 = {0, 1, 0, 3, 12};
        moveZeros(arr3);

        int[] arr4 = {1, 1, 2, 2, 3, 4};
        removeDuplicates(arr4);

        int[] arr5 = {1,8,6,2,5,4,8,3,7};
        maxWater(arr5);
    }
}