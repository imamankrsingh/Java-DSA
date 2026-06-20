public class BookAllocation {

    static boolean isPossible(int[] books, int students, int maxPages) {

        int studentCount = 1;
        int pages = 0;

        for (int book : books) {

            if (pages + book <= maxPages) {
                pages += book;
            } else {

                studentCount++;
                pages = book;

                if (studentCount > students) {
                    return false;
                }
            }
        }

        return true;
    }

    static int allocateBooks(int[] books, int students) {

        if (students > books.length) {
            return -1;
        }

        int low = 0;
        int high = 0;

        for (int book : books) {
            low = Math.max(low, book);
            high += book;
        }

        int answer = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isPossible(books, students, mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] books = {12, 34, 67, 90};
        int students = 2;

        System.out.println(allocateBooks(books, students));
    }
}