public class CountInversions {

    static int merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        int inversions = 0;

        while (i < n1 && j < n2) {

            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }

            else {

                arr[k] = R[j];
                j++;

                // count inversions
                inversions += (n1 - i);
            }

            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

        return inversions;
    }

    static int mergeSort(int[] arr, int left, int right) {

        int count = 0;

        if (left < right) {

            int mid = (left + right) / 2;

            count += mergeSort(arr, left, mid);

            count += mergeSort(arr, mid + 1, right);

            count += merge(arr, left, mid, right);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 2, 1};

        int ans = mergeSort(arr, 0, arr.length - 1);

        System.out.println(ans);
    }
}