import java.util.Collections;
import java.util.LinkedList;

public class BucketSortLinkedList {

    static void bucketSort(int[] arr) {

        int n = arr.length;
        int max = arr[0];

    
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

       
        LinkedList<Integer>[] buckets = new LinkedList[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new LinkedList<Integer>();
        }

       
        for (int i = 0; i < n; i++) {

            int bucketIndex = (arr[i] * n) / (max + 1);

            buckets[bucketIndex].add(arr[i]);
        }

        
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        
        int index = 0;

        for (int i = 0; i < n; i++) {

            for (int num : buckets[i]) {
                arr[index++] = num;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {29, 25, 3, 49, 9, 37, 21, 43};

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