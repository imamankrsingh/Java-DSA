public class MaxElement {

    static int findMax(int[] arr, int idx) {

    
        if (idx == arr.length - 1) {
            return arr[idx];
        }

    
        int smallAns = findMax(arr, idx + 1);

        
        return Math.max(arr[idx], smallAns);
    }

    public static void main(String[] args) {

        int[] arr = {2, 9, 1, 7, 5};

        System.out.println(findMax(arr, 0));
    }
}