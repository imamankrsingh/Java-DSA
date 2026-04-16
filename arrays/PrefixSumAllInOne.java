public class PrefixSumAllInOne {

    
    static int[] buildPrefix(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    
    static int rangeSum(int[] prefix, int L, int R) {
        if (L == 0) return prefix[R];
        return prefix[R] - prefix[L - 1];
    }


    static void equilibriumIndex(int[] arr) {
        int totalSum = 0;

        for (int num : arr) totalSum += num;

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; 

            if (leftSum == totalSum) {
                System.out.println("Equilibrium Index: " + i);
                return;
            }

            leftSum += arr[i];
        }

        System.out.println("No Equilibrium Index");
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};


        int[] prefix = buildPrefix(arr);

        System.out.print("Prefix Array: ");
        for (int num : prefix) System.out.print(num + " ");
        System.out.println();

    
        int L = 1, R = 3;
        System.out.println("Range Sum (1 to 3): " + rangeSum(prefix, L, R));

    
        equilibriumIndex(arr);
    }
}