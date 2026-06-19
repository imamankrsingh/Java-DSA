public class PaintersPartition {

    static boolean isPossible(int[] boards, int painters, int maxTime) {

        int painterCount = 1;
        int currentTime = 0;

        for (int board : boards) {

            if (currentTime + board <= maxTime) {
                currentTime += board;
            } else {

                painterCount++;
                currentTime = board;

                if (painterCount > painters) {
                    return false;
                }
            }
        }

        return true;
    }

    static int minTime(int[] boards, int painters) {

        int low = 0;
        int high = 0;

        for (int board : boards) {
            low = Math.max(low, board);
            high += board;
        }

        int answer = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isPossible(boards, painters, mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] boards = {10, 20, 30, 40};
        int painters = 2;

        System.out.println(minTime(boards, painters));
    }
}