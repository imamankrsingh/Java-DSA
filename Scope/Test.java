public class Test {


    static boolean checkPair(int arr[], int target) {


        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int arr[] = {3, 6, 9};
        int target = 30;

        boolean ans = checkPair(arr, target);
        System.out.println(ans);
    }
}
