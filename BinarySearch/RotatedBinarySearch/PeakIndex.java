public class PeakIndex {

    public static void main(String[] args) {
        PeakIndex solution = new PeakIndex();
        int[] arr = {0, 1, 0};
        System.out.println(solution.peakIndexInMountainArray(arr)); 
    }
    public int peakIndexInMountainArray(int[] arr) {

        int st = 0,end = arr.length-1;
        int ans = -1;

        

        while (st < end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] < arr[mid + 1]) {
                st = mid + 1; 
            } else {
                end = mid; 
            }
        }

        return st; 
    }
}