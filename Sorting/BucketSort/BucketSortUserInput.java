import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BucketSortUserInput {

    static void bucketSort(float[] arr) {

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

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        float[] arr = new float[n];

        System.out.println("Enter elements between 0 and 1:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextFloat();
        }

        System.out.println("Before Sorting:");
        for (float num : arr) {
            System.out.print(num + " ");
        }

        bucketSort(arr);

        System.out.println("\nAfter Sorting:");
        for (float num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}