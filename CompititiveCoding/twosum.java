import java.util.*;

public class twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int required = target - arr[i];

            if (map.containsKey(required)) {
                System.out.println(map.get(required) + " " + i);
                return;
            }

            map.put(arr[i], i);
        }
    }
}