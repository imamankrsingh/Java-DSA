import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter sorted elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int start = 0;
        int end = n - 1;
        int found = -1;

        while(start <= end) {

            int mid = (start + end) / 2;

            if(arr[mid] == key) {
                found = mid;
                break;
            }
            else if(arr[mid] < key) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        System.out.println("Index: " + found);
    }
}