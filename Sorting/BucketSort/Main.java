
    
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    static void bucketSort(float[] arr) {
        int n = arr.length;

        if (n <= 0)
            return;

        
        ArrayList<Float>[] buckets = new ArrayList[n];

        
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }

        
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (arr[i] * n);
            buckets[bucketIndex].add(arr[i]);
        }

        
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

      
        int index = 0;

        for (int i = 0; i < n; i++) {
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

        bucketSort(arr);

        System.out.println("\nAfter Sorting:");
        for (float num : arr) {
            System.out.print(num + " ");
        }
    }
}
