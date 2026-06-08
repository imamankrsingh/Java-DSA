import java.util.ArrayList;
import java.util.Collections;

public class BucketSortDouble {

    static void bucketSort(double[] arr) {

        int n = arr.length;

     
        ArrayList<Double>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Double>();
        }

        
        for (int i = 0; i < n; i++) {

            int bucketIndex = (int)(arr[i] * n);

            buckets[bucketIndex].add(arr[i]);
        }

        
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

       
        int index = 0;

        for (int i = 0; i < n; i++) {

            for (double num : buckets[i]) {
                arr[index++] = num;
            }
        }
    }

    public static void main(String[] args) {

        double[] arr = {0.78, 0.17, 0.39, 0.26, 0.72, 0.94, 0.21};

        System.out.println("Before Sorting:");
        for (double num : arr) {
            System.out.print(num + " ");
        }

        bucketSort(arr);

        System.out.println("\nAfter Sorting:");
        for (double num : arr) {
            System.out.print(num + " ");
        }
    }
}