import java.util.ArrayList;
import java.util.Collections;

public class BucketSortInteger {

    static void bucketSort(int[] arr) {

        int max = arr[0];

        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int bucketCount = 5;

        
        ArrayList<Integer>[] buckets = new ArrayList[bucketCount];

        for (int i = 0; i < bucketCount; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        
        for (int i = 0; i < arr.length; i++) {

            int bucketIndex = (arr[i] * bucketCount) / (max + 1);

            buckets[bucketIndex].add(arr[i]);
        }

        
        for (int i = 0; i < bucketCount; i++) {
            Collections.sort(buckets[i]);
        }


        int index = 0;

        for (int i = 0; i < bucketCount; i++) {
            for (int num : buckets[i]) {
                arr[index++] = num;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {42, 32, 33, 52, 37, 47, 51};

        System.out.println("Before Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        bucketSort(arr);

        System.out.println("\nAfter Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}