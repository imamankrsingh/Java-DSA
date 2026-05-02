import java.util.Scanner;

public class NQueens {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        int[][] board = new int[n][n];

        solve(board, 0, n);

        System.out.println("Total solutions: " + count);
    }

    static void solve(int[][] board, int row, int n) {
        if (row == n) {
            printBoard(board, n);
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 1;
                solve(board, row + 1, n);
                board[row][col] = 0;
            }
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int n) {

        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) return false;
        }

        return true;
    }

    static void printBoard(int[][] board, int n) {
        System.out.println("Solution:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}