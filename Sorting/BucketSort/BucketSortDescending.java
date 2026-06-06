import java.util.ArrayList;
import java.util.Collections;

public class BucketSortDescending {

    static void bucketSortDescending(float[] arr) {

        int n = arr.length;

       
        ArrayList<Float>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }

        
        for (int i = 0; i < n; i++) {

            int bucketIndex = (int)(arr[i] * n);

            buckets[bucketIndex].add(arr[i]);
        }

       
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i], Collections.reverseOrder());
        }

       
        int index = 0;

        for (int i = n - 1; i >= 0; i--) {

            for (float value : buckets[i]) {
                arr[index++] = value;
            }
        }
    }

    public static void main(String[] args) {

        float[] arr = {0.42f, 0.32f, 0.23f, 0.52f, 0.25f, 0.47f};

        System.out.println("Before Sorting:");
        for (float num : arr) {
            System.out.print(num + " ");
        }

        bucketSortDescending(arr);

        System.out.println("\nAfter Sorting (Descending):");
        for (float num : arr) {
            System.out.print(num + " ");
        }
    }
}