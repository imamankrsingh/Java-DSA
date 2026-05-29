public class Basic {

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }

    static void BasiccountSort(int[] arr, int max) {
        int[] count = new int[max + 1];

        for (int i : arr) {
            count[i]++;
        }

        int index = 0;

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    static void Display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void countSort(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            max = Math.max(max, i);
        }

        int[] count = new int[max + 1];

        for (int i : arr) {
            count[i]++;
        }

        int index = 0;

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        countSort(arr);

        Display(arr);
    }
}