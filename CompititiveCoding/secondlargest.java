public class secondlargest {
    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 20};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest = " + secondLargest);
    }
}
