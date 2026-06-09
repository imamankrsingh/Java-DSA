import java.util.ArrayList;
import java.util.Collections;

public class BucketSortString {

    static void bucketSort(String[] arr) {

        int n = arr.length;

       
        ArrayList<String>[] buckets = new ArrayList[26];

        for (int i = 0; i < 26; i++) {
            buckets[i] = new ArrayList<String>();
        }

       
        for (int i = 0; i < n; i++) {

            char firstChar = Character.toLowerCase(arr[i].charAt(0));

            int bucketIndex = firstChar - 'a';

            buckets[bucketIndex].add(arr[i]);
        }

      
        for (int i = 0; i < 26; i++) {
            Collections.sort(buckets[i]);
        }


        int index = 0;

        for (int i = 0; i < 26; i++) {

            for (String str : buckets[i]) {
                arr[index++] = str;
            }
        }
    }

    public static void main(String[] args) {

        String[] arr = {
            "Mango",
            "Apple",
            "Banana",
            "Orange",
            "Grapes",
            "Cherry"
        };

        System.out.println("Before Sorting:");
        for (String str : arr) {
            System.out.print(str + " ");
        }

        bucketSort(arr);

        System.out.println("\nAfter Sorting:");
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }
}